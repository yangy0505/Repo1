package com.yangying.por.pojo;
import javax.persistence.*;
@Entity
@Table(name = "course")
public class Course {
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
    /*@Column(name = "TEACHER_ID")
    private Integer teacher_id ;*/

    @ManyToOne(targetEntity = Rpt.class)
    @JoinColumn(name = "TEACHER_ID", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Rpt publishTeacher;

    public Rpt getPublishTeacher() {
        return publishTeacher;
    }

    public void setPublishTeacher(Rpt publishTeacher) {
        this.publishTeacher = publishTeacher;
    }

    @Column(name = "MAJOR")
    private String major ;

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }


    @Column(name = "OPENING_TIME")
    private String  opening_time ;

    public String getOpening_time() {
        return opening_time;
    }
    public void setOpening_time(String opening_time) {
        this.opening_time = opening_time;
    }
}
