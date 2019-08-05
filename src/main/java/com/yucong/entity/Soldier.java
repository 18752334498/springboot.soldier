package com.yucong.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 军人基本信息
 */
@Entity
@Table(name = "army_soldier")
@Data
public class Soldier extends AbstractEntity {

    private static final long serialVersionUID = -803638378637371256L;

    /** 主键 */
    @Id
    @Column(name = "soldier_id")
    private String soldierId;

    /** 保存军人所有角色 */
    @Column(name = "role")
    private String role;

    /** 操作人 */
    @Column(name = "opt_user_id")
    private String optUserId;

    /** 操作人姓名 */
    @Column(name = "opt_username")
    private String optUsername;

    /** 操作人企业id */
    @Column(name = "opt_corp_id")
    private String optCorpId;

    /** 操作人企业名称 */
    @Column(name = "opt_dept_name")
    private String optDeptName;

    /** 暂存保存，0暂存 1保存 */
    @Column(name = "opt_type")
    private String optType;


    /********** 基础信息 **********/

    /** 姓名 */
    @Column(name = "name")
    private String name;

    /** 身份证号码 */
    @Column(name = "id_number")
    private String idNumber;

    /** 性别 */
    @Column(name = "sex")
    private String sex;

    /** 出生日期 */
    @Column(name = "birth_date")
    private Date birthDate;

    /** 民族 */
    @Column(name = "minority")
    private String minority;

    /** 签发机关 */
    @Column(name = "issuing_authority")
    private String issuingAuthority;

    /** 有效期 */
    @Column(name = "expiry_date")
    private String expiryDate;

    /** 户籍地址-省 */
    @Column(name = "huji_province")
    private String hujiProvince;

    /** 户籍地址-市 */
    @Column(name = "huji_city")
    private String hujiCity;

    /** 户籍地址-区 */
    @Column(name = "huji_area")
    private String hujiArea;

    /** 户籍地址-address */
    @Column(name = "huji_address")
    private String hujiAddress;

    /** 近照 */
    @Column(name = "pictures")
    private String pictures;

    /** 证件正面照 */
    @Column(name = "id_photo_front")
    private String idPhotoFront;

    /** 证件反面照 */
    @Column(name = "id_photo_back")
    private String idPhotoBack;


    /********** 更多基本信息 **********/

    /** 政治面貌 */
    @Column(name = "politics")
    private String politics;

    /** 政治面貌-中国共产党-入党时间 */
    @Column(name = "join_party_date")
    private Date joinPartyDate;

    /** 政治面貌-中国共产党-党龄 */
    @Column(name = "party_age")
    private Integer partyAge;

    /** 政治面貌-所在支部 */
    @Column(name = "belong_branch")
    private String belongBranch;

    /** 政治面貌-是否按时足额缴纳党费 */
    @Column(name = "pay_party_money")
    private String payPartyMoney;

    /** 政治面貌-是否正常参加组织活动 */
    @Column(name = "join_activity")
    private String joinActivity;

    /** 人大代表 */
    @Column(name = "npc_member")
    private String npcMember;

    /** 人大任职开始时间 */
    @Column(name = "npc_member_start_date")
    private Date npcMemberStartDate;

    /** 政协委员 */
    @Column(name = "cppcc_member")
    private String cppccMember;

    /** 政协任职开始时间 */
    @Column(name = "cppcc_member_start_date")
    private Date cppccMemberStartDate;

    /** 参加工作时间 */
    @Column(name = "work_date")
    private Date workDate;

    /** 婚姻状况 */
    @Column(name = "marriage")
    private String marriage;

    /** 身高 */
    @Column(name = "height")
    private Double height;

    /** 籍贯地址-省 */
    @Column(name = "jiguan_province")
    private String jiguanProvince;

    /** 籍贯地址-市 */
    @Column(name = "jiguan_city")
    private String jiguanCity;

    /** 籍贯地址-区 */
    @Column(name = "jiguan_area")
    private String jiguanArea;

    /** 籍贯地址-address */
    @Column(name = "jiguan_address")
    private String jiguanAddress;

    /** 现居住地址-省 */
    @Column(name = "juzhu_province")
    private String juzhuProvince;

    /** 现居住地址-市 */
    @Column(name = "juzhu_city")
    private String juzhuCity;

    /** 现居住地址-区 */
    @Column(name = "juzhu_area")
    private String juzhuArea;

    /** 现居住地址-address */
    @Column(name = "juzhu_address")
    private String juzhuAddress;

