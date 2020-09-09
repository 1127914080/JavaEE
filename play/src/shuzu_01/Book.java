package shuzu_01;

public class Book {



	public static void main(String[] args) {

//		int sum =0 ;
//		for(int i = 1 ; i<=100 ;i=i+2) {
//			
//				sum=sum+i;		
//				
//			}
//		System.out.println("奇数和为:"+sum);
//			

		int sum = 0;
		int sum1 = 1;
		for (int i = 9; i >=1; i--) {
			
			  sum1 = 1;
			for (int j = i; j >=1; j--) {
				sum1 = sum1 * j;
			
			}
			sum = sum + sum1;
		}
		
		System.out.println(sum);
	}

//		// TODO Auto-generated method stub
//		int i = 1;
//		int sum = 0;
//		while (i <= 100) {
//			sum = sum + i;
//			i = i + 2;
//		}
//		System.out.println("100以内的奇数和为：" + sum);
//
//	}	

//	long result = 0;
//
//	for(
//	int j = 1;j<=99;j=j+2)
//	{
//
//		result = result + j;
//
//	}
//
//	System.out.println("result="+result);

	


}
