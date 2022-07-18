package com.example.student.Studentmodel;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class ModuleExam extends Basemodel {
    @ManyToOne
    private Module module;
    @ManyToOne
    private Exam exam;
    private Date date;
}
