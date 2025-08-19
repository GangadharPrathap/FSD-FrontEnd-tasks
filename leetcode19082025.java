package tasks;

public class leetcode19082025 {
    public static void main(int[] nums) {
    long ans = 0;
    int cnt = 0;
    for (int num : nums) {
        if (num == 0) {
            cnt++;
        } else {
            ans += (long) cnt * (cnt + 1) / 2;
            cnt = 0;
        }
    }
    ans += (long) cnt * (cnt + 1) / 2;
    System.out.println(ans);
    }
}
