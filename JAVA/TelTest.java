import java.util.*;
public class TelTest{
public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
	    int num = scanner.nextInt();
		//个位 
		int first = num%10;
		//十位
		int sec = num/10%10;
		//百位
		//5678
		int thrid = num/100%10;
		//千位
		int forth = num/1000;
		//各位加上5
		first = (first+5)%10;
		sec = (sec+5)%10;
		thrid = (thrid+5)%10;
		forth = (forth+5)%10;
		int result = first*1000+thrid*10+sec*100+forth;
		System.out.print(result);
	}
}