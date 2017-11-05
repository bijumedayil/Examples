DROP TABLE EMPLOYEE;

DROP TABLE DEPARTMENT;


CREATE TABLE DEPARTMENT(
DEPTID INT(5) PRIMARY KEY AUTO_INCREMENT,
DNAME VARCHAR(30)
);

CREATE	TABLE EMPLOYEE(
EMPID INT(5) PRIMARY KEY AUTO_INCREMENT,
ENAME VARCHAR(30),
EMAIL VARCHAR(30),
DEPTID INT(5),
CONSTRAINT FOREIGN KEY (DEPTID) REFERENCES DEPARTMENT (DEPTID)
);