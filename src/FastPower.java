public class FastPower {
    public static int fastPower(int A, int N){

        //base
        if(N == 0){
            return 1;
        }

        //sub problem
        return fastPower(A, N -1) * A;
    }
}

/*
* Ques: Given two integers a and n, find a^n using recursion
* Brute force: Multiply 'a' N times
* TC: O(N)
* SC: O(1)
*
* Approach:
* step 1: identify smaller problem which is : a^N = a^N - 1 * N
* step 2: identify base case: if(N == 0) return 1 because 2^0 = 1
* step 3: call function for fn(a,n - 1) * a
* TC: O(N);
* SC: O(N);
* */
