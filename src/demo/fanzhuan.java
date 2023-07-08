package demo;

public class fanzhuan {
    public static void main(String[] args) {
        int[] arr = {50,38,49,38,31};
        reverse(arr);
        printarr(arr);

    }
    public static void reverse(int[] arr){
        for(int start = 0,end = arr.length - 1;start<end;start++,end--){
            int tem = arr[start];
            arr[start] = arr[end];
            arr[end] = tem;
        }
    }
    public static void printarr(int[] arr){
        for(int x =0;x < arr.length;x++){
            System.out.print(arr[x]+",");
        }
    }
}
