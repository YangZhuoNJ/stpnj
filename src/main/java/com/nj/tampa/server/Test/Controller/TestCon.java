package com.nj.tampa.server.Test.Controller;

import com.nj.tampa.server.Test.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2016/11/13.
 */

@RestController
@RequestMapping("/nj")
public class TestCon {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @RequestMapping("jdbc")
    public String save() {
//        jdbcTemplate.execute("DROP TABLE customers");

        jdbcTemplate.execute("CREATE TABLE customer (id SERIAL , FIRST_NAME VARCHAR(255), LAST_NAME VARCHAR(255) )");

        return "Success created table customer!";
    }

    @RequestMapping
    public String saveUser(@RequestParam(defaultValue = "nj", required = false) String first_name,
                           @RequestParam(defaultValue = "nanjun", required = false) String last_name) {

        Customer customer = new Customer(first_name, last_name);
        jdbcTemplate.batchUpdate("INSERT INTO customer (fisrt_name)");
        return "Success!";
    }

}
