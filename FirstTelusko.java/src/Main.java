class PascalTriangleIterative{
    public static void main(String[] args) {
        int numOfRows = 4;
        int num;

        for (int i = 0; i<=numOfRows; i++){
            num = 1;
            for (int j = 0; j<=i; j++){
                System.out.print(num + " ");
                num = num * (i - j)/(j+1);
            }
            System.out.println();
        }
    }
}
// The explanation of the above code
//At first I have created 2 variables,
//        One for the number of rows I want to print and a variable named num to give the initial value of the pattern.
//
//        Now for iteration, I initialize the loop from 0 because for 1, the output may varies.
//        then I initialize my "num" variable with 1. And now I have another loop initialized with 0 which goes up to the value of i as it increases.
//        Now in it's statement at first I printed the initial value which is 1. and gave a space
//        and now here comes the main formula
//
//        num = num * (i-j) / (j + 1)
//
//        with this formula, the value of each element in pascal's triangle is calculated iteratively.
//        -num represents current value
//        (i-j) this calculates binomial coefficient. it means choosing j elements from i elements.
//        (j+1) means incrementing factor for the binomial coefficient. calculating the value for next element in the row
//
//        altogether multiplying with num for calculating the current element based on previous elements on the above row.
//
//
