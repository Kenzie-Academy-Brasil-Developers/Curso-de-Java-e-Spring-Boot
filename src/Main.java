import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        /*
        === "CONSOLE.LOG()" E COMENTÁRIOS ===
        */

        // Log com quebra de linha
        System.out.println("Hello world!"); // >> Hello world!

        // Log sem quebra de linha
        System.out.print("Hello world!");
        System.out.print("Hello world!"); // >> Hello world!Hello world!

        // Comentário de uma linha
        /*
        * Comentário de
        * múltiplas linhas
        * */


        /*
        === TIPOS DE DADOS E DECLARAÇÃO DE VARIÁVEIS ===
        */

        String myString = "Batata";
        char myChar = 'b';

        // Multideclaração de variáveis
        int myNumber = 10, myOtherNumber = 15;

        // Atribuição de um mesmo valor a múltiplas variáveis
        float myFloatNumber, myOtherFloatNumber;
        myFloatNumber = myOtherFloatNumber = 2.5f;

        System.out.println(myString); // >> Batata
        System.out.println(myChar); // >> b

        System.out.println(myNumber); // >> 10
        System.out.println(myOtherNumber); // >> 15

        System.out.println(myFloatNumber); // >> 2.5
        System.out.println(myOtherFloatNumber); // >> 2.5

        // NÃO é possível ter um log dessa forma!
        System.out.println(myNumber, myOtherNumber);


        /*
        === VETORES ===
        */

        // Array de tamanho fixo
        String[] myArray = {"Batata", "Banana", "Cenoura"};

        System.out.println(myArray); // >> [Ljava.lang.String;@4f3f5b24
        System.out.println(Arrays.stream(myArray).toArray()); // >> [Batata, Banana, Cenoura]
        System.out.println(myArray[0]); // >> Batata

        // Array de tamanho variável
        ArrayList<String> myArrayList = new ArrayList<>();

        myArrayList.add("Batata");
        myArrayList.add("Banana");
        myArrayList.add("Cenoura");

        System.out.println(myArrayList); // >> [Batata, Banana, Cenoura]
        System.out.println(myArrayList.get(0)); // >> Batata


        /*
        === "OBJETOS" ===
        */

        HashMap<String, String> myHashMap = new HashMap<>();

        myHashMap.put("bat", "Batata");
        myHashMap.put("ban", "Banana");
        myHashMap.put("cen", "Cenoura");

        System.out.println(myArrayList); // >> [cen=Cenoura, bat=Batata, ban=Banana]
        System.out.println(myHashMap.get("ban")); // >> Banana


        /*
        === ESTRUTURA CONDICIONAL ===
        */

        // Usando else if
        if (myArrayList.size() == 0) {
            System.out.println("Array vazio!");
        } else if (myArrayList.size() != 0) {
            System.out.println("Array NÃO vazio!");  // >> Array NÃO vazio!
        }

        // Usando else
        if (myArrayList.size() == 0) {
            System.out.println("Array vazio!");
        } else {
            System.out.println("Array NÃO vazio!"); // >> Array NÃO vazio!
        }

        // Usando ternário
        System.out.println(myArrayList.size() == 0 ? "Array vazio!" : "Array NÃO vazio!"); // >> Array NÃO vazio!
        System.out.println(myArrayList.isEmpty() ? "Array vazio!" : "Array NÃO vazio!"); // >> Array NÃO vazio!


        /*
        === ESTRUTURA DE REPETIÇÃO ===
        */

        // Percorrendo um ArrayList com for
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i)); // >> Batata
                                                    // >> Banana
                                                    // >> Cenoura
        }

        // Percorrendo um ArrayList com foreach
        for (String item : myArrayList) {
            System.out.println(item); // >> Batata
                                      // >> Banana
                                      // >> Cenoura
        }
    }

}
