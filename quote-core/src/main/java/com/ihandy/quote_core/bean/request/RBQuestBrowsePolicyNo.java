package com.ihandy.quote_core.bean.request;

/**
 * Created by fengwen on 2016/4/29.
 */
public class RBQuestBrowsePolicyNo {

 /*   var editType = document.getElementById("editType");
    var bizType = document.getElementById("bizType");
    var bizNo = document.getElementById("bizNo");
    var riskCode = document.getElementById("prpCmain.riskCode");
    var minusFlag = document.getElementById("minusFlag");
    var contractNo = document.getElementById("prpCmain.contractNo");
    var comCode = document.getElementById("prpCmain.comCode");
    var originQuery = document.getElementById("originQuery");
    var proposalNo = document.getElementById("prpCmain.proposalNo");
    if(proposalNo.value == null || proposalNo.value==''){
        proposalNo = document.getElementById("prpCmainCI.proposalNo");
    }
    var prarmeterURL = "?";
    prarmeterURL += 'editType=' + editType.value + '&bizType=' + bizType.value
    + '&bizNo=' + bizNo.value + '&riskCode=' + document.getElementById("riskCode").value
    + '&minusFlag=' + minusFlag.value + "&contractNo=" + contractNo.value
    +"&comCode="+comCode.value+"&originQuery="+originQuery.value+"&proposalNo="+proposalNo.value;*/
    public int editType;
    public int bizType;
    public String bizNo;
    public String riskCode;
    public String minusFlag;
    public String contractNo;
    public String comCode;
    public String originQuery;
    public String proposalNo;

}
