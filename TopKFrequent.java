import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
           map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry entry: map.entrySet()){
            pq.add(entry);
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++){
            result[i] = pq.poll().getKey();
        }
       return result;
    }

    public int topKthFrequent(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry entry: map.entrySet()){
            pq.add(entry);
        }
        for (int i = 0; i < k; i++){
            pq.poll().getKey();
        }
        return pq.poll().getKey();
    }

    public static void main(String[] args) {
        TopKFrequent k = new TopKFrequent();
        int[] a = {1, 1, 1, 2, 2, 3};
        System.out.println(Arrays.toString(k.topKFrequent(a, 2)));

        int[] b = {3, 2, 1, 5, 6, 4};
        System.out.println(k.topKthFrequent(b, 2));
    }
}
