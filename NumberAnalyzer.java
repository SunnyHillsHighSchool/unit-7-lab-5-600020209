//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
  public NumberAnalyzer(int[] l){
    list = new ArrayList<Number>();
    for(int i:l){
      list.add(new Number(i));
    }
  }
	//write count odds
  public int countOdds(){
    //Initialize int variable oCount with value 0
    int oCount = 0;
    //For all int values i within the list (for-each):
    for(Number i:list){
      //If i is odd:
      if(i.isOdd()){
        //Increment oCount by 1
        oCount++;
      }
    }
    //return oCount
    return oCount;
  }
	//write count evens
  public int countEvens(){
    //Initialize int variable eCount with value 0
    int eCount = 0;
    //For all int values i within the list (for-each):
    for(Number i:list){
      //if i is not odd:
      if(!i.isOdd()){
        //increment eCount by 1
        eCount++;
      }
    }
    //return eCount
    return eCount;
  }
	//write count perfects
	public int countPerfects(){
    //Initialize int variable pCount with value 0
    int pCount = 0;
    //For all int values i within the list (for-each):
    for(Number i:list){
      //If i is perfect:
      if(i.isPerfect()){
        //increment pCount by 1
        pCount++;
      }
    }
    //return pCount
    return pCount;
  }
	//write a toString
  public String toString(){
    return "" + list;
  }
}