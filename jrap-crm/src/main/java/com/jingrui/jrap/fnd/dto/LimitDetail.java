/*
 * *
 *  @file com.maddyhome.idea.copyright.pattern.JavaCopyrightVariablesProvider$1@72658169$
 *  @CopyRight (C) 2018 ZheJiangJingRui Co. Ltd.
 *  @brief JingRui Application Platform
 *  @author $name$
 *  @email yulong.yuan@jr-info.cn
 *  @date $date$
 * /
 */

package com.jingrui.jrap.fnd.dto;

/**Auto Generated By Jrap Code Generator**/

import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import com.jingrui.jrap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.Length;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@ExtensionAttribute(disable=true)
@Table(name = "fnd_limit_detail")
public class LimitDetail extends BaseDTO {

     public static final String FIELD_DETAIL_ID = "detailId";
     public static final String FIELD_COMPANY_ID = "companyId";
     public static final String FIELD_LIMIT_ID = "limitId";
     public static final String FIELD_DEAL_TYPE = "dealType";
     public static final String FIELD_ORDER_ID = "orderId";
     public static final String FIELD_CASHFLOW_ID = "cashflowId";
     public static final String FIELD_DR_AMOUNT = "drAmount";
     public static final String FIELD_CR_AMOUNT = "crAmount";
     public static final String FIELD_DEAL_DATE = "dealDate";
     public static final String FIELD_BALANCE = "balance";
     public static final String FIELD_DEAL_NOTE = "dealNote";
     public static final String FIELD_REMARK = "remark";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


     @Id
     @GeneratedValue
     private Long detailId;

     private Long companyId; //商户ID

     private Long limitId; //授信ID

     @Length(max = 60)
     private String dealType; //交易类型

     private Long orderId; //订单ID

     private Long cashflowId; //现金流ID

     private Long drAmount; //借方金额

     private Long crAmount; //贷方金额

     private Date dealDate; //交易日期

     private Long balance; //余额

     @Length(max = 200)
     private String dealNote; //摘要

     @Length(max = 2147483647)
     private String remark; //备注说明

     private Long programApplicationId;

     private Date programUpdateDate;


     public void setDetailId(Long detailId){
         this.detailId = detailId;
     }

     public Long getDetailId(){
         return detailId;
     }

     public void setCompanyId(Long companyId){
         this.companyId = companyId;
     }

     public Long getCompanyId(){
         return companyId;
     }

     public void setLimitId(Long limitId){
         this.limitId = limitId;
     }

     public Long getLimitId(){
         return limitId;
     }

     public void setDealType(String dealType){
         this.dealType = dealType;
     }

     public String getDealType(){
         return dealType;
     }

     public void setOrderId(Long orderId){
         this.orderId = orderId;
     }

     public Long getOrderId(){
         return orderId;
     }

     public void setCashflowId(Long cashflowId){
         this.cashflowId = cashflowId;
     }

     public Long getCashflowId(){
         return cashflowId;
     }

     public void setDrAmount(Long drAmount){
         this.drAmount = drAmount;
     }

     public Long getDrAmount(){
         return drAmount;
     }

     public void setCrAmount(Long crAmount){
         this.crAmount = crAmount;
     }

     public Long getCrAmount(){
         return crAmount;
     }

     public void setDealDate(Date dealDate){
         this.dealDate = dealDate;
     }

     public Date getDealDate(){
         return dealDate;
     }

     public void setBalance(Long balance){
         this.balance = balance;
     }

     public Long getBalance(){
         return balance;
     }

     public void setDealNote(String dealNote){
         this.dealNote = dealNote;
     }

     public String getDealNote(){
         return dealNote;
     }

     public void setRemark(String remark){
         this.remark = remark;
     }

     public String getRemark(){
         return remark;
     }

     public void setProgramApplicationId(Long programApplicationId){
         this.programApplicationId = programApplicationId;
     }

     public Long getProgramApplicationId(){
         return programApplicationId;
     }

     public void setProgramUpdateDate(Date programUpdateDate){
         this.programUpdateDate = programUpdateDate;
     }

     public Date getProgramUpdateDate(){
         return programUpdateDate;
     }

     }
