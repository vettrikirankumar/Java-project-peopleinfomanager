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