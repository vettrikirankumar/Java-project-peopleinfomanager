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
