class EncapsulationDemo{
private int i;
public int geti()
{
return i;
}
public void seti(int newvalue)
{
i=newvalue;
}
}

class Test{
public static void main(String[] args)
{
EncapsulationDemo obj=new EncapsulationDemo();
obj.seti(156);
System.out.println("i value" +obj.geti());
}}
