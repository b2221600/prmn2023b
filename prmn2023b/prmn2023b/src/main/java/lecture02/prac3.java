package lecture02;
public class prac3 {
    public static void main(String[] args) {
        String[][] array = {{"B2221100","psw1"},
                            {"B2221200","psw2"},
                            {"B2221300","psw3"},
                            {"B2221400","psw4"},
                            {"B2221500","psw5"}};

        Certify cer = new Certify();
        if(cer.studentID(array)) cer.password(array);
    }
}
