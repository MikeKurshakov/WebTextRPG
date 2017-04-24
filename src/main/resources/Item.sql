CREATE TABLE item
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    strength INT(11) NOT NULL,
    vitality INT(11) NOT NULL,
    intelligence INT(11) NOT NULL,
    agility INT(11) NOT NULL,
    defense int(11) NOT NULL ,
    attack int (11) NOT NULL ,
    heakth int (11) NOT NULL ,
    mana int (11) NOT NULL ,
    position INT(11) NOT NULL,
    price INT(11) NOT NULL,
    compatibility VARCHAR(10) NOT NULL
);

INSERT  INTO item ( name, strength, vitality, intelligence, agility, defense, attack, health, mana, position, price, compatibility)
VALUE('knife',1,1,0,0,0,10,5,0,1,20,'Warrior');
INSERT  INTO item ( name, strength, vitality, intelligence, agility, defense, attack, health, mana, position, price, compatibility)
VALUES('helmet',1,1,0,0,5,0,10,0,2,20,'Warrior');
INSERT  INTO item ( name, strength, vitality, intelligence, agility, defense, attack, health, mana, position, price, compatibility)
VALUES('shield',1,2,0,0,20,0,0,0,3,20,'Warrior');
