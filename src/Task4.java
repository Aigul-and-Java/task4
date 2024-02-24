import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    static int countMinimumMoves(int[] nums) {
        Arrays.sort(nums);
        int middle = nums.length / 2;
        int moves = 0;
        for (int num : nums) {
            moves += Math.abs(num - middle);
        }
        return moves;
    }
    
        public static void main (String[] args){
        int[] arr = new int[4];
        arr[0] = Integer.parseInt(args[0]);
        arr[1] = Integer.parseInt(args[1]);
        arr[2] = Integer.parseInt(args[2]);
        arr[3] = Integer.parseInt(args[3]);
            System.out.println(countMinimumMoves(arr));
        }
    }

