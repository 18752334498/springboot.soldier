package com.yucong.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 生活状态
 */
@Entity
@Table(name = "army_life_state")
@Data
public class LifeState extends AbstractEntity {

    private static final long serialVersionUID = 175593748471166008L;

    /** 主键 */
    @Id
    @Column(name = "life_state_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lifeStateId;

    /** 军人基本信息id */
    @Column(name = "soldier_id")
    private String soldierId;

    /** 住房状况 数组 */
    @Column(name = "houses")
    private String houses;

    /** 上年度家庭收入 */
    @Column(name = "family_income")
    private String familyIncome;

    /** 上年度个人收入 */
    @Column(name = "person_income")
    private String personIncome;

    /** 享受社会救助 */
    @Column(name = "society_help")
    private String societyHelp;

    /** 是否个案帮扶 */
    @Column(name = "is_other_help")
    private String isOtherHelp;

    /** 个案帮扶主体 */
    @Column(name = "other_help")
    private String otherHelp;

    /** 个案帮扶方式 */
    @Column(name = "other_help_type")
    private String otherHelpType;

    /** 个案帮扶金额 */
    @Column(name = "other_help_money")
    private String otherHelpMoney;

    /** 援助经费补贴来源 */
    @Column(name = "help_money_type")
    private String helpMoneyType;

    /** 个案帮扶时间段 数组 */
    @Column(name = "other_help_dates")
    private String otherHelpDates;

    /** 是否孤老 */
    @Column(name = "is_lonely")
    private String isLonely;

    /** 是否孤儿 */
    @Column(name = "is_orphan")
    private String isOrphan;

    /*****************************************************************************/

    /** 养老保险类型 */
    @Column(name = "old_age_insurance")
    private String oldAgeInsurance;

    /** 养老保险现参保地 */
    @Column(name = "old_age_belong")
    private String oldAgeBelong;

    /** 参加养老保险时长 */
    @Column(name = "old_age_insurance_duration")
    private String oldAgeInsuranceDuration;

    /** 养老保险是否存在中断情况 */
    @Column(name = "old_age_interrupt")
    private String oldAgeInterrupt;

    /** 养老保险中断时间段 数组 */
    @Column(name = "old_age_interrupts")
    private String oldAgeInterrupts;

    /** 医疗保险类型 */
    @Column(name = "medical_insurance")
    private String medicalInsurance;

    /** 医疗保险现参保地 */
    @Column(name = "medical_belong")
    private String medicalBelong;

    /** 参加医保时长 */
    @Column(name = "medical_insurance_duration")
    private String medicalInsuranceDuration;

    /** 医疗保险是否存在中断情况 */
    @Column(name = "medical_interrupt")
    private String medicalInterrupt;

    /** 医疗保险中断时间段 数组 */
    @Column(name = "medical_interrupts")
    private String medicalInterrupts;


    /** 更多保险情况 */
    @Column(name = "more_insurances")
    private String moreInsurances;


}
