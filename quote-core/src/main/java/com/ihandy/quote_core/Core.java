package com.ihandy.quote_core;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by fengwen on 2016/4/28.
 */
public class Core {
    private static Log log = LogFactory.getLog(Core.class);
    public boolean checkLoginRequest(RBRequestSysLogin request){
        Boolean flag =true;

        if(null==request.getUserName()||null==request.getPassword()||null ==request.getCookies()){
            flag = false;
            log.info("访问页面请求信息不完整/n");
        }
        return flag;
    };

}
