//package com.training.application.entity;
//
//import lombok.Data;
//import lombok.ToString;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//import org.springframework.data.annotation.CreatedDate;
//
//import javax.persistence.*;
//import java.sql.Date;
//import java.sql.Timestamp;
//
//@ToString
//@Data
//@Entity
//@Table(name = "customer", schema = "training-batch1")
//public class CustomerEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    int id;
//
//    @Column(name = "name")
//    String name;
//
//    @Column(name = "email")
//    String email;
//
//    @Column(name = "createdTime")
//    @CreationTimestamp
//    Timestamp createdTime;
//
//    @Column(name = "updatedTime")
//    @UpdateTimestamp
//    Timestamp updatedTime;
//
//    @Column(name = "createdBy")
//    String crearedBy;
//
//    @Column(name = "updatedBy")
//    String updated;
//
//}
