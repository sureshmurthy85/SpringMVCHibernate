
// PersonDAO.java --
//
// PersonDAO.java is part of ElectricCommander.
//
// Copyright (c) 2005-2016 Electric Cloud, Inc.
// All rights reserved.
//

package com.demo.spring.dao;

import java.util.List;

import com.demo.spring.model.Person;

public interface PersonDAO
{

    //~ Methods ----------------------------------------------------------------

    void addPerson(Person p);

    List<Person> listPersons();

    void removePerson(int id);

    void updatePerson(Person p);

    Person getPersonById(int id);
}
