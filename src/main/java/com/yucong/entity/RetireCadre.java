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
 * 军队离退休干部和退休士官
 */
@Entity
@Table(name = "army_retire_cadre")
@Data
public class RetireCadre extends AbstractEntity {

    private static final long serialVersionUID = 3869006900611026866L;

    /** 主键 */
    @Id
    @Column(name = "retire_cadre_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long retireCadreId;

    /** d:军队离退休干部和退休士官 */
    @Column(name = "role", length = 50)
    private String role;

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

    /** 参加革命时期 */
    @Column(name = "join_war", length = 50)
    private String joinWar;

    /** 原单位序列 */
    @Column(name = "belong_depart", length = 50)
    private String belongDepart;

    /** 兵种 */
    @Column(name = "soldier_type", length = 50)
    private String soldierType;

    /** 所属大单位 */
    @Column(name = "belong_army", length = 50)
    private String belongArmy;


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


    /********** 安置 **********/

    /** 军休类别 */
    @Column(name = "retire_type", length = 50)
    private String retireType;

    /** 离休退时间 */
    @Column(name = "retire_date")
    private Date retireDate;

    /** 离休退休证件 */
    @Column(name = "retire_picture", length = 50)
    private String retirePicture;

    /** 离休退休证件号 */
    @Column(name = "retire_number", length = 50)
    private String retireNumber;

    /** 安置方式 */
    @Column(name = "setting_type", length = 50)
    private String settingType;

    /** 安置计划批次 */
    @Column(name = "setting_number", length = 50)
    private String settingNumber;

    /** 安置地-省 */
    @Column(name = "setting_province", length = 50)
    private String settingProvince;

    /** 安置地-市 */
    @Column(name = "setting_city", length = 50)
    private String settingCity;

    /** 安置地-区 */
    @Column(name = "setting_area", length = 50)
    private String settingArea;

    /** 安置地-address */
    @Column(name = "setting_address", length = 50)
    private String settingAddress;

    /** 安置管理单位 */
    @Column(name = "setting_depart", length = 50)
    private String settingDepart;

    /** 接收服务单位 */
    @Column(name = "receive_depart", length = 50)
    private String receiveDepart;

    /** 接收日期 */
    @Column(name = "receive_date")
    private Date receiveDate;

    /** 安置地-档案管理单位 */
    @Column(name = "paper_depart", length = 50)
    private String paperDepart;

    /** 安置地-档案是否弄虚作假 */
    @Column(name = "is_false", length = 50)
    private String isFalse;

    /** 安置地-档案弄虚作假说明 */
    @Column(name = "false_reason", length = 50)
    private String falseReason;

    /** 是否隶属于转隶人员 */
    @Column(name = "is_belong_change", length = 50)
    private String isBelongChange;

    /** 审定办结年度 */
    @Column(name = "check_year")
    private Date checkYear;


    /********** 光荣悬挂 **********/

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


    /********** 享受待遇情况 **********/

    /** 干部类别 */
    @Column(name = "cadre_type", length = 50)
    private String cadreType;

    /** 享受待遇级别 */
    @Column(name = "treat_level", length = 50)
    private String treatLevel;

    /** 享受待遇级别-行政 */
    @Column(name = "admin", length = 50)
    private String admin;

    /** 享受待遇级别-专业技术 */
    @Column(name = "technology", length = 50)
    private String technology;

    /** 享受待遇级别-士官 */
    @Column(name = "petty_officer", length = 50)
    private String pettyOfficer;

    /** 待遇标准 */
    @Column(name = "enjoy_care_level", length = 50)
    private String enjoyCareLevel;

    /** 离退休费 */
    @Column(name = "retire_money", length = 50)
    private String retireMoney;

    /** 各类补贴 */
    @Column(name = "allowance_money", length = 50)
    private String allowanceMoney;

    /** 是否享受护理费 */
    @Column(name = "is_enjoy_care", length = 50)
    private String isEnjoyCare;

    /** 享受护理费原因 */
    @Column(name = "enjoy_care_reason", length = 50)
    private String enjoyCareReason;

    /** 护理费 */
    @Column(name = "care_money", length = 50)
    private String careMoney;

    /** 变更情况 */
    @Column(name = "change_detail", length = 50)
    private String changeDetail;

}
