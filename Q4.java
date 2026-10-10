import java.util.HashMap;
import java.util.Map;
public class Q4 {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        frequency.put(0, 1);
        int sum = 0, count = 0;
        for (int value : nums) {
            sum += value;
            count += frequency.getOrDefault(sum - k, 0);
            frequency.put(sum, frequency.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1}, 2));
        System.out.println(subarraySum(new int[]{1,-1,0}, 0));
    }
}
