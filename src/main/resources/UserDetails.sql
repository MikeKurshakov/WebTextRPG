
CREATE TABLE userdetails
(
  id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  level INT(11) NOT NULL,
  type VARCHAR(15) NOT NULL,
  items VARCHAR(255),
  strenght INT(11),
  vitality INT(11),
  agility INT(11),
  intelligence INT(11),
  exp INT(11),
  point INT(11),
  wearing_items VARCHAR(255)
);