-- Create the database Gtasks
create database Gtasks;

use Gtasks;

-- Create the Empl table
create table Empl(
empno int primary KEY,
ename varchar(60) not null,
job varchar(30) not null,
mgr int,
hiredate date not null,
sal DECIMAL(10,2) NOT NULL,
comm DECIMAL(10,2),
deptno int
);

-- Insert data into the Empl table
INSERT INTO Empl (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES 
(8369, 'SMITH', 'CLERK', 8902, '1990-12-18', 800.00, NULL, 20),
(8499, 'ANYA', 'SALESMAN', 8698, '1991-02-20', 1600.00, 300.00, 30),
(8521, 'SETH', 'SALESMAN', 8698, '1991-02-22', 1250.00, 500.00, 30),
(8566, 'MAHADEVAN', 'MANAGER', 8839, '1991-04-02', 2985.00, NULL, 20),
(8654, 'MOMIN', 'SALESMAN', 8698, '1991-09-28', 1250.00, 1400.00, 30),
(8698, 'BINA', 'MANAGER', 8839, '1991-05-01',2850.00, NULL, 30),
(8882, 'SHIVANSH', 'MANAGER', 8839, '1991-06-09', 2450.00, NULL,10),
(8888, 'SCOTT','ANALYST',8566,'1992-12-09',3000.00,NULL,20),
(8839, 'AMIR', 'PRESIDENT',NULL,'1991-11-18',5000.00,NULL,10),
(8844, 'KULDEEP','SALESMAN',8698,'1991-09-08',1500.00,0.00,30);


-- Query 1: Display all employees.
select * from Empl
order by empno;


-- Query 2: Display names and salaries of employees with 
-- salary are greater than or equal to 2200.
select  ename as name, sal as salary from Empl
where sal>=2200
order by sal;

-- Query 3: Display names of employees who are not getting commission.
select  ename as name from Empl
where comm is null
order by name;

-- Query 4: Display names and salaries of employees 
-- who don't have their salary in the range of 2500 to 4000.
select ename as name, sal as salary from Empl
where sal < 2500 or sal > 4000
order by sal;

-- Query 5: Display names, job titles, and salaries of employees
-- who don'thave a managers.
select ename as name, job as Job_Title, 
sal as salary from Empl
where job <> "Manager"
order by sal;

-- Query 6: Display names of employees where the third letter is 'A'
SELECT ename
FROM Empl
WHERE ename LIKE '__A%';

# or SELECT ename FROM Empl WHERE SUBSTRING(ename, 3, 1) = 'A';

-- Query 7: Display names of employees containing 'T' at last
SELECT ename
FROM Empl
WHERE ename LIKE '%T';



