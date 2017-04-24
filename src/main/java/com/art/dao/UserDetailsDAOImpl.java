package com.art.dao;

import com.art.model.Userdetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "UserDetailsDAO")
@Transactional
@EnableTransactionManagement
public class UserDetailsDAOImpl implements  UserDetailsDAO {
    private final SessionFactory sessionFactory;

    @Autowired
    public UserDetailsDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void update(Userdetails userdetails) {
        getSession().saveOrUpdate(userdetails);
    }
}
