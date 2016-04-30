package com.ihandy.quote_core.service;

import com.ihandy.quote_core.bean.Cookie;
import com.ihandy.quote_core.bean.response.UserInfoResponse;

/**
 * Created by fengwen on 2016/4/29.
 */
public interface RBService {
    UserInfoResponse getCarInfoByLicenseNo(String licenseNo, Cookie cookie);
}
