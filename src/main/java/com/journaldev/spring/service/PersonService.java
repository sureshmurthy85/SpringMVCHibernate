
// PersonService.java --
//
// PersonService.java is part of ElectricCommander.
//
// Copyright (c) 2005-2016 Electric Cloud, Inc.
// All rights reserved.
//

package com.journaldev.spring.service;

import java.util.List;

import com.journaldev.spring.model.Person;

public interface PersonService
{

    //~ Methods ----------------------------------------------------------------

    List<Person> listPersons();

    void removePerson(int id);

    void updatePerson(Person p);

    void addPerson(Person p);

    Person getPersonById(int id);
}
