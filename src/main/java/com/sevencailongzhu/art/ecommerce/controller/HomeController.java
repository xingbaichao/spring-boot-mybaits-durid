package com.sevencailongzhu.art.ecommerce.controller;

import com.sevencailongzhu.art.ecommerce.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xingbaichao on 15/12/10.
 */
@Controller
public class HomeController {

    @Autowired
    private AccountService accountService;
    @RequestMapping("/")
    @ResponseBody
    public String index(){

        return accountService.sayHiMessage("xingbaichao");

    }

}
