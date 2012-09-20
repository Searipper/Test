/*
*		program: 	RecursionMain
*		class: 		SortAndSearch
*		programmer: Sammy Hajeer
*		course:		CSC285
*		assignment:	HW8
*/
import java.util.ArrayList;
class SortAndSearch <T extends Comparable>
{
	
	protected ArrayList<T> values = new ArrayList<T>();
	protected int mcount;
	protected T max;
	
	//**************************
	// Constructor
	//**************************
	public SortAndSearch(){
		mcount = 0;
	}

	//**************************
	// method decleration
	//**************************
	
	public int getLength(){return mcount;}
	
	public int setvalue(T x){
		//places value in ArrayList
		values.add(mcount++,x);
		return mcount;
	}
	
	public T getvalue(int i){
		//gats values from ArreyList
		System.out.println("in getvalue returning "+i);
		if(i<=mcount)return values.get(i);
		else
			return values.get(0);
	}//end of getvalue
	
	public void SelectSort(int high){
		System.out.println("in SelectSort"+high);
		
		if(high>0){
			int indexOfMax=0;
			max=values.get(0);
			for(int i=1;i<=high;i++){
				if((values.get(i)).compareTo(max)==1){
					max=values.get(i);
					indexOfMax=i;
				}// record index of maxvalue
			}//end of for max value
			
			//now swap largest number with the last num.
			values.set(indexOfMax,values.get(high));
			values.set(high,max);
			//now recursively call sort on the list one element shorter
			SelectSort(high-1);
			}//end of if high>0
			else return;
			
			return;
	}//end SelectSort
	
	public int BinarySearch(T key, int high, int low,int maxloops){
		int middle = (low+high)/2;
		
		if((values.get(low)).compareTo(key)==0)return low;//compare first
		
		else if((values.get(high)).compareTo(key)==0)return high;//compare last
		
		else if((values.get(middle)).compareTo(key)==0)return middle;//compare middle
		else if (maxloops==0){//check maxamum search loops. if loops exeed value of half of the list break;
			System.out.println("variable "+key+" outside the range of list");
			return-99;
		}else if((values.get(middle)).compareTo(key)!=0){//if not equal to the middle...

			if((values.get(middle)).compareTo(key)==-1){//is it greater than?
				System.out.println(key+" is greater than"+(values.get(middle))+" and less than "+(values.get(high)));
				int answer = BinarySearch(key,high,middle,--maxloops);
				return answer;
		 	}

			if((values.get(middle)).compareTo(key)==1){
				System.out.println(key+" is greater than "+(values.get(low))+" and less than"+(values.get(middle)));
				int answer = BinarySearch(key,middle,low,--maxloops);
				return answer;
			}//is it less than?
		}//endif
			return -99;
		
	}//end search

	//helper method for sort
	public void sort(){		
		SelectSort(mcount-1);
		return;
		}
	//helper method for search
	public int FindIndex(T find){
		int maxloops=mcount/2;
		int result = BinarySearch(find, mcount-1, 0,maxloops);
		return result;
	}//end FindIndex
	
}//end SortAndSearch