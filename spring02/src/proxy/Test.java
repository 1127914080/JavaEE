package proxy;



public class Test {
	public static void main(String[] args) {
		
		//Ŀ�����
		ArithmeticCalultorImpl target = new ArithmeticCalultorImpl();
		
		//��ȡ�������
		Object obj = new ArithmeticCalculatorProxy(target).getProxy();
	
		//ת�ؾ������
		
	
		ArithmeticCalultor proxy = (ArithmeticCalultor) obj;
		
		System.out.println(proxy.getClass().getName());
		
		int result = proxy.add(1, 2);
		
		System.out.println("result:"+result);
		
	
		/**
		 *   1����������ܷ�ת��ΪĿ�����
		 *   2�����������ô�������Ϊʲô��ִ��InvocationHandler�е�invoke ����
		 *
		 *
		 */
	}

}
