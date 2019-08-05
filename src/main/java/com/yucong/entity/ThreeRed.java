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
 * 三红人员
 */
@Entity
@Table(name = "army_three_red")
@Data
public class ThreeRed extends AbstractEntity {

    private static final long serialVersionUID = -5962691615160150521L;

    /** 主键 */
    @Id
    @Column(name = "three_red_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long threeRedId;

    /** f:三红人员 */
    @Column(name = "role")
    private String role;

    /** 军人基本信息id */
    @Column(name = "soldier_id")
    private String soldierId;

    /** 人员类别 */
    @Column(name = "people_type")
    private String peopleType;

    /** 参加革命时间 */
    @Column(name = "join_army_date")
    private Date joinArmyDate;

    /** 退伍时间 */
    @Column(name = "leave_army_date")
    private Date leaveArmyDate;

    /** 离休退休时间 */
    @Column(name = "retire_date")
    private Date retireDate;

    /** 原单位 */
    @Column(name = "belong_depart")
    private String belongDepart;

    /** 安置地-省 */
    @Column(name = "setting_province")
    private String settingProvince;

    /** 安置地-市 */
    @Column(name = "setting_city")
    private String settingCity;

    /** 安置地-区 */
    @Column(name = "setting_area")
    private String settingArea;

    /** 证件照片 */
    @Column(name = "paper_picture")
    private String paperPicture;

    /** 证件号码 */
    @Column(name = "paper_number")
    private String paperNumber;

    /** 供养情况 */
    @Column(name = "support_type")
    private String supportType;

    /** 供养单位 */
    @Column(name = "support_depart")
    private String supportDepart;

    /** 享受国家抚恤金 */
    @Column(name = "enjoy_national_money")
    private String enjoyNationalMoney;

    /** 待遇发放类型 */
    @Column(name = "give_money_type")
    private String giveMoneyType;

    /** 金额 */
    @Column(name = "total_money")
    private String totalMoney;

    /** 银行名称 */
    @Column(name = "bank")
    private String bank;

    /** 银行卡号 */
    @Column(name = "bank_id_number")
    private String bankIdNumber;


}
