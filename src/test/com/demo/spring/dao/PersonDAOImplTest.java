
// PersonDAOImplTest.java --
//
// PersonDAOImplTest.java is part of ElectricCommander.
//
// Copyright (c) 2005-2016 Electric Cloud, Inc.
// All rights reserved.
//

package com.demo.spring.dao;

import org.junit.Test;

import org.springframework.test.context.ContextConfiguration;

import com.demo.spring.model.Person;

import static junit.framework.Assert.assertEquals;

@ContextConfiguration(
    locations = {"classpath*:/WEB-INF/appServlet/servlet-context.xml"}
)
public class PersonDAOImplTest
{

    //~ Methods ----------------------------------------------------------------

    @Test public void savePersonTest()
    {
        Person p = new Person();

        p.setId(1);
        p.setName("suresh");
        p.setCountry("United States");
        assertEquals("suresh", p.getName());
    }
}
