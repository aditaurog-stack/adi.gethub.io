import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tell Me your favourite movies : ");
        String line = input.nextLine();

        List<String> items = Arrays.asList(line.split(","));

        System.out.println("Your movies: " + items);
    }
}
