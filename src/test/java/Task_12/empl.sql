create database Empl;
use Empl;
create table Empl(
empno int unique,
 ename varchar(10) NOT NULL ,
 job varchar (10),
 mgr int, 
 hiredate varchar(10),
 sal decimal(10,5),
 comm decimal(10,5),
 deptno int);  
Insert into Empl(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(8369,'SMITH','CLERK',8902,'1990-12-18','800.00',null , 20);
Insert into Empl(empno,ename,job,mgr,hiredate,sal,comm,deptno) values (8499,'ANYA','SALESMAN', 8698,'1991-02-20','1600.00','300.00',30);											
Insert into Empl(empno,ename,job,mgr,hiredate,sal,comm,deptno) values (8521,'SETH','SALESMAN', 8698,'1991-02-22','1250.00','500.00',30);											
Insert into Empl(empno,ename,job,mgr,hiredate,sal,comm,deptno) values (8566,'MAHADEVAN','MANAGER', 8639,'1991-04-12','2985.00',null,30);										
Insert into Empl(empno,ename,job,mgr,hiredate,sal,comm,deptno) values  (8654,'MOMIN','SALESMAN', 8698,'1991-09-28','1250.00','1400.00',20);                                                                  
Insert into Empl(empno,ename,job,mgr,hiredate,sal,comm,deptno) values  (8698,'BINA','MANAGER', 8839,'1991-05-01','2850.00',NULL,20);                                                                  
Insert into Empl(empno,ename,job,mgr,hiredate,sal,comm,deptno) values  (8882,'SHIVANSH','MANAGER', 8839,'1991-03-25','2450.00',NULL,20);                                                                  
Insert into Empl(empno,ename,job,mgr,hiredate,sal,comm,deptno) values  (8888,'SCOTT','ANALYST', 8566,'1981-09-28','2450.00','1400.00',20);                                                                  
Insert into Empl(empno,ename,job,mgr,hiredate,sal,comm,deptno) values  (8839,'AMIR','PRESIDENTY', NULL,'1990-09-28','3250.00','1400.00',20);                                                                  
Insert into Empl(empno,ename,job,mgr,hiredate,sal,comm,deptno) values  (8844,'KULDEEP','SALESMAN', 8698,'1989-09-28','2550.00','1400.00',20);                                                                  


select * from Empl;                                                                      											

select* from Empl where sal = '800';
select max(comm) from Empl; 
select min (comm) from Empl;
select * from Empl order by empno;                                                                    
 select * from Empl where sal= 2450 and deptno =20;
  select * from Empl where sal= 2450 or deptno =20; 
  select * from Empl where sal >= 2550;
select *from Empl where ename = '__t%';
select * from Empl where ename ='%t%';

