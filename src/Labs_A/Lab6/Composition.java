/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labs_A.Lab6;

/**
 *
 * @author User
 */
public class Composition {
    private String name;
    private String artist;
    private double duration;
    private String style;

    public Composition(String name, String artist, double duration, String style) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
    
    @Override
    public String toString() {
        return "\nНазва групи: " + this.getName() + " → "
                + "Артист: " + this.getArtist() + " → "
                + "Стиль: " + this.getStyle() + " → "
                + "Тривалість композиції: " + this.getDuration();
    }
}
