package com.lxh.demo.constant;

import com.gexin.rp.sdk.http.IGtPush;

/**
 * created by lanxinghua@2dfire.com on 2020/8/8
 * app的信息
 */
public class AppInfo {
    public static final String APPID = "YLkQlPKsNcA9DDyqf7tcG4";
    public static final String APPKEY = "gU6EETIzQj6Vt4tMXhArR1";
    public static final String MASTERSECRET = "BTtMJqmRS87Leo96D5jFp8";

    public static final String CID = "eca0a0321cf5312dc6295a35f4701682";
    public static final String CID_2 = "";

    public static final String DEVICETOKEN = "";

    public static final String ALIAS = "alias1";
    public static final String ALIAS_2 = "alias2";

    public static final String TAG = "tag1";
    public static final String TAG_2 = "tag2";

    public static final String PNMD5 = "xxxx";

    public static IGtPush push = new IGtPush(APPKEY, MASTERSECRET);

    private static String host = "http://sdk.open.api.igexin.com/apiex.htm";
}
