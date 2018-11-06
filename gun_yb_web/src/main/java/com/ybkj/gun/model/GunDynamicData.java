package com.ybkj.gun.model;

import java.util.Date;

public class GunDynamicData {
    private Integer id;

    private String gunId;

    private Integer totalBulletNumber;

    private Integer bulletNumber;

    private Integer realTimeState;

    private Date createTime;

    private Date updateTime;

    private Integer gunDeviceState;

    private String gunDeviceBatteryPower;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGunId() {
        return gunId;
    }

    public void setGunId(String gunId) {
        this.gunId = gunId == null ? null : gunId.trim();
    }

    public Integer getTotalBulletNumber() {
        return totalBulletNumber;
    }

    public void setTotalBulletNumber(Integer totalBulletNumber) {
        this.totalBulletNumber = totalBulletNumber;
    }

    public Integer getBulletNumber() {
        return bulletNumber;
    }

    public void setBulletNumber(Integer bulletNumber) {
        this.bulletNumber = bulletNumber;
    }

    public Integer getRealTimeState() {
        return realTimeState;
    }

    public void setRealTimeState(Integer realTimeState) {
        this.realTimeState = realTimeState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getGunDeviceState() {
        return gunDeviceState;
    }

    public void setGunDeviceState(Integer gunDeviceState) {
        this.gunDeviceState = gunDeviceState;
    }

    public String getGunDeviceBatteryPower() {
        return gunDeviceBatteryPower;
    }

    public void setGunDeviceBatteryPower(String gunDeviceBatteryPower) {
        this.gunDeviceBatteryPower = gunDeviceBatteryPower == null ? null : gunDeviceBatteryPower.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}