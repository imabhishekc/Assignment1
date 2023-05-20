import java.util.*;
public class MemoizationMethod {
    public static void pascalTriangle(int n){
        Map<String, Integer> memoize = new HashMap<>();

        for (int i=0; i<n; i++){
            for (int j = 0; j<=i; j++){
                System.out.print(pascalValue(i, j, memoize) +" ");
            }
            System.out.println();
        }
    }
    public static int pascalValue(int i, int j, Map<String, Integer> memoize){
        if (j==0 || j == i){
            return 1;
        }
        String key = i + "-"+ j;

        if (memoize.containsKey(key)){
            return memoize.get(key);
        }
        int result = pascalValue(i -1, j-1, memoize) + pascalValue(i - 1, j, memoize);
        memoize.put(key, result);
        return result;
    }

    public static void main(String[] args) {
        int num = 6;
        pascalTriangle(num);
    }
}

//Explanation
//       -We create a HashMap called memoize to store calculated values.
//        -The keys of the map are strings in the format row and column, representing the coordinates of the Pascal's Triangle.
//        -The pascalTriangle method takes an integer n imput and prints Pascal's Triangle up to the nth row. Inside the method, there are two nested loops. The outer loop iterates over i from 0 to n-1, representing the row number.
//        -Within the outer loop, there is an inner loop that iterates over j from 0 to i, representing the column number
//        -For each place in the triangle, the pascalValue method is called with the current row(i), column(j), and the memoize cache.
//        -The pascalValue method takes the i, j and the memoize cache as input and calculates the value of Pascal's Triangle at the given place.
//        -If the column 'j' is 0 or the column 'j' is equal to the row 'i', it means we are at the edge of the triangle, so the value is always 1.
//        -We generate a unique key by concatenating the 'i' and 'j' values as a string, which is used to check if the value already exists in the memoize cache.
//        -If the value is found in the cache, we retrieve it and return it directly without calculating again.
//        -If the value is not in the cache, we calculate it by recursively calling the pascalValue method for the place above and to the left (pascalValue(i - 1, j - 1, memoize)) and above and to the right (pascalValue(i - 1, j, memoize)). The results are then sum.
//        -The computed value is stored in the memoize cache with the corresponding key for future use.
