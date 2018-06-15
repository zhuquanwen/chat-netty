package com.zqw.chat.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: zhuquanwen
 * @Description:
 * @Date: 2018/6/15 16:58
 * @Modified:
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String name;
    private List<User> friends;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
