import java.util.LinkedList;
  public class LinkedList1 {
  public static void main(String[] args) {
     LinkedList<String> l_list = new LinkedList<String>();
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("White");
          l_list.add("Pink");
          l_list.add("Yellow");
	
   System.out.println("The linked list: " + l_list);
   }
}

/*
OUTPUT
The linked list: [Red, Green, Black, White, Pink, Yellow]
*/