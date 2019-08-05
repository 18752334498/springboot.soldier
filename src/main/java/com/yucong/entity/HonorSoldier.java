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
 * 因公牺牲军人信息，病故军人信息，现役军人信息，烈士遗嘱，无遗嘱烈士
 */
@Entity
@Table(name = "army_honor_soldier")
@Data
public class HonorSoldier extends AbstractEntity {

    private static final long serialVersionUID = 8709851093535832476L;

    /** 主键 */
    @Id
    @Column(name = "honor_soldier_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long honorSoldierId;

    /** k:烈士遗嘱 l:无遗嘱烈士 m:因公牺牲军人 n:病故军人 o:现役军人 */
    @Column(name = "role")
    private String role;

    /** 军人基本信息id */
    @Column(name = "soldier_id")
    private String soldierId;

    /** 姓名 */
    @Column(name = "name")
    private String name;

    /** 性别 */
    @Column(name = "sex")
    private String sex;

    /** 民族 */
    @Column(name = "minority")
    private String minority;

    /** 出生日期 */
    @Column(name = "birth_date")
    private Date birthDate;

    /** 籍贯 */
    @Column(name = "native_place")
    private String nativePlace;


    /** 入伍日期 */
    @Column(name = "join_date")
    private Date joinDate;

    /** 参加工作时间 */
    @Column(name = "work_date")
    private Date workDate;

    /** 生前部队 */
    @Column(name = "belong_army")
    private String belongArmy;

    /** 生前职务 */
    @Column(name = "duty")
    private String duty;

    /** 牺牲、死亡日期 */
    @Column(name = "dead_date")
    private Date deadDate;

    /** 牺牲地点 */
    @Column(name = "dead_place")
    private String deadPlace;

    /** 牺牲原因 */
    @Column(name = "dead_reason")
    private String deadReason;

    /** 批准单位/确定单位 */
    @Column(name = "check_depart")
    private String checkDepart;

    /** 批准时间 */
    @Column(name = "approve_date")
    private Date approveDate;

    /** 烈士安葬地 */
    @Column(name = "bury_place")
    private String buryPlace;

    /** 安葬地详细地址 */
    @Column(name = "bury_address")
    private String buryAddress;

    /** 病故军人/烈士证明书编号 */
    @Column(name = "paper_number")
    private String paperNumber;

    /** 病故军人/烈士证明书 */
    @Column(name = "certificate")
    private String certificate;

    /** 烈士事迹 */
    @Column(name = "honor_story")
    private String honorStory;

    /** 立功受奖情况 */
    @Column(name = "honors")
    private String honors;

    /************** 以下是现役军人独有信息 **************/

    /** 军人类别 */
    @Column(name = "soldier_type")
    private String soldierType;

    /** 职务，军官 */
    @Column(name = "soldier_junguan")
    private String soldierJunguan;

    /** 职务，士官 */
    @Column(name = "soldier_shiguan")
    private String soldierShiguan;

    /** 职务，义务兵 */
    @Column(name = "soldier_yiwubing")
    private String soldierYiwubing;


    /** 身份证号 */
    @Column(name = "id_number")
    private String idNumber;

    /** 家庭直系亲属人口数 */
    @Column(name = "relation_number")
    private String relationNumber;

    /** 军队证件号 */
    @Column(name = "soldier_number")
    private String soldierNumber;

    /** 备注 */
    @Column(name = "comments")
    private String comments;


}
