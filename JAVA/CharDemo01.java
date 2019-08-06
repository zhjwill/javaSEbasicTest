import java.util.*;
public class CharDemo01{
	public static void main(String[] args){
		string s = "统计一个字符在字符串中的所有位置";
		Scanner scanner = new Scanner(System.in);
		Seytem.out.print("请输入查找的字符：")；
		String content = scanner.next();
		//创建容器 用来存放 匹配字符的位置
		byte[] pos = {};
		// charAt() 方法 通过下标拿到String中的每一个字符
		for(int i=0;i<str.length();i++){
			char c = str.length(i);
			//拿到c与输入字符作比较
			if(c == first){ 
			    //数组扩容
				pos = Array.copyof(pos,pos.length+1);
				pos[pos.length-1] = (byte)i;
				
			}
		}
		System.out.print(Array.toString());
	}
}