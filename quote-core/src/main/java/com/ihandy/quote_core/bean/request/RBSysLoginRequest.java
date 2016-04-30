package com.ihandy.quote_core.bean.request;

import java.util.Map;

/**
 * Created by fengwen on 2016/4/29.
 */
public class RBSysLoginRequest {

    public String UserName;
    public String Password;
    public String Lt;
    public Map<String, Object> Cookies;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getLt() {
        return Lt;
    }

    public void setLt(String lt) {
        Lt = lt;
    }

    public Map<String, Object> getCookies() {
        return Cookies;
    }

    public void setCookies(Map<String, Object> cookies) {
        Cookies = cookies;
    }
}
