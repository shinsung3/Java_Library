interface printString {
	void showString(String str);
}

public class TestLambda {
	// 구현부
	public static void main(String[] args) {
		printString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("TEST");
		showMyString(lambdaStr);

		// test라는 변수로 구현부를 반환받은것.
		printString test = retrunString();

		test.showString("test3");
	}

	public static void showMyString(printString p) {
		p.showString("Test2");
	}

	public static printString retrunString() {
		return s -> System.out.println(s + "!!!");
	}
}