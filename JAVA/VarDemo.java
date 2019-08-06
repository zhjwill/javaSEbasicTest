import java.util.Random;

public class VarDemo{
    public static void main(String[] args){
		Random r = new Random();
		int a = r.nextInt(27);
		int b = a+65;
		char c = (char)b;
		System.out.println(c);
	}
}