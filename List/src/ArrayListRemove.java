import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListRemove {
	public static void main(String[]args)
	{
		List<Integer> test1 = new ArrayList<Integer>();
		test1.add(2);
		test1.add(1);
		test1.add(8);
		test1.add(1);
		test1.add(3);
		test1.add(2);
		test1.add(8);
		for(int i = 0; i < test1.size();i++)
		{
			System.out.print(test1.get(i)+" ");
		}
		removeDuplicates(test1);
		System.out.println("");
		for(int i = 0; i < test1.size();i++)
		{
			System.out.print(test1.get(i)+" ");
		}
	}
	public static List<Integer> removeDuplicates(List<Integer> nums)
	{
		int x,y;
		Collections.sort(nums);
		for(int i = 0; i < nums.size()-1; i++)
		{
			x = nums.get(i);
			for(int j = i+1; j <nums.size();j++)
			{
				y = nums.get(j);
				if(x==y)
				{
					nums.remove(j);
				}
			}
		}
		return nums;
	}
}
