package com.ihandy.quote_core.bean.response;

import java.security.Timestamp;

/**
 * Created by fengwen on 2016/4/29.
 */
public class UserInfoResponse extends  BaseResponse{

    public String CarUsedType; //使用性质
   
    public Timestamp ForceEndDate;//交强险到期日期

    public Timestamp BizEndDate;//商业险到期日期
   
    public String CarVin;//车架号
   
    public String MoldName;//品牌型号
  
    public String EngineNo;//发动机号
    
    public String LicenseOwner;// 车主姓名

    public double PurchasePrice; //购买价格
    
    public String LicenseOwnerIdCardNo;//证件号码
   
    public int LicenseOwnerIdCardType;//证件类型
    
    public String InsuredName; //被保险人

    public String PostedName;//投保人
   
    public String LicenseNo;//车牌号

    public Timestamp CarRegisterDate;//车辆注册日期
  
    public int CarSeated;//座位数量

    public int CityCode ; //城市编码
    
    public int CompanyId; //sourceId公司

    public QuoteResponse quoteResponse;//报价bean



    public String getCarUsedType() {
        return CarUsedType;
    }

    public void setCarUsedType(String carUsedType) {
        CarUsedType = carUsedType;
    }

    public Timestamp getForceEndDate() {
        return ForceEndDate;
    }

    public void setForceEndDate(Timestamp forceEndDate) {
        ForceEndDate = forceEndDate;
    }

    public Timestamp getBizEndDate() {
        return BizEndDate;
    }

    public void setBizEndDate(Timestamp bizEndDate) {
        BizEndDate = bizEndDate;
    }

    public String getCarVin() {
        return CarVin;
    }

    public void setCarVin(String carVin) {
        CarVin = carVin;
    }

    public String getMoldName() {
        return MoldName;
    }

    public void setMoldName(String moldName) {
        MoldName = moldName;
    }

    public String getEngineNo() {
        return EngineNo;
    }

    public void setEngineNo(String engineNo) {
        EngineNo = engineNo;
    }

    public String getLicenseOwner() {
        return LicenseOwner;
    }

    public void setLicenseOwner(String licenseOwner) {
        LicenseOwner = licenseOwner;
    }

    public double getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        PurchasePrice = purchasePrice;
    }

    public String getLicenseOwnerIdCardNo() {
        return LicenseOwnerIdCardNo;
    }

    public void setLicenseOwnerIdCardNo(String licenseOwnerIdCardNo) {
        LicenseOwnerIdCardNo = licenseOwnerIdCardNo;
    }

    public int getLicenseOwnerIdCardType() {
        return LicenseOwnerIdCardType;
    }

    public void setLicenseOwnerIdCardType(int licenseOwnerIdCardType) {
        LicenseOwnerIdCardType = licenseOwnerIdCardType;
    }

    public String getInsuredName() {
        return InsuredName;
    }

    public void setInsuredName(String insuredName) {
        InsuredName = insuredName;
    }

    public String getPostedName() {
        return PostedName;
    }

    public void setPostedName(String postedName) {
        PostedName = postedName;
    }

    public String getLicenseNo() {
        return LicenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        LicenseNo = licenseNo;
    }

    public Timestamp getCarRegisterDate() {
        return CarRegisterDate;
    }

    public void setCarRegisterDate(Timestamp carRegisterDate) {
        CarRegisterDate = carRegisterDate;
    }

    public int getCarSeated() {
        return CarSeated;
    }

    public void setCarSeated(int carSeated) {
        CarSeated = carSeated;
    }

    public int getCityCode() {
        return CityCode;
    }

    public void setCityCode(int cityCode) {
        CityCode = cityCode;
    }

    public int getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(int companyId) {
        CompanyId = companyId;
    }

    public QuoteResponse getQuoteResponse() {
        return quoteResponse;
    }

    public void setQuoteResponse(QuoteResponse quoteResponse) {
        this.quoteResponse = quoteResponse;
    }
}
