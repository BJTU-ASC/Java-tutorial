/**
 * Copyright (c) BJTU Academic Support Centre. All Rights Reserved
 *
 * @author (Baihan Yang)
 * @version (20220403)
 */
public class Section3_3 {
    public static void main(String[] args) {
        char grade = 'C';
        if (grade == 'A')
            System.out.println("优秀");
        else if (grade == 'B' || grade == 'C')
            System.out.println("良好");
        else if (grade == 'D' || grade == 'E')
            System.out.println("及格");
        else if (grade == 'F')
            System.out.println("不及格");
        else
            System.out.println("未知等级");

        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
            case 'E':
                System.out.println("及格");
                break;
            case 'F':
                System.out.println("不及格");
                break;
            default:
                System.out.println("未知等级");
        }
    }
}
