/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labs_A.Lab5;

/**
 *
 * @author User
 */
public class Word {
    private static final String character = "а";
    private final Letter[] letters;
    private final int amount;

    public Word(Letter[] letters) {
        this.letters = letters;
        this.amount = getAmount(letters);
    }

    public int setAmount(){
        return this.amount;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Letter letter : letters) {
            builder.append(letter);
        }
        return builder.toString();
    }

    public static Word toWord (String w) {
        Letter[] letters = new Letter[w.length()];
        for (int j = 0; j < letters.length; j++) {
            letters[j] = new Letter(w.charAt(j));
        }
        return new Word(letters);
    }

    public int getAmount(Letter[] letters) {
        int counter = 0;
        for(Letter letter : letters) {
            if (character.contains(letter.toString())) {
                counter++;
            }
        }
        return counter;
    }
}
