import java.util.*;
public class ArrayList1 {
  public static void main(String[] args) {
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Green");
  list_Strings.add("Orange");
  list_Strings.add("White");
  list_Strings.add("Black");
  System.out.println(list_Strings);
  Iterator<String> itrIterable=list_Strings.iterator();
  while (itrIterable.hasNext()) {
	System.out.println(itrIterable.next());
}
 }
}

/*OUTPUT:
[Red, Green, Orange, White, Black]
Red
Green
Orange
White
Black
*/