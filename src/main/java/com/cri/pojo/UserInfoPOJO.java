package com.cri.pojo;

import lombok.Data;

/**
 * 用于前段交互的结构类型POJO
 *
 * @author csg
 * @create 2017-06-19:44
 */
@Data
public class UserInfoPOJO extends BaseVO {
    /**
     *  asd
     */
    private String username;
    /**
     *  asd
     */
    private String pwd;

    private String  text1;
}
