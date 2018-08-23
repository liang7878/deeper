import java.util.Scanner;
import java.util.ArrayList;

public class Rabbit {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numlist = new ArrayList<Integer>();
        while(sc.hasNext()) {
            numlist.add(sc.nextInt());
        }
		int number = numlist.size();
		int[] nums = new int[number];
		for(int i = 0; i < number; i++){
			nums[i]  = numlist.get(i);
		}
		int count = sortByChangePart(nums);
		System.out.println(count);
	}
	public static int[] changePart(int[] nums, int begin, int end){
		int total = begin + end;
		for(int i = begin; i < (begin + end)/2 + 1; i++){
			int tem = nums[i];
			nums[i] = nums[total - i];
			nums[total - i] = tem;
		}
		return nums;
	}
	
	public static int minPosition(int[] nums, int begin, int end){
		int min = nums[begin];
		int minPoint = begin;
		for(int i = begin; i < end + 1; i++){
			if(nums[i] < min){
				min = nums[i];
				minPoint = i;
			}
		}
		return minPoint;
	}
	
	public static int maxPosition(int[] nums, int begin, int end){
		int max = nums[begin];
		int maxPoint = begin;
		for(int i = begin; i < end + 1; i++){
			if(nums[i] > max){
				max = nums[i];
				maxPoint = i;
			}
		}
		return maxPoint;
	}
	
	public static int sortByChangePart(int[] nums){
		int count = 0;
		
		int begin = 0;
		int end = nums.length - 1;
		
		while(begin < end){
			int minPoint = minPosition(nums, begin, end);
			if(minPoint != begin){
				changePart(nums, begin, minPoint);
				count++;
				begin++;
			}
			
			int maxPoint = maxPosition(nums, begin, end);
			if(maxPoint != end){
				changePart(nums, maxPoint, end);
				count++;
				end--;
			}
		}
		
		return count;
	}
 
}
