package com.lxh.demo.util;

import com.gexin.rp.sdk.template.NotificationTemplate;
import com.gexin.rp.sdk.template.style.Style6;
import com.lxh.demo.constant.AppInfo;

/**
 * created by lanxinghua@2dfire.com on 2020/8/8
 */
public class PushUtils {
    public static void main(String[] args) {

    }


    // 获取推送模板
    private static NotificationTemplate getTemplate(String title, String text){
        NotificationTemplate template = new NotificationTemplate();
        template.setAppId(AppInfo.APPID);
        template.setAppkey(AppInfo.APPKEY);
        // 透传消息设置，1为强制启动应用，客户端接收到消息后就会立即启动应用；2为等待应用启动
        template.setTransmissionType(1);
        // 设置定时展示时间
        // template.setDuration("2015-01-16 11:40:00", "2015-01-16 12:24:00");
        Style6 style6 = new Style6();
        style6.setTitle(title);
        style6.setText(text);
        style6.setBigStyle2(text);
        style6.setLogo("");
        style6.setLogoUrl("https://assets.2dfire.com/frontend/5a75e835c0b8c09f51acda09bdd68125.jpg");
        // 设置通知是否响铃，震动，或者可清除
        style6.setRing(true);
        style6.setVibrate(true);
        style6.setClearable(true);
        template.setStyle(style6);
        return template;
    }
}
