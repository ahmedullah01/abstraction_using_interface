//no allowed any nonabstract function
interface Animal {
    //here the propertie is fixed
    //mean int i = 12;
    //method are abstract and also a public
void walk();
void eat();
}
//here we learn the new type of inheritence bcz this class is not use in classes and oject but it use in abstactrion

interface  herbivore{
    void eatsgrass();
}
class horsesectype implements  Animal , herbivore {
    @Override
    public void eat() {
        System.out.println("eating  ");
    }

    public void eatsgrass() {
        System.out.println("eating grass");
    }

    public void walk() {
        System.out.println("walking");
    }
}



// class horse implements  Animal{
//public void  walk(){
//         System.out.println("walking");
//     }
//  public   void eat(){
//         System.out.println("eating");
//
//     }
//}
public class Main {
    public static void main(String[] args) {
//horse one = new horse();
//one.eat();
//one.walk();
    horsesectype one = new horsesectype();
    one.eat();
    one.walk();
    one.eatsgrass();
    }
}