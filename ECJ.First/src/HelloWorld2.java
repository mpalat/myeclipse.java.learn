
public class HelloWorld2 {

	public static void main(String[] args) {
		
		String name = "Anamika";
		
		if (args.length > 0) {
			name = args[0];
		}
		System.out.println("Hello World " + name) ;
	}
}
