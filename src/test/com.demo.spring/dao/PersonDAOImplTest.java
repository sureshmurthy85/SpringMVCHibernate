
// PersonDAOImplTest.java --
//
// PersonDAOImplTest.java is part of ElectricCommander.
//
// Copyright (c) 2005-2016 Electric Cloud, Inc.
// All rights reserved.
//

package com.demo.spring.dao;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(defaultRollback = true)
@Transactional public class PersonDAOImplTest {

    @Autowired
    private IPersonDao personDao;
    @Autowired
    private HibernateTemplate  hibernateTemplate;
    @Test
    public void savePersonTest(){
        personDao.savePerson();
        Person person = hibernateTemplate.get(Person.class, 1);
        assertEquals("Ram", person.getName());
    }
}
