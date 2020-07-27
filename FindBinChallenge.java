//Generate Binary Numbers from 1 to n using a Queue
//sample input: n = 3
//Sample output: result = {"1","10","11"}

class FindBinChallenge {
    public static String[] findBin(int number) {
        String[] result = new String[number];
        Queue<String> queue = new Queue<String>(number + 1);

        queue.enqueue("1");

        for (int i = 0; i < number; i++) {
            result[i] = queue.dequeue();
            String s1 = result[i] + "0";
            String s2 = result[i] + "1";
            queue.enqueue(s1);
            queue.enqueue(s2);
        }

        return result;
    }
}
