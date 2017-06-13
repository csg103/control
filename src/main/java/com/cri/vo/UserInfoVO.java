package com.cri.vo;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 用户VO类型，对应数据库字段
 *
 * @author csg
 * @create 2017-06-19:17
 */
@Data
@Entity
@Table(name = "userinfo")
public class UserInfoVO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private String username;
    @NotNull
    private String pwd;
    private Date creattime;
}
