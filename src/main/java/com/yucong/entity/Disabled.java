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
 * 伤残军人，伤残民兵民工
 */
@Entity
@Table(name = "army_disabled")
@Data
public class Disabled extends AbstractEntity {

    private static final long serialVersionUID = -5765803871814980388L;

    /** 主键 */
    @Id
    @Column(name = "disabled_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long disabledId;

    /** i:伤残军人 j:伤残民兵民工 */
    @Column(name = "role")
    private String role;

    /** 军人基本信息id */
    @Column(name = "soldier_id")
    private String soldierId;


    /** 入伍时间 */
    @Column(name = "join_date")
    private Date joinDate;

    /** 退伍时间 */
    @Column(name = "leave_army_date")
    private Date leaveArmyDate;

    /** 负伤时间 */
    @Column(name = "disabled_date")
    private Date disabledDate;

    /** 负伤地点-省 */
    @Column(name = "disabled_province")
    private String disabledProvince;

    /** 负伤地点-市 */
    @Column(name = "disabled_city")
    private String disabledCity;

    /** 负伤地点-区县 */
    @Column(name = "disabled_area")
    private String disabledArea;

    /** 负伤地点-详细地址 */
    @Column(name = "disabled_address")
    private String disabledAddress;

    /** 负伤时所在部队 */
    @Column(name = "disabled_army")
    private String disabledArmy;

    /** 评残时间 */
    @Column(name = "assess_date")
    private Date assessDate;

    /** 伤残证件号码 */
    @Column(name = "disabled_number")
    private String disabledNumber;

    /** 伤残证件照片 */
    @Column(name = "disabled_picture")
    private String disabledPicture;

    /** 伤残证件有效期起始时间 */
    @Column(name = "valid_start_date")
    private Date validStartDate;

    /** 伤残证件有效期截止时间 */
    @Column(name = "valid_end_date")
    private Date validEndDate;

    /** 伤残性质 */
    @Column(name = "disabled_reason")
    private String disabledReason;

    /** 伤残等级 */
    @Column(name = "disabled_level")
    private String disabledLevel;

    /** 伤残部位 数组 */
    @Column(name = "disabled_parts")
    private String disabledParts;

    /** 是否精神病评残 */
    @Column(name = "spirit_illness")
    private String spiritIllness;

    /** 是否职业病评残 */
    @Column(name = "occupational_disease")
    private String occupationalDisease;

    /** 是否配置辅助器材 */
    @Column(name = "is_config_tool")
    private String isConfigTool;

    /** 配置时间 */
    @Column(name = "config_date")
    private Date configDate;

    /** 辅助器具-假肢 */
    @Column(name = "limb_tool")
    private String limbTool;

    /** 辅助器具-矫形器 */
    @Column(name = "fix_tool")
    private String fixTool;

    /** 辅助器具-移动辅助器具 */
    @Column(name = "move_tool")
    private String moveTool;

    /** 辅助器具-生活类辅助器具 */
    @Column(name = "life_tool")
    private String lifeTool;

    /** 伤残变动种类 */
    @Column(name = "change_disabled_type")
    private String changeDisabledType;

    /** 变动伤残时间 */
    @Column(name = "change_disabled_date")
    private Date changeDisabledDate;

    /** 变动伤残证件 */
    @Column(name = "change_disabled_picture")
    private String changeDisabledPicture;

    /** 变动伤残证件号码 */
    @Column(name = "change_disabled_number")
    private String changeDisabledNumber;

    /** 变动伤残等级 */
    @Column(name = "change_disabled_level")
    private String changeDisabledLevel;

    /** 变动伤残部位 */
    @Column(name = "change_disabled_part")
    private String changeDisabledPart;



    /********** 供养情况 **********/

    /** 供养方式 */
    @Column(name = "support_type")
    private String supportType;

    /** 供养单位 */
    @Column(name = "support_depart")
    private String supportDepart;

    /** 供养单位地址-省 */
    @Column(name = "support_province")
    private String supportProvince;

    /** 供养单位地址-市 */
    @Column(name = "support_city")
    private String supportCity;

    /** 供养单位地址-区县 */
    @Column(name = "support_area")
    private String supportArea;

    /** 供养单位地址-详细地址 */
    @Column(name = "support_address")
    private String supportAddress;


    /** 轮养状况 数组 */
    @Column(name = "care_rotation")
    private String careRotation;


    /********** 待遇 **********/
    /** 抚恤金发放银行 */
    @Column(name = "bank")
    private String bank;

    /** 银行账号 */
    @Column(name = "bank_id_number")
    private String bankIdNumber;

    /** 发放金额 */
    @Column(name = "money")
    private String money;

    /** 护理费 */
    @Column(name = "care_reason")
    private String careReason;

    /** 护理金额 */
    @Column(name = "care_money")
    private String careMoney;


    /********** 光荣牌 **********/

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
