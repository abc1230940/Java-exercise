public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c';

    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...
    int index = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        System.out.println("Found.");
        index = i;
      } else {
        System.out.println("Not Found.");
      }
    }
    System.out.println("The index of the last character of c is " + index);
  }
}
