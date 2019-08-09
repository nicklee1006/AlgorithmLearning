package leetcode.easy;

import leetcode.util.Employee;

import java.util.*;

/**
 * 2018.6.30 Question 690. Employee Importance
 * https://leetcode.com/problems/employee-importance/description/
 *
 * You are given a data structure of employee information, which includes the employee's unique id, his
 * importance value and his direct subordinates' id.
 *
 * For example, employee 1 is the leader of employee 2, and employee 2 is the leader of employee 3. They
 * have importance value 15, 10 and 5, respectively. Then employee 1 has a data structure like [1, 15,
 * [2]], and employee 2 has [2, 10, [3]], and employee 3 has [3, 5, []]. Note that although employee 3
 * is also a subordinate of employee 1, the relationship is not direct.
 *
 * Now given the employee information of a company, and an employee id, you need to return the total
 * importance value of this employee and all his subordinates.
 *
 * Solution
 * 1. Use hashmap to map employee and id
 * 2. use queue to add employee
 */
public class Q690EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        int result = 0;

        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }

        Queue<Employee> queue = new LinkedList<>();
        queue.add(map.get(id));

        while (!queue.isEmpty()) {
            Employee current = queue.poll();

            result += current.importance;

            for (int subId : current.subordinates) {
                queue.add(map.get(subId));
            }
        }

        return result;
    }
}
