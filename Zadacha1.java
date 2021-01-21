package zadachi.aqa;
import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int chisloPolzovatelya = scan.nextInt();
        if (chisloPolzovatelya > 7){
            System.out.println("Привет");
        }
    }
}
