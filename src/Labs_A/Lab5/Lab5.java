/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labs_A.Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 *
 * @author User
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "Азбука морзе. Антлантичний океан. Острів Мадагаскар? Українські вірші. Видавництво А-ба-ла-ба-ла-га!";

        ArrayList<Word> list = new ArrayList<>();
        for (String w : input.toLowerCase().split("[.!? ]\\s*")) {
            Word word = Word.toWord(w);
            list.add(word);
        }
        String sortedWords = list.stream().sorted(Comparator.comparingInt(Word::setAmount))
                .map(Object::toString)
                .collect(Collectors.joining("\n"));

         System.out.println(sortedWords);
    }
    
}
