package week2.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n=4;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				//System.out.println(n);
				count++;
			}
		}
		if(count==2) {
				System.out.print(n + "  condition is true");
			}else {
				System.out.println(n+" condtion is fasle");
			}
		}
	}

