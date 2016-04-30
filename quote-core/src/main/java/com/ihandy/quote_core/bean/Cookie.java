package com.ihandy.quote_core.bean;

import java.util.Map;

/**
 * Created by fengwen on 2016/4/29.
 */
public class Cookie {
    public String prpall;
    public String JSESSIONID;
    public String CASTGC ;
    public String BOCINS_prpall_Cookie;
    public String PICCINS_JFCD_Cookie;
    public Map<String ,Object> map;

    public String getPrpall() {
        return prpall;
    }

    public void setPrpall(String prpall) {
        this.prpall = prpall;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public String getPICCINS_JFCD_Cookie() {
        return PICCINS_JFCD_Cookie;
    }

    public void setPICCINS_JFCD_Cookie(String PICCINS_JFCD_Cookie) {
        this.PICCINS_JFCD_Cookie = PICCINS_JFCD_Cookie;
    }

    public String getBOCINS_prpall_Cookie() {
        return BOCINS_prpall_Cookie;
    }

    public void setBOCINS_prpall_Cookie(String BOCINS_prpall_Cookie) {
        this.BOCINS_prpall_Cookie = BOCINS_prpall_Cookie;
    }

    public String getCASTGC() {
        return CASTGC;
    }

    public void setCASTGC(String CASTGC) {
        this.CASTGC = CASTGC;
    }

    public String getJSESSIONID() {
        return JSESSIONID;
    }

    public void setJSESSIONID(String JSESSIONID) {
        this.JSESSIONID = JSESSIONID;
    }
}
