package subproject2;

public class DemoSubproject2 {

	int k;

	public static void main(String[] args) {
		int k_subproject;
	}

	
	public boolean unusedMethodSubproject(boolean k) {
		k = true;

		String foo = null;
		System.out.println(foo.length());

		return k;
	}

	private static DemoSubproject2 foo = null;

	public static DemoSubproject2 getFook() {  
		if (foo==null) {
			foo = new DemoSubproject2();
		}
		return foo;
	}
}
