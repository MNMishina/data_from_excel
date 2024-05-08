/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed
 * by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 * <p>
 * Example 1:
 * * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * <p>
 * Example 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * <p>
 * Example 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
package leetCode.explore;

public class RansomNote {
  public boolean canConstruct(String ransomNote, String magazine) {
    for (int i = 0; i < ransomNote.length(); i++) {
      char r = ransomNote.charAt(i);

      // int matchingIndex = -1;
//      for (int j = 0; j<magazine.length(); j++) {
//        char m = magazine.charAt(j);
//
//        if (m == r) {
//          matchingIndex = j;
//        }
      int matchingIndex = magazine.indexOf(r);

      if (matchingIndex == -1) {
        return false;
      }
      magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
    }
    return true;
  }
}
class RansomNoteTest {
  public static void main(String[] args) {
    RansomNote rn = new RansomNote();
    System.out.println(rn.canConstruct("aa", "aab"));
  }
}
