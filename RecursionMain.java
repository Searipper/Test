/*
*		program: 	RecursionMain
*		class: 		main
*		programmer: Sammy Hajeer
*		course:		CSC285
*		assignment:	HW8
*/
import java.io.*;
import java.io.IOException;
import javax.swing.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;

class RecursionMain{

	public static void main(String[] Args)throws Exception{
		
		
		//N Factorial
		System.out.println("----------------N-Factorial----------------");
		RecursionManager p1 = new RecursionManager();
		
		System.out.println(p1.Nfactorial(12));
		System.out.println(p1.Nfactorial(25));
		System.out.println(p1.Nfactorial(-5));
		
		//Fibonatchi
		System.out.println("----------------Fibo----------------");
		p1.fib(7);
		System.out.println("number of times fib is called for fib7: "+p1.getFibCount());
		
		//Binary Search
		System.out.println("-------------Binary-Search--------------");
		SortAndSearch<Integer> intArray=new SortAndSearch<Integer>();
		intArray.setvalue(13);
		intArray.setvalue(-8);
		intArray.setvalue(29);
		intArray.setvalue(15);
		intArray.setvalue(75);
		intArray.setvalue(-88);
		intArray.setvalue(19);
		intArray.setvalue(21);
		intArray.setvalue(17);
		intArray.setvalue(85);
		intArray.setvalue(12);
		
		intArray.sort();
		
		int index[]= new int[5];
		int[] intVals={21,75,-88,85,49};
		 
		index[0] = intArray.FindIndex(21);
		index[1] = intArray.FindIndex(75);
		index[2] = intArray.FindIndex(-88);
		index[3] = intArray.FindIndex(85);
		index[4] = intArray.FindIndex(49);
		
		for(int i=0;i<5;i++){
			if(index[i]!=-99)
			System.out.println("index of " +intArray.getvalue(index[i])+" is "+index[i]);
			else System.out.println("no vlaue for "+intVals[i]+" value in list");
		}
		
		//Doubles
		SortAndSearch<Double> doubArray=new SortAndSearch<Double>();
		
		doubArray.setvalue(14.3);
		doubArray.setvalue(29.2);
		doubArray.setvalue(55.2);
		doubArray.setvalue(-17.8);
		doubArray.setvalue(42.1);
		doubArray.setvalue(-88.3);
		doubArray.setvalue(94.2);
		doubArray.setvalue(33.5);
		doubArray.setvalue(-12.5);
		
		int index2[]= new int[4];
		
		index2[0]= doubArray.FindIndex(55.2);
		index2[1]= doubArray.FindIndex(-17.8);
		index2[2]= doubArray.FindIndex(94.2);
		index2[3]= doubArray.FindIndex(25.3);
		double[] doubVals = {55.2,-17.8,94.2,25.3};
		
	for(int i=0;i<4;i++){
			if(index2[i]!=-99){
			System.out.println("index of " +doubArray.getvalue(index2[i])+" is "+index2[i]);
		}else System.out.println("no vlaue for "+doubVals[i]+" value in list");
		
		}

	}
}//end RecursionMain