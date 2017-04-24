package com.art.controller.battle;

import com.art.character.Heroes.Player;
import com.art.dao.PlayerDAO;
import com.art.init.EnemyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/battle/woodland")
public class Woodland {
    private final EnemyConfig enemyConfig;
    private final HttpServletRequest req;
    private final PlayerDAO playerDAO;

    @Autowired
    public Woodland(EnemyConfig enemyConfig, HttpServletRequest req, PlayerDAO playerDAO) {
        this.enemyConfig = enemyConfig;
        this.req = req;
        this.playerDAO = playerDAO;
    }

    @RequestMapping(value = "/bear", method = RequestMethod.GET)
    public String battleBear(ModelMap map) {

        String type = (String) req.getSession().getAttribute("type");
        Player player = playerDAO.playerGetType(type);
        if (player==null) return "redirect:/";

        map.put("Player", player);
        map.put("Bear", enemyConfig.bear());
        return "BattleBear";
    }

    @RequestMapping(value = "/wolf", method = RequestMethod.GET)
    public String battleWolf(ModelMap map) {
        map.put("Wolf", enemyConfig.wolf());
        return "BattleWolf";
    }

    @RequestMapping(value = "/marauder", method = RequestMethod.GET)
    public String battleMarauder(ModelMap map) {
        map.put("Marauder", enemyConfig.marauder());
        return "BattleMarauder";
    }
}
