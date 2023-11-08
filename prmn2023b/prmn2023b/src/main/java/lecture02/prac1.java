package lecture02;
import java.util.Scanner;
public class prac1 {
    public static void main(String[] args) {
        String number = "B2221600";

        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力してください。：");
        String gakuseki = scan.next();

        Gakuseki gak = new Gakuseki();
        gak.decide(number,gakuseki);
    }
}
