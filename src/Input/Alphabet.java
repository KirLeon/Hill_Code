package Input;

import java.util.ArrayList;
import java.util.Iterator;

public class Alphabet {
    public static ArrayList<Character> alphabet = new ArrayList(40);

    public Alphabet() {
    }

    public static void full_alphabet() {
        int n;
        for(n = 1072; n < 1104; ++n) {
            if (n == 1078) {
                alphabet.add('ё');
                alphabet.add((char)n);
            } else {
                alphabet.add((char)n);
            }
        }

        alphabet.add('.');
        alphabet.add(',');
        alphabet.add(' ');
        alphabet.add('?');
        n = 0;

        for(Iterator var1 = alphabet.iterator(); var1.hasNext(); ++n) {
            char c = (Character)var1.next();
            System.out.print("" + n + c + " ");
        }

        System.out.println();
    }
}