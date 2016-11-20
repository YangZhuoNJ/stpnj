package com.nj.tampa;

/**
 * Created by admin on 2016/11/11.
 */

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@MapperScan(basePackages = "com.nj.tempa.mapper")
@ComponentScan(basePackageClasses = {AppServer.class})
public class AppServer {

    static Logger log = Logger.getLogger(AppServer.class);


    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        SpringApplication.run(AppServer.class, args);

        log.info("Application is start !------NJ");


//
//        UserDao dao =(UserDao)context.getBean("userDao");
//        User u = dao.findUserById(4);
//        System.out.println(u);
//
//
//        User user = new User("Mybatis", 1, "nj@jiannanjun.com");
//        dao.save(user);
//
//        dao.delete("2");



//        SpringApplication.run(AppServer.class, args);
    }
}
