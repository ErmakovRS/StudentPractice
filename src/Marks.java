import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Marks {
    public void addNewItem() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.next();
        int numArray = scanner.nextInt();
        ArrayList<String> items = new ArrayList<>();
        items.add(numArray, item);
        System.out.println(items);
    }



}
