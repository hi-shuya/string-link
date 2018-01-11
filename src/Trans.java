import java.util.Scanner;

public class Trans {
	//提取字符串
	public String Spilt(String y){
		String[] strArray = null; 
		String z = "";
        strArray = y.split(","); 
        for (String string : strArray) {
			z=z+this.transfer(string);
		}
        /*z = z.replace("null","" );*/
        return z;
	}
	
	//替换成相应语句
	public String transfer(String x){
		//x = "replace(" + x + ",char(10),' ')    " + x+"," ;
		x = "var " + x + " =sysUrl  + '" + x+"';" ;
		return x;
	}
	
	/*使用方法:运行java程序u，复制select中的所有字段（带逗号复制进来）到控制台，再按几下回车，复制出来即可。*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Trans trans = new Trans();
		while(true){
		System.out.println(trans.Spilt(scan.next()));
		}
	}
}
