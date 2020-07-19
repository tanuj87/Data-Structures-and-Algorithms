class CheckUnionIntersection {
    //performs union of two lists
    public static <T> SinglyLinkedList<T> union(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        SinglyLinkedList<T> result = new SinglyLinkedList<T>();
        if (list1.isEmpty())
            return list2;
        if (list2.isEmpty())
            return list1;
        SinglyLinkedList<T>.Node current1 = list1.getHeadNode();
        SinglyLinkedList<T>.Node current2 = list2.getHeadNode();

        while(current1.nextNode != null){
            current1 = current1.nextNode;
        }
        current1.nextNode = list2.getHeadNode();
        
        list1.removeDuplicatesWithHashing();
        return list1;
    }
    
    //performs intersection between list
    public static <T> SinglyLinkedList<T> intersection(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        SinglyLinkedList<T> result = new SinglyLinkedList<T>();
        if (list1.isEmpty())
            return list2;
        if (list2.isEmpty())
            return list1;
        SinglyLinkedList<T>.Node current1 = list1.getHeadNode();
        SinglyLinkedList<T>.Node current2 = list2.getHeadNode();
        SinglyLinkedList<T>.Node current3 = result.getHeadNode();

        boolean firstElement = true;

        while(current1 != null){
            current2 = list2.getHeadNode();
            while(current2 != null){
                if(current1.data.equals(current2.data)){
                    if(firstElement == true){
                        firstElement = false;
                        result.setHeadNode(current1);
                        current3 = current1;
                        current3.nextNode = null;
                        current3 = current3.nextNode;
                    }
                    else{
                    current3 = current1;
                    current3.nextNode = null;
                    current3 = current3.nextNode;
                    }
                }
                current2= current2.nextNode;
            }
            current1 = current1.nextNode;
        }
        return result;
    }
}
