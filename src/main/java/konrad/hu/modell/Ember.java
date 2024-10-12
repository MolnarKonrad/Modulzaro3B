package konrad.hu.modell;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ember {
    public static String nev;
    public static int kor;
    public static List<String> beszeltNyelvek;
    private static String[] nyelvek = {"angol", "német", "francia", "spanyol", "olasz", "orosz"};

    public Ember (String nev) {
        this.nev = nev;
        this.kor = randomKor(18,78);
        this.beszeltNyelvek = new ArrayList<>();

        if (beszelIdegenNyelvet()){
            int nyelvDb = new Random().nextInt(2) + 1;
            for (int i = 0; i < nyelvDb; i++){
                String nyelv = randomNyelv();
                if (!beszeltNyelvek.contains(nyelv)){
                    beszeltNyelvek.add(nyelv);
                }
            }
        }
    }

    private int randomKor(int min, int max){
        int eletkor = new Random().nextInt((max - min) + 1) + min;
        return eletkor;
    }

    private String randomNyelv(){
        int index = new Random().nextInt(nyelvek.length);
        return nyelvek[index];
    }

    private boolean beszelIdegenNyelvet(){
        return new Random().nextBoolean();
    }
}
