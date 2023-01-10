import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("Jack");
    al.add("Tyler");

    Iterator<String> itr = al.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}