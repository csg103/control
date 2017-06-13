package com.cri.controller;

import com.cri.pojo.UserInfoPOJO;
import com.cri.service.UserInfoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 例子类，用于开发指引
 *
 * @author csg
 * @create 2017-06-18:35
 */
@RestController
@AllArgsConstructor
public class UserInfoController
{
    private UserInfoService userInfoService;

    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody UserInfoPOJO userinfo)
    {
        userInfoService.addUser(userinfo);
        return "";
    }

    @RequestMapping(value = "/{token}")
    public String userValidataToken(@PathVariable("token") String token)
    {

        return "";
    }
}