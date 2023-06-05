import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        === ENCAPSULAMENTO (GET E SET) ===
        */

        System.out.println(AnotherClass.staticRReturnHelloWorld()); // >> Hello World!
        System.out.println(AnotherClass.staticName); // >> Juliana

        // NÃO é possível acessar um método/atributo não estático sem instanciar a classe
        System.out.println(AnotherClass.returnHelloWorld());
        System.out.println(AnotherClass.name);

        // Instanciando uma classe
        AnotherClass anotherClass = new AnotherClass();

        // Agora é possível acessar o método/atributo não estático!
        System.out.println(anotherClass.returnHelloWorld()); // >> Hello World!
        System.out.println(anotherClass.name); // >> Juliana

        // NÃO é possível acessar/modificar um atributo privado diretamente
        System.out.println(anotherClass.privateName);
        anotherClass.privateName = "Não mais Juliana";

        // Por isso dos getters e setters
        System.out.println(anotherClass.getPrivateName()); // >> Juliana
        anotherClass.setPrivateName("Não mais Juliana");
        System.out.println(anotherClass.getPrivateName()); // >> Não mais Juliana

        // Com um construtor, agora a classe precisa ser instanciada com valores
        AnotherClass myAnotherClass = new AnotherClass("João");

        System.out.println(myAnotherClass.getPrivateName()); // >> João
        myAnotherClass.setPrivateName("Não mais João");
        System.out.println(myAnotherClass.getPrivateName()); // >> Não mais João
        System.out.println(myAnotherClass.returnHelloWorld()); // >> Hello World!


        /*
        === HERANÇA ===
        */

        SubClass subClass = new SubClass("Maria", 18);

        System.out.println(subClass.getPrivateName()); // >> Maria
        System.out.println(subClass.getAge()); // >> 18
        System.out.println(subClass.returnHelloWorld()); // >> Hello World da SubClass!


        /*
        === ABSTRAÇÃO ===
        */

        // NÃO é possível instanciar uma classe abstrata!
        AbstractClass abstractClass = new AbstractClass();

        ExtendedClass extendedClass = new ExtendedClass();

        extendedClass.showHelloWorld(); // >> Hello World!
        extendedClass.showOlaMundo(); // >> Olá Mundo!


        /*
        === INTERFACES ===
        */

        ImplementedClass implementedClass = new ImplementedClass();

        implementedClass.sayMyName("Walter"); // >> Walter
        implementedClass.notSayMyName("Walter"); // >> NO!


        /*
        === INPUT DE USUÁRIO ===
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your input: ");
        // Lerá uma String do usuário via terminal!
        String userInput = scanner.nextLine();

        System.out.print("The USER INPUT was " + userInput);
    }

}
