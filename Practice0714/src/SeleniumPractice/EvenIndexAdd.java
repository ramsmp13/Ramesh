package SeleniumPractice;

public class EvenIndexAdd {

	public static void main(String[] args) {
		int RamArray[] = {10,20,30,40,35,32};
				
		for (int i=0; i<RamArray.length; i++)
		{
			if(i%2==0)
			{
				int sum=0;
				sum=sum+RamArray[i];
				System.out.println(sum);
			}
			else 
			{
			int oddsum=0;
				oddsum=oddsum+RamArray[i];
				System.out.println(oddsum);
			}
		}
		
			}

}
