package com.jiangxiaohu.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/9/9/009.
 */
@Controller
@RequestMapping("home")
public class HomeController {

    @RequestMapping("admin")
    public String getHome(){
        System.out.println("aaaa");
        return "home";
    }
}
