public class Main {

    public static void main(String[] args) {

        long n = 1000;
        long evenOne = 2;
        long evenTwo = 8;
        long total = 2;
            
        while (evenTwo <= n) {
            total += evenTwo;
                
            long temp = evenOne;
            evenOne = evenTwo;
            evenTwo = (4*evenOne + temp);
        }
            
        System.out.println(total);
    }
}

/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be: 1,2,3,5,8,13,21,34,55,89,...
By considering the terms in the Fibonacci sequence whose values do not exceed N, find the sum of the even-valued terms.
*/

/*
We only care about the even numbers, so 2,8,34,144,etc...
E(n) = 4*E(n-1) + E(n-2)
*/