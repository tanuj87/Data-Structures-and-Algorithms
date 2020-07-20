class PalindromeChallenge {
    public static <T> boolean isPalindrome(DoublyLinkedList<T> list) {
        if(list == null)
            return false;
        int length = list.getSize();
        if(length == 1)
            return true;
        if(length ==0)
            return false;
        DoublyLinkedList.Node header = list.getHeadNode();
        DoublyLinkedList.Node tailer = list.getTailNode();

        int i = 1;
        int j = length;

        while(i<=j){
            if(header.data == tailer.data){
                i++;
                j--;
                tailer = tailer.prevNode;
                header = header.nextNode;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
