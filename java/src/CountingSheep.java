public class CountingSheep {
    
    public static int countSheeps(Boolean[] arrayOfSheeps) {
      int count = 0;
      
      for (Boolean b : arrayOfSheeps) {
        if (b != null && b) count++;
      }
      
      return count;
    }

    public static void main(String[] args) {
        Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true };

        System.out.println(countSheeps(array1));    
    } 
}