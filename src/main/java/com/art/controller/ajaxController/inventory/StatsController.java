package com.art.controller.ajaxController.inventory;


import com.art.character.Heroes.Player;
import com.art.dao.PlayerDAO;
import com.art.dao.UserDAO;
import com.art.dao.UserDetailsDAO;
import com.art.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/ajax")
public class StatsController {
    private final PlayerDAO playerDAO;
    private final HttpServletRequest req;
    private final UserDAO userDAO;
    private final UserDetailsDAO userDetailsDAO;

    @Autowired
    public StatsController(PlayerDAO playerDAO, HttpServletRequest req, UserDAO userDAO, UserDetailsDAO userDetailsDAO) {
        this.playerDAO = playerDAO;
        this.req = req;
        this.userDAO = userDAO;
        this.userDetailsDAO = userDetailsDAO;
    }

    @RequestMapping(value = "/strength", method = RequestMethod.GET)
    @ResponseBody
    public String strenght() {
        String name = (String) req.getSession().getAttribute("name");
        User bylogin = userDAO.findByLogin(name);
        if (bylogin.getUserdetails().getPoint() < 1) return "";
        bylogin.getUserdetails().setPoint(bylogin.getUserdetails().getPoint() - 1);
        bylogin.getUserdetails().setStrenght(bylogin.getUserdetails().getStrenght() + 1);
        userDetailsDAO.update(bylogin.getUserdetails());
        Player player = playerDAO.getPlayer(bylogin.getUserdetails().getType(), bylogin.getLogin(), bylogin.getUserdetails());
        player.addStrength(0);
        req.getSession().setAttribute("user", player);
        return player.getAttack() + " " + player.getHealth();
    }

    @RequestMapping(value = "/intelligence", method = RequestMethod.GET)
    @ResponseBody
    public String intelligence() {
        String name = (String) req.getSession().getAttribute("name");
        User bylogin = userDAO.findByLogin(name);
        if (bylogin.getUserdetails().getPoint() < 1) return "";
        bylogin.getUserdetails().setPoint(bylogin.getUserdetails().getPoint() - 1);
        bylogin.getUserdetails().setIntelligence(bylogin.getUserdetails().getIntelligence() + 1);
        userDetailsDAO.update(bylogin.getUserdetails());
        Player player = playerDAO.getPlayer(bylogin.getUserdetails().getType(), bylogin.getLogin(), bylogin.getUserdetails());
        player.addIntelligence(0);
        req.getSession().setAttribute("user", player);
        return player.getAttack() + " " + player.getMana();
    }

    @RequestMapping(value = "/vitality", method = RequestMethod.GET)
    @ResponseBody
    public String vitality() {
        String name = (String) req.getSession().getAttribute("name");
        User bylogin = userDAO.findByLogin(name);
        if (bylogin.getUserdetails().getPoint() < 1) return "";
        bylogin.getUserdetails().setPoint(bylogin.getUserdetails().getPoint() - 1);
        bylogin.getUserdetails().setVitality(bylogin.getUserdetails().getVitality() + 1);
        userDetailsDAO.update(bylogin.getUserdetails());
        Player player = playerDAO.getPlayer(bylogin.getUserdetails().getType(), bylogin.getLogin(), bylogin.getUserdetails());
        player.addVitality(0);
        req.getSession().setAttribute("user", player);
        return player.getAttack() + " " + player.getHealth();
    }

    @RequestMapping(value = "/agility", method = RequestMethod.GET)
    @ResponseBody
    public String agility() {
        String name = (String) req.getSession().getAttribute("name");
        User bylogin = userDAO.findByLogin(name);
        if (bylogin.getUserdetails().getPoint() < 1) return "";
        bylogin.getUserdetails().setPoint(bylogin.getUserdetails().getPoint() - 1);
        bylogin.getUserdetails().setAgility(bylogin.getUserdetails().getAgility() + 1);
        userDetailsDAO.update(bylogin.getUserdetails());
        Player player = playerDAO.getPlayer(bylogin.getUserdetails().getType(), bylogin.getLogin(), bylogin.getUserdetails());
        player.addAgility(0);
        req.getSession().setAttribute("user", player);
        return player.getAttack() + " " + player.getDefense();
    }

}
