public class occupation {
    String occupationName;
    double salary;

    occupation() {
        occupationName = "none";
        salary = 0.0;
    }

    occupation(String occupationName, double salary) {
        this();
        if (occupationName != null && salary > 0) {
            this.occupationName = occupationName;
            this.salary = salary;
        }
    }

    public void input() {
        System.out.println("Enter occupation:");
        occupationName = bank.ob.nextLine();
        System.out.println("Enter salary:");
        salary = bank.ob.nextDouble();
        bank.ob.nextLine();
    }

    public void display() {
        System.out.println("Occupation: " + occupationName);
        System.out.println("Salary: " + salary);
    }
}
