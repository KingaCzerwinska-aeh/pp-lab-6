import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main{

    public static void main(String[] args) {
        Worker worker1 = new Worker("Karolina Ogorek", 4000, 1, "2024-01-01", "Marketing");
        Worker worker2 = new Worker("Krystyna Pomidor", 6000, 2, "2023-02-02", "HR");
        Worker worker3 = new Worker("Klaudia Pietruszka", 8000, 2, "2022-03-03", "Administration");

        Manager manager = new Manager("Klara Burak", 12000, 5, "2020-05-05", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        Worker worker4 = new Worker("Kornelia Marchewka", 10000, 4, "2021-04-04", "Secretary");
        Manager manager1 = new Manager("Katarzyna Sałata", 11000.0, 2, "2020-06-06", "Manger");

        employees.add(worker4);
        employees.add(manager1);

        double totalSalary = 0.0;
        double totalManagerSalary = 0.0;
        double totalWorkerSalary = 0.0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();

            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("Suma wszytskich wymagrodzen: " + totalSalary);
        System.out.println("Suma wynagrodzen Managerow: " + totalManagerSalary);
        System.out.println("Suma wynagrodzen Workerow: " + totalWorkerSalary);


        System.out.println("The same Id has:");
        for (Employee employee : employees) {
            int count = 0;
            for (Employee otherEmployee : employees) {
                if (employee.hashCode() == otherEmployee.hashCode()) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(employee.getName() + " ID: " + employee.hashCode() );
            }
        }
    }
}
