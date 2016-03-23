
// Person.java --
//
// Person.java is part of ElectricCommander.
//
// Copyright (c) 2005-2016 Electric Cloud, Inc.
// All rights reserved.
//

package com.demo.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations Hibernate provides JPA implementation.
 */
@Entity
@Table(name = "PERSON")
public class Person
{

    //~ Instance fields --------------------------------------------------------

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private int id;
    private String  name;
    private String  country;

    //~ Methods ----------------------------------------------------------------

    @Override public String toString()
    {
        return "id=" + id + ", name=" + name + ", country=" + country;
    }

    public String getCountry()
    {
        return country;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
