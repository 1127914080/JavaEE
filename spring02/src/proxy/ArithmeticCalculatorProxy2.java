package proxy;

import java.lang.reflect.Constructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 鐢熸垚浠ｇ悊瀵硅薄銆�
 * 
 * JDK鐨勫姩鎬佷唬鐞�:
 * 	 1. Proxy : 鏄墍鏈夊姩鎬佷唬鐞嗙被鐨勭埗绫伙紝 涓撻棬鐢ㄦ埛鐢熸垚浠ｇ悊绫绘垨鑰呮槸浠ｇ悊瀵硅薄  
 * 		 	public static Class<?> getProxyClass(ClassLoader loader,
                                         Class<?>... interfaces)
                            鐢ㄤ簬鐢熸垚浠ｇ悊绫荤殑Class瀵硅薄. 
                                         
 * 			public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                         InvocationHandler h)
                            鐢ㄤ簬鐢熸垚浠ｇ悊瀵硅薄                            
                                         
 *   2. InvocationHandler :瀹屾垚鍔ㄦ�佷唬鐞嗙殑鏁翠釜杩囩▼.
 *   		public Object invoke(Object proxy, Method method, Object[] args)
        	throws Throwable; 
 *   		
 */
public class ArithmeticCalculatorProxy2 {
	//鍔ㄦ�佷唬鐞�:    鐩爣瀵硅薄     濡備綍鑾峰彇浠ｇ悊瀵硅薄      浠ｇ悊瑕佸仛浠�涔� 
	
	//鐩爣瀵硅薄
	private  ArithmeticCalultor  target ; 
	
	
	public ArithmeticCalculatorProxy2(ArithmeticCalultor target) {
		this.target = target ; 
	}
	
	
	//鑾峰彇浠ｇ悊瀵硅薄鐨勬柟娉�
	public Object  getProxy() throws Exception {
		
		//浠ｇ悊瀵硅薄
		Object  proxy ; 
		
		ClassLoader loader = target.getClass().getClassLoader();
		Class [] interfaces = target.getClass().getInterfaces();
		
		Class proxyClass = Proxy.getProxyClass(loader, interfaces);
		
		//Class  鍒涘缓瀵硅薄?   newInstance()
		
		Constructor con = 
				proxyClass.getDeclaredConstructor(InvocationHandler.class);
		
		proxy = con.newInstance(new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//灏嗘柟娉曠殑璋冪敤杞洖鍒扮洰鏍囧璞′笂. 
				
				//鑾峰彇鏂规硶鐨勫悕瀛�
				String methodName = method.getName();
				//璁板綍鏃ュ織
				System.out.println("LoggingProxy2==> The method " + methodName+" begin with "+ Arrays.asList(args));
				Object result = method.invoke(target, args);  // 鐩爣瀵硅薄鎵ц鐩爣鏂规硶. 鐩稿綋浜庢墽琛孉rithmeticCalculatorImpl涓殑+ - * /
				
				//璁板綍鏃ュ織
				System.out.println("LoggingProxy2==> The method " + methodName  +" ends with :" +result   );
				return result ;
			}
		});
		
		
		return proxy ;
	}
	
}















