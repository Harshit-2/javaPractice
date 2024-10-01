public class Employee {
    private int empNo;
    private String empName;
    private String department;
    private String designation;
    private int salary;

    public Employee(int empNo, String empName, String department, String designation, int salary) {
        this.empNo = empNo;
        this.empName = empName;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public int getSalary() {
        return salary;
    }
}