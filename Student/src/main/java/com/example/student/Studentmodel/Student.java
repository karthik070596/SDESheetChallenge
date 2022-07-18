package com.example.student.Studentmodel;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Student extends Basemodel{
    private String name;
    private String email;
    private String password;
    private String address;
    @ManyToMany
    List<Module> enrolledStudents;
}
