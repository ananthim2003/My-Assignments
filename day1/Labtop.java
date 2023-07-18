package week1.day1;

public class Labtop {
	public void OpenLap() {
		System.out.println("open the laptop");
		}
	public void CloseLap() {
		System.out.println("close the laptop");
	}
	public void Text() {
		System.out.println("text");
	}
	public void Search() {
		System.out.println("search laptop");
	}
	public void mail() {
		System.out.println("send the mail");
	}
	public static void main(String[] args) {
		Labtop myLabtop= new Labtop();
		myLabtop.OpenLap();
		myLabtop.CloseLap();
		myLabtop.Text();
		myLabtop.Search();
	}

}
