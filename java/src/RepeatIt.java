public class RepeatIt {

  public static String repeatString(final Object toRepeat, final int n) {
    String str = "";
    int i = 0;

    if (toRepeat instanceof String) {
      while (i < n) {
        str += toRepeat;
        i++;
      } 
    } else {
        str = "Not a string";
    }
    
    return str;
  }
