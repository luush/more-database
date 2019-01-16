package org.lszjaf.dagger.moredatabase.bean;

public class Post {
    private Long id;

    private String channelId;

    private String financialProductId;

    private Integer operationType;

    private Integer operationSubType;

    private Integer clientType;

    private Integer customerType;

    private Long frontId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getFinancialProductId() {
        return financialProductId;
    }

    public void setFinancialProductId(String financialProductId) {
        this.financialProductId = financialProductId == null ? null : financialProductId.trim();
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public Integer getOperationSubType() {
        return operationSubType;
    }

    public void setOperationSubType(Integer operationSubType) {
        this.operationSubType = operationSubType;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public Integer getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    public Long getFrontId() {
        return frontId;
    }

    public void setFrontId(Long frontId) {
        this.frontId = frontId;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", channelId='" + channelId + '\'' +
                ", financialProductId='" + financialProductId + '\'' +
                ", operationType=" + operationType +
                ", operationSubType=" + operationSubType +
                ", clientType=" + clientType +
                ", customerType=" + customerType +
                ", frontId=" + frontId +
                '}';
    }
}
