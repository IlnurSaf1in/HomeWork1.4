import java.util.Random;

public class Main {
    public static void main(String[] args) {
        {
            { // задание 1
                int i = 0;
                while (i < 10) {
                    i++;
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            for (int i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        {// задание 2
            Random random = new Random();
            int friday = 1 + random.nextInt(7 - 1);
            System.out.println(friday);
            for (int i = friday; i < 31; i = i + 7) {
                System.out.println("Сегодня пятница," + i + "-е число. Необходимо подготовить отчет");
            }
        }
        int age = 2022;
        for (int i = 0; i < 2022 + 100 ; i = i +79) {
            if (i  < age + 100 && i > age - 200 )
            System.out.println(i);



        }
    }
}