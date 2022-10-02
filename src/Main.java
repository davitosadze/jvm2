import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("მიიღეთ ინფორმაცია ქართველ მწერლებზე");
        System.out.println("___________________________________");

        System.out.println("1) ქართული");
        System.out.println("2) English");

        int language = sc.nextInt();

        ChatOptions options = new ChatOptions(language);
        options.getNames();
        options.askWriter();

    }
}