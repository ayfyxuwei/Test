package com.cn.hnust.pojo;

public class Delivery {
    private Integer delId;

    private String delName;

    private String delTel;

    private String delDate;

    private String delDz;

    public Integer getDelId() {
        return delId;
    }

    public void setDelId(Integer delId) {
        this.delId = delId;
    }

    public String getDelName() {
        return delName;
    }

    public void setDelName(String delName) {
        this.delName = delName == null ? null : delName.trim();
    }

    public String getDelTel() {
        return delTel;
    }

    public void setDelTel(String delTel) {
        this.delTel = delTel == null ? null : delTel.trim();
    }

    public String getDelDate() {
        return delDate;
    }

    public void setDelDate(String delDate) {
        this.delDate = delDate == null ? null : delDate.trim();
    }

    public String getDelDz() {
        return delDz;
    }

    public void setDelDz(String delDz) {
        this.delDz = delDz == null ? null : delDz.trim();
    }
}