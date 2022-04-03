/**
 * Copyright (c) BJTU Academic Support Centre. All Rights Reserved
 *
 * @author (Baihan Yang)
 * @version (20220403)
 */
public class Section7_1_3_Dog {
    private String name;
    Section7_1_3_Dog(String name) {
        this.name = name;
    }
    public void eat(String food) {
        System.out.println(name + " eats " + food);
    }
}
