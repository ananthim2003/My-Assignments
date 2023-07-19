package week1.day2;

public class Mobiles {
	String mobileBrandName="Redmi";
	char mobileLogo='m';
	short noOfMobilePiece=15000;
	int modelNumber=866762571;
	long mobilelmeiNumber=1234567893L;
	float mobilePrice=15000F;
	boolean isDamaged=true;
	
	public static void main(String[] args) {
		Mobiles myMobiles=new Mobiles();
		System.out.println(myMobiles.mobileBrandName);
		System.out.println(myMobiles.mobileLogo);
		System.out.println(myMobiles.noOfMobilePiece);
		System.out.println(myMobiles.modelNumber);
		System.out.println(myMobiles.mobilelmeiNumber);
		System.out.println(myMobiles.mobilePrice);
		System.out.println(myMobiles.isDamaged);
		
		
	}
	
}

