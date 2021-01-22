package zadachi.aqa;
import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int dlinaMass = scan.nextInt();
        int znacheniyaMass[] = new int[dlinaMass];

        System.out.println("Введите значения массивов");
        for (int i = 0; i < dlinaMass; i ++){
            znacheniyaMass[i] = scan.nextInt();
        }
        for (int i = 0; i < dlinaMass; i ++){
            if (znacheniyaMass[i] % 3 == 0){
                System.out.println(znacheniyaMass[i]);
            }
        }
    }
}