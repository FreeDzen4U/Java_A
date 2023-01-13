/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labs_A.Lab6;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author User
 */
public class Album {
    private final ArrayList<Composition> setOfCompositions;

    public Album(ArrayList<Composition> setOfCompositions) {
        this.setOfCompositions = setOfCompositions;
    }

    public Double getAlbumDuration() {
        return setOfCompositions.stream().map(composition -> composition.getDuration())
                .reduce((double) 0, Double::sum);
    }

    public String getSortStyle() {
        return setOfCompositions.stream().filter(composition -> composition.getStyle().equals("Rock"))
                .map(composition -> String.format("%s → %s", composition.getStyle(), composition.getArtist()))
                .collect(Collectors.joining(", "));
    }

    public String getRangeCompositions(double min, double max) {
        if (min < 0 || max < 0 || min >= max) {
            throw new Error("Неправильно задані границі діапазону!");
        }
        String newList = setOfCompositions.stream().filter(composition -> composition.getDuration() >= min && composition.getDuration() <= max)
                .map(composition -> String.format("%s - %s", composition.getName(), composition.getDuration()))
                .collect(Collectors.joining(", "));
        return String.format("Композиції, що відповідають заданому діапазону. Від %s хв до %s хв: \n", min, max) + newList;
    }

    @Override
    public String toString() {
        return "Альбом: \n" + setOfCompositions +"\n";
    }
}
