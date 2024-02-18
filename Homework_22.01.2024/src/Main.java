import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = "";
        System.out.println("User, write your sentence: ");
        str = scanner.nextLine();
        String resultingstr = str.replaceFirst("suppe", "pizza");
        String resultingstr2 = str.replace("suppe", "");

        System.out.println(resultingstr);
        System.out.println("User, your sentence: " +  resultingstr2);
    }
}