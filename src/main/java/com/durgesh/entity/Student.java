package com.durgesh.entity;

import lombok.Data;

import javax.persistence.*;

// entity will create a table in a database and map it to corresponding table with the data
@Entity
@Table(name="student_data")
@Data
public class Student {

    @Id
    @Column(name="student_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(name="first_name")
    public String firstName;

    @Column(name="last_name")
    public String lastName;

    @Column(name="city")
    public String city;

}
