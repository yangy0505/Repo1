package com.yangying.por.pojo;
import javax.persistence.*;

@Entity
@Table(name = "elective_course")
public class ElectiveCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(targetEntity = Student.class)
    @JoinColumn(name = "STU_ID", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Student student;

    @ManyToOne(targetEntity = Course.class)
    @JoinColumn(name = "COURSE_ID", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Course course;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
