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
 * 军队无军籍离退休退职职工
 */
@Entity
@Table(name = "army_retire_worker")
@Data
public class RetireWorker extends AbstractEntity {

    private static final long serialVersionUID = -1225925568635291374L;

    /** 主键 */
    @Id
    @Column(name = "retire_worker_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long retireWorkerId;

    /** e:军队无军籍离退休退职职工 */
    @Column(name = "role")
    private String role;

    /** 军人基本信息id */
    @Column(name = "soldier_id")
    private String soldierId;

    /** 成为军队职工方式 */
    @Column(name = "join_type")
    private String joinType;

    /** 入伍地-省 */
    @Column(name = "join_place_province")
    private String joinPlaceProvince;

    /** 入伍地-市 */
    @Column(name = "join_place_city")
    private String joinPlaceCity;

    /** 入伍地-区县 */
    @Column(name = "join_place_area")
    private String joinPlaceArea;

    /** 入伍时间 */
    @Column(name = "join_date")
    private Date joinDate;

    /** 退役时间 */
    @Column(name = "leave_army_date")
    private Date leaveArmyDate;

    /** 军龄 */
    @Column(name = "army_age")
    private Integer armyAge;

    /** 原部别 */
    @Column(name = "belong_army")
    private String belongArmy;

    /** 原单位 */
    @Column(name = "belong_depart")
    private String belongDepart;

    /** 转职工时间 */
    @Column(name = "turn_date")
    private Date turnDate;

    /** 退休前身份 */
    @Column(name = "old_position")
    private String oldPosition;

    /** 原职级-2006年6月30日之前 */
    @Column(name = "original_before")
    private String originalBefore;

    /** 原职级-2007年7月1日之后 */
    @Column(name = "original_after")
    private String originalAfter;

    /** 职务 */
    @Column(name = "duty")
    private String duty;

    /** 获得荣誉称号情况 数组 */
    @Column(name = "honors")
    private String honors;


    /******************** 安置地 ********************/

    /** 移交方式 */
    @Column(name = "transfer_type")
    private String transferType;

    /** 移交批次 */
    @Column(name = "transfer_times")
    private String transferTimes;

    /** 安置地-省 */
    @Column(name = "setting_province")
    private String settingProvince;

    /** 安置地-市 */
    @Column(name = "setting_city")
    private String settingCity;

    /** 安置地-区 */
    @Column(name = "setting_area")
    private String settingArea;

    /** 安置时间 */
    @Column(name = "setting_date")
    private Date settingDate;

    /** 退休方式 */
    @Column(name = "retire_type")
    private String retireType;

    /** 离休退时间 */
    @Column(name = "retire_date")
    private Date retireDate;

    /** 离休退休证件 */
    @Column(name = "retire_picture")
    private String retirePicture;

    /** 离休退休证件号 */
    @Column(name = "retire_number")
    private String retireNumber;


    /********** 享受待遇情况 **********/

    /** 财政渠道 */
    @Column(name = "get_money_type")
    private String getMoneyType;

    /** 月离退休金 */
    @Column(name = "retire_money")
    private String retireMoney;

    /** 变更情况 */
    @Column(name = "treatment_change")
    private String treatmentChange;

    /** 变更后金额 */
    @Column(name = "change_Money")
    private String changeMoney;

    /********** 光荣悬挂 **********/

    /** 申请悬挂时间 */
    @Column(name = "apply_date")
    private Date applyDate;

    /** 是否悬挂光荣牌 */
    @Column(name = "is_honor")
    private String isHonor;

    /** 悬挂时间 */
    @Column(name = "honor_date")
    private Date honorDate;

    /** 悬挂地址-省 */
    @Column(name = "honor_province")
    private String honorProvince;

    /** 悬挂地址-市 */
    @Column(name = "honor_city")
    private String honorCity;

    /** 悬挂地址-区县 */
    @Column(name = "honor_area")
    private String honorArea;

    /** 悬挂地址 */
    @Column(name = "honor_address")
    private String honorAddress;

    /** 是否取消光荣牌 */
    @Column(name = "is_cancel_honor")
    private String isCancelHonor;

    /** 取消光荣牌时间 */
    @Column(name = "cancel_honor_date")
    private Date cancelHonorDate;

    /** 是否更换光荣牌 */
    @Column(name = "is_change_honor")
    private String isChangeHonor;

    /** 更换光荣牌时间 */
    @Column(name = "change_honor_date")
    private Date changeHonorDate;

}
