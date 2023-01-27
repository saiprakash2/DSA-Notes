public class RecursionFibonacci {

    public static void main(String[] args) {

        System.out.println("Enter the  number");

        System.out.println(fibo(50));
    }

    static int fibo(int n){

        if(n<2)
            return n;

        return fibo(n-1) + fibo(n-2); // this is not tail recursion
    }
}

//1. Identify if you can break the problems into smaller problem
//2. write the recurrence relation
//3. draw the recursive tree
//4. about the tree:
    // 1. see the flow of functions and see how they are getting into stack
    // 2.  Identify and focus left tree calls and right tree calls
//5. Draw the tree and pointers again and again using pen and paper
//6. Use the debugger to see the flow
//7. see how the values are returned at each step
//8. see where the functions call come out,  in the end you will come out of the main function


//very Important
//variables in recursion


//Types of recurence relation
//1. linear recurence relation --> fibo
//2. divide & conquer rcurence relation --> bs( reduced by a factor)