    /** 家庭地址-省 */
    @Column(name = "jiating_province")
    private String jiatingProvince;

    /** 家庭地址-市 */
    @Column(name = "jiating_city")
    private String jiatingCity;

    /** 家庭地址-区 */
    @Column(name = "jiating_area")
    private String jiatingArea;

    /** 家庭地址-address */
    @Column(name = "jiating_address")
    private String jiatingAddress;

    /** 籍贯是否等同于户籍 */
    @Column(name = "jiguan_equal_huji")
    private String jiguanEqualHuji;

    /** 现居住是否等同于户籍 */
    @Column(name = "juzhu_equal_huji")
    private String juzhuEqualHuji;

    /** 家庭是否等同于户籍 */
    @Column(name = "jiating_equal_huji")
    private String jiatingEqualHuji;



    /** 手机号 */
    @Column(name = "mobile")
    private String mobile;

    /** 家庭固话 */
    @Column(name = "home_phone")
    private String homePhone;

    /** 办公电话 */
    @Column(name = "work_mobile")
    private String workMobile;

    /** 紧急联系人电话 */
    @Column(name = "emergency_mobile")
    private String emergencyMobile;

    /** 微信 */
    @Column(name = "weixin")
    private String weixin;

    /** qq */
    @Column(name = "qq")
    private String qq;

    /** 电子邮箱 */
    @Column(name = "mail")
    private String mail;

    /** 邮编 */
    @Column(name = "postcode")
    private String postcode;

    /** 个人信息备注 */
    @Column(name = "comments")
    private String comments;


    /************ 主要诉求 ************/

    /** 主要困难 */
    @Column(name = "main_difficulty")
    private String mainDifficulty;

    /** 主要诉求 */
    @Column(name = "main_request")
    private String mainRequest;

    /** 具体诉求 */
    @Column(name = "request_detail")
    private String requestDetail;


    /** 主要诉求-退役安置类 */
    @Column(name = "setting_request")
    private String settingRequest;

    /** 主要诉求-优待抚恤类 */
    @Column(name = "care_request")
    private String careRequest;

    /** 主要诉求-创业就业类 */
    @Column(name = "work_request")
    private String workRequest;

    /** 主要诉求-褒扬纪念类 */
    @Column(name = "honor_request")
    private String honorRequest;

    /** 主要诉求-军休服务类 */
    @Column(name = "service_request")
    private String serviceRequest;

    /** 主要诉求-帮扶援助类 */
    @Column(name = "help_request")
    private String helpRequest;

    /** 主要诉求-党员管理类 */
    @Column(name = "party_request")
    private String partyRequest;

    /** 主要诉求-咨询建议 */
    @Column(name = "consult_request")
    private String consultRequest;

    /** 主要诉求-其他 */
    @Column(name = "other_request")
    private String otherRequest;

    /************ 采集过程 ************/

    /** 变动种类 */
    @Column(name = "change_type")
    private String changeType;

    /** 变动时间 */
    @Column(name = "change_date")
    private Date changeDate;

    /** 死亡时间 */
    @Column(name = "die_date")
    private Date dieDate;

    /** 死亡注销时间 */
    @Column(name = "death_cancel_date")
    private Date deathCancelDate;


    /** 采集人姓名 */
    @Column(name = "collect_name")
    private String collectName;

    /** 采集人联系电话 */
    @Column(name = "collect_mobile")
    private String collectMobile;

    /** 采集单位 */
    @Column(name = "collect_depart")
    private String collectDepart;

    /** 采集时间 */
    @Column(name = "collect_date")
    private Date collectDate;

    /** 审核人姓名 */
    @Column(name = "check_name")
    private String checkName;

    /** 审核人联系电话 */
    @Column(name = "check_mobile")
    private String checkMobile;

    /** 审核单位 */
    @Column(name = "check_depart")
    private String checkDepart;

    /** 审核时间 */
    @Column(name = "check_date")
    private Date checkDate;

    /** 对象确认签字 */
    @Column(name = "sign_picture")
    private String signPicture;


    /************ 额外字段 ************/

    /** 退休时间 */
    @Column(name = "retire_date")
    private Date retireDate;

    /** 离休时间 */
    @Column(name = "leave_date")
    private Date leaveDate;

    /** 入伍时间 */
    @Column(name = "join_date")
    private Date joinDate;

    /** 创建时间 */
    @Column(name = "create_date")
    private Date createDate;

}
