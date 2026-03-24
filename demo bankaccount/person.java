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
