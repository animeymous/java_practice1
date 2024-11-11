public class FastPower_optimised {
    public static int fastPower_optimised(int A, int N){

        //base
        if(N == 0){
            return 1;
        }

        //sub problem
        int p = fastPower_optimised(A, N/2);

        //checking N is positive or negative to calculate separately
        if(N % 2 == 0){
            return p * p;
        }else{
            return p * p * A;
        }
    }
}

/*
 * Ques: Given two integers a and n, find a^n using recursion
 * Brute force: Multiply 'a' N times
 * TC: O(N)
 * SC: O(1)
 *
 * Approach: optimised recursive
 * step 1: identify smaller problem which is : for even a^N = (N/2) * (N/2), for odd a^N = (N/2) * (N/2) * a
 * step 2: identify base case: if(N == 0) return 1 because 2^0 = 1
 * step 3: call function for fn(a,n - 1) * a
 * TC: O(logn * N);
 * SC: O(logn * N);
 * */