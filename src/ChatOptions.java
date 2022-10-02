import java.util.Scanner;

public class ChatOptions {
    int language;
    Scanner sc = new Scanner(System.in);

    public ChatOptions(int language){
        this.language = language;
    }

    void getNames() {
        if(language == 1) {
            System.out.println("1) ილია ჭავჭავაძე");
            System.out.println("2) ვაჟა-ფშაველა");
            System.out.println("3) აკაკი წერეთელი");
            System.out.println("4) იაკობ გოგებაშვილი");

        } else if(language == 2) {
            System.out.println("1) Ilia Tchavchavadze");
            System.out.println("2) Vaja-Pshavela");
            System.out.println("3) Akaki Tsereteli");
            System.out.println("4) Iakob Gogebashvili");
        }
        else {
            System.out.println("არასწორი აიდი");
        }
    }

    void askWriter() {
        if(language == 1) {
            System.out.println("მიუთითეთ მწერლის ID");
        } else if(language == 2) {
            System.out.println("Enter writer ID");
        }

        int writerId = sc.nextInt();

        if(language == 1) {
            WriterGeorgian info = new WriterGeorgian(writerId);
            info.getInfo();
        }
        else if(language == 2) {
            WriterEnglish info = new WriterEnglish(writerId);
            info.getInfo();
        }

    }

}
