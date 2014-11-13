package demo_algorithm_Fibonacci;

public class Iterative {

	public static void main(String[] args) {
		int result = fibo(6);
		System.out.println(result);

	}

	/**
	 * 斐波那契数列，又称黄金分割数列，指的是这样一个数列：1、1、2、3、5、8、13、21、……
	 * 在数学上，斐波纳契数列以如下被以递归的方法定义：
	 * F0=0，F1=1，Fn=F(n-1)+F(n-2)（n>=2，n∈N*）
	 * 本方法通过迭代计算第n个斐波那契数的值
	 */
	public static int fibo(int n) {
		if (n == 0) {
			return 0; // f(0) = 0
		}
		if (n == 1) {
			return 1; // f(1) = 1
		}
		int a = 1, b = 1;

		for (int i = 3; i <= n; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		return b;

	}
}
