package com.art.dao;


import com.art.character.Heroes.Player;
import com.art.model.Item;
import com.art.model.User;
import com.art.model.Userdetails;

import java.util.List;

public interface PlayerDAO {
    public Player getPlayer(String type, String login, Userdetails userdetails);

    public String getWearitem(Player player);

    public String getItemList(Player player);

    public List<Item> getWearItem(Player player);

    public List<Item> getItem(Player player);

    public String setItem(User user, int id);

    void deleteItem(Player player, User user , int id);

    Player unequipe(Player player, User user, int id);

    Player deleteEquipeItem(Player player, User user, int id);

    Player equip(Player player, User user, int id);

    Player playerGetType(String type);
}
