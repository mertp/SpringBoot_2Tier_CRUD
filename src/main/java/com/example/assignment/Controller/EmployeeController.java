package com.example.assignment.Controller;

import com.example.assignment.Model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {
    //Creating a instance of employeeList
    private final List<Employee> employeeList = new ArrayList<Employee>();

    //Constructor with filllist method
    public EmployeeController() {
        filllist();

    }

    //CRUD Operations
    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("eList", employeeList);
        return "index";
    }

    @GetMapping("/getemp")
    public String getEmployee() {
        return "getemp";
    }

    @GetMapping("/getemployee")
    public String getEmp(@RequestParam(name = "empno") Integer empno, Model model) {
        for (Employee e : employeeList) {
            if (e.getEmpno() == empno) {
                model.addAttribute("employee", e);
                break;
            }
        }
        return "employee";
    }

    @GetMapping("/addemp")
    public String addEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "addemp";
    }

    @PostMapping("/add")
    public String addEmp(Employee employee, Model model) {
        employeeList.add(employee);
        model.addAttribute("eList", employee);
        return "index";
    }

    //
    @GetMapping("/update/{empno}")
    public String update(@PathVariable("empno") Integer id, Model model) {
        for (Employee e : employeeList) {
            if (e.getEmpno() == id) {
                model.addAttribute("employee", e);
                break;
            }
        }
        return "update";
    }

    @PostMapping("/update")
    public String updateEmp(Employee emp, Model model) {
        for (Employee e : employeeList) {
            if (e.getEmpno() == emp.getEmpno()) {
                e.setName(emp.getName());
                e.setJob(emp.getJob());
                e.setSalary(emp.getSalary());
                e.setHireDate(emp.getHireDate());
                e.setMgr(emp.getMgr());
                e.setDeptno(emp.getDeptno());
                e.setComm(emp.getComm());

            }
            model.addAttribute("eList", employeeList);
            break;
        }
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmp(@PathVariable("id") Integer id, Model model) {
        for (Employee e : employeeList) {
            if (e.getEmpno() == id) {
                employeeList.remove(e);
                break;
            }
        }
        model.addAttribute("eList", employeeList);
        return "index";
    }
    //Filllist method
    public void filllist() {
        employeeList.add(new Employee(9369, "SAMI", "CLERK", "7902", "12.15.2021", 1000, "50", 20));
        employeeList.add(new Employee(7369, "SMITH", "CLERK", "7902", "12.17.1980", 900, "50", 20));
        employeeList.add(new Employee(7499, "ALLEN", "SALESMAN", "7698", "2.05.2021", 1600, "300", 30));
        employeeList.add(new Employee(7521, "WARD", "SALESMAN", "7698", "2.22.1981", 1250, "500", 30));
        employeeList.add(new Employee(7566, "JONES", "MANAGER", "7839", "4.2.1981", 2975, "", 20));
        employeeList.add(new Employee(7654, "MARTIN", "SALESMAN", "7698", "9.28.1981", 1250, "1400", 30));
        employeeList.add(new Employee(7698, "BLAKE", "MANAGER", "7839", "5.1.1981", 2850, "", 30));
        employeeList.add(new Employee(7782, "CLARK", "MANAGER", "7839", "6.9.1981", 2450, "", 10));
        employeeList.add(new Employee(7788, "SCOTT", "ANALYST", "7566", "12.9.1982", 3000, "", 20));
        employeeList.add(new Employee(7839, "KING", "PRESIDENT", "", "11.17.1981", 5000, "", 10));
        employeeList.add(new Employee(7844, "TURNER", "SALESMAN", "7698", "9.8.1981", 1500, "0", 30));
        employeeList.add(new Employee(7876, "ADAMS", "CLERK", "7788", "1.12.1983", 1100, "", 20));
        employeeList.add(new Employee(7900, "JAMES", "CLERK", "7698", "12.3.1981", 950, "", 30));
        employeeList.add(new Employee(7902, "FORD", "ANALYST", "7566", "12.3.1981", 3000, "", 20));
        employeeList.add(new Employee(7934, "MILLER", "CLERK", "7782", "1.23.1982", 1300, "", 10));
    }


}
