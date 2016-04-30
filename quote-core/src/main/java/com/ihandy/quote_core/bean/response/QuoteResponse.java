package com.ihandy.quote_core.bean.response;

/**
 * Created by fengwen on 2016/4/29.
 */
public class QuoteResponse extends BaseResponse{

    public double CheSun;//车损
    public double SanZhe;//三者
    public double DaoQiang;//盗抢
    public double SiJi;//司机
    public double ChengKe;//乘客
    public double Boli;//玻璃
    public double HuaHen;//划痕

    public double  BuJiMianCheSun;//不计免车损
    public double  BuJiMianSanZhe;//不计免三者
    public double  BuJiMianDaoQiang;//不计免盗抢
    public double  BuJiMianRenYuan;//不计免人员
    public double  BuJiMianFuJia;//不计免附加

    public double SheShui;//涉水
    public double CheDeng;//车灯
    public double ZiRan;//自燃

    public double getCheDeng() {
        return CheDeng;
    }

    public void setCheDeng(double cheDeng) {
        CheDeng = cheDeng;
    }

    public double getCheSun() {
        return CheSun;
    }

    public void setCheSun(double cheSun) {
        CheSun = cheSun;
    }

    public double getSanZhe() {
        return SanZhe;
    }

    public void setSanZhe(double sanZhe) {
        SanZhe = sanZhe;
    }

    public double getDaoQiang() {
        return DaoQiang;
    }

    public void setDaoQiang(double daoQiang) {
        DaoQiang = daoQiang;
    }

    public double getSiJi() {
        return SiJi;
    }

    public void setSiJi(double siJi) {
        SiJi = siJi;
    }

    public double getChengKe() {
        return ChengKe;
    }

    public void setChengKe(double chengKe) {
        ChengKe = chengKe;
    }

    public double getBoli() {
        return Boli;
    }

    public void setBoli(double boli) {
        Boli = boli;
    }

    public double getHuaHen() {
        return HuaHen;
    }

    public void setHuaHen(double huaHen) {
        HuaHen = huaHen;
    }

    public double getBuJiMianCheSun() {
        return BuJiMianCheSun;
    }

    public void setBuJiMianCheSun(double buJiMianCheSun) {
        BuJiMianCheSun = buJiMianCheSun;
    }

    public double getBuJiMianSanZhe() {
        return BuJiMianSanZhe;
    }

    public void setBuJiMianSanZhe(double buJiMianSanZhe) {
        BuJiMianSanZhe = buJiMianSanZhe;
    }

    public double getBuJiMianDaoQiang() {
        return BuJiMianDaoQiang;
    }

    public void setBuJiMianDaoQiang(double buJiMianDaoQiang) {
        BuJiMianDaoQiang = buJiMianDaoQiang;
    }

    public double getBuJiMianRenYuan() {
        return BuJiMianRenYuan;
    }

    public void setBuJiMianRenYuan(double buJiMianRenYuan) {
        BuJiMianRenYuan = buJiMianRenYuan;
    }

    public double getBuJiMianFuJia() {
        return BuJiMianFuJia;
    }

    public void setBuJiMianFuJia(double buJiMianFuJia) {
        BuJiMianFuJia = buJiMianFuJia;
    }

    public double getSheShui() {
        return SheShui;
    }

    public void setSheShui(double sheShui) {
        SheShui = sheShui;
    }

    public double getZiRan() {
        return ZiRan;
    }

    public void setZiRan(double ziRan) {
        ZiRan = ziRan;
    }

    public double getBizTotal()
    {
        return  (this.CheSun + this.SanZhe + this.DaoQiang + this.SiJi + this.ChengKe + this.Boli + this.HuaHen + this.BuJiMianCheSun + this.BuJiMianSanZhe + this.BuJiMianDaoQiang + this.BuJiMianRenYuan + this.BuJiMianFuJia  + this.SheShui + this.CheDeng + this.ZiRan);
    }
}
