public class Classwork0309{

  public int partition(int start, int end, int[] data){
    double random = Math.random()*(end-start);
    int pivot = (int)random + start;
    exchange(start,pivot,data);
    int pivotInt = data[start];
    int reference = start;
    start++;
    while(end >= start){
      if(data[start] > pivotInt){
        exchange(start,end,data);
        end--;
      }
      else if(data[start] < pivotInt){
        exchange(reference,start,data);
        start++;
        reference++;
      }
      else if(data[start] == pivotInt){
        start++;
      }
    }
    return end;
  }

  public void exchange(int num1, int num2, int[] data){ // these are indices
    int temp = data[num1]
    data[num1] = data[num2];
    data[num2] = temp;
  }

  public static String printArray(int[] ary) {
 String result = "[";
 for (int i = 0; i < ary.length ; i++) {
  result += " " + ary[i];
  if (i != ary.length - 1) {
    result += ",";
  }
}
  return result + "]";
}

public static void main(String[] args){

  

}

}
