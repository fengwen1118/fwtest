package com.ihandy.quote_core.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by fengwen on 2016/5/8.
 */
public class SysConfigInfo {
    private static Logger logger = LoggerFactory.getLogger(SysConfigInfo.class);

    private static Properties properties;

    /** ====================================================人保begin====================*/
    /** 人保域名*/
     public static String RB_domain ;

    /**首页面*/
     public static String  RB_index;
     public static Integer RB_index_pageNum;
    /**承保页面 */
     public static String  RB_calogin;
     public static Integer RB_calogin_pageNum;
     /**车商渠道专用出单页面 */
     public static String RB_quickProposal ;
     public static Integer RB_quickProposal_pageNum;
     /**续保对话框 */
     public static String  RB_editRenewalSearch ;
     public static Integer  RB_editRenewalSearch_pageNum;
     /**查看保单数据源 */
     public static String  RB_selectRenewal;
     public static Integer RB_selectRenewal_pageNum;
     /**浏览保单 */
     public static String  RB_browsePolicyNo;
     public static Integer RB_browsePolicyNo_pageNum;
     /**车辆信息 */
     public static String  RB_carTab;
     public static Integer RB_carTab_pageNum;
     /**关系人信息 */
     public static String  RB_insuredTab ;
     public static Integer RB_insuredTab_pageNum;
     /**保险责任 */
     public static String  RB_kindTab;
     public static Integer RB_kindTab_pageNum;
     /**查询理赔信息 */
     public static String  RB_queryClaimsMsg;
     public static Integer RB_queryClaimsMsg_pageNum;


    static {
        try {
            properties = new Properties();
            InputStream is = SysConfigInfo.class.getClassLoader().getResource("url.properties").openStream();
            properties.load(is);
            // 微信相关接口
            RB_domain = getString("rb.domain", "");

            RB_index = getString("rb.index", "");
            RB_index_pageNum =getInt("rb.index.pageNum", 0);
            RB_calogin = getString("rb.calogin", "");
            RB_calogin_pageNum =getInt("rb.calogin.pageNum", 0);
            RB_quickProposal = getString("rb.quickProposal", "");
            RB_quickProposal_pageNum =getInt("rb.quickProposal.pageNum", 0);
            RB_editRenewalSearch = getString("rb.editRenewalSearch", "");
            RB_editRenewalSearch_pageNum = getInt("rb.editRenewalSearch.pageNum", 0);
            RB_selectRenewal = getString("rb.selectRenewal", "");
            RB_selectRenewal_pageNum = getInt("rb.selectRenewal.pageNum", 0);
            RB_browsePolicyNo = getString("rb.browsePolicyNo", "");
            RB_browsePolicyNo_pageNum = getInt("rb.browsePolicyNo.pageNum", 0);
            RB_carTab=getString("rb.carTab","");
            RB_carTab_pageNum = getInt("rb.carTab.pageNum", 0);
            RB_insuredTab = getString("rb.insuredTab", "");
            RB_insuredTab_pageNum =getInt("rb.insuredTab.pageNum", 0);
            RB_kindTab = getString("rb.kindTab", "");
            RB_kindTab_pageNum = getInt("rb.kindTab.pageNum", 0);
            RB_queryClaimsMsg = getString("rb.queryClaimsMsg", "");
            RB_queryClaimsMsg_pageNum = getInt("rb.queryClaimsMsg.pageNum", 0);

        } catch (Exception e) {
            logger.error("加载属性文件失败",e);
        }
    }

    private static String getString(String key, String defaultValue) {
        String value = properties.getProperty(key);
        if (null != value && !"".endsWith(value)) {
            return value.trim();
        } else {
            return defaultValue;
        }
    }

    private static String getString(String key, String defaultValue, String prefix) {
        String value = properties.getProperty(key);
        if (null != value && !"".endsWith(value)) {
            return prefix + value.trim();
        } else {
            return defaultValue;
        }
    }

    private static int getInt(String key, int defaultValue) {
        String value = properties.getProperty(key);
        if (null != value) {
            return Integer.parseInt(value);
        } else {
            return defaultValue;
        }
    }

    public static Map getSelectedFields(String prex){
        Map map =new HashMap();
        try {
            Class clazz = Class.forName("com.ihandy.quote_core.utils.SysConfigInfo");//根据类名获得其对应的Class对象 写上你想要的类名就是了 注意是全名 如果有包的话要加上 比如java.Lang.String
            Field[]  fields = clazz.getDeclaredFields();//根据Class对象获得属性 私有的也可以获得

            for(Field f : fields) {
                String name = f.getName();
                if(name.contains(prex)){
                    if(f.getType().getName().equals("java.lang.String")){
                        String value = getString(f.getName(),"");
                        map.put(name,value);
                    }else if(f.getType().getName().equals("java.lang.Integer")){
                         int value =getInt(f.getName(),0);
                        map.put(name,value);
                    }else{}
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return map;
    }
    public static void main(String[] args) {
        Map map  = getSelectedFields("RB_");
        logger.info(map+"");
    }


}
