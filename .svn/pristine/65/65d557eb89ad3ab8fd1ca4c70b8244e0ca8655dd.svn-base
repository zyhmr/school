package com.shjd.pojo;

import lombok.Data;

import javax.persistence.*;

@Table(name = "student_info")
@Data
public class StudentInfo {
    /**
     * 学生信息表编号
     */
    @Id
    private Integer id;

    /**
     * 学生表编号
     */
    @Column(name = "student_id")
    private Integer studentId;

    /**
     * 性别：1男 0女
     */
    @Column(name = "student_age")
    private Integer studentAge;

    /**
     * 学生所在班级
     */
    @Column(name = "in_class")
    private String inClass;

    /**
     * 获取学生信息表编号
     *
     * @return id - 学生信息表编号
     */
    public Integer getId() {
        return id;
    }
}