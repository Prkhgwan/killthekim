package MrScanner;

import java.util.Scanner;

public class MrScanner {

    private static MrScanner instance;
    private Scanner sc = null;

    public static MrScanner getInstance() {
        if (instance == null) {
            instance = new MrScanner();
        }
        return instance;
    }
    private MrScanner() {
        this.sc = new Scanner(System.in);
    }

    public String stringInput() {
        return sc.nextLine();
    }

    public int intInput() {
        return sc.nextInt();
    }

}
