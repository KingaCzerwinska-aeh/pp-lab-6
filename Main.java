import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;


public class Main{

    public static void main(String[] args) {
        Worker worker1 = new Worker("Karolina Ogorek", 4000, 1, "2024-01-01", "Marketing");
        Worker worker2 = new Worker("Krystyna Pomidor", 6000, 2, "2023-02-02", "HR");
        Worker worker3 = new Worker("Klaudia Pietruszka", 8000, 2, "2022-03-03", "Administration");


        Manager manager = new Manager("Klara Burak", 12000, 5, "2020-05-05", "Manager");



        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println("Id " + worker1.getName() + " and " +  worker2.getName() + " is the same: " + worker2.equals(worker1));
        System.out.println("Id " + worker3.getName() + " and " +  worker2.getName() + " is the same: " + worker2.equals(worker3));
        System.out.println("Id " + manager.getName() + " and " +  worker2.getName() + " is the same: " + worker2.equals(manager));
    }
}