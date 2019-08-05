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
 * 身体状态
 */
@Entity
@Table(name = "army_body_state")
@Data
public class BodyState extends AbstractEntity {

    private static final long serialVersionUID = 7616548977843488872L;

    /** 主键 */
    @Id
    @Column(name = "body_state_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bodyStateId;

    /** 军人基本信息id */
    @Column(name = "soldier_id")
    private String soldierId;

    /** 健康状况 数组 */
    @Column(name = "health_state")
    private String healthState;

    /** 疾病种类 */
    @Column(name = "illness_type")
    private String illnessType;

    /** 评残时间 */
    @Column(name = "assess_date")
    private Date assessDate;

    /** 残疾部位 */
    @Column(name = "disabled_part")
    private String disabledPart;

    /** 残疾等级 */
    @Column(name = "disabled_level")
    private String disabledLevel;

    /** 残疾证件照片 */
    @Column(name = "disability_picture")
    private String disabilityPicture;

    /** 残疾证件号 */
    @Column(name = "disability_number")
    private String disabilityNumber;

    /** 残疾证件有效期 */
    @Column(name = "valid_date")
    private Date validDate;

    /** 是否配置辅助器具 */
    @Column(name = "is_config_tool")
    private String isConfigTool;

    /** 配置辅助器具状况 */
    @Column(name = "config_tools")
    private String configTools;

    /** 是否职业病评残 */
    @Column(name = "occupational_disease")
    private String occupationalDisease;

    /** 享受残疾人两项补贴 */
    @Column(name = "have_dubbo_allowance")
    private String haveDubboAllowance;

    /** 是否享受护理 */
    @Column(name = "enjoy_care")
    private String enjoyCare;


}
