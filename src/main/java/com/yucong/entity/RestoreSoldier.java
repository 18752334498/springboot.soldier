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
 * 复员军人
 */
@Entity
@Table(name = "army_restore_soldier")
@Data
public class RestoreSoldier extends AbstractEntity {

    private static final long serialVersionUID = 3002863015098026659L;

    /** 主键 */
    @Id
    @Column(name = "restore_soldier_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restoreSoldierId;

    /** g:复员军人 */
    @Column(name = "role")
    private String role;

    /** 军人基本信息id */
    @Column(name = "soldier_id")
    private String soldierId;

    /** 人员类别 */
    @Column(name = "people_type")
    private String peopleType;

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
    @Column(name = "army_code")
    private String armyCode;

    /** 原职级 */
    @Column(name = "original_duty")
    private String originalDuty;

    /** 兵种 */
    @Column(name = "soldier_type")
    private String soldierType;

    /** 立功受奖情况 */
    @Column(name = "honors")
    private String honors;

    /** 安置地-省 */
    @Column(name = "setting_province")
    private String settingProvince;

    /** 安置地-市 */
    @Column(name = "setting_city")
    private String settingCity;

    /** 安置地-区 */
    @Column(name = "setting_area")
    private String settingArea;

    /** 安置计划年度 */
    @Column(name = "setting_date")
    private Date settingDate;

    /** 档案接收时间 */
    @Column(name = "receive_date")
    private Date receiveDate;

    /** 复员证件号 */
    @Column(name = "restore_number")
    private String restoreNumber;

    /** 复员证件图片 */
    @Column(name = "restore_picture")
    private String restorePicture;


    /********** 待遇 **********/

    /** 待遇情况-优抚证件 */
    @Column(name = "treat_picture")
    private String treatPicture;

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
