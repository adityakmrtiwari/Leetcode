CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
        Select Distinct salary 
        From Employee e1 
        Where N-1 = ( 
            Select COUNT(DISTINCT salary)
            From Employee e2
            Where e2.salary>e1.salary
        )
  );
END