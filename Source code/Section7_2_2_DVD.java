/**
 * Copyright (c) BJTU Academic Support Centre. All Rights Reserved
 *
 * @author (Baihan Yang)
 * @version (20220403)
 */
public class Section7_2_2_DVD extends Section7_2_2_Album {
    private String director;
    public Section7_2_2_DVD(String title, String director) {
        super(title);
        this.director = director;
    }
    public void print() {
        System.out.println("Title:" + super.getTitle());
        System.out.println("Director:" + director);
    }

}
