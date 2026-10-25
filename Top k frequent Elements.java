import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] nums = {1, 4, 1, 2, 1, 4, 3, 1, 3, 3};
        int k = 2;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i : nums){
            freq.put(i,freq.getOrDefault(i,0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(

                (a,b) -> freq.get(a) - freq.get(b)
        );
        for(int j: freq.keySet()){
            pq.offer(j);
            if(pq.size() > k){
                pq.poll();
            }
        }
        System.out.println(pq.toString());

    }
}