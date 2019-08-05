package com.yucong.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 复员干部
 */
@Entity
@Table(name = "army_restore_cadre")
@Data
public class RestoreCadre extends AbstractEntity {

    private static final long serialVersionUID = -741381464193528367L;

    /** 主键 */
    @Id
    @Column(name = "restore_cadre_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restoreCadreId;

    /** h:复员干部 */
    @Column(name = "role")
    private String role;

    /** 军人基本信息id */
    @Column(name = "soldier_id")
    private String soldierId;

    /** 入伍时间 */
    @Column(name = "join_date")
    private Date joinDate;

    /** 复员时间 */
    @Column(name = "restore_date")
    private Date restoreDate;

    /** 军龄 */
    @Column(name = "army_age")
    private Integer armyAge;

    /** 部队代号 */
    @Column(name = "army_code", length = 50)
    private String armyCode;

    /** 原职级 */
    @Column(name = "original_duty", length = 50)
    private String originalDuty;

    /** 兵种 */
    @Column(name = "soldier_type", length = 50)
    private String soldierType;

    /** 立功受奖情况 */
    @Column(name = "honors", length = 50)
    private String honors;

    /** 立功受奖情况 */
    @Column(name = "honor_picture", length = 50)
    private String honorPicture;


    /********** 复员接收情况 **********/

    /** 复员接受地情况-复员地-省 */
    @Column(name = "restore_province", length = 50)
    private String restoreProvince;

    /** 复员接受地情况-复员地-市 */
    @Column(name = "restore_city", length = 50)
    private String restoreCity;

    /** 复员接受地情况-复员地-区县 */
    @Column(name = "restore_area", length = 50)
    private String restoreArea;

    /** 安置地-省 */
    @Column(name = "setting_province", length = 50)
    private String settingProvince;

    /** 安置地-市 */
    @Column(name = "setting_city", length = 50)
    private String settingCity;

    /** 安置地-区 */
    @Column(name = "setting_area", length = 50)
    private String settingArea;

    /** 户口所在派出所 */
    @Column(name = "police_station", length = 50)
    private String policeStation;

    /** 档案管理单位 */
    @Column(name = "paper_depart", length = 50)
    private String paperDepart;

    /** 接收档案时间 */
    @Column(name = "receive_date")
    private Date receiveDate;

    /** 规定报道时间 */
    @Column(name = "report_date")
    private Date reportDate;

    /** 是否报道 */
    @Column(name = "is_report", length = 50)
    private String isReport;

    /** 复员证件号 */
    @Column(name = "restore_number", length = 50)
    private String restoreNumber;

    /** 复员证件照片 */
    @Column(name = "restore_picture", length = 50)
    private String restorePicture;


    /********** 待遇享受情况 **********/

    /** 享受国家抚恤金 */
    @Column(name = "enjoy_national_money", length = 50)
    private String enjoyNationalMoney;

    /** 待遇发放类型 */
    @Column(name = "give_money_type", length = 50)
    private String giveMoneyType;

    /** 金额 */
    @Column(name = "total_money", length = 50)
    private String totalMoney;

    /** 银行名称 */
    @Column(name = "bank", length = 50)
    private String bank;

    /** 银行卡号 */
    @Column(name = "bank_id_number", length = 50)
    private String bankIdNumber;


    /********** 光荣牌 **********/

    /** 申请悬挂时间 */
    @Column(name = "apply_date")
    private Date applyDate;

    /** 是否悬挂光荣牌 */
    @Column(name = "is_honor", length = 50)
    private String isHonor;

    /** 悬挂时间 */
    @Column(name = "honor_date")
    private Date honorDate;

    /** 悬挂地址-省 */
    @Column(name = "honor_province", length = 50)
    private String honorProvince;

    /** 悬挂地址-市 */
    @Column(name = "honor_city", length = 50)
    private String honorCity;

    /** 悬挂地址-区县 */
    @Column(name = "honor_area", length = 50)
    private String honorArea;

    /** 悬挂地址 */
    @Column(name = "honor_address", length = 50)
    private String honorAddress;

    /** 是否取消光荣牌 */
    @Column(name = "is_cancel_honor", length = 50)
    private String isCancelHonor;

    /** 取消光荣牌时间 */
    @Column(name = "cancel_honor_date")
    private Date cancelHonorDate;

    /** 是否更换光荣牌 */
    @Column(name = "is_change_honor", length = 50)
    private String isChangeHonor;

    /** 更换光荣牌时间 */
    @Column(name = "change_honor_date")
    private Date changeHonorDate;


    /******************* 培训 *********************/

    /** 培训情况-培训意向 */
    @Column(name = "train_wish", length = 50)
    private String trainWish;

    /** 培训情况-培训类型 */
    @Column(name = "train_type", length = 50)
    private String trainType;

    /** 培训情况-异地培训 */
    @Column(name = "is_local_place", length = 50)
    private String isLocalPlace;

    /** 培训情况-培训项目 */
    @Column(name = "train_project", length = 50)
    private String trainProject;


    /** 培训情况-是否适应性培训 */
    @Column(name = "is_train_adapt", length = 50)
    private String isTrainAdapt;

    /** 培训情况-是否个性化培训 */
    @Column(name = "is_train_personal", length = 50)
    private String isTrainPersonal;

    /** 培训情况-是否学历教育培训 */
    @Column(name = "is_train_education", length = 50)
    private String isTrainEducation;

    /** 培训情况-是否职业技能培训 */
    @Column(name = "is_train_skill", length = 50)
    private String isTrainSkill;

    /** 培训情况-是否创业培训 */
    @Column(name = "is_train_business", length = 50)
    private String isTrainBusiness;

    /** 培训情况-是否心理调试培训 */
    @Column(name = "is_train_mental", length = 50)
    private String isTrainMental;

    /** 培训情况-是否其他培训 */
    @Column(name = "is_train_other", length = 50)
    private String isTrainOther;


    /** 培训情况-适应性培训-具体需求内容 */
    @Column(name = "adapt_content", length = 50)
    private String adaptContent;

    /** 培训情况-个性化培训-具体需求内容 */
    @Column(name = "personal_content", length = 50)
    private String personalContent;

    /** 培训情况-学历教育培训-具体需求内容 */
    @Column(name = "education_content", length = 50)
    private String educationContent;

    /** 培训情况-职业技能培训-具体需求内容 */
    @Column(name = "skill_content", length = 50)
    private String skillContent;

    /** 培训情况-创业培训-具体需求内容 */
    @Column(name = "business_content", length = 50)
    private String businessContent;

    /** 培训情况-心理调试培训-具体需求内容 */
    @Column(name = "mental_content", length = 50)
    private String mentalContent;

    /** 培训情况-其他培训-具体需求内容 */
    @Column(name = "other_content", length = 50)
    private String otherContent;


    /** 培训情况-适应性培训-培训时长建议 */
    @Column(name = "adapt_duration", length = 50)
    private String adaptDuration;

    /** 培训情况-个性化培训-培训时长建议 */
    @Column(name = "personal_duration", length = 50)
    private String personalDuration;

    /** 培训情况-学历教育培训-培训时长建议 */
    @Column(name = "education_duration", length = 50)
    private String educationDuration;

    /** 培训情况-职业技能培训-培训时长建议 */
    @Column(name = "skill_duration", length = 50)
    private String skillDuration;

    /** 培训情况-创业培训-培训时长建议 */
    @Column(name = "business_duration", length = 50)
    private String businessDuration;

    /** 培训情况-心理调试培训-培训时长建议 */
    @Column(name = "mental_duration", length = 50)
    private String mentalDuration;

    /** 培训情况-其他培训-培训时长建议 */
    @Column(name = "other_duration", length = 50)
    private String otherDuration;


    /** 培训情况-适应性培训-培训形式建议 */
    @Column(name = "adapt_method", length = 50)
    private String adaptMethod;

    /** 培训情况-个性化培训-培训形式建议 */
    @Column(name = "personal_method", length = 50)
    private String personalMethod;

    /** 培训情况-学历教育培训-培训形式建议 */
    @Column(name = "education_method", length = 50)
    private String educationMethod;

    /** 培训情况-职业技能培训-培训形式建议 */
    @Column(name = "skill_method", length = 50)
    private String skillMethod;

    /** 培训情况-创业培训-培训形式建议 */
    @Column(name = "business_method", length = 50)
    private String businessMethod;

    /** 培训情况-心理调试培训-培训形式建议 */
    @Column(name = "mental_method", length = 50)
    private String mentalMethod;

    /** 培训情况-其他培训-培训形式建议 */
    @Column(name = "other_method", length = 50)
    private String otherMethod;


    /** 培训情况-承训机构名称 */
    @Column(name = "train_agency", length = 50)
    private String trainAgency;

    /** 培训情况-承训机构等级 */
    @Column(name = "train_agency_level", length = 50)
    private String trainAgencyLevel;

    /** 培训情况-获得学历或者技能证书 */
    @Column(name = "skill_paper", length = 50)
    private String skillPaper;



    /********************* 就业 *******************/

    /** 就业情况-就业状态 */
    @Column(name = "work_status", length = 50)
    private String workStatus;

    /** 就业情况-就业单位 */
    @Column(name = "work_depart", length = 50)
    private String workDepart;

    /** 就业情况-职务 */
    @Column(name = "position", length = 50)
    private String position;

    /** 就业情况-就业单位所属行业 */
    @Column(name = "industry", length = 50)
    private String industry;

    /** 就业情况-就业时间 */
    @Column(name = "work_date")
    private Date workDate;

    /** 就业情况-就业单位-省 */
    @Column(name = "work_province", length = 50)
    private String workProvince;

    /** 就业情况-就业单位-市 */
    @Column(name = "work_city", length = 50)
    private String workCity;

    /** 就业情况-就业单位-区县 */
    @Column(name = "work_area", length = 50)
    private String workArea;

    /** 就业情况-就业单位-详细地址 */
    @Column(name = "work_address", length = 50)
    private String workAddress;

    /** 就业情况-工资水平 */
    @Column(name = "salary", length = 50)
    private String salary;

    /** 就业情况-是否缴纳社保 */
    @Column(name = "is_insurance", length = 50)
    private String isInsurance;

    /** 就业情况-工作满意度 */
    @Column(name = "satisfaction", length = 50)
    private String satisfaction;


    /********************* 创业 *******************/

    /** 创业情况-创业项目名称 */
    @Column(name = "project_name", length = 50)
    private String projectName;

    /** 创业情况-创业公司名称 */
    @Column(name = "company_name", length = 50)
    private String companyName;

    /** 创业情况-创业单位法人 */
    @Column(name = "company_owner", length = 50)
    private String companyOwner;

    /** 创业情况-创业公司所属行业 */
    @Column(name = "company_property", length = 50)
    private String companyProperty;

    /** 创业情况-创业单位性质 */
    @Column(name = "company_type", length = 50)
    private String companyType;

    /** 创业情况-创业时间 */
    @Column(name = "create_date")
    private Date createDate;

    /** 创业情况-资产规模 */
    @Column(name = "company_value", length = 50)
    private String companyValue;

    /** 创业情况-公司联系电话 */
    @Column(name = "company_telNum", length = 50)
    private String companyTelNum;

    /** 创业情况-创业公司注册地址-省 */
    @Column(name = "zhuce_province", length = 50)
    private String zhuceProvince;

    /** 创业情况-创业公司注册地址-市 */
    @Column(name = "zhuce_city", length = 50)
    private String zhuceCity;

    /** 创业情况-创业公司注册地址-区县 */
    @Column(name = "zhuce_area", length = 50)
    private String zhuceArea;

    /** 创业情况-创业公司注册地址-详细地址 */
    @Column(name = "zhuce_address", length = 50)
    private String zhuceAddress;

    /** 创业情况-创业公司通讯地址-省 */
    @Column(name = "tongxun_province", length = 50)
    private String tongxunProvince;

    /** 创业情况-创业公司通讯地址-市 */
    @Column(name = "tongxun_city", length = 50)
    private String tongxunCity;

    /** 创业情况-创业公司通讯地址-区县 */
    @Column(name = "tongxun_area", length = 50)
    private String tongxunArea;

    /** 创业情况-创业公司通讯地址-详细地址 */
    @Column(name = "tongxun_address", length = 50)
    private String tongxunAddress;

    /** 创业情况-解决就业情况 */
    @Column(name = "solve_problem", length = 50)
    private String solveProblem;

    /** 创业情况-公司效益 */
    @Column(name = "benefit", length = 50)
    private String benefit;

    /** 创业情况-纳税情况 */
    @Column(name = "pay_taxes", length = 50)
    private String payTaxes;

    /** 创业情况-是否享受自主创业优惠政策 */
    @Column(name = "enjoy_preference", length = 50)
    private String enjoyPreference;


    /********************* 退休 *******************/

    /** 退休情况-退休前原单位 */
    @Column(name = "old_depart", length = 50)
    private String oldDepart;

    /** 退休情况-原单位所属行业 */
    @Column(name = "old_depart_property", length = 50)
    private String oldDepartProperty;

    /** 退休情况-原单位地址-省 */
    @Column(name = "yuan_province", length = 50)
    private String yuanProvince;

    /** 退休情况-原单位地址-市 */
    @Column(name = "yuan_city", length = 50)
    private String yuanCity;

    /** 退休情况-原单位地址-区县 */
    @Column(name = "yuan_area", length = 50)
    private String yuanArea;

    /** 退休情况-原单位地址-详细地址 */
    @Column(name = "yuan_address", length = 50)
    private String yuanAddress;

    /** 退休情况-退休时间 */
    @Column(name = "retire_date")
    private Date retireDate;

    /** 退休情况-当前收入范围 */
    @Column(name = "income_range", length = 50)
    private String incomeRange;


    /********************* 意愿 *******************/

    /** 是否有再就业意愿 */
    @Column(name = "change_work_wish", length = 50)
    private String changeWorkWish;

    /** 是否有创业意向 */
    @Column(name = "business_wish", length = 50)
    private String businessWish;



    /** 就业城市意向-省 */
    @Column(name = "wish_province", length = 50)
    private String wishProvince;

    /** 就业城市意向-市 */
    @Column(name = "wish_city", length = 50)
    private String wishCity;

    /** 就业城市意向-区县 */
    @Column(name = "wish_area", length = 50)
    private String wishArea;

    /** 就业行业意向 */
    @Column(name = "wish_industry", length = 50)
    private String wishIndustry;

    /** 就业薪酬期待 */
    @Column(name = "wish_salary", length = 50)
    private String wishSalary;


    /** 专长 */
    @Column(name = "special_skill", length = 50)
    private String specialSkill;

    /** 个人性格 */
    @Column(name = "personality", length = 50)
    private String personality;

    /** 兴趣爱好 */
    @Column(name = "interest", length = 50)
    private String interest;

    /** 获奖情况 */
    @Column(name = "prize", length = 50)
    private String prize;

    /** 工作经历 */
    @Column(name = "experience", length = 50)
    private String experience;



    /** 创业意向 */
    @Column(name = "business_direction", length = 50)
    private String businessDirection;

    /** 创业帮扶需求 */
    @Column(name = "business_help", length = 50)
    private String businessHelp;

}
