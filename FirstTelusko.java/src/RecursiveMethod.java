// Pascal Triangle using recursion
public class RecursiveMethod {
    public static void print(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print(triangle(i,j) + " ");
            }
            System.out.println();
        }
    }
    public static int triangle(int i, int j){
        if(j == 0){
            return 1;
        }
        else if (j == i){
            return 1;
        }
        else {
            return triangle(i-1, j-1) + triangle(i - 1, j);
        }
    }
    public static void main(String[] args) {
        int num = 6;
        print(num);
    }
}

// Explanation
//At first I have a method named print that takes a "n" input. It basically means the triangle will be up to nth row.
//        Inside print method we have two nested loop. The outer loop for row number. (n-1)
//
//        we have inner loop that goes form 'j' initial 0 to 'i'/column.
//
//        inside inner loop method triangle is called with current row number "i" and column "j" ad printed with space.
//
//        triangle method takes two integers "i" and "j" and returns an integer value. This method calculate value of triangle at given row and column.
//
//        Conditions check in triangle method:
//        -if 'j' is 0 which is the beginning of a row so it returns 1.
//        -if column 'j' equal to row 'i', it means end so the value is 1.
//
//        - else, value calculated by adding the value above and to the left of current place (triangle(i-1, j-1)) with the value above to the right of the current place(triangle(i-1,j))
//
//        at last main method declared with a variable called "num" and assigned the value 6. The print method is called with the value of num which is 6 so the triangle will form up to 6th row.