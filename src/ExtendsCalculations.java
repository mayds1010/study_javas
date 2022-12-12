public class ExtendsCalculations extends Calculations {
    ExtendsCalculations(){
        System.out.println("ExtendsCalculations - Calculations");
    }
    //multiply
    public int multiplication(int first, int second){
        int result = first * second;
        return result;
    }
   //public Methods subtraction
   public int subtraction(int first, int second){
    int result = second - first ; //1출력
    return result;
}
}
