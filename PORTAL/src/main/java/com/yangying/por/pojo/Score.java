package com.yangying.por.pojo;
import javax.persistence.*;
@Entity
@Table(name = "score")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SCORE_ID")
    private Integer scoreId;

    @ManyToOne(targetEntity = Student.class)
    @JoinColumn(name = "STU_ID", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Student student;

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @OneToOne(targetEntity = Course.class)
    @JoinColumn(name = "COURSE_ID", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Column(name = "GRADE")
    private Integer grade;

    public Integer getGrade() {
        return grade;
    }
    public void setGrade(Integer grade) {
        this.grade = grade;
    }


    @Column(name = "TOTAL_GRADE")
    private Integer total_grade;

    public Integer getTotal_grade() {
        return total_grade;
    }
    public void setTotal_grade(Integer total_grade) {
        this.total_grade = total_grade;
    }
}
