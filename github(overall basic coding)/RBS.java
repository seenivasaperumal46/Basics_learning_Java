public class RBS {
    public static void main(String[] args) {
        int[] arr ={1,2,43,54,67,76,98};
        int target =67;
        System.out.println(ans(arr,target,0,arr.length-1));
    }
    static int ans(int[] arr, int target, int  s, int e){
        if(s>e){
            return -1;
        }
        int m=s+(e+s)/2;
        if(arr[m]==target){
            return m;
        }
        else if (arr[m]<target) {
            return ans(arr,target,m+1,arr.length-1);
        }
        return ans(arr,target,0,m-1);
    }
}
