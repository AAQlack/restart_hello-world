/**
 * @author AAQlack
 * @version 1
 */

/*
	文档注释使用斜杠双星号
	多行注释使用斜杠星号
 */
public class JavaDoc {
	//单行注释使用双斜杠
	//编写main方法
	public static void main(String[] args) {
	}
}
/*
	多写、写明白注释可以提高代码可读性，应养成良好注释习惯

	文档注释一般写于类前，用于标识类信息
	文档注释用法：
	cmd中输入javadoc -d 文件路径 -需要的标签 -需要的标签 文件名.java
	例如Javadoc -d c:\\temp -author -version JavaDoc.java
	可在c:\\temp目录生成包含JavaDoc的author和version信息的index.html

	常用javadoc标签：
	@author:标识类作者
	@version:标识类版本
	@param:说明一个方法的参数
	@return:说明返回值类型
	@see:指定一个到另一主题的链接
	{@link}:插入一个到另一主题的链接
	等等
 */