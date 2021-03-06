package com.jingrui.jrap.activiti.dto;

/**
 * Auto Generated By Jrap Code Generator
 **/

import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@ExtensionAttribute(disable = true)
@Table(name = "act_re_model")
public class ReModel {
    @Id
    @GeneratedValue
    private String id_;

    private Long rev_;

    private String name_;

    private String key_;

    private String category_;

    private Date createTime_;

    private Date lastUpdateTime_;

    private Long version_;

    private String metaInfo_;

    private String deploymentId_;

    private String editorSourceValueId_;

    private String editorSourceExtraValueId_;

    private String tenantId_;


    public void setId_(String id_) {
        this.id_ = id_;
    }

    public String getId_() {
        return id_;
    }

    public void setRev_(Long rev_) {
        this.rev_ = rev_;
    }

    public Long getRev_() {
        return rev_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getName_() {
        return name_;
    }

    public void setKey_(String key_) {
        this.key_ = key_;
    }

    public String getKey_() {
        return key_;
    }

    public void setCategory_(String category_) {
        this.category_ = category_;
    }

    public String getCategory_() {
        return category_;
    }

    public void setCreateTime_(Date createTime_) {
        this.createTime_ = createTime_;
    }

    public Date getCreateTime_() {
        return createTime_;
    }

    public void setLastUpdateTime_(Date lastUpdateTime_) {
        this.lastUpdateTime_ = lastUpdateTime_;
    }

    public Date getLastUpdateTime_() {
        return lastUpdateTime_;
    }

    public void setVersion_(Long version_) {
        this.version_ = version_;
    }

    public Long getVersion_() {
        return version_;
    }

    public void setMetaInfo_(String metaInfo_) {
        this.metaInfo_ = metaInfo_;
    }

    public String getMetaInfo_() {
        return metaInfo_;
    }

    public void setDeploymentId_(String deploymentId_) {
        this.deploymentId_ = deploymentId_;
    }

    public String getDeploymentId_() {
        return deploymentId_;
    }

    public void setEditorSourceValueId_(String editorSourceValueId_) {
        this.editorSourceValueId_ = editorSourceValueId_;
    }

    public String getEditorSourceValueId_() {
        return editorSourceValueId_;
    }

    public void setEditorSourceExtraValueId_(String editorSourceExtraValueId_) {
        this.editorSourceExtraValueId_ = editorSourceExtraValueId_;
    }

    public String getEditorSourceExtraValueId_() {
        return editorSourceExtraValueId_;
    }

    public void setTenantId_(String tenantId_) {
        this.tenantId_ = tenantId_;
    }

    public String getTenantId_() {
        return tenantId_;
    }

}
