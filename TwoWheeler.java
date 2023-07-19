package week1.day2;

public class TwoWheeler {
	int noOfWheeler=4;
	short noOfMirrors=2;
	long chessisNumber=1234567899L;
    boolean isPunctured=true;
	String bikeName="Hero honda";
	double runningKM=3.333;
	
	public static void main(String[] args) {
		TwoWheeler myTwo= new TwoWheeler();
		System.out.println("No of Wheels="+ myTwo.noOfWheeler);
		System.out.println("No of Mirrors="+ myTwo.noOfMirrors);
		System.out.println("chessis Number="+ myTwo.chessisNumber);
		System.out.println("TwoWheeler is puncture= "+ myTwo.isPunctured);
		System.out.println("bike Name is "+ myTwo.bikeName);
		System.out.println("TwoWheeler running KM is "+ myTwo.runningKM);
	}

	
		
	
			
}
