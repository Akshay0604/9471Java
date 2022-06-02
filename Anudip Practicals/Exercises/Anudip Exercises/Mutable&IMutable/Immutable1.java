public final class Immutable1 {
private String name;
Immutable1 (String name) {
this.name = name;
}
public String getName() {
return name;
}

public static void main(String[] args) {
Immutable1 obj = new Immutable1("hello");
System.out.println(obj.getName());
//obj.setName("new hello");
//System.out.println(obj.getName());
}

}

//Output: hello
