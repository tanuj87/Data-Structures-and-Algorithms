class NthElementChallenge {
    public static <T> Object nthElementFromEnd(SinglyLinkedList<T> list, int n) {
        if(list== null){
            return null;
        }
        SinglyLinkedList.Node current  = list.getHeadNode();
        int len = 0, counter =1;

        while(current != null){
            len ++;
            current = current.nextNode;
        }
        int new_index = len-n+1;
        current = list.getHeadNode();

        while(current != null){
            if(counter == new_index){
                return current.data;
            }
            current = current.nextNode;
            counter++;
        }
        return null;
    }
}
