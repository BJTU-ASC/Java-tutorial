/**
 * Copyright (c) BJTU Academic Support Centre. All Rights Reserved
 *
 * @author (Baihan Yang)
 * @version (20220403)
 */
public class Section6_1 {
    public static int max(int num1, int num2) {
        int res;
        if (num1 > num2)
            res = num1;
        else
            res = num2;
        return res;
    }
    public static void main(String[] args) {
        int num = max(3, 5) + 4;
    }
}
