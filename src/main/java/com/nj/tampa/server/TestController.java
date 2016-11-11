package com.nj.tampa.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2016/11/12.
 */

@RestController
@RequestMapping("/nj")
public class TestController {

    @RequestMapping("/1")
    public String TestReturn() {
        return "Hello World";
    }

}
