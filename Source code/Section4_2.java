/**
 * Copyright (c) BJTU Academic Support Centre. All Rights Reserved
 *
 * @author (Baihan Yang)
 * @version (20220403)
 */
public class Section4_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }

        for (int i = 1; i < 10; i++)
            for (int j = 1; i + j < 10; j++)
                System.out.println(i +" + "+ j);
    }
}
