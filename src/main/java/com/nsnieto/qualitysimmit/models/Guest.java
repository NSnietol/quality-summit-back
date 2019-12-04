package com.nsnieto.qualitysimmit.models;

import javax.persistence.EntityListeners;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "phones")
@EntityListeners(AuditingEntityListener.class)
@Data
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id; 

    @Column(name = "name")
    private String name; 

    @Column(name = "email")
    private String email; 

    @Column(name = "address")
    private String address; 

    @Column(name = "city")
    private String city; 

    @Column(name = "state")
    private String state; 

}