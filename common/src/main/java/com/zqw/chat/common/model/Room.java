package com.zqw.chat.common.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: zhuquanwen
 * @Description:
 * @Date: 2018/6/15 17:00
 * @Modified:
 **/
@Data
public class Room implements Serializable {
    private String id;
    private List<User> users;
}
