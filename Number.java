//Add Number.java code from lab 4
//header for Number class
public class Number{
  //private instance variable (must be an Integer)
  private Integer num;
  //constructor
  public Number(){
    num = 0;
  }
  public Number(Integer n){
    num = n;
  }
  //getter method
  public Integer getNum(){
    return num;
  }

  //setter method
  public void setNum(Integer newNum){
    num = newNum;
  }
  //isOdd method
  public boolean isOdd(){
    //If the modulo of this number and 2 is 0:
    if(num % 2 == 0){
      //Return false
      return false;
    //End if
    }
    //Return true
    return true;
  }

  //isPerfect method
  public boolean isPerfect(){
    //Initialize int variable sum with 0
    int sum = 0;
    //Start for loop; intializing int variable i with value 1, while i is less than this number, and incrementing i by one each run:
    for(int i = 1; i < num; i++){
      //If the modulo of this number and i is 0:
      if(num % i == 0){
        //Add i to sum
        sum += i;
      //End if
      }
    //End for
    }
    //If sum is equal to this number:
    if(sum == num){
      //Return true
      return true;
    //End if
    }
    //Return false
    return false;
  }

  //toString
  public String toString(){
    return "" + num;
  }
}