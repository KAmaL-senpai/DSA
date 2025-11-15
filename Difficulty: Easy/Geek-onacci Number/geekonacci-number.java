/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code here
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {

            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int N = sc.nextInt();

            if (N == 1) {
                System.out.println(A);
            } else if (N == 2) {
                System.out.println(B);
            } else if (N == 3) {
                System.out.println(C);
            } else {
                int f1 = A, f2 = B, f3 = C;
                int fn = 0;

                for (int i = 4; i <= N; i++) {
                    fn = f1 + f2 + f3; // sum of last 3
                    f1 = f2;
                    f2 = f3;
                    f3 = fn;
                }

                System.out.println(fn);
            }
        }
        sc.close();
        
	}
}