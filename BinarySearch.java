public class BinarySearch {

    public int binarySearch(int[] nums, int key){
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;
        while(low <= high ){
            if (nums[mid] == key){
                return nums[mid];
            }else if (nums[mid] < key){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
