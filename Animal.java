class Animal
{
 void eat()
{
  System.out.println("Eating");
}
}
class Dog extends Animal
{
 void bark()
  {
    super.eat();
    System.out.println("Barking");
   }

} 

class Cat extends Animal
{
 void meow()
  {
    System.out.println("Meowing...");
   }

} 


class Test
{
public static void main(String args[])
{

Cat c=new Cat();
c.eat();
//c.bark();// CT Error
c.meow();
Dog d=new Dog();
d.bark();
d.eat();


}
}