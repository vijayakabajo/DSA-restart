import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        

        while(n>0){
            int dig=n%10;   //remainder or last digit
            n=n/10;         //Quotient or rest number after cutting off the last digit
            System.out.print(dig+" ");
        }
    sc.close();
    }
}
