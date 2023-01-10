import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
  public static void main(String[] args) {
    HashSet<String> hs = new HashSet<>();
    hs.add("Rachit"); // adding elements
    hs.add("Amit");
    hs.add("jack");
    Iterator<String> itr = hs.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
