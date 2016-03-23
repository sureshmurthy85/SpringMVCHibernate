
// PersonDAOImpl.java --
//
// PersonDAOImpl.java is part of ElectricCommander.
//
// Copyright (c) 2005-2016 Electric Cloud, Inc.
// All rights reserved.
//

package com.journaldev.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Repository;

import com.journaldev.spring.model.Person;

@Repository public class PersonDAOImpl
    implements PersonDAO
{

    //~ Static fields/initializers ---------------------------------------------

    private static final Logger logger = LoggerFactory.getLogger(
            PersonDAOImpl.class);

    //~ Instance fields --------------------------------------------------------

    private SessionFactory sessionFactory;

    //~ Methods ----------------------------------------------------------------

    @Override public void addPerson(Person p)
    {
        Session session = this.sessionFactory.getCurrentSession();

        session.persist(p);
        logger.info("Person saved successfully, Person Details=" + p);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Person> listPersons()
    {
        Session      session     = this.sessionFactory.getCurrentSession();
        List<Person> personsList = session.createQuery("from Person")
                                          .list();

        for (Person p : personsList) {
            logger.info("Person List::" + p);
        }

        return personsList;
    }

    @Override public void removePerson(int id)
    {
        Session session = this.sessionFactory.getCurrentSession();
        Person  p       = (Person) session.load(Person.class, new Integer(id));

        if (null != p) {
            session.delete(p);
        }

        logger.info("Person deleted successfully, person details=" + p);
    }

    @Override public void updatePerson(Person p)
    {
        Session session = this.sessionFactory.getCurrentSession();

        session.update(p);
        logger.info("Person updated successfully, Person Details=" + p);
    }

    @Override public Person getPersonById(int id)
    {
        Session session = this.sessionFactory.getCurrentSession();
        Person  p       = (Person) session.load(Person.class, new Integer(id));

        logger.info("Person loaded successfully, Person details=" + p);

        return p;
    }

    public void setSessionFactory(SessionFactory sf)
    {
        this.sessionFactory = sf;
    }
}
