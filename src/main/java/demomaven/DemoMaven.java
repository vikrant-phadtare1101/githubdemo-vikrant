package demomaven;

public class DemoMaven {

	public static void main(String[] args) {
		int k;
	}
	
	public boolean unusedMethod(boolean k) {
		k = true;
		
        String foo = null;
        System.out.println(foo.length());
        
		return k;
	}
	
	public boolean unusedMethod2(boolean k) {
		k = true;
		//comment added
		
        String foo = null;
        System.out.println(foo.length());
        
		return k;
	}

}
