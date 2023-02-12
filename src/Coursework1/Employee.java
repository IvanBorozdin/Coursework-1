package Coursework1;

public class Employee {

    private String fio;
    private int department;
    private int salary;
    public int id;
    private static int counter;


    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id =++counter; ;
    }



    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getFio() {
        return this.fio;
    }


    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
