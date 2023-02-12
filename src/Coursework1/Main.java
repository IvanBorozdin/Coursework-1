package Coursework1;

import java.util.zip.ZipFile;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("adssdsd", 2, 33232);
        employees[1] = new Employee("adssdsd", 2, 3323);
        employees[2] = new Employee("adssdsd", 2, 332);
        employees[3] = new Employee("adssdsd", 2, 3323);
        employees[4] = new Employee("adssdsd", 2, 3323);
        employees[5] = new Employee("adssdsd", 2, 3323);
        employees[6] = new Employee("adssdsd", 2, 3323);
        employees[7] = new Employee("adssdsd", 2, 3323);
        employees[8] = new Employee("adssdsd", 2, 3323);
        employees[9] = new Employee("adssdsd", 2, 3323);

        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println(sumSalary(employees));
        System.out.println(sumSalary(employees)/ employees.length);
        System.out.println(minSalary(employees));
        System.out.println(maxSalary(employees));
        printFio(employees);

    }
    public static int sumSalary(Employee[]employees){
        int sum=0;
        for (Employee person : employees) {
            sum += person.getSalary();
        }
        return sum;
    }
    public static int minSalary(Employee[] employees){
        Employee result= employees[0];
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i].getSalary()<result.getSalary()){
                result = employees[i];
            }
        }
        return result.getSalary();
    }
    public static float maxSalary(Employee[] employees){
        Employee result = employees[0];
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i].getSalary()>result.getSalary()){
                result=employees[i];
            }
        }
        return result.getSalary();
    }
    public static void printFio(Employee[]employees){
        for (int i = 0; i < employees.length ; i++) {
            System.out.println(employees[i].getFio());

        }
    }

}






