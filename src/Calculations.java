public class Calculations extends Object {
    int _first=0;
    int _second=0;

    //constructors(생성자)
    Calculations(){ 
      System.out.println("Calculations - constructor");
    }

    Calculations(int first, int second ){ 
    this._first = first;
    this._second = second;
      System.out.println("Calculations - constructor with params");
    } 

    //multiplication
    public int multiplication(){
        int result = this._first * this._second;
        return result;
    } //위와 세트

    //public Methods addition
    public int addition(int first, int second){
        int result = first + second;
        return result;
    } 
    //public Methods subtraction
    public int subtraction(int first, int second){
        int result = first - second;//-1출력
        return result;
    }
    
}
