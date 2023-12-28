// Distribute Chocolates
// Time Limit: 2, Memory Limit: 256000
// For your birthday, you have a list of N children, and you initially plan to give each of them A[i] chocolates. However, the children are not happy with this initial distribution. You want to redistribute the chocolates to meet the following criteria:

// 1. Each child must have at least one chocolate.
// 2. The difference in the number of chocolates between any pair of children should not exceed K.

// Can you determine if it's possible to achieve this redistributed chocolate distribution for your birthday? Print "Yes" if it's possible, "No" otherwise.
// Input
// Input consists of two lines:
// The first line contains two integers N and k.
// The second line contains N integers representing A[i], (1<=i<=n).

// Constraints
// 1 <= N <= 105
// 0 <= K <= 100
// 0 <= A[i] <= 100
// Output
// Print "Yes" if it's possible to distribute the chocolates according to the given conditions, "No" otherwise.
// Example
// Input
// 5 2
// 7 0 1 4 2

// Output
// Yes

// Explanation
// A possible redistribution satisfying all conditions is [2, 4, 2, 4, 2]. Note that all children have at least 1 chocolate and the maximum difference of chocolates between any two children is 2.

import java.util.*;
class Main {
    public static void main (String[] args){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int k=sc.nextInt();
        // int[] arr=new int[n];
        // int noc=0;
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        //     noc+=arr[i];
        // }
        // System.out.println(noc);
        // leftc=noc-n;
//         // //n 
        
//     }
// }


Scanner scanner = new Scanner(System.in);

        // Get input
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        // Determine and print the result
        String result = isRedistributionPossible(N, K, A) ? "Yes" : "No";
        System.out.println(result);
    }

    public static boolean isRedistributionPossible(int N, int K, int[] A) {
        int totalChocolates = Arrays.stream(A).sum();
        int minPerChild = totalChocolates / N;

        if (minPerChild < 1) {
            return false; // Condition 1-Choclate hi nahi bacha
        }

        if (K >= minPerChild) {
            return true; // Condition 2 can always be satisfied
        }
        Arrays.sort(A);

        for (int i = 0; i < N - 1; i++) {
            if (A[i + 1] - A[i] > K) {
                return false; // Condition 2 violated
            }
        }

        return true; // All conditions satisfied

        
    }
}
