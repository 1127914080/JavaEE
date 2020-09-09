package aop;

public class ArithmeticCalultorImpl implements ArithmeticCalultor {

	@Override
	public int add(int i, int j) {
		System.out.println("��־��¼:The method add begin with ["+i+","+j+"]");
		int result = i + j;
		System.out.println("��־��¼:The method add ends with : "+result);
		return result;
	}

	@Override
	public int sub(int i, int j) {
		System.out.println("��־��¼:The method sub begin with ["+i+","+j+"]");
		int result = i - j;
		System.out.println("��־��¼:The method sub ends with : "+result);
		return result;
	}

	@Override
	public int mul(int i, int j) {
		System.out.println("��־��¼:The method mul begin with ["+i+","+j+"]");
		int result = i * j;
		System.out.println("��־��¼:The method mul ends with : "+result);
		return result;
	}

	@Override
	public int div(int i, int j) {
		System.out.println("��־��¼:The method div begin with ["+i+","+j+"]");
		int result = i / j;
		System.out.println("��־��¼:The method div ends with : "+result);
		return result;
	}

}
