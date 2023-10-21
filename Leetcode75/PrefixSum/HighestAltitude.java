package Leetcode75.PrefixSum;

public class HighestAltitude {
    public static void main(String[] args) {
        HighestAltitude new1 = new HighestAltitude();
        int[] gain = new int[]{-5,1,5,0,-7};
        System.out.println(new1.largestAltitude(gain));
    }

    public int largestAltitude(int[] gain) {
        int sum = 0, largest = 0;
        for (int i: gain) {
            sum+=i;
            largest = Math.max(sum, largest);
        }

        return largest;
    }
}
