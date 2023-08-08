package com.modulcar.hb01.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {
    public static void main(String[] args) {
        Student01 student01 = new Student01();

        student01.setId(1001);
        student01.setName("Ummu Umare");
        student01.setGrade(98);
        student01.setAge(25);

        //hibernate.cfg.xml dosyasındaki bilgileri ve Student01 classına göre annotasyonlara göre config et.
        Configuration configuration = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml");

        //addAnnotatedClass ile Entity classınızı Hibernate e gösteriyoruz.
        //DB ile ilgili işlemlerin yönetimini sağlar.
        SessionFactory sf = configuration.buildSessionFactory();

        //DB de CRUD operationları için ve sorguları çalıştırmak için metodlar yazılır.
        Session session = sf.openSession();

        //Hibernate auto-commit: false
        //DB de bir transaction başlatır.
        Transaction tx = session.beginTransaction();

        tx.commit();
        session.close();
        sf.close();
    }
}
