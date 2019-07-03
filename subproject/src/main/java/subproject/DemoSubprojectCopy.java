package subproject;

public class DemoSubprojectCopy {

	private static DemoSubprojectCopy foo = null;

	public static void main(String[] args) {
		int k_subproject;
	}
	
	public boolean unusedMethodSubproject(boolean k) {
		k = true;
		
        String foo = null;
        System.out.println(foo.length());
        
        return k;
	}
	
	 public static DemoSubprojectCopy getFoo() {
     if (foo==null) {
         foo = new DemoSubprojectCopy();
     }
    return foo;
 }
 
 	 public static DemoSubprojectCopy getFoo2() { 
     if (foo==null) {
         foo = new DemoSubprojectCopy();
     }
    return foo;
 }
}
