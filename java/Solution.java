import java.util.*;

public class Solution {
    public static void main(String args[]) {
        int[][] arrar = {{1,2,8,9}, {2,4,9,12},{4,7,10,13}, {6,8,11,15}};

        System.out.println(Find(16, arrar));
    }

    public static boolean Find(int target, int[][] arr) {
        int x_length = arr.length;
        int y_length = arr[0].length;

        for(int i=x_length-1, j=0; i>=0&&j<y_length;) {
            if(arr[i][j]==target) {
                return true;
            }

            if(arr[i][j]>target) {
                i--;
                continue;
            }

            if(arr[i][j]<target) {
                j++;
            }
        }
        return false;
    }
}