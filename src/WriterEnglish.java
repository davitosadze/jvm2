public class WriterEnglish {
    int writerId;

    public WriterEnglish(int writerId){
        this.writerId = writerId;
    }

    void getInfo() {
     String ilia = "Ilia Chavchavadze was born in Qvareli, a village in Kvareli | 8 November 1837";
     String vaja = "Vazha-Pshavela was born into a family of clergymen in the little village of Chargali | 14 July 1861";
     String akaki = "Tsereteli was born in the village of Skhvitori, Imereti region of western Georgia on | 9 June 1840";
     String iakobi = "Iakob Gogebashvili was born in village Variani near Gori, Georgia | 27 October 1840";

     if(writerId == 1 ){
         System.out.println(ilia);
     } else if(writerId ==2) {
         System.out.println(vaja);
     } else if(writerId ==3) {
         System.out.println(akaki);
     } else if(writerId ==4) {
         System.out.println(iakobi);
     } else {
        System.out.println("Incorrect ID");
     }

    }
}
