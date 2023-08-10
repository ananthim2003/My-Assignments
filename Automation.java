package week4.day4;

public class Automation extends MultipleLangauge {

	public void Java() {
		System.out.println("java");
		
	}

	public void Selenium() {
		System.out.println("Selenum");
		
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}
	public static void main(String[] args) {
		Automation my=new Automation();
		my.Java();
		my.Selenium();
		my.ruby();
		my.python();
	}

}
