package study.algorithm.sort;

/**
 * @author heqingqing
 * @Description: 冒泡排序
 * @date 2019/6/16 16:51
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] beSort) {

        for (int i=0;i<beSort.length-1;i++){
            for(int j=i+1;j<beSort.length-i;j++){
                if(beSort[j-1]>beSort[j]){
                    swap(beSort,j-1,j);
                }
            }
        }
        return beSort;
    }

    public static void swap(int[] beSort, int i, int j) {
        int val = beSort[i];
        beSort[i] = beSort[j];
        beSort[j] = val;
    }

    public static void sort(int[] nums){
        int N = nums.length;
        boolean isSorted = false;
        for(int i= N-1;i>0&&!isSorted;i--){
            isSorted = true;
            for(int j=0;j<i;j++){
                if(nums[j+1]<nums[j]){
                    isSorted =false;
                    swap(nums,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] beSort = {1,2,4,4,3,2,6};
        bubbleSort(beSort);
        for(int i:beSort){
            System.out.print(i);
        }
    }
}
