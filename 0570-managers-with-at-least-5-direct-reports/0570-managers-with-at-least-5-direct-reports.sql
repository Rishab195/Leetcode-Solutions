# Write your MySQL query statement below

Select e.name from Employee as  e join Employee as m on e.id=m.managerId group by m.managerId  
having count(m.managerId)>=5 ;