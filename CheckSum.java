class CheckSum
{   
  public static int[] findSum(int[] arr, int n) 
  {
    int[] result = new int[2];
    // write your code here
    if(arr == null){
      return null;
    }
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length; j++){
        if(i==j)
          continue;
        if((arr[i]+arr[j])==n){
          result[0] = arr[i];
          result[1] = arr[j];
          break;
        }
      }
    }
    return result;   // return the elements in the array whose sum is equal to the value passed as parameter 
  }
}