package com.modulcar.hb01.annotation;

import javax.persistence.*;

@Entity
@Table(name="t_student01")
public class student01 {

    @Id
    @Column(name = "std_id")
    private int id;

    @Column(name = "std_name",length = 100,nullable = false,unique = true)
    private String name;
    private int grade;

    @Transient // bu fieldda karşılık age isminde bir sütun oluşturulmaz.
    private int age;

    //@Lob // büyük boyutlu datalar için sütun oluşmasını sağlar.
    //private byte[] image;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "student01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
