import java.util.*;

public class LeetCode2349 {
    private Map<Integer, PriorityQueue<Integer>> res;
    private Map<Integer, Integer> index_val;

    public LeetCode2349(){
        res = new HashMap<>();
        index_val = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if (index_val.containsKey(index)) {
            int prevNum = index_val.get(index);
            if (prevNum == number) return;
            res.get(prevNum).remove(index);
        }

        res.computeIfAbsent(number, PriorityQueue::new).offer(index);
        index_val.put(index, number);
    }
    
    public int find(int number) {
        PriorityQueue<Integer> pq = res.getOrDefault(number, new PriorityQueue<>());
        return pq.isEmpty() ? -1 : pq.peek();
    }

    public static void main(String[] args) {
        LeetCode2349 obj = new LeetCode2349();
        System.out.println(obj.find(10)); // Output: -1
        obj.change(2, 10);
        obj.change(1, 10);
        obj.change(3, 10);
        obj.change(5, 10);
        System.out.println(obj.find(10)); // Output: 1
        obj.change(1, 20);
        System.out.println(obj.find(10)); // Output: 2
    }
}
