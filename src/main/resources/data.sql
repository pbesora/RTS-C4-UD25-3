DROP TABLE IF EXISTS boxes;
DROP table IF EXISTS warehouses;


CREATE TABLE warehouses (
  id int(11) NOT NULL AUTO_INCREMENT,
  location varchar(100) DEFAULT NULL,
  capacity int DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE boxes (
  id int(11) NOT NULL AUTO_INCREMENT,
  content varchar(100) DEFAULT NULL,
  value int DEFAULT NULL,
  warehouse int(11) DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT FK_wareBox FOREIGN KEY (warehouse) REFERENCES warehouses (id)
  ON DELETE SET NULL ON UPDATE CASCADE
);


insert into warehouses (location, capacity)values('Location 1', 12000);
insert into warehouses (location, capacity)values('Location 2', 62000);
insert into warehouses (location, capacity)values('Location 3', 22000);
insert into warehouses (location, capacity)values('Location 4', 98000);

insert into boxes (content, value, warehouse) values ('Content 1', 20, 1);
insert into boxes (content, value, warehouse) values ('Content 2', 222, 4);
insert into boxes (content, value, warehouse) values ('Content 3', 43, 3);
insert into boxes (content, value, warehouse) values ('Content 4', 10, 2);

