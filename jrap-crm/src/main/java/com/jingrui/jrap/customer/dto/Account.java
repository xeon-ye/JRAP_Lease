package com.jingrui.jrap.customer.dto;

/**
 * Auto Generated By Jrap Code Generator
 **/

import javax.persistence.*;

import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import com.jingrui.jrap.mybatis.common.query.JoinColumn;
import com.jingrui.jrap.mybatis.common.query.JoinOn;
import com.jingrui.jrap.mybatis.common.query.JoinTable;
import com.jingrui.jrap.mybatis.common.query.Where;
import org.hibernate.validator.constraints.Length;

import com.jingrui.jrap.system.dto.BaseDTO;
import com.jingrui.jrap.finance.dto.Bank;

import java.util.Date;
import javax.persistence.criteria.JoinType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@ExtensionAttribute(disable = true)
@Table(name = "afd_account")
public class Account extends BaseDTO {

    public static final String FIELD_ACCOUNT_ID = "accountId";
    public static final String FIELD_ACCOUNT_NUMBER = "accountNumber";
    public static final String FIELD_ACCOUNT_NAME = "accountName";
    public static final String FIELD_ACCOUNT_TYPE = "accountType";
    public static final String FIELD_ACCOUNT_CLASS = "accountClass";
    public static final String FIELD_ACCOUNT_USAGE = "accountUsage";
    public static final String FIELD_BANK_ID = "bankId";
    public static final String FIELD_BANK_NAME = "bankName";
    public static final String FIELD_OWNER_TYPE = "ownerType";
    public static final String FIELD_OWNER_ID = "ownerId";
    public static final String FIELD_ENABLED_FLAG = "enabledFlag";

    @Id
    @GeneratedValue
    @Where
    private Long accountId;

    @Length(max = 60)
    @Where
    private String accountNumber; //账号

    @Length(max = 200)
    @Where
    private String accountName; //账户

    @Length(max = 60)
    @Where
    private String accountType; //账户类型

    @Length(max = 60)
    @Where
    private String accountClass; //账户属性

    @Length(max = 60)
    @Where
    private String accountUsage; //账户用途

    @JoinTable(name = "bankJoin", target = Bank.class, type = JoinType.LEFT, on = {@JoinOn(joinField = Bank.FIELD_BANK_ID)})
    @OrderBy
    @Where
    private Long bankId; //银行表ID

    @Transient
    @JoinColumn(joinName = "bankJoin", field = Bank.FIELD_FULL_NAME)
    @OrderBy
    private String bankName;

    @NotEmpty
    @Length(max = 50)
    @Where
    private String ownerType; //所有者类型

    @NotNull
    @Where
    private Long ownerId; //所有者ID

    @Transient
    private String ownerName;

    @Length(max = 1)
    private String enabledFlag; //启用标识

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountClass(String accountClass) {
        this.accountClass = accountClass;
    }

    public String getAccountClass() {
        return accountClass;
    }

    public void setAccountUsage(String accountUsage) {
        this.accountUsage = accountUsage;
    }

    public String getAccountUsage() {
        return accountUsage;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public Long getBankId() {
        return bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }
}
