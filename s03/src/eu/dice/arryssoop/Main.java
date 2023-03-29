package eu.dice.arryssoop;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println(doStuff(args));
		} catch(Exception e)
		{
			System.out.println("exc");
		}
		finally {
			System.out.println("fin");
		}
		doStuff(args);
	}
	
	static int doStuff(String[] args) {
		return Integer.parseInt(args[0]);
	}
}