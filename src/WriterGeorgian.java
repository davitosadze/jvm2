public class WriterGeorgian {
    int writerId;

    public WriterGeorgian(int writerId){
        this.writerId = writerId;
    }

    void getInfo() {
        String ilia = "ილია ჭავჭავაძე დაიბადა გადამდგარი ოფიცრის, თავად გრიგოლ ჭავჭავაძის ოჯახში | 8 ნოემბერი 1837";
        String vaja = "გავრცელებული ვერსიის თანახმად ვაჟა-ფშაველა დაიბადა 1861 წლის 14 ივლისს, თუმცა 1912 წელს „სახალხო გაზეთში“ გამოქვეყნებულ ვაჟასავე წერილში მითითებულია, რომ დაიბადა ძვ. სტილით 1862 წლის 15 მაისს";
        String akaki = "აკაკი წერეთელი დაიბადა ზემო იმერეთის შეძლებული თავადის როსტომ წერეთლის ოჯახში | 21 ივნისი 1840";
        String iakobi = "იაკობ გოგებაშვილი დაიბადა ღარიბი მღვდლის ოჯახში. სწავლობდა ჯერ გორის, შემდეგ თბილისის სასულიერო სასწავლებელში | 27 ოქტომბერი 1840";

        if(writerId == 1 ){
            System.out.println(ilia);
        } else if(writerId ==2) {
            System.out.println(vaja);
        } else if(writerId ==3) {
            System.out.println(akaki);
        } else if(writerId ==4) {
            System.out.println(iakobi);
        } else {
            System.out.println("არასწორი აიდი");
        }

    }
}
