package com.yangying.por.pojo;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_stu")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "SEX")
    private Integer sex;

    public Integer getSex() {
        return sex;
    }
    public void setSex(Integer sex) {
        this.sex = sex;
    }


    @Column(name = "NP")
    private String  np;

    public String getNp() {
        return np;
    }
    public void setNp(String np) {
        this.np = np;
    }


    @Column(name = "TEL")
    private String  tel;

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }


    @Column(name = "ID_CARD")
    private String  id_card;

    public String getId_card() {
        return id_card;
    }
    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    @Column(name = "COLLEGE")
    private String college;

    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }


    @Column(name = "MAJOR")
    private String major;

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }


    @Column(name = "CLASS")
    private String  cla;

    public String getCla() {
        return cla;
    }
    public void setCla(String cla) {
        this.cla = cla;
    }

    @Column(name = "ENROLLMENT_YEAR")
    private String enrollment_year ;

    public String getEnrollment_year() {
        return enrollment_year;
    }
    public void setEnrollment_year(String enrollment_year) {
        this.enrollment_year = enrollment_year;
    }

}
