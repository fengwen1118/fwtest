package com.ihandy.quote_core.bean.response;

/**
 * Created by fengwen on 2016/4/29.
 */
public class BaseResponse {
    public int ErrCode;

    public String ErrMsg;

    public int getErrCode() {
        return ErrCode;
    }

    public void setErrCode(int errCode) {
        ErrCode = errCode;
    }

    public String getErrMsg() {
        return ErrMsg;
    }

    public void setErrMsg(String errMsg) {
        ErrMsg = errMsg;
    }
}
