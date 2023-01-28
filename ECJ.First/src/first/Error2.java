package first;

public class Error2 {

public int foo(int one) {

	int ret;
	if (one > 10) {
		ret = 20;
	} else {
		System.out.println("one is not less than 10..woah");
	}
	return ret;
}
	
}
