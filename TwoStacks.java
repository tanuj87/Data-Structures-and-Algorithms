class TwoStacks<V> {
    private int maxSize;
    private V[] array;
    private int top1;
    private int top2;

    @SuppressWarnings("unchecked")
    public TwoStacks(int max_size) {
        this.maxSize = max_size;
        this.top1 = -1; //intitally when stack1 is empty
        this.top2 = max_size; //intitally when stack2 is empty
        array = (V[]) new Object[max_size];//type casting Object[] to V[]
    }

    //insert at top of first stack
    public void push1(V value) {
        if((top1 == (maxSize/2)-1)){
            return;
        }
        array[++top1] = value;
    }

    //insert at top of second stack
    public void push2(V value) {
        if((top2 == (maxSize/2))){
            return;
        }
        array[--top2] = value;
    }

    //remove and return value from top of first stack
    public V pop1() {
        if(top1 == -1){
            return null;
        }
        return array[top1--];
    }

    //remove and return value from top of second stack
    public V pop2() {
        if(top2 == maxSize-1){
            return null;
        }
        return array[top2++];
    }
}
