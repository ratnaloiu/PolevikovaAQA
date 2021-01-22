package zadachi.aqa.polevikova;
import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя");
        String imyaPolzovatelya = scan.nextLine();
        String imya = "Вячеслав";
        boolean imyaTrueFalse;
        imyaTrueFalse = imyaPolzovatelya.equals(imya);
        if (imyaTrueFalse == true){
            System.out.println("Привет, Вячеслав");
        }else{
            System.out.println("Нет такого имени");
        }
    }
}


