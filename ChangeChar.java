public class ChangeChar {

	public static void main(String[] args) {
		//\t:制表位
		System.out.println("1\t2\t3");
		//\n:换行符
		System.out.println("1\n2\n3");
		//\r:回车 将光标置于行首
		System.out.println("1\r2\r3");
		//\不能直接输入的符号如'"\：转义后面需要直接输出的符号
		System.out.println("1\\2\'3\"");
		//综合
		System.out.println("书名\t作者\t出版社\t价格\n\"三国\"\t罗贯中\txx社\t30");
	}
}