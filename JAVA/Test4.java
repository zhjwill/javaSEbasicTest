/*public class Test4{

    public  static void main(String[] arg)
    {
        String str = "统计字符串中的某个字在字符串中出现的位置";
        int[] iArr =  countAll(str,'字');
        System.out.println(Arrays.toString(iArr));
    }
    private static int[] countAll(String str,char ch)
    {
        int[] iArr={};
        for(int i = 0; i < str.length();i++){
            char c =str.charAt(i);
            if (c==ch){
                iArr = Arrays.copyOf(iArr,iArr.length+1);//数组复制，新建的内存
                iArr[iArr.length-1] = i;
            }
        }
        return iArr;
    }
}*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[ ] chs ={'统','计','一','个','字','符','在','字','符','串','中'};
		for (int i = 0; i < chs.length; i++) {
			if (chs[i] == '字') {
				System.out.println("字符在字符数组中的位置是： "+i);
			}
		}
	}

}
	