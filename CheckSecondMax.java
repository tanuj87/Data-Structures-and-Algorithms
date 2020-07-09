class CheckSecondMax {
  
  public int findSecondMaximum(int[] arr)
  {
    // Write - Your - Code
    int max = Integer.MIN_VALUE, second_max = Integer.MIN_VALUE;
    for(int i=0; i< arr.length; i++){
      if(arr[i]> max){
        max = arr[i];
      }
    }
    for(int i=0; i< arr.length; i++){
      if(arr[i]>second_max && arr[i]!=max){
        second_max = arr[i];
      }
    }
    return second_max;
  }
}