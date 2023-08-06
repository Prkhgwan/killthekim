package MrScanner;

import java.util.Scanner;

public class MrScanner {
    Scanner mrScanner = new Scanner(System.in);

    public String stringInput() {
        return mrScanner.nextLine();
    }

    public int intInput() {
        return mrScanner.nextInt();
    }
}
