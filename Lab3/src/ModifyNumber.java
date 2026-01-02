import java.util.Scanner;
import java.lang.Math;
public class ModifyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,modifiedNumber;
		System.out.println("Enter the number:");
		number=sc.nextInt();
		modifiedNumber=modifyNumber(number);
		System.out.println(modifiedNumber);
	}

	private static int modifyNumber(int number) {
		String str=String.valueOf(number),str1="";
		
		int i,diff;
		for (i=0;i<str.length()-1;i++) {
			char c=str.charAt(i);
			char c1=str.charAt(i+1);
			diff=Math.abs(Integer.parseInt(String.valueOf(c))-Integer.parseInt(String.valueOf(c1)));
			str1+=String.valueOf(diff);
		}
		str1+=str.charAt(str.length()-1);
		return Integer.parseInt(str1);
	}

}
