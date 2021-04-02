package com.epam.rd.tasks.sqlqueries;

/**
 * Implement sql queries like described
 */
public class SqlQueries {
    //Select all employees sorted by last name in ascending order
    //language=HSQLDB
    String select01 = "SELECT * FROM employee ORDER BY lastname";

    //Select employees having no more than 5 characters in last name sorted by last name in ascending order
    //language=HSQLDB
    String select02 = "SELECT * FROM employee WHERE LENGTH(lastname) < 6 ORDER BY lastname";

    //Select employees having salary no less than 2000 and no more than 3000
    //language=HSQLDB
    String select03 = "SELECT * FROM employee WHERE salary >= 2000 AND salary <= 3000";

    //Select employees having salary no more than 2000 or no less than 3000
    //language=HSQLDB
    String select04 = "SELECT * FROM employee WHERE salary <= 2000 OR salary >= 3000";

    //Select all employees assigned to departments and corresponding department
    //language=HSQLDB
    String select05 = "SELECT * FROM employee AS e JOIN department AS d ON e.department = d.ID";

    //Select all employees and corresponding department name if there is one.
    //Name column containing name of the department "depname".
    //language=HSQLDB
    String select06 = "SELECT e.ID, e.lastname, e.salary, d.name AS depname FROM employee AS e LEFT JOIN department AS d" +
            " ON e.department = d.ID";

    //Select total salary pf all employees. Name it "total".
    //language=HSQLDB
    String select07 = "SELECT SUM(salary) AS total FROM employee";

    //Select all departments and amount of employees assigned per department
    //Name column containing name of the department "depname".
    //Name column containing employee amount "staff_size".
    //language=HSQLDB
    String select08 = "SELECT d.name AS depname, COUNT(e.department) AS staff_size" +
            " FROM department AS d JOIN employee AS e" +
            " ON d.ID = e.department" +
            " GROUP BY d.name";

    //Select all departments and values of total and average salary per department
    //Name column containing name of the department "depname".
    //language=HSQLDB
    String select09 = "SELECT d.name AS depname, SUM(e.salary) AS total, AVG(e.salary) AS average" +
            " FROM department AS d JOIN employee AS e" +
            " ON d.ID = e.department" +
            " GROUP BY d.name";

    //Select lastnames of all employees and lastnames of their managers if an employee has a manager.
    //Name column containing employee's lastname "employee".
    //Name column containing manager's lastname "manager".
    //language=HSQLDB
    String select10 = "SELECT e.lastname AS employee, m.lastname AS manager " +
            "FROM employee e LEFT JOIN employee m " +
            "ON e.manager = m.ID";
}
