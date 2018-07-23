package com.yangying.por.pojo;
import javax.persistence.*;
@Entity
@Table(name = "class")
public class ClassBean {
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

    @Column(name = "COLLEGE")
    private String college;

    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }

    @Column(name = "STU_COUNT")
    private Integer stu_count;

    public Integer getStu_count() {
        return stu_count;
    }
    public void setStu_count(Integer stu_count) {
        this.stu_count = stu_count;
    }

    @OneToOne(targetEntity = Rpt.class)
    @JoinColumn(name = "MASTER_TEACHER_ID", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Rpt master; // 班主任

    public Rpt getMaster() {
        return master;
    }

    public void setMaster(Rpt master) {
        this.master = master;
    }
}
