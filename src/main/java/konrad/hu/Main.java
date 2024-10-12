package konrad.hu;

import konrad.hu.modell.Ember;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ember> emberek = new ArrayList<>();
            emberek.add(new Ember("Anna"));
            emberek.add(new Ember("Béla"));
            emberek.add(new Ember("Csilla"));
        for (Ember ember : emberek){
            Bemutatkozas.bemutatkozas();
        }
    }
}
