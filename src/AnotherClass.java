public class AnotherClass {

    /*
    === ENCAPSULAMENTO (GET E SET) ===
    */

    // --- Default ---
    String name = "Juliana";

    String returnHelloWorld() {
        return "Hello World!";
    }

    // --- Estáticos ---
    static String staticName = "Juliana";

    static String staticRReturnHelloWorld() {
        return "Hello World!";
    }

    // --- Privados ---
    private String privateName = "Juliana";

    // Método para ser usado somente dentro dessa classe!
    static String privateReturnHelloWorld() {
        return "Hello World!";
    }

    // --- Getters e Setters para atributos privados ---
    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }

    // --- Construtor ---
    public AnotherClass(String privateName) {
        this.privateName = privateName;
    }

    // --- Final ---
    private final String privateFinalName = "Juliana";

    // Atributos finais não podem ser modificados, por isso não possui setter!
    public String getPrivateFinalName() {
        return privateFinalName;
    }
}


/*
=== HERANÇA ===
*/

class SubClass extends AnotherClass {

    private int age;

    public SubClass(String privateName, int age) {
        super(privateName);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    === POLIMORFISMO ===
    */

    // Modificando o comportamento de um método da classe pai!
    String returnHelloWorld() {
        return "Hello World da SubClass!";
    }

}


/*
=== ABSTRAÇÃO ===
*/

abstract class AbstractClass {

    public void showHelloWorld() {
        System.out.println("Hello World!");
    }

    // Métodos abstratos NÃO podem ter body na classe abstrata!
    public abstract void showOlaMundo() {

    }

    public abstract void showOlaMundo();

}


/*
=== ABSTRAÇÃO ===
*/

abstract class AbstractClass {

    public void showHelloWorld() {
        System.out.println("Hello World!");
    }

    // Métodos abstratos NÃO podem ter body na classe abstrata!
    public abstract void showOlaMundo() {

    }

    public abstract void showOlaMundo();

}

class ExtendedClass extends AbstractClass {

    public void showOlaMundo() {
        System.out.println("Olá Mundo!");
    }

}


/*
=== INTERFACES ===
*/

// As interfaces seguem a mesma ideia das abstract classes!
interface Interface {

    public void sayMyName(String name);

}

interface AnotherInterface {

    public void notSayMyName(String name);

}

// Com o uso de interfaces é possível implementar múltiplas interfaces em uma classe!
class ImplementedClass implements Interface, AnotherInterface {

    public void sayMyName(String name) {
        System.out.println(name);
    }

    public void notSayMyName(String name) {
        System.out.println("NO!");
    }

}


/*
=== MODIFICADORES ===
*/

final class FinalClass {

}

// NÃO é possível estender uma classe definida como final!
class Banana extends FinalClass {

}