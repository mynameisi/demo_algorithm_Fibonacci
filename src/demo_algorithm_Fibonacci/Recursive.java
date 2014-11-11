package demo_algorithm_Fibonacci;

public class Recursive {

	public static void main(String[] args) {
		int result = fibo(3);
		System.out.println(result);

	}

	/**
	 * 斐波那契数列，又称黄金分割数列，指的是这样一个数列：1、1、2、3、5、8、13、21、……
	 * 在数学上，斐波纳契数列以如下被以递归的方法定义：
	 * F0=0，F1=1，Fn=F(n-1)+F(n-2)（n>=2，n∈N*）
	 * 本方法通过递归计算第n个斐波那契数的值
	 */
	public static int fibo(int n) {
		if (n == 0) {
			return 0; // f(0) = 0
		} else if (n == 1) {
			return 1; // f(1) = 1
		} else if (n > 1) {
			return fibo(n - 1) + fibo(n - 2); // f(n) = f(n—1) + f(n-2)
		} else {
			return -1; // Error condition
		}

	}
}
