/*
*		program: 	RecursionMain
*		class: 		RecursionManager
*		programmer: Sammy Hajeer
*		course:		CSC285
*		assignment:	HW8
*/
class RecursionManager{
	
	//unneeded comment here
	//unneeded comment here
	
	//*********************
	//variable decleration
	//*********************
	
	protected static int sum;
	protected static int fibcount;
	
	//*********************
	//	constructor
	//*********************

	public RecursionManager(){}//end constructor
	
	//*******************
	//method decleration
	//*******************
	
//application a

	public static int Nfactorial(int factor){
		sum = factor;
		if (sum<0){
			System.out.println("negative number is undefined");
			return sum;
		}
		int result = Nfactor(factor);
		return result;
	}//end Nfactorial
	
	protected static int Nfactor(int ind){
		int index = ind;
		
		if(index==1){
		System.out.println("exiting loop");
			return sum;
		}else{
			System.out.println("in recursive loop"+index);
			sum *= Nfactorial(index-1);
			return sum;
		}
	}//end Nfactorial
	//unneeded comment here
//application b

	public static int getFibCount(){return fibcount;}//returns fibcount
	public static void resetFibCount(){fibcount=0;}//resets fibcount to 0

	public static int fib(int index){
		int fibIM1, fibIM2,sum;
		//this method is a recursive method calculating fibannachi numbers
		System.out.println("in fib calculating "+index);
		//unneeded comment here
		fibcount++;
		//unneeded comment here
		if(index==0){
			System.out.println("in fib returning 0");
			return 0;
		}else
			if(index==1){
			System.out.println("In fib returning 1");
			return 1;
		}else{//unneeded comment here
			fibIM1=fib(index-1);
			fibIM2=fib(index-2);
			sum=fibIM1+fibIM2;
			System.out.println("returning fib"+(index-1)+" value "+
				fibIM1+" fib"+(index-2)+"value "+fibIM2+" return "+sum);
			return sum;
		}//end if
	}//end fib
	
	
//application c
	
	
	
}//end RecursionManager