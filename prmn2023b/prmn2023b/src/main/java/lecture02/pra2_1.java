package lecture02;
import java.util.Scanner;
public class pra2_1 {
    public static void main(String[] args) {
        String name1 = "千歳太郎";
        int num = 2001000;

        Scanner scan = new Scanner(System.in);
        System.out.println("input name:");
        name1 = scan.next();
        System.out.println("input studentID:");
        num = scan.nextInt();
        System.out.println("氏名："+ name1 +" 学籍番号：b"+ num);
    }
}
