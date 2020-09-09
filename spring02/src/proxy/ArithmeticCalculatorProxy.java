package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * ���ɴ������
 * 
 * JDK�Ķ�̬����:
 * 	 1. Proxy : �����ж�̬������ĸ��࣬ ר���û����ɴ���������Ǵ������  
 * 		 	public static Class<?> getProxyClass(ClassLoader loader,
                                         Class<?>... interfaces)
                            �������ɴ������Class����. 
                                         
 * 			public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                         InvocationHandler h)
                            �������ɴ������                            
                                         
 *   2. InvocationHandler :��ɶ�̬�������������.
 *   		public Object invoke(Object proxy, Method method, Object[] args)
        	throws Throwable; 
 *   		
 */
public class ArithmeticCalculatorProxy {

	//��̬����:    Ŀ�����     ��λ�ȡ�������      ����Ҫ��ʲô 
	
		//Ŀ�����
		private  ArithmeticCalultor  target ; 
		
		
		public ArithmeticCalculatorProxy(ArithmeticCalultor target) {
			this.target = target ; 
		}
		
		
		//��ȡ�������ķ���
		public Object  getProxy() {
			
			//�������
			Object  proxy ; 
			
			/**
			 * loader:  ClassLoader���� �����������.  �����Ǽ��ض�̬���ɵĴ����ࡣ 
			 * 
			 * interfaces: �ӿ���.  �ṩĿ���������еĽӿ�.  Ŀ�����ô������֤��Ŀ������нӿ�����ͬ�ķ���. 
			 * 			
			 * h:  InvocationHandler���͵Ķ���. 
			 */
			ClassLoader loader = target.getClass().getClassLoader();
			
			Class []  interfaces = target.getClass().getInterfaces();
			
			
			proxy = Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
				/**
				 * invoke:  ���������ô������� ���������invoke������
				 * 
				 * proxy: ������� �� ��invoke������һ�㲻��ʹ��. 
				 * 
				 * method: ���ڱ����õķ�������. 
				 * 
				 * args:   ���ڱ����õķ����Ĳ���. 
				 */
				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
					
					//�������ĵ���ת�ص�Ŀ�������. 
					
					//��ȡ����������
					String methodName = method.getName();
					//��¼��־
					System.out.println("LoggingProxy==> The method " + methodName+" begin with "+ Arrays.asList(args));
					Object result = method.invoke(target, args);  // Ŀ�����ִ��Ŀ�귽��. �൱��ִ��ArithmeticCalculatorImpl�е�+ - * /
					
					//��¼��־
					System.out.println("LoggingProxy==> The method " + methodName  +" ends with :" +result   );
					return result ;
				}
			});
			
			return proxy ;
		}
		
	}

/**
 * ģ��ײ����ɵĶ�̬������
 */

class $Proxy0  extends Proxy  implements ArithmeticCalultor{

	protected $Proxy0(InvocationHandler h) {
		super(h);
	}

	@Override
	public int add(int i, int j) {
	//	return  super.h.invoke(this,��������,��������);
		return 0 ;
	}

	@Override
	public int sub(int i, int j) {
		return 0;
	}

	@Override
	public int mul(int i, int j) {
		return 0;
	}

	@Override
	public int div(int i, int j) {
		return 0;
	}
	
}



