package cn.appsys.pojo;

import java.util.Date;

public class AdPromotion {
    private Integer id;//����ID
    private Integer appId;//appId
    private String adPicPath;//���ͼƬ�洢·��
    private Integer adPV;//�������
    private Integer carouselPosition;//�ֲ�λ��1-n��
    private Date startTime;//�����Чʱ��
    private Date endTime;//���ʧЧʱ��
    private Integer createdBy;//������
    private Date creationDate;//����ʱ��
    private Integer modifyBy;//������
    private Date modifyDate;//����ʱ��
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getAppId() {
        return appId;
    }
    public void setAppId(Integer appId) {
        this.appId = appId;
    }
    public String getAdPicPath() {
        return adPicPath;
    }
    public void setAdPicPath(String adPicPath) {
        this.adPicPath = adPicPath;
    }
    public Integer getAdPV() {
        return adPV;
    }
    public void setAdPV(Integer adPV) {
        this.adPV = adPV;
    }
    public Integer getCarouselPosition() {
        return carouselPosition;
    }
    public void setCarouselPosition(Integer carouselPosition) {
        this.carouselPosition = carouselPosition;
    }
    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    public Integer getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    public Integer getModifyBy() {
        return modifyBy;
    }
    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }
    public Date getModifyDate() {
        return modifyDate;
    }
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
