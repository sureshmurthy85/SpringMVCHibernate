
// PersonDAOImplTest.java --
//
// PersonDAOImplTest.java is part of ElectricCommander.
//
// Copyright (c) 2005-2016 Electric Cloud, Inc.
// All rights reserved.
//

package com.demo.spring.dao;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.spring.model.Person;

import static junit.framework.Assert.assertEquals;

@ContextConfiguration(
    locations = {"classpath*:/WEB-INF/appServlet/servlet-context.xml"}
)
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonDAOImplTest
{

    //~ Instance fields --------------------------------------------------------

    @Autowired private PersonDAO personDAO;

    //~ Methods ----------------------------------------------------------------

    @Test public void savePersonTest()
    {
        Person p = new Person();

        p.setId(1);
        p.setName("suresh");
        p.setCountry("United States");

        //
        personDAO.addPerson(p);

        Person person = personDAO.getPersonById(1);

        assertEquals("suresh", person.getName());
    }
}
