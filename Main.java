import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;


public class Main{

    public static void main(String[] args) {
        Worker worker1 = new Worker("Karolina Ogorek", 4000, 1, "2024-01-01", "Marketing");
        Worker worker2 = new Worker("Krystyna Pomidor", 6000, 2, "2023-02-02", "HR");
        Worker worker3 = new Worker("Klaudia Pietruszka", 8000, 3, "2022-03-03", "Administration");
        Worker worker4 = new Worker("Kornelia Marchewka", 10000, 4, "2021-04-04", "Secretary");

        Manager manager = new Manager("Klara Burak", 12000, 5, "2020-05-05", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");
            employee.work();
        }
    }
}