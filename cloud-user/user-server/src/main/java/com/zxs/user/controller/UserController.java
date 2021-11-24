package com.zxs.user.controller;

import com.zxs.user.common.resp.RestResult;
import com.zxs.user.model.AdminUser;
import com.zxs.user.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "用户接口")
@Validated
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/findByName")
    public AdminUser findByUserName(String userName){
        return userService.findByUserName(userName);
    }



    @GetMapping(value = "/findByName2")
    public RestResult<List<AdminUser>> findByUserName2(String userName){
        return userService.findByUserName2(userName);
    }

}
