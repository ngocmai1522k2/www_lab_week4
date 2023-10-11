package vn.edu.iuh.fit.objectInjection;

import vn.edu.iuh.fit.objectInjection.Class_;

public class Student_ {
    private Class_ class_;
    private String name;
    private long id;

    public Student_() {
    }

    @Override
    public String toString() {
        return "Student_{" +
                "class_=" + class_ +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Student_(Class_ class_, String name, long id) {
        this.class_ = class_;
        this.name = name;
        this.id = id;
    }

    public Class_ getClass_() {
        return class_;
    }

    public void setClass_(Class_ class_) {
        this.class_ = class_;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
