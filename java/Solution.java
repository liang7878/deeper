import java.util.*;

public class Solution {
    public static void main(String args[]) {
        int[][] arrar = {{1,2,3,4,5}, {6,7,8,10,12},{13,16,17,18,19}};

        System.out.println(Find(10, arrar));
    }

    public static boolean Find(int target, int[][] arrar) {
        int x_length = arrar.length;
        int y_length = arrar[0].length;

        for(int i=x_length-1; i>=0; i--) {
            for(int j=y_length-1; j>=0; j--) {
                if(arrar[i][j] == target) {
                    return true;
                }

                if(arrar[i][j]>target) {
                    
                }
            }
        }
    }
}