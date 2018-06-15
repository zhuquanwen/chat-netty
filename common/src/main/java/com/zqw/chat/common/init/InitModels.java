package com.zqw.chat.common.init;

import com.zqw.chat.common.model.Room;
import com.zqw.chat.common.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: zhuquanwen
 * @Description:
 * @Date: 2018/6/15 17:04
 * @Modified:
 **/
public class InitModels {
    public static List<User> users = new ArrayList<>(); //初始化一个注册的所有用户，应该存在数据库里，暂时模拟
    public static List<Room> rooms = new ArrayList<>(); //初始化一个群组
    static {
        //初始化用户
        User user1 = new User("1","zhangsan");
        User user2 = new User("2", "lisi");
        User user3 = new User("3", "wangwu");
        User user4 = new User("4", "zhaoliu");
        user1.setFriends(Arrays.asList(user2, user3));
        user2.setFriends(Arrays.asList(user1, user3));
        user3.setFriends(Arrays.asList(user1, user2));
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        //初始化群组
        Room room1 = new Room();
        room1.setId("1");
        room1.setUsers(Arrays.asList(user1, user2, user3));
        rooms.add(room1);
    }
}
