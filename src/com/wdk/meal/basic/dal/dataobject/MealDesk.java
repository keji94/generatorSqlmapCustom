package com.wdk.meal.basic.dal.dataobject;

import java.util.Date;

public class MealDesk {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String deskCode;

    private String deskSpec;

    private Long areaId;

    private Byte deskType;

    private String deskName;

    private String arCode;

    private String warehouseCode;

    private String shopCode;

    private String restaurantCode;

    private Byte status;

    private Byte active;

    private String deskId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getDeskCode() {
        return deskCode;
    }

    public void setDeskCode(String deskCode) {
        this.deskCode = deskCode == null ? null : deskCode.trim();
    }

    public String getDeskSpec() {
        return deskSpec;
    }

    public void setDeskSpec(String deskSpec) {
        this.deskSpec = deskSpec == null ? null : deskSpec.trim();
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Byte getDeskType() {
        return deskType;
    }

    public void setDeskType(Byte deskType) {
        this.deskType = deskType;
    }

    public String getDeskName() {
        return deskName;
    }

    public void setDeskName(String deskName) {
        this.deskName = deskName == null ? null : deskName.trim();
    }

    public String getArCode() {
        return arCode;
    }

    public void setArCode(String arCode) {
        this.arCode = arCode == null ? null : arCode.trim();
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode == null ? null : warehouseCode.trim();
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode == null ? null : shopCode.trim();
    }

    public String getRestaurantCode() {
        return restaurantCode;
    }

    public void setRestaurantCode(String restaurantCode) {
        this.restaurantCode = restaurantCode == null ? null : restaurantCode.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    public String getDeskId() {
        return deskId;
    }

    public void setDeskId(String deskId) {
        this.deskId = deskId == null ? null : deskId.trim();
    }
}