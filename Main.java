import company.models.Manager;
import company.models.Worker;

public class Main{

    public static void main(String[] args) {
        Worker worker1 = new Worker("Karolina Ogorek", 4000, 1);
        Worker worker2 = new Worker("Krystyna Pomidor", 6000, 2);
        Worker worker3 = new Worker("Klaudia Pietruszka", 8000, 3);
        Worker worker4 = new Worker("Kornelia Marchewka", 10000, 4);

        Manager manager = new Manager("Klara Burak", 12000, 5);

        System.out.println(worker1.getName() + " salary: " + worker1.getSalary());
        worker1.work();

        System.out.println(worker2.getName() + " salary: " + worker2.getSalary());
        worker2.work();

        System.out.println(worker3.getName() + " salary: " + worker3.getSalary());
        worker3.work();

        System.out.println(worker4.getName() + " salary: " + worker4.getSalary());
        worker4.work();

        System.out.println(manager.getName() + " salary: " + manager.getSalary());
        manager.work();
    }
}