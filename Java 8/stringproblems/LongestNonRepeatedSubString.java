public class LongestNonRepeatedSubString {
  
  private static int getLongestNonRepeatedStringLength(String givenString) {
    
    String temp = "";
    int requiredLength = -1;
    
    if(givenString.length() == 0) {
      return 0;
    }
    if(givenString.length() == 1) {
      return 1;
    }
    for(char ch : givenString)  {
      String str = String.valueOf(ch);
      if(temp.contains(str)) {
        temp = temp.substring(temp.indexOf(str) + 1);
      }
      temp = temp + String.valueOf(ch);
      requiredLength = Math.max(temp.length(), requiredLength);
    }
    return requiredLength;
  }
  
  public static void main(String[] args) {
    System.out.println(getLongestNonRepeatedStringLength( "ABDEFGABEF" )); //prints the output as 6. because the length of non repeated characters in the given string are 
                                                                           // BDEFGA and DEFGAB
  }
}
