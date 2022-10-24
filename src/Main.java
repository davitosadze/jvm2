import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {
    final static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        logger.trace("This is Trace");
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