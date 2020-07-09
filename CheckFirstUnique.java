class CheckFirstUnique
{
 public static int findFirstUnique(int[] arr) 
 {
   int result = 0;
	   for(int i=0; i < arr.length; i++){
	     boolean ifExist = false;
	     for(int j=0; j < arr.length; j++){
	       if(i==j){
	         continue;
	       }
	       if(arr[i]==arr[j]){
	         ifExist = true;
	         break;
	       }
	     }
	     if(ifExist == true){
	       continue;
	     }
	     else{
	       result = arr[i];
	       break;
	     }
	   }   return result;
 }
}