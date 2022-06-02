public class Mutable1 {
private String name;
Mutable1(String name) {
this.name = name;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public static void main(String[] args) {
Mutable1 obj = new Mutable1("hello1");
System.out.println(obj.getName());

obj.setName("new hello1");
System.out.println(obj.getName());
}
}

/*Output:
hello1
new hello1 */
