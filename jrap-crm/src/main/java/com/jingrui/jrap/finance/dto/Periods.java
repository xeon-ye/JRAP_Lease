/*
 * *
 *  @file com.maddyhome.idea.copyright.pattern.JavaCopyrightVariablesProvider$1@10e6e454$
 *  @CopyRight (C) 2018 ZheJiangJingRui Co. Ltd.
 *  @brief JingRui Application Platform
 *  @author $name$
 *  @email yulong.yuan@jr-info.cn
 *  @date $date$
 * /
 */

package com.jingrui.jrap.finance.dto;

/**Auto Generated By Jrap Code Generator**/

import com.jingrui.jrap.fnd.dto.Company;
import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import com.jingrui.jrap.mybatis.common.query.JoinColumn;
import com.jingrui.jrap.mybatis.common.query.JoinOn;
import com.jingrui.jrap.mybatis.common.query.JoinTable;
import com.jingrui.jrap.mybatis.common.query.Where;
import com.jingrui.jrap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.persistence.criteria.JoinType;
import javax.validation.constraints.NotNull;
import java.util.Date;

@ExtensionAttribute(disable=true)
@Table(name = "fin_periods")
public class Periods extends BaseDTO {

     public static final String FIELD_SET_CODE = "setCode";
     public static final String FIELD_COMPANY_ID = "companyId";
     public static final String FIELD_PERIOD_YEAR = "periodYear";
     public static final String FIELD_PERIOD_NUM = "periodNum";
     public static final String FIELD_PERIOD_NAME = "periodName";
     public static final String FIELD_ADJUSTMENT_FLAG = "adjustmentFlag";
     public static final String FIELD_INTERNAL_PERIOD_NUM = "internalPeriodNum";
     public static final String FIELD_START_DATE = "startDate";
     public static final String FIELD_END_DATE = "endDate";
     public static final String FIELD_QUARTER_NUM = "quarterNum";
     public static final String FIELD_STATUS = "status";
     public static final String FIELD_MONTH_FLAG = "monthFlag";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


     @Id
     @NotEmpty
     @Length(max = 60)
     @OrderBy("ASC")
     @Where
     private String setCode; //期间集

     @Id
     @NotNull
     @JoinTable(name = "companyJoin", target = Company.class, type = JoinType.LEFT, on = {@JoinOn(joinField = Company.FIELD_COMPANY_ID)})
     private Long companyId; //公司FND_COMPANY_B.COMPANY_ID

     @Transient
     @JoinColumn(joinName = "companyJoin", field = Company.FIELD_COMPANY_FULL_NAME)
     private String companyFullName; // 商户全称

     private Long periodYear; //年

     private Long periodNum; //序号

     @Length(max = 60)
     @Where
     private String periodName; //期间

     @NotEmpty
     @Length(max = 1)
     private String adjustmentFlag; //调整标志

     @Id
     private Long internalPeriodNum; //内部期间

     private Date startDate; //日期从

     private Date endDate; //日期至

     private Long quarterNum; //季度

     @Length(max = 30)
     private String status; //期间状态

     @Length(max = 1)
     private String monthFlag; //月结标志

     private Long programApplicationId;

     private Date programUpdateDate;

    public String getCompanyFullName() {
        return companyFullName;
    }

    public void setCompanyFullName(String companyFullName) {
        this.companyFullName = companyFullName;
    }

    public void setSetCode(String setCode){
         this.setCode = setCode;
     }

     public String getSetCode(){
         return setCode;
     }

     public void setCompanyId(Long companyId){
         this.companyId = companyId;
     }

     public Long getCompanyId(){
         return companyId;
     }

     public void setPeriodYear(Long periodYear){
         this.periodYear = periodYear;
     }

     public Long getPeriodYear(){
         return periodYear;
     }

     public void setPeriodNum(Long periodNum){
         this.periodNum = periodNum;
     }

     public Long getPeriodNum(){
         return periodNum;
     }

     public void setPeriodName(String periodName){
         this.periodName = periodName;
     }

     public String getPeriodName(){
         return periodName;
     }

     public void setAdjustmentFlag(String adjustmentFlag){
         this.adjustmentFlag = adjustmentFlag;
     }

     public String getAdjustmentFlag(){
         return adjustmentFlag;
     }

     public void setInternalPeriodNum(Long internalPeriodNum){
         this.internalPeriodNum = internalPeriodNum;
     }

     public Long getInternalPeriodNum(){
         return internalPeriodNum;
     }

     public void setStartDate(Date startDate){
         this.startDate = startDate;
     }

     public Date getStartDate(){
         return startDate;
     }

     public void setEndDate(Date endDate){
         this.endDate = endDate;
     }

     public Date getEndDate(){
         return endDate;
     }

     public void setQuarterNum(Long quarterNum){
         this.quarterNum = quarterNum;
     }

     public Long getQuarterNum(){
         return quarterNum;
     }

     public void setStatus(String status){
         this.status = status;
     }

     public String getStatus(){
         return status;
     }

     public void setMonthFlag(String monthFlag){
         this.monthFlag = monthFlag;
     }

     public String getMonthFlag(){
         return monthFlag;
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