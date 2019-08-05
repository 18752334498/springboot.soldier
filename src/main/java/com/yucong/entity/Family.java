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
 * 家庭成员
 */
@Entity
@Table(name = "army_family")
@Data
public class Family extends AbstractEntity {

    private static final long serialVersionUID = 1704103173879341181L;

    /** 主键 */
    @Id
    @Column(name = "family_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long familyId;

    /** 军人基本信息id */
    @Column(name = "soldier_id")
    private String soldierId;

    /** 关系 */
    @Column(name = "relation")
    private String relation;

    /** 姓名 */
    @Column(name = "name")
    private String name;

    /** 性别 */
    @Column(name = "sex")
    private String sex;

    /** 出生日期 */
    @Column(name = "birth_date")
    private Date birthDate;

    /** 身份证号 */
    @Column(name = "id_Number")
    private String idNumber;

    /** 民族 */
    @Column(name = "minority")
    private String minority;

    /** 工作单位 */
    @Column(name = "work_place")
    private String workPlace;

}
