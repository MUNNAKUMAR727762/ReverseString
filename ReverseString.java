package star;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s="welcome";
		String st="";
		
		for(int i=s.length()-1;i>=0;i--) {
			st +=s.charAt(i);
		}
		System.out.println(""+st);
	}

}
