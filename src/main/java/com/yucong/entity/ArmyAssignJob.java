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
 * 军队转业干部-计划分配
 */
@Entity
@Table(name = "army_assign_job")
@Data
public class ArmyAssignJob extends AbstractEntity {

    private static final long serialVersionUID = 4445719874293029276L;

    /** 主键 */
    @Id
    @Column(name = "assign_job_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assignJobId;

    /** a:军队转业干部 */
    @Column(name = "role", length = 50)
    private String role;

    /** a:计划分配，b:自主择业 */
    @Column(name = "type", length = 50)
    private String type;

    /** 军人基本信息id */
    @Column(name = "soldier_id", length = 50)
    private String soldierId;


    /** 入伍地-省 */
    @Column(name = "join_place_province", length = 50)
    private String joinPlaceProvince;

    /** 入伍地-市 */
    @Column(name = "join_place_city", length = 50)
    private String joinPlaceCity;

    /** 入伍地-区县 */
    @Column(name = "join_place_area", length = 50)
    private String joinPlaceArea;

    /** 入伍时间 */
    @Column(name = "join_date")
    private Date joinDate;

    /** 退役时间 */
    @Column(name = "leave_army_date")
    private Date leaveArmyDate;

    /** 军龄 */
    @Column(name = "army_age", length = 50)
    private Integer armyAge;

    /** 原部别 */
    @Column(name = "belong_army", length = 50)
    private String belongArmy;

    /** 部队代号 */
    @Column(name = "army_code", length = 50)
    private String armyCode;

    /** 兵种 */
    @Column(name = "soldier_type", length = 50)
    private String soldierType;


    /** 是否领导职务 */
    @Column(name = "is_manager", length = 50)
    private String isManager;

    /** 职务类别 */
    @Column(name = "duty_type", length = 50)
    private String dutyType;

    /** 任现职级名称 */
    @Column(name = "duty_name", length = 50)
    private String dutyName;

    /** 职务等级 */
    @Column(name = "duty_level", length = 50)
    private String dutyLevel;

    /** 任现职务时间、衔级时间 */
    @Column(name = "duty_start_date")
    private Date dutyStartDate;

    /** 法律职业资格 */
    @Column(name = "law_power", length = 50)
    private String lawPower;


    /********** 服役特殊履历 **********/

    /** 艰苦边远地区服役 */
    @Column(name = "remote_areas", length = 50)
    private String remoteAreas;

    /** 是否驻海外基地服役 */
    @Column(name = "overseas_places", length = 50)
    private String overseasPlaces;

    /** 参战 */
    @Column(name = "join_armies", length = 50)
    private String joinArmies;

    /** 参与重大任务 */
    @Column(name = "great_tasks", length = 50)
    private String greatTasks;

    /** 特殊岗位 */
    @Column(name = "special_position", length = 50)
    private String specialPosition;

    /** 个人特长 */
    @Column(name = "hobby", length = 50)
    private String hobby;


    /********** 奖惩情况 **********/

    /** 表彰 */
    @Column(name = "commends", length = 50)
    private String commends;

    /** 奖励 */
    @Column(name = "awards", length = 50)
    private String awards;

    /** 党纪处分 */
    @Column(name = "party_punishs", length = 50)
    private String partyPunishs;

    /** 军纪处分 */
    @Column(name = "army_punishs", length = 50)
    private String armyPunishs;


    /********** 安置地 **********/

    /** 计划分配、自主择业 */
    @Column(name = "get_job_type", length = 50)
    private String getJobType;

    /** 安置地-省 */
    @Column(name = "setting_province", length = 50)
    private String settingProvince;

    /** 安置地-市 */
    @Column(name = "setting_city", length = 50)
    private String settingCity;

    /** 安置地-区 */
    @Column(name = "setting_area", length = 50)
    private String settingArea;

    /** 安置地-单位性质 */
    @Column(name = "depart_type", length = 50)
    private String departType;

    /** 安置地-省内单位性质 */
    @Column(name = "depart_name", length = 50)
    private String departName;

    /** 安置地-中央垂直管理单位 */
    @Column(name = "direct_depart", length = 50)
    private String directDepart;

    /** 安置地-地区去向 */
    @Column(name = "direction", length = 50)
    private String direction;

    /** 安置地-安置单位 */
    @Column(name = "setting_depart", length = 50)
    private String settingDepart;

    /** 安置地-职务名称 */
    @Column(name = "position_name", length = 50)
    private String positionName;

    /** 安置地-安置职务等级 */
    @Column(name = "position_level", length = 50)
    private String positionLevel;

    /** 安置地-是否领导班子任职 */
    @Column(name = "is_leader", length = 50)
    private String isLeader;

    /** 安置地-安排领导职务 */
    @Column(name = "positon_type", length = 50)
    private String positonType;

    /** 安置地-安置日期 */
    @Column(name = "setting_date")
    private Date settingDate;

    /** 安置地-通知日期 */
    @Column(name = "notice_date")
    private Date noticeDate;

    /** 安置地-报道日期 */
    @Column(name = "report_date")
    private Date reportDate;



    /** 安置后工作变化情况 数组 */
    @Column(name = "work_changes", length = 50)
    private String workChanges;

    /** 调动后单位名称 */
    @Column(name = "new_depart_name", length = 50)
    private String newDepartName;

    /** 调动时间 */
    @Column(name = "transfer_date")
    private Date transferDate;

    /** 晋升后职级 */
    @Column(name = "promote_positon", length = 50)
    private String promotePositon;

    /** 晋升时间 */
    @Column(name = "promote_date")
    private Date promoteDate;



    /** 是否属于复员改办专业军队专业干部 */
    @Column(name = "is_special_cadre", length = 50)
    private String isSpecialCadre;

    /** 退档日期 */
    @Column(name = "quit_date")
    private Date quitDate;

    /** 退档原因 */
    @Column(name = "quit_reason", length = 50)
    private String quitReason;

    /** 现工作状态 */
    @Column(name = "work_state", length = 50)
    private String workState;

    /** 岗前培训情况 */
    @Column(name = "is_train", length = 50)
    private String isTrain;

    /** 安置地-安置信息备注 */
    @Column(name = "setting_comment", length = 50)
    private String settingComment;

    /** 转业证件号 */
    @Column(name = "change_number", length = 50)
    private String changeNumber;

    /** 转业证件照片 */
    @Column(name = "change_picture", length = 50)
    private String changePicture;



    /** 安置地-安置地派出所 */
    @Column(name = "police_station", length = 50)
    private String policeStation;

    /** 安置地-是否报道 */
    @Column(name = "is_report", length = 50)
    private String isReport;

    /** 安置地-呈报人 */
    @Column(name = "reporter", length = 50)
    private String reporter;

    /** 安置地-审核机关 */
    @Column(name = "check_depart", length = 50)
    private String checkDepart;

    /** 安置地-档案管理单位 */
    @Column(name = "paper_depart", length = 50)
    private String paperDepart;

    /** 安置地-档案是否弄虚作假 */
    @Column(name = "is_false", length = 50)
    private String isFalse;

    /** 安置地-档案弄虚作假说明 */
    @Column(name = "false_reason", length = 50)
    private String falseReason;



    /********** 家属 **********/

    /** 安置地-随调家属 */
    @Column(name = "follow_families", length = 50)
    private String followFamilies;

    /** 安置地-随迁户数 */
    @Column(name = "follow_house", length = 50)
    private String followHouse;

    /** 安置地-随迁户口迁移数 */
    @Column(name = "setting_house", length = 50)
    private String settingHouse;

    /** 安置地-随迁人员落户数 */
    @Column(name = "setting_person", length = 50)
    private String settingPerson;

    /** 安置地-随迁人数 */
    @Column(name = "follow_person", length = 50)
    private String followPerson;


    /********************* 享受待遇 *******************/


    /** 退役金起始发放时间 */
    @Column(name = "provide_start_date")
    private Date provideStartDate;

    /** 安置地-退役金和生活补贴调整记录 */
    @Column(name = "change_record", length = 50)
    private String changeRecord;

    /** 退役金和生活补贴调整记录-停发、增减-时间 */
    @Column(name = "change_date")
    private Date changeDate;

    /** 退役金和生活补贴调整记录-停发、增减-原因 */
    @Column(name = "change_reason", length = 50)
    private String changeReason;

    /** 退役金和生活补贴调整记录-停发、增减-呈报机关 */
    @Column(name = "change_depart", length = 50)
    private String changeDepart;

    /** 退役金和生活补贴调整记录-增减、增减-金额 */
    @Column(name = "change_money", length = 50)
    private String changeMoney;


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
    @Column(name = "honor_province")
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
