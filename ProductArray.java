class ProductArray  
{  
  public static int[] findProduct(int arr[])  
  { 
    if(arr == null){
        return null;
    }   
    int [] result = new int[arr.length];
    for(int i=0; i< arr.length; i++){
        int prod = 1;
        for(int j=0; j< arr.length; j++){
            if(i==j)
                continue;
            else{
                prod = prod * arr[j];
            }
            
        }
        result[i] = prod;
    }
    // write your code here

    return result; 
   } 
} 