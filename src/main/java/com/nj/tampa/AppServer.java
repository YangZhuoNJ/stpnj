package com.nj.tampa;

/**
 * Created by admin on 2016/11/11.
 */

import com.nj.tampa.dao.UserDao;
import com.nj.tampa.domain.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
//@MapperScan(basePackages = "com.nj.tempa.mapper")
public class AppServer {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");

        UserDao dao =(UserDao)context.getBean("userDao");
        User u = dao.findUserById(4);
        System.out.println(u);


        User user = new User("Mybatis", 1, "nj@jiannanjun.com");
        dao.save(user);

        dao.delete("2");



//        SpringApplication.run(AppServer.class, args);
    }
}
