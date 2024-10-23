import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
  public boolean isIsomorphic(String s, String t) {
    Map<Character, Integer> charToIndex_s = new HashMap<>();
    Map<Character, Integer> charToIndex_t = new HashMap<>();

    for (Integer i = 0; i < s.length(); ++i) {
      if (charToIndex_s.put(s.charAt(i), i) != charToIndex_t.put(t.charAt(i), i))
        return false;
    }

    return true;
  }

  public static void main(String[] args) {
    IsomorphicString isomorphic = new IsomorphicString();
    
    String s1 = "egg";
    String t1 = "add";
    System.out.println(s1 + " and " + t1 + " are isomorphic: " + isomorphic.isIsomorphic(s1, t1));
    
    String s2 = "foo";
    String t2 = "bar";
    System.out.println(s2 + " and " + t2 + " are isomorphic: " + isomorphic.isIsomorphic(s2, t2));
    
    String s3 = "paper";
    String t3 = "title";
    System.out.println(s3 + " and " + t3 + " are isomorphic: " + isomorphic.isIsomorphic(s3, t3));
  }
}
