/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labs_A.Lab6;

import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     * * С13 = 4 (Визначити ієрархію музичних композицій. Записати на диск альбом. 
     * Порахувати тривалість альбому. Провести перестановку композицій диска на основі приналежності до стилю.
     * Знайти композицію, що відповідає заданому діапазону довжини треків).
     */
    public static void main(String[] args) {
        ArrayList<Composition> myCompositions = new ArrayList<>();

        Rap rapComposition = new Rap("G-Unit", "50 Cent", 4.16);
        Rock rockComposition = new Rock("The Beatles", "Paul McCartney", 3.29);
        Rock rockComposition2 = new Rock("Yoyo", "Enrike", 5.47);
        Pop popComposition = new Pop("Garden", "Luis Fonsi", 2.35);
        Pop popComposition2 = new Pop("United", "Hunter", 3.21);

        myCompositions.add(rapComposition);
        myCompositions.add(rockComposition);
        myCompositions.add(rockComposition2);
        myCompositions.add(popComposition);
        myCompositions.add(popComposition2);
        
        Album myAlbum = new Album(myCompositions);
        System.out.println(myAlbum);

        System.out.println("Загальна тривалість альбому: " + myAlbum.getAlbumDuration());
        System.out.println("\nСортування композицій за приналежністю до стилю: \n" + myAlbum.getSortStyle());
        System.out.println("\n" + myAlbum.getRangeCompositions(3.05, 5.55));
    }
}
