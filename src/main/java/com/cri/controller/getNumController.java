package com.cri.controller;

import com.cri.pojo.UserInfoPOJO;
import com.cri.service.UserInfoService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 例子类，用于开发指引
 *
 * @author csg
 * @create 2017-06-18:35
 */
@RestController
@AllArgsConstructor
@Log4j2
public class getNumController
{
    public  static  int mm=1;
    private final UserInfoService userInfoService;

    @PostMapping(value = "/getNum")
    public int addUser(Model model)
    {
                mm =mm+(int)(Math.random()*100);

        model.addAttribute("num",mm);
        log.info(mm);
        return mm;
    }

//    @RequestMapping(value = "/{token}")
//    public int userValidataToken(@PathVariable("token") String token,Model model)
//    {
//        mm =mm+(int)(Math.random()*100);
//
//        model.addAttribute("num",mm);
//        return mm;
//    }
}
