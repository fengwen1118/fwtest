package com.ihandy.quote_core.bean.response;

/**
 * Created by fengwen on 2016/4/30.
 */
public class ClaimResponse extends BaseResponse {
    private String PayCompanyName;//保险公司
    private Double PayAmount;//出险金额
    private String EndCaseTime;//结案时间
    private String LossTime;//出险时间

    public String getPayCompanyName() {
        return PayCompanyName;
    }

    public void setPayCompanyName(String payCompanyName) {
        PayCompanyName = payCompanyName;
    }

    public String getLossTime() {
        return LossTime;
    }

    public void setLossTime(String lossTime) {
        LossTime = lossTime;
    }

    public String getEndCaseTime() {
        return EndCaseTime;
    }

    public void setEndCaseTime(String endCaseTime) {
        EndCaseTime = endCaseTime;
    }

    public Double getPayAmount() {
        return PayAmount;
    }

    public void setPayAmount(Double payAmount) {
        PayAmount = payAmount;
    }
}
