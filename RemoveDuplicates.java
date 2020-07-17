class RemoveDuplicatesChallenge {
    public static <T> void removeDuplicates(SinglyLinkedList<T> list) {
        if(list == null){
            return;
        }
        SinglyLinkedList<T>.Node prev = list.headNode;
        SinglyLinkedList<T>.Node current = list.headNode;
        HashSet<T> hs = new HashSet<T>();

        while(current!= null){
            if(hs.add(current.data)){
                prev = current;
            }
            else{
                prev.nextNode = current.nextNode;
            }
            current = current.nextNode;
        }
    }
}
