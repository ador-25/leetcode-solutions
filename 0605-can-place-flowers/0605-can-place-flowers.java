class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1){
            if(n==0){
                return true;
            }
            if (n==1){
                return flowerbed[0]==0;
            }
            return false;
        }

        int lastIndex = flowerbed.length-1,firstIndex= 0;
        int count =0;
        for (int i=0;i<flowerbed.length;i++){
            // prev and next are 0 and arr[i]==1
            int nextIndex = i+1;
            int previousIndex = i-1;
            if (flowerbed[i]==1){
                continue;
            }
            if (i==firstIndex){
                if (flowerbed[nextIndex]==0){
                    flowerbed[i]++;
                    count++;
                }
                continue;
            }
            if (i==lastIndex){
                if (flowerbed[previousIndex]==0){
                    flowerbed[i]++;
                    count++;
                }
                continue;
            }

            if (flowerbed[previousIndex]==0 && flowerbed[nextIndex]==0){
                flowerbed[i]++;
                count++;
            }

        }

        return count >= n;
    }
}