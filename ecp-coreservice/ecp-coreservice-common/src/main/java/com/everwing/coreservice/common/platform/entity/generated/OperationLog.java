package com.everwing.coreservice.common.platform.entity.generated;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table operation_log
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class OperationLog implements Serializable {
    /**
     * Database Column Remarks:
     *   必填
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_log.operation_log_id
     *
     * @mbg.generated
     */
    private String operationLogId;

    /**
     * Database Column Remarks:
     *   公司ID，非必填
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_log.company_id
     *
     * @mbg.generated
     */
    private String companyId;

    /**
     * Database Column Remarks:
     *   非必填
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_log.project_id
     *
     * @mbg.generated
     */
    private String projectId;

    /**
     * Database Column Remarks:
     *   日志二级分类，必填
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_log.model_name
     *
     * @mbg.generated
     */
    private String modelName;

    /**
     * Database Column Remarks:
     *   日志一级分类，必填
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_log.business_name
     *
     * @mbg.generated
     */
    private String businessName;

    /**
     * Database Column Remarks:
     *   必填
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   操作角色，必填
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_log.operation_role_name
     *
     * @mbg.generated
     */
    private String operationRoleName;

    /**
     * Database Column Remarks:
     *   必填
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_log.operation_user_name
     *
     * @mbg.generated
     */
    private String operationUserName;

    /**
     * Database Column Remarks:
     *   操作数据ID，非必填
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_log.operation_data_id
     *
     * @mbg.generated
     */
    private String operationDataId;

    /**
     * Database Column Remarks:
     *   操作数据，非必填
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_log.operation_data
     *
     * @mbg.generated
     */
    private String operationData;

    /**
     * Database Column Remarks:
     *   操作内容描述，非必填
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_log.operation_description
     *
     * @mbg.generated
     */
    private String operationDescription;

    /**
     * Database Column Remarks:
     *   数据的增删改查类型，必填。1=增加 2=删除 3=修改 4=查询
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_log.operation_type
     *
     * @mbg.generated
     */
    private Integer operationType;

    /**
     * Database Column Remarks:
     *   非必填
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_log.operation_ip
     *
     * @mbg.generated
     */
    private String operationIp;

    /**
     * Database Column Remarks:
     *   日志来源，必填
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_log.log_source_type
     *
     * @mbg.generated
     */
    private String logSourceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_log.is_success
     *
     * @mbg.generated
     */
    private Boolean isSuccess;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table operation_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_log.operation_log_id
     *
     * @return the value of operation_log.operation_log_id
     *
     * @mbg.generated
     */
    public String getOperationLogId() {
        return operationLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_log.operation_log_id
     *
     * @param operationLogId the value for operation_log.operation_log_id
     *
     * @mbg.generated
     */
    public void setOperationLogId(String operationLogId) {
        this.operationLogId = operationLogId == null ? null : operationLogId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_log.company_id
     *
     * @return the value of operation_log.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_log.company_id
     *
     * @param companyId the value for operation_log.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_log.project_id
     *
     * @return the value of operation_log.project_id
     *
     * @mbg.generated
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_log.project_id
     *
     * @param projectId the value for operation_log.project_id
     *
     * @mbg.generated
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_log.model_name
     *
     * @return the value of operation_log.model_name
     *
     * @mbg.generated
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_log.model_name
     *
     * @param modelName the value for operation_log.model_name
     *
     * @mbg.generated
     */
    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_log.business_name
     *
     * @return the value of operation_log.business_name
     *
     * @mbg.generated
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_log.business_name
     *
     * @param businessName the value for operation_log.business_name
     *
     * @mbg.generated
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_log.create_time
     *
     * @return the value of operation_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_log.create_time
     *
     * @param createTime the value for operation_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_log.operation_role_name
     *
     * @return the value of operation_log.operation_role_name
     *
     * @mbg.generated
     */
    public String getOperationRoleName() {
        return operationRoleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_log.operation_role_name
     *
     * @param operationRoleName the value for operation_log.operation_role_name
     *
     * @mbg.generated
     */
    public void setOperationRoleName(String operationRoleName) {
        this.operationRoleName = operationRoleName == null ? null : operationRoleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_log.operation_user_name
     *
     * @return the value of operation_log.operation_user_name
     *
     * @mbg.generated
     */
    public String getOperationUserName() {
        return operationUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_log.operation_user_name
     *
     * @param operationUserName the value for operation_log.operation_user_name
     *
     * @mbg.generated
     */
    public void setOperationUserName(String operationUserName) {
        this.operationUserName = operationUserName == null ? null : operationUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_log.operation_data_id
     *
     * @return the value of operation_log.operation_data_id
     *
     * @mbg.generated
     */
    public String getOperationDataId() {
        return operationDataId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_log.operation_data_id
     *
     * @param operationDataId the value for operation_log.operation_data_id
     *
     * @mbg.generated
     */
    public void setOperationDataId(String operationDataId) {
        this.operationDataId = operationDataId == null ? null : operationDataId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_log.operation_data
     *
     * @return the value of operation_log.operation_data
     *
     * @mbg.generated
     */
    public String getOperationData() {
        return operationData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_log.operation_data
     *
     * @param operationData the value for operation_log.operation_data
     *
     * @mbg.generated
     */
    public void setOperationData(String operationData) {
        this.operationData = operationData == null ? null : operationData.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_log.operation_description
     *
     * @return the value of operation_log.operation_description
     *
     * @mbg.generated
     */
    public String getOperationDescription() {
        return operationDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_log.operation_description
     *
     * @param operationDescription the value for operation_log.operation_description
     *
     * @mbg.generated
     */
    public void setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription == null ? null : operationDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_log.operation_type
     *
     * @return the value of operation_log.operation_type
     *
     * @mbg.generated
     */
    public Integer getOperationType() {
        return operationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_log.operation_type
     *
     * @param operationType the value for operation_log.operation_type
     *
     * @mbg.generated
     */
    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_log.operation_ip
     *
     * @return the value of operation_log.operation_ip
     *
     * @mbg.generated
     */
    public String getOperationIp() {
        return operationIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_log.operation_ip
     *
     * @param operationIp the value for operation_log.operation_ip
     *
     * @mbg.generated
     */
    public void setOperationIp(String operationIp) {
        this.operationIp = operationIp == null ? null : operationIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_log.log_source_type
     *
     * @return the value of operation_log.log_source_type
     *
     * @mbg.generated
     */
    public String getLogSourceType() {
        return logSourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_log.log_source_type
     *
     * @param logSourceType the value for operation_log.log_source_type
     *
     * @mbg.generated
     */
    public void setLogSourceType(String logSourceType) {
        this.logSourceType = logSourceType == null ? null : logSourceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_log.is_success
     *
     * @return the value of operation_log.is_success
     *
     * @mbg.generated
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_log.is_success
     *
     * @param isSuccess the value for operation_log.is_success
     *
     * @mbg.generated
     */
    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operationLogId=").append(operationLogId);
        sb.append(", companyId=").append(companyId);
        sb.append(", projectId=").append(projectId);
        sb.append(", modelName=").append(modelName);
        sb.append(", businessName=").append(businessName);
        sb.append(", createTime=").append(createTime);
        sb.append(", operationRoleName=").append(operationRoleName);
        sb.append(", operationUserName=").append(operationUserName);
        sb.append(", operationDataId=").append(operationDataId);
        sb.append(", operationData=").append(operationData);
        sb.append(", operationDescription=").append(operationDescription);
        sb.append(", operationType=").append(operationType);
        sb.append(", operationIp=").append(operationIp);
        sb.append(", logSourceType=").append(logSourceType);
        sb.append(", isSuccess=").append(isSuccess);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}