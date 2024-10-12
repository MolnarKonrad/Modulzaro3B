package konrad.hu;

import konrad.hu.modell.Ember;

public class Bemutatkozas {

    public static void bemutatkozas(){
        System.out.print("Szia, a nevem " + Ember.nev + ", " + Ember.kor + "éves vagyok.");
        if (!Ember.beszeltNyelvek.isEmpty()){
            System.out.print("Beszélek idegen nyelven: ");
            System.out.println(String.join(", ", Ember.beszeltNyelvek) + ".");
        } else {
            System.out.println("Nem beszélek idegen nyelven.");
        }
    }
}
