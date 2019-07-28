import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int p=n1%10;
      int l=n1/10;
      int b=p+l;
      System.out.println(b);
	}
}