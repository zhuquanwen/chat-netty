package com.zqw.chat.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: zhuquanwen
 * @Description:
 * @Date: 2018/6/15 15:24
 * @Modified:
 **/
@Data
public class Message implements Serializable {
    private String id;
    private String from;
    private String to;
    private String roomId;
    private Object msg;
}
