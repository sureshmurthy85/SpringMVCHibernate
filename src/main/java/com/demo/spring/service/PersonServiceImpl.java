
// PersonServiceImpl.java --
//
// PersonServiceImpl.java is part of ElectricCommander.
//
// Copyright (c) 2005-2016 Electric Cloud, Inc.
// All rights reserved.
//

package com.demo.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.spring.dao.PersonDAO;
import com.demo.spring.model.Person;

@Service public class PersonServiceImpl
    implements PersonService
{

    //~ Instance fields --------------------------------------------------------

    private PersonDAO personDAO;

    //~ Methods ----------------------------------------------------------------

    @Override @Transactional public void addPerson(Person p)
    {
        this.personDAO.addPerson(p);
    }

    @Override @Transactional public List<Person> listPersons()
    {
        return this.personDAO.listPersons();
    }

    @Override @Transactional public void removePerson(int id)
    {
        this.personDAO.removePerson(id);
    }

    @Override @Transactional public void updatePerson(Person p)
    {
        this.personDAO.updatePerson(p);
    }

    @Override @Transactional public Person getPersonById(int id)
    {
        return this.personDAO.getPersonById(id);
    }

    public void setPersonDAO(PersonDAO personDAO)
    {
        this.personDAO = personDAO;
    }
}
