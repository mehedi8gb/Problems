package IOHandler;

import java.util.Scanner;

public class InputHandler {
    Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        Data.setData(this.scanner.nextLine());
    }

}
