package com.ihandy.quote_core.service.impl;

import com.ihandy.quote_core.bean.Cookie;
import com.ihandy.quote_core.bean.response.CarInfoResponse;
import com.ihandy.quote_core.bean.response.ClaimResponse;
import com.ihandy.quote_core.bean.response.QuoteResponse;
import com.ihandy.quote_core.service.IRBService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fengwen on 2016/4/29.
 */
@Service
public class RBServiceImpl implements IRBService {
    public CarInfoResponse getCarInfoByLicenseNo(String licenseNo, Cookie cookie) {
        CarInfoResponse response =null;
        // TODO: 2016/4/30  获取车架号、发动机号、品牌型号
        return response;
    }

    public QuoteResponse getQuoteInfoByCarInfo(CarInfoResponse carInfo, Cookie cookie) {
        return null;
    }

    public ClaimResponse getClaimInfoByCarInfo(CarInfoResponse carInfo, Cookie cookie) {
        return null;
    }

    public List<ClaimResponse> getClaimInfoList(CarInfoResponse carInfo, Cookie cookie) {
        return null;
    }



}
