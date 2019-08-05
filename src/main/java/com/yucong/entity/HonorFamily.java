package com.yucong.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 因公牺牲军人遗嘱信息，病故军人遗嘱信息，现役军人直系亲属信息，烈士遗嘱信息
 */
@Entity
@Table(name = "army_honor_family")
@Data
public class HonorFamily extends AbstractEntity {

    private static final long serialVersionUID = -7804188106770881551L;

    /** 主键 */
    @Id
    @Column(name = "honor_family_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long honorFamilyId;

    /** k:烈士遗嘱 m:因公牺牲军人 n:病故军人 o:现役军人直系亲属 */
    @Column(name = "role")
    private String role;

    /** 军人基本信息id */
    @Column(name = "soldier_id")
    private String soldierId;

    /** 与军人/烈士关系 */
    @Column(name = "relation")
    private String relation;

    /** 是否是持证人 */
    @Column(name = "is_hiself")
    private String isHiself;

    /** 城乡分区 */
    @Column(name = "city_or_town")
    private String cityOrTown;


    /** 享受待遇证件号 */
    @Column(name = "treat_number")
    private String treatNumber;

    /** 享受待遇证件照片 */
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

    /** 直系亲属人口 */
    @Column(name = "relation_number")
    private String relationNumber;


    /** 是否随军 */
    @Column(name = "is_follow")
    private String isFollow;

    /** 待遇情况 */
    @Column(name = "treatment")
    private String treatment;

}
