package subproject2;

public class DemoSubproject2 {

	int k;

	public static void main(String[] args) {
		int k_subproject;
	}
	
//	private static DemoSubproject2 fook = null;
//
//	public static DemoSubproject2 getFook() {  
//		if (fook==null) {
//			fook = new DemoSubproject2();
//		}
//		return fook;
//	}
	
	private static DemoSubproject2 foo = null; 

	public static DemoSubproject2 getFoo() {  
		if (foo==null) {
			foo = new DemoSubproject2();
		}
		return foo;
	}
	
	public boolean unusedMethodSubproject(boolean k) {
		k = true;

		String foo = null;
		System.out.println(foo.length());

		return k;
	}
}
