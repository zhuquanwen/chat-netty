package com.zqw.chat.common.init;

import com.zqw.chat.common.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhuquanwen
 * @Description:
 * @Date: 2018/6/15 17:04
 * @Modified:
 **/
public class InitModels {
    public static List<User> users = new ArrayList<>(); //初始化一个注册的所有用户，应该存在数据库里，暂时模拟
    static {
        User user1 = new User("1","zhangsan");
        User user2 = new User("2", "lisi");
        User user3 = new User("3", "wangwu");
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }
}
