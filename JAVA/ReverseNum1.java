/**
	讲整数各位翻转
*/
public class ReverseNum{
	pubic static void main(String[] args){
		int num = "56123156646";
		String changedNum = String.valueof(num);
		//将Stringle类型 转为StringBuffer
		StringBuffer stringBuffer = new StringBuffer(changedNum);
		StringBuffer stringBuffer2 = StringBuffer.reverse();
		//将StringBuffer转为int类型
		//将stringBUffer转为String
		String str = stringBuffer2.toString();
		//将String转为int类型
		int finalNum = Integer.parseInt(str);
		System.out.print(finalNum)
	}
}
		