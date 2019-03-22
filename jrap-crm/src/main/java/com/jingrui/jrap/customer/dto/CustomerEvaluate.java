package com.jingrui.jrap.customer.dto;

/**Auto Generated By Jrap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.jingrui.jrap.system.dto.BaseDTO;
import java.util.Date;
@ExtensionAttribute(disable=true)
@Table(name = "afd_customer_evaluate")
public class CustomerEvaluate extends BaseDTO {

     public static final String FIELD_EVALUATE_ID = "evaluateId";
     public static final String FIELD_CUSTOMER_ID = "customerId";
     public static final String FIELD_EVALUATE_TYPE = "evaluateType";
     public static final String FIELD_EVALUATOR = "evaluator";
     public static final String FIELD_COMPOSITE_SCORE = "compositeScore";
     public static final String FIELD_EVALUATE_DATE = "evaluateDate";
     public static final String FIELD_INDATE_DATE = "indateDate";
     public static final String FIELD_BRIEF = "brief";
     public static final String FIELD_REMARK = "remark";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


     @Id
     @GeneratedValue
     private Long evaluateId;

     private Long customerId; //客户ID

     @Length(max = 60)
     private String evaluateType; //评估类型

     @Length(max = 60)
     private String evaluator; //评估人

     private Long compositeScore; //综合评分

     private Date evaluateDate; //评估时间

     private Date indateDate; //有效日期

     @Length(max = 2147483647)
     private String brief; //评估简要

     @Length(max = 2147483647)
     private String remark; //备注说明

     private Long programApplicationId;

     private Date programUpdateDate;


     public void setEvaluateId(Long evaluateId){
         this.evaluateId = evaluateId;
     }

     public Long getEvaluateId(){
         return evaluateId;
     }

     public void setCustomerId(Long customerId){
         this.customerId = customerId;
     }

     public Long getCustomerId(){
         return customerId;
     }

     public void setEvaluateType(String evaluateType){
         this.evaluateType = evaluateType;
     }

     public String getEvaluateType(){
         return evaluateType;
     }

     public void setEvaluator(String evaluator){
         this.evaluator = evaluator;
     }

     public String getEvaluator(){
         return evaluator;
     }

     public void setCompositeScore(Long compositeScore){
         this.compositeScore = compositeScore;
     }

     public Long getCompositeScore(){
         return compositeScore;
     }

     public void setEvaluateDate(Date evaluateDate){
         this.evaluateDate = evaluateDate;
     }

     public Date getEvaluateDate(){
         return evaluateDate;
     }

     public void setIndateDate(Date indateDate){
         this.indateDate = indateDate;
     }

     public Date getIndateDate(){
         return indateDate;
     }

     public void setBrief(String brief){
         this.brief = brief;
     }

     public String getBrief(){
         return brief;
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