
public class foofoo {
	public static void main(String[]args)
	{
		int a = 3;
		int b = doubled(a);
		System.out.println(a);
		System.out.println(b);
		
		String foo = "foo";
		String foofoo = doubled(foo);
		System.out.println(foo);
		System.out.println(foofoo);
		
		String[]testA = {"hi","bye"};
		String[]testB = doubled(testA);
		printArr(testA);
		printArr(testB);
		
	}
	public static int doubled(int x)
	{
		x = x+x;
		return x;
	}
	public static String doubled(String str1)
	{
		str1 = str1 +str1;
		return str1;
	}
	public static String[] doubled(String[]str2)
	{
		for(int i = 0; i < str2.length; i ++)
		{
			str2[i] = doubled(str2[i]);
		}
		return str2;
	}
	public static void printArr(Object[]arr)
	{
		for(Object x : arr)
		{
			System.out.println(x);
		}
		/*
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		*/
	}

}
