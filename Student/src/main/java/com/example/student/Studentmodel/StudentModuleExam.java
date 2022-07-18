package com.example.student.Studentmodel;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Entity
public class StudentModuleExam extends Basemodel {
    @ManyToOne
    private Student student;
    @ManyToOne
    private ModuleExam moduleExam;
    private double Marks;
}
