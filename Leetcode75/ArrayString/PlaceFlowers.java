package Leetcode75.ArrayString;

public class PlaceFlowers {
    public static void main(String[] args) {
        PlaceFlowers new1 = new PlaceFlowers();
        int[] flowerbed = new int[]{1,0,0,0,1,0,1};
        int flower = 2;
        boolean canPlace = new1.canPlaceFlowers(flowerbed, flower);
        System.out.println(canPlace);
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n--;
                if(n == 0) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
