package com.art.dao;

import com.art.model.Item;

/**
 * Created by Artem on 10.03.2017.
 */
public interface ItemDAO {
    public Item findById(int id);
}
