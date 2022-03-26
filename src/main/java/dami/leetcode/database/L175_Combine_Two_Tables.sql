-- MySQL, MS SQL Server, Oracle
SELECT A.firstName
     , A.lastName
     , B.city
     , B.state
  FROM Person A LEFT JOIN Address B
    ON A.personId = B.personId;