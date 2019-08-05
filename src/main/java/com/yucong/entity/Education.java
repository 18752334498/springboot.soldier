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
 * 教育学历
 */
@Entity
@Table(name = "army_education")
@Data
public class Education  extends AbstractEntity{

    private static final long serialVersionUID = -6535998016633808838L;

    /** 主键 */
    @Id
    @Column(name = "education_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educationId;

    /** 军人基本信息id */
    @Column(name = "soldier_id")
    private String soldierId;

    /** 入学时间 */
    @Column(name = "start_date")
    private Date startDate;

    /** 毕业时间 */
    @Column(name = "end_date")
    private Date endDate;

    /** 教学机构 */
    @Column(name = "institution")
    private String institution;

    /** 专业 */
    @Column(name = "major")
    private String major;

    /** 学历 */
    @Column(name = "education")
    private String education;

    /** 学位 */
    @Column(name = "degree")
    private String degree;

    /** 学历证书 */
    @Column(name = "education_picture")
    private String educationPicture;

    /** 学位证书 */
    @Column(name = "degree_picture")
    private String degreePicture;

    /** 教育类型，1全日制，2继续教育 */
    @Column(name = "edu_type")
    private String eduType;

}
