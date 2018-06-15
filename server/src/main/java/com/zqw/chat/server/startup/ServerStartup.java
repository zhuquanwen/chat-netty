package com.zqw.chat.server.startup;

import ch.qos.logback.core.joran.spi.JoranException;
import com.zqw.chat.common.utils.LogbackUtils;

import java.io.IOException;

/**
 * @Author: zhuquanwen
 * @Description:
 * @Date: 2018/6/15 15:20
 * @Modified:
 **/
public class ServerStartup {
    public static void main(String[] args) {
        try {
            LogbackUtils.load("netty-logback.xml");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JoranException e) {
            e.printStackTrace();
        }
    }
}
