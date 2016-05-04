package com.ihandy.quote_common;

/**
 * Created by fengwen on 2016/4/29.
 */
public class SysContantUrl {
    public String index = "/portal/index.jsp";//首页面 ticket=ST-43945-DXIbKb2cu0FME6dmle7Q-cas
    public String calogin = "/prpall/index.jsp";//承保页面 calogin&ticket=ST-44088-NMmm4dWQe0bb1mwT2Vha-cas
    public String quickProposal = "/prpall/business/quickProposal";//车商渠道专用出单页面 bizType=PROPOSAL&editType=NEW&is4S=Y
    public String editRenewalSearch = "prpall/business/editRenewalSearch"; //续保对话框
    public String selectRenewal = "/prpall/business/selectRenewal" ; //查看保单数据源  "pageSize="+pageSize+"&pageNo="+pageNo;
    public String browsePolicyNo = "/prpall/business/browsePolicyNo"; //浏览保单  bizNo=PDAT20151102T000182528
    public String carTab = "/business/showCitemCar";//车辆信息 RbQuestBrowsePolicyNo
    public String insuredTab = "/business/showCinsured";// 关系人信息 RbQuestBrowsePolicyNo
    public String kindTab = "'/business/showCitemKind";// 保险责任 RbQuestBrowsePolicyNo

    public String queryClaimsMsg ="/prpall/business/queryClaimsMsg";//查询理赔信息 bizNo=PDAT20151102T000182528&bizType=POLICY

}
