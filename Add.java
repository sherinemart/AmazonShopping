public class Add
{

 static float add(float a,float b,float c)
{
  return a+b+c;
}
 static float add(float a,float b)
{
  return a+b;
}
  
 static int add(int a,int b,int c)
{
  return a+b+c;
}
  
  public static void main(String args[])
{
  Add a=new Add();
 // System.out.println(a.add(2,4));
  //System.out.println(a.add(4,6,7));
  
  System.out.println(Add.add(2.5f,4.8f,6.7f));
  System.out.println(Add.add(4,6,7));
  System.out.println(Add.add(4.5f,6.4f));
}
}

