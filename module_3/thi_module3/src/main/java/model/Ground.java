package model;

import java.sql.Date;

public class Ground {
    private String id;
    private int statusId;
    private int area;
    private int floor;
    private int typeId;
    private float price;
    private Date beginDate;
    private Date endDate;

    public Ground(String id, int statusId, int area, int floor, int typeId, float price, Date beginDate, Date endDate) {
        this.id = id;
        this.statusId = statusId;
        this.area = area;
        this.floor = floor;
        this.typeId = typeId;
        this.price = price;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
