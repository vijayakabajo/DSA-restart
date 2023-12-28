
//have to print the digits from left to right 
//1234=
// 1
// 2
// 3
// 4

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();

        //number of digits 
        int nod=0;
        int temp=num; //so the actual number would not change

        while(temp!=0){
            temp=temp/10;
            nod++;
        }
        // System.out.println(nod);

        //printing digits
        int divisor=(int)Math.pow(10,nod-1);

        while(divisor != 0){    //divisor because if num used it will not work for 1000,4500...
            int quotient=num/divisor;
            System.out.println(quotient); //printing  the digits from left to right

            num=num%divisor;  //updating num 
            divisor=divisor/10;  //reducing divisor
        }
        sc.close();
    }
}