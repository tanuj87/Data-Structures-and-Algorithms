class CheckMid {
    
    public static <T> Object findMiddle(SinglyLinkedList<T> list) {
      if (list.isEmpty())
            return null;
      int mid = 0, len = 0;
      SinglyLinkedList<T>.Node current = list.headNode;

      while(current != null){
        len++;
        current = current.nextNode;
      }
      if((len%2)==0){
        mid = len/2;
      }
      else{
        mid = (len/2)+1;
      }
      int counter=1;
      current = list.headNode;
      while(counter<mid){
        current = current.nextNode;
        counter++;
      }
      return current.data;
    }
}
