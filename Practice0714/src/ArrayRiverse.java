

public class ArrayRiverse {

	public static void main(String[] args) {
		
		int num[] =  {10,20,30,40,50,60,70,80,90};
//		for (int j=0; j<num.length;j++)
//		{
//			System.out.println(num[j]);
//		}
		
		System.out.println("Riverse order of the Array is ");
		for (int i=num.length-1;i>=0;i--)
		{
			System.out.println(num[i]);
		}
}
}
