public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Gino", "Rossi", "Via Marco");
        Employee emp2 = new Employee("Pina", "Verdi", "Piazza Fomtana");

        Badge bag1 = new Badge(emp1);
        Badge bag2 = new Badge(emp2);

        bag1.showBadgeDetails();
        bag2.showBadgeDetails();
    }
}