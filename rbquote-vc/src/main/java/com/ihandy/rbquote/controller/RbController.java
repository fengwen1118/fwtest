package com.ihandy.rbquote.controller;

import com.ihandy.quote_common.HttpUtils;
import com.ihandy.quote_core.bean.request.RBSysLoginRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengwen on 2016/4/28.
 */
@Controller
@RequestMapping("/Rb")
public class RbController {
    private static Logger logger = LoggerFactory.getLogger(RbController.class);


    /**
     * 查询续保信息
     *
     * @param LicenseNo
     * @param CityCode
     * @param CustKey
     * @param SecCode
     * @return
     */
    @RequestMapping("/getRenewalInfo")
    @Transactional
    @ResponseBody
    public Map<String, Object> getRenewalInfo( String LicenseNo, int CityCode,String CustKey,String SecCode) {

        try {

        } catch (Exception e) {

        }
        return null;
    }

    /**
     *  根据车牌号获取车架号、发动机号、品牌型号接口
     * @param LicenseNo
     * @return
     */
    @RequestMapping("/getCarInfoByLicenseNo")
    @Transactional
    @ResponseBody
    public Map<String, Object> getCarInfoByLicenseNo( String LicenseNo , RBSysLoginRequest request) {
        Map map =new HashMap();
        try {

        } catch (Exception e) {

        }
        return map;
    }

    public String MainUrl = "http://10.134.136.48:8888";
    public String LoginURL = this.MainUrl + "/portal/index.jsp";
    public String param = "service=http%3A%2F%2F10.134.136.48%3A80%2Fportal%2Findex.jsp";
    public Map<String ,Object> RbSysLogin(){
        Map map =  HttpUtils.sendPost(LoginURL,param);
        return map;
    }


}
