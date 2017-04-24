package com.art.dao;

import com.art.model.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
@Repository("ItemDao")
@Transactional
@EnableTransactionManagement
public class ItemDAOImp implements  ItemDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Item findById(int id) {
            try {
                return (Item) getSession().get(Item.class, id);
            } catch (NullPointerException ex ) {
                System.out.println(("Такого предмета нету"));
                return null;
            }
    }



}
