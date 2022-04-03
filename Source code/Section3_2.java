/**
 * Copyright (c) BJTU Academic Support Centre. All Rights Reserved
 *
 * @author (Baihan Yang)
 * @version (20220403)
 */
public class Section3_2 {
    public static void main(String[] args) {
        int n = 7;
        if (n >= 10)
            if (n <= 15)
                System.out.println("10~15");
            else
                System.out.println(">15");
        else
        if (n >= 5)
            System.out.println("5~9");
        else
            System.out.println("<5");
    }
}
