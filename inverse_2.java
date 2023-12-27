import java.util.Scanner;

public class inverse_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();   //2 1 4 3
        int remainder=0;
        int answer=0;
        int i=1;
        while (n!=0){
            remainder = n%10;     //3  =>  4
            answer += i*Math.pow(10,remainder-1);   //0+1*100   =>  100+ 2*1000  so far 2 1(inverted)
            n=n/10;  //2 1 4    =>  21
            i++;    //2       =>     3
        }
        System.out.println(+answer);
        sc.close();

    }
}