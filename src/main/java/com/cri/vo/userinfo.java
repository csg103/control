package com.cri.vo;

import lombok.Data;

import java.util.Date;

/**
 * 用户VO类型，对应数据库字段
 *
 * @author csg
 * @create 2017-06-19:17
 */
@Data
public class userinfo {

    private int id;
    private String username;
    private String pwd;
    private Date creattime;
    private  String text1;
}
