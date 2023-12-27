// You've a pizza. Can you divide the circular pizza into N pieces using any (possibly zero) number of cuts? You can only cut the pizza in a way such that the knife starts from the boundary of the pizza, passes through the center, and ends at the boundary.
// Input
// You're given an integer N. (1 <= N <= 1e6)
// Output
// Print "Yes" if you can cut the pizza in N pieces, "No" otherwise.



import java.util.*;


class pizzaSlices {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();  //user want no. of pieces

        if(N==1 || N%2==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
