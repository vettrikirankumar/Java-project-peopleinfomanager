import java.util.*;

public class bank {
    static Scanner ob = new Scanner(System.in);
    int bankcode;
    String bankname;
    String bankbranch;

    bank() {
        bankcode = 0;
        bankname = "none";
        bankbranch = "none";
    }

    bank(int bankcode, String bankname, String bankbranch) {
        this();
        if (bankcode > 0 && bankname != null && bankbranch != null) {
            this.bankcode = bankcode;
            this.bankname = bankname;
            this.bankbranch = bankbranch;
        }
    }
}
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
public class person extends occupation {
    String name;
    int age;
    bank[] accounts;
    int accountCount;

    person() {
        name = "none";
        age = 0;
        accounts = new bank[0];
        accountCount = 0;
    }

    person(String name, int age, bank[] accounts) {
        this();
        if (name != null && age > 0 && accounts != null) {
            this.name = name;
            this.age = age;
            this.accounts = accounts;
            this.accountCount = accounts.length;
        }
    }

    person(person other) {
        this.name = other.name;
        this.age = other.age;
        this.accountCount = other.accountCount;
        this.accounts = new bank[other.accountCount];
        for (int i = 0; i < other.accountCount; i++) {
            this.accounts[i] = other.accounts[i];
        }
    }

    public void input() {
        super.input();
        System.out.println("Enter name:");
        name = bank.ob.nextLine();
        System.out.println("Enter age:");
        age = bank.ob.nextInt();
        bank.ob.nextLine();
        System.out.println("How many bank accounts?");
        accountCount = bank.ob.nextInt();
        bank.ob.nextLine();
        accounts = new bank[accountCount];
        for (int i = 0; i < accountCount; i++) {
            System.out.println("--- Account " + (i + 1) + " ---");
            accounts[i] = new bank();
            System.out.println("Enter bank code:");
            accounts[i].bankcode = bank.ob.nextInt();
            bank.ob.nextLine();
            System.out.println("Enter bank name:");
            accounts[i].bankname = bank.ob.nextLine();
            System.out.println("Enter bank branch:");
            accounts[i].bankbranch = bank.ob.nextLine();
        }
    }

    public void display() {
        super.display();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        for (int i = 0; i < accountCount; i++) {
            System.out.println("--- Account " + (i + 1) + " ---");
            System.out.println("Bank Code: " + accounts[i].bankcode);
            System.out.println("Bank Name: " + accounts[i].bankname);
            System.out.println("Bank Branch: " + accounts[i].bankbranch);
        }
    }
}
public class PeopleInfoManager {
    static person[] people = new person[100];
    static int count = 0;

    static {
        System.out.println("PeopleInfoManager ready.");
    }

    static void addPerson() {
        person p = new person();
        p.input();
        people[count] = p;
        count++;
    }

    static void displayAll() {
        for (int i = 0; i < count; i++) {
            System.out.println("=== Person " + (i + 1) + " ===");
            people[i].display();
        }
    }

    public static void main(String[] args) {
        System.out.println("How many people to add?");
        int n = bank.ob.nextInt();
        bank.ob.nextLine();
        for (int i = 0; i < n; i++) {
            addPerson();
        }
        displayAll();
    }
}