package chap03;

public class Dog {
    String name;
    public static void main(String[] args) {

        // make a dog object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";
        
        // make a dog array
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        
        // access the Dogs using the array references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        
        // Since myDogs[2] is nameless, we give it a name. 
        System.out.print("last don't name is ");
        System.out.println(myDogs[2].name);
        
        // loop through the array and tell all of the dogs to bark.
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x+1;
        }
    }

    
    public void bark() {
        System.out.println(name + " says Ruff!");
    }
    
    public void eat() { }
    
    public void chaseCat() { }
}
