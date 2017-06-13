package com.cri.pojo;

import lombok.Data;

/**
 * 基类，用于存储公共的信息
 *
 * @author csg
 * @create 2017-06-23:36
 */
@Data
public class BaseVO {
    //版本信息
    private String version;
    //接口ID
    private String interfaceId;
    //渠道信息 从APP 或者网站调用
    private String channelId;
}
