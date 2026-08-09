# Write your MySQL query statement below
Select MAX(salary) as SecondHighestSalary from Employee
WHERE salary< (select MAX(salary) from employee);