DROP TABLE IF EXISTS employee;
 
CREATE TABLE employee (
  id INT PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO employee (id, first_name, last_name, email) VALUES
  (1,'Raj', 'K', 'a@emp.com'),
  (2,'Bill', 'G', 'b@emp.com'),
  (3,'Mark', 'A', 'c@emp.com');
  

 DROP TABLE IF EXISTS payslip;
 
CREATE TABLE payslip (
  id INT PRIMARY KEY,
  emp_id INT NOT NULL,
  month VARCHAR(250) NOT NULL,
  salary INT NOT NULL,
  foreign key (emp_id) references employee(id)
);

INSERT INTO payslip (id, emp_id, month, salary) VALUES
  (1,1, 'Jan-20', 100),
 (2,1, 'Feb-20', 100),
 (3,2, 'Jan-20', 100);