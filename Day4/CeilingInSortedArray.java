public class CeilingInSortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,8,10,10,12,19};
        int x =29;
        int index1 = ceilSearch(a,x);
        int index2 = floorSearch(a,x);
        if(index1 == -1)
            System.out.println("Ceiling of "+x+" doesn't exist in array");
        else
            System.out.println("ceiling of "+x+" is "+a[index1]);

        if(index2 == -1)
            System.out.println("Floor of "+x+" doesn't exist in array");
        else
            System.out.println("Floor of "+x+" is "+a[index2]);
    }
    public static int ceilSearch(int[] arr, int x){
        if(arr[0]>=x){
            return 0;
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==x)
                return i;
            else if(arr[i] < x && arr[i+1] >=x){
                return i+1;
            }
        }
        return -1;
    }
    public static int floorSearch(int[] arr, int x){
        if(arr[arr.length-1] <= x )
            return arr.length-1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==x)
                return i;
            else if (arr[i]<=x && arr[i+1]>x) {
                return i;
            }
        }
        return -1;
    }

}
