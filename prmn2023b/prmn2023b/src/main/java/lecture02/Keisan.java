package lecture02;

public class Keisan {
    int sum = 0;
    void sum(int[] num){
        for(int j : num)  sum += j;
    }
    void print(){
        System.out.println("合計値："+ sum);
        if(sum>100) System.out.println("great!!");
        else if(sum>50) System.out.println("big!!");
        else System.out.println("small!!");
    }
}
