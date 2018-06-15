package com.zqw.chat.common.model;

import lombok.Data;

/**
 * @Author: zhuquanwen
 * @Description:
 * @Date: 2018/6/15 15:24
 * @Modified:
 **/
@Data
public class Message {
    private String id;
    private String from;
    private String to;
    private String roomId;
}
