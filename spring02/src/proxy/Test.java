package proxy;



public class Test {
	public static void main(String[] args) {
		
		//目标对象
		ArithmeticCalultorImpl target = new ArithmeticCalultorImpl();
		
		//获取代理对象
		Object obj = new ArithmeticCalculatorProxy(target).getProxy();
	
		//转回具体对象
		
	
		ArithmeticCalultor proxy = (ArithmeticCalultor) obj;
		
		System.out.println(proxy.getClass().getName());
		
		int result = proxy.add(1, 2);
		
		System.out.println("result:"+result);
		
	
		/**
		 *   1，代理对象能否转换为目标对象
		 *   2，代理对象调用代理方法，为什么回执行InvocationHandler中的invoke 方法
		 *
		 *
		 */
	}

}
