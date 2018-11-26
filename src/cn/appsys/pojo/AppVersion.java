package cn.appsys.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AppVersion {
    private Integer id;//����id
    private Integer appId;//appId
    private String versionNo;//�汾��
    private String versionInfo;//�汾����
    private Integer publishStatus;//����״̬id
    private String downloadLink;//apk�ļ���������
    private BigDecimal versionSize;//�汾��С
    private Integer createdBy;//������
    private Date creationDate;//����ʱ��
    private Integer modifyBy;//������
    private Date modifyDate;//����ʱ��
    private String apkLocPath;//apk�ļ��ķ������洢·��

    private String appName;//APP�������
    private String publishStatusName;//����״̬����
    private String apkFileName;//�ϴ���apk�ļ�����

    public String getApkFileName() {
        return apkFileName;
    }
    public void setApkFileName(String apkFileName) {
        this.apkFileName = apkFileName;
    }
    public String getPublishStatusName() {
        return publishStatusName;
    }
    public void setPublishStatusName(String publishStatusName) {
        this.publishStatusName = publishStatusName;
    }
    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }
    public String getApkLocPath() {
        return apkLocPath;
    }
    public void setApkLocPath(String apkLocPath) {
        this.apkLocPath = apkLocPath;
    }
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
    public String getVersionNo() {
        return versionNo;
    }
    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }
    public String getVersionInfo() {
        return versionInfo;
    }
    public void setVersionInfo(String versionInfo) {
        this.versionInfo = versionInfo;
    }
    public Integer getPublishStatus() {
        return publishStatus;
    }
    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }
    public String getDownloadLink() {
        return downloadLink;
    }
    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }
    public BigDecimal getVersionSize() {
        return versionSize;
    }
    public void setVersionSize(BigDecimal versionSize) {
        this.versionSize = versionSize;
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
