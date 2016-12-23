package com.om.hiberoiddemo.bean;

import com.om.hiberoid.annotation.Entity;

import java.io.Serializable;

/**
 * Created by Surendra on 12/23/2016.
 */
@Entity(name = "Apex")
public class Student implements Serializable {
    private int id;

    private String name;
    private String class_name;
    private String grade;

    public Student() {
    }

    public Student(String name, String class_name, String grade) {
        this.name = name;
        this.class_name = class_name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
