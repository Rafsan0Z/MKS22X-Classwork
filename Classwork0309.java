public class Classwork0309{

  public int partition(int start, int end, int[] data){

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

}
