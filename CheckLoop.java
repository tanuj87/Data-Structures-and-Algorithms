class CheckLoop {
    //Detects loop in the given linked list
    public static <T> boolean detectLoop(SinglyLinkedList<T> list) {
        SinglyLinkedList<T>.Node current = list.headNode; //firstElement
        HashSet<SinglyLinkedList<T>.Node> nodesHashSet = new HashSet<SinglyLinkedList<T>.Node>();
        boolean loop = false;
        while(current != null){
            if(nodesHashSet.add(current)){
                current = current.nextNode;
            }                
            else{
                loop = true;
                break;
            }                
            
        }        
        return loop;
    }
}
