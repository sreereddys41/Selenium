package PracticefromVideos;

public class about_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample="Hello Selenium";
		int length=sample.length();
		String lower=sample.toLowerCase();
		String upper=sample.toUpperCase();
		
		System.out.println(length);
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(sample.replace("Selenium","Testing"));
		System.out.println(sample.indexOf('S'));
				

	}

}
