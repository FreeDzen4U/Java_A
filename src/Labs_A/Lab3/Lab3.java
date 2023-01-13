/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labs_A.Lab3;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     * C3 = 2 (String) ; C17 = 8 (Відсортувати  слова заданого тексту за зростанням кількості в них заданої літери)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "Для кожної людини, якаа щиро любить рідну землю, її природааа найчарівнішаааа у світі.";
        
        //System.out.println(input);
        input = input.toLowerCase();
        String regex = ("[?!.,:;]");
        String replace = "";
        
        Pattern p = Pattern.compile(regex);
        
        Matcher m = p.matcher(input); 
        input = m.replaceAll(replace);
        System.out.println(input);
        
        String[] words = input.split(" ");
        //System.out.println(Arrays.toString(words));
        int letterEntry[] = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == 'а') {
                    letterEntry[i] += 1;
                }
            }
        }
        System.out.println(Arrays.toString(letterEntry));
        
        String s_1;
        int w_1 = 0;
        for (int i = 0; i < letterEntry.length; i++) {
            int minn = letterEntry[i];
            for (int j = 1 + i; j < letterEntry.length; j++) {
                //System.out.println(j);
                if (minn > letterEntry[j]) {
                    minn = letterEntry[j];
                    w_1 = j;
                }
            }
            letterEntry[w_1] = letterEntry[i];
            
            s_1 = words[i];
            words[i] = words[w_1];
            words[w_1] = s_1;
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }   
    
    }  
}
