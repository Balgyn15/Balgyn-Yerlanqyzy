import java.util.*;

public class MyApplication {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee emp2 = new Employee("George", "Harrison", "Developer", 50000.00);

        Student stu1 = new Student("Ringo", "Starr", 2.5);
        Student stu2 = new Student("Paul", "McCartney", 3.8);

        ArrayList<Payable> payables = new ArrayList<>();
        payables.add(emp1);
        payables.add(emp2);
        payables.add(stu1);
        payables.add(stu2);

        payables.sort(Collections.reverseOrder());
        printData(payables);
    }

    public static void printData(Iterable<Payable> payables) {
        for (Payable payable : payables) {
            System.out.printf("%s earns %.2f tenge\n", payable, payable.getPaymentAmount());
        }
    }
}
