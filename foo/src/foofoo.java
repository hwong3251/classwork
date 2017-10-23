
public class foofoo {
	public static void main(String[]args)
	{
		String foo = "foo";
		String foofoo = doubled(foo);
		System.out.println(foo);
		System.out.println(foofoo);
		
		String[]testA = {"hi","bye"};
		String[]testB = doubled(testA);
		System.out.println(testA);
		
	}
	public static String doubled(String str1)
	{
		str1 = str1 +str1;
		return str1;
	}

}
