package Yichang;

public class Yichangchuli3 {
	

public static void main(String[] args) {

	int v3=0;
		try {
			int v1 = Integer.parseInt(args[0]);
			int v2 = Integer.parseInt(args[1]);
			v3 = v1 / v2;
	           return;
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("我现在捕获到越界了，我打印的堆栈信息如下");
		// TODO Auto-generated catch block
		e.printStackTrace();
		return;
	} catch (ArithmeticException e) {
		System.out.println("我现在捕获到算法錯誤了，我打印的堆栈信息如下");
		// TODO Auto-generated catch block
		e.printStackTrace();
		return;
	}finally {
		System.out.println("无论捕捉到什么异常，我都会被执行");
		System.out.println(" v3 = "+v3);
	}
	
}


}
