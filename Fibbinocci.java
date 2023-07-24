package week2.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int firstNum=0,secNum=1,sum=11;
		System.out.println(firstNum);
		for(int i=0; i<=sum;++i) {
			//System.out.println(sum);
			int sum1 = firstNum+secNum;
			firstNum=secNum;
			secNum=sum1;
			System.out.println(sum1);
			
			
		}
		
		
	}

}



