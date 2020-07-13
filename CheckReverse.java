class CheckReverse {
	public static <T> void reverse(SinglyLinkedList<T> list){
        //Write -- Your -- Code
        SinglyLinkedList<T>.Node prev = null; //To keep track of the previous element, will be used in swapping links
		SinglyLinkedList<T>.Node current = list.headNode; //firstElement
		SinglyLinkedList<T>.Node next = current.nextNode;

        // Node headNode = list.headNode;
        
        // Node current = headNode;
        // Node prev= null;
        // Node next = current.nextNode;

        while(next != null){
            current.nextNode = prev;
            prev = current;
            current = next;
            next = current.nextNode;
        }
        current.nextNode = prev;
        list.headNode = current;
    }
}
