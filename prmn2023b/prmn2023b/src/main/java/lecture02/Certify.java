package lecture02;
import java.util.Scanner;

public class Certify {
    Scanner scan = new Scanner(System.in);
    String id;
    String psw;
    int index;
    boolean studentID(String[][] array){
        System.out.println("input studentID:");
        id = scan.next();

        for (String[] strings : array) if (id.equals(strings[0])) return true;
        System.out.println("error");
        return false;
    }
    void password(String[][] array){
        System.out.println("input password:");
        psw = scan.next();

        for (String[] strings : array) {
            if (id.equals(strings[0]) && psw.equals(strings[1])) {
                System.out.println("ログイン完了");
                System.exit(0);
            }
        }
        System.out.println("error");
    }
}
