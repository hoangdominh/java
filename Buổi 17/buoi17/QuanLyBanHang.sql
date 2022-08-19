-- create database quanlybanhang;

-- create table quanlybanhang.customer (
-- 	cID int not null primary key auto_increment,
--     cName VARCHAR(50),
--     cAge int
--     );

-- create table quanlybanhang.order (
-- 	oID int not null primary key auto_increment,
--     cID int not null,
--     oDate date,
--     oTotalPrice float,
--     FOREIGN KEY (cID) REFERENCES customer (cID)
--     );

-- create table quanlybanhang.product ( 
-- 	pID int not null primary key auto_increment,
--     pName VARCHAR(50),
--     pPrice floatorderdetail
--     );


create table quanlybanhang.orderdetail ( 
	oID int not null,
    pID int not null,
    odQTY VARCHAR(255),
    FOREIGN KEY (oID) REFERENCES quanlybanhang.order (oID),
    FOREIGN KEY (pID) REFERENCES quanlybanhang.product (pID)
    );

    
    