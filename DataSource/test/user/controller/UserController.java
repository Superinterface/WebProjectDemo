package com.test.user.controller;

import com.test.user.service.UserService;
import com.test.util.DynamicDataSourceContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user/")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "select")
    @ResponseBody
    public String select(String datasource){
        DynamicDataSourceContextHolder.setDataSource(datasource);
        return userService.selectOne(datasource);
    }

}