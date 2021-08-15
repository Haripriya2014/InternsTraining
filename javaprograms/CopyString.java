package javaprograms;


public class CopyString {

	public static void main(String[] args) {
		String str = "Welcome";
		char[] x = str.toCharArray();
		int size = x.length;
		char[] y = new char[size];
		for(int i=0;i<=6;i++) {
			y[i]=x[i];
			}
	System.out.println(x);
	System.out.println(y);
	}

}
