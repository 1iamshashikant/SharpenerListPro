public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={-9,-8,0,1,2,3,5,6,7,9};
        int target=9;
        int output =main(arr,target);
        System.out.println(output);

    }

    public static int main(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }


            if (arr[mid] > target) {

                end = mid - 1;


            }
            if (arr[mid] < target) {
                start = mid + 1;

            }
            if(arr[start]==target){
                return start;
            }
            if (arr[end]==target) {
                return end;

            }


        }
        return -1;
    }

}
