class ReverseKChallenge {
    public static <V> void reverseK(Queue<V> queue, int k) {
       if(queue == null){
            return;
        }
        if(k ==0){
            return;
        }
        int maxSize = queue.getMaxSize();
        int queue2_size = maxSize - k;
        Stack<V> stack1 = new Stack<V>(k);
        Queue<V> queue1 = new Queue<V>(queue2_size);

        for(int i=0; i<k; i++){
            stack1.push(queue.dequeue());
        }
        for(int i=0; i<k; i++){
            queue.enqueue(stack1.pop());
        }
        for(int j=k; j<maxSize-1; j++){
            queue.enqueue(queue.dequeue());
        }
    }

}
