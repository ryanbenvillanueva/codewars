public class TakeTheFirstElements {
    public static int[] take(int[] arr, int n) {
      
      if (arr.length == 0) {
        int[] newArr = arr;
        return newArr;
      }
      
      if (arr.length < n) n = arr.length;
      
      int[] newArr = new int[n];
      for (int i = 0; i < n; i++) {
        newArr[i] = arr[i];
      }
      
      return newArr;
    }
  }