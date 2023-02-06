package Interfaces;

public interface Laptop {

	
	public void copy();
	public void paste();
	public void cut();
	
	public default void audio() {
		System.out.println("code for audio functionality");
	}
	
	public static void security()
	{
		System.out.println("code for security");
	}
}
