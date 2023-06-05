public class Main {

    /*
    === CRIAÇÃO/CHAMADA DE MÉTODOS E TIPAGENS ===
    */

    // Método estático
    static String staticShowHelloWorld() {
        return "Hello World!";
    }

    // Método público
    public String publicShowHelloWorld() {
        return "Hello World!";
    }


    /*
    === PARÂMETROS E RETORNO ===
    */

    static int sumNumbers(int n1, int n2) {
        System.out.println("Método 1 chamado");
        return n1 + n2;
    }


    /*
    === METHOD OVERLOADING ===
    */

    // Mesmo método, só que com 3 parâmetros
    static int sumNumbers(int n1, int n2, int n3) {
        System.out.println("Método 2 chamado");
        return n1 + n2 + n3;
    }

    // Mesmo método, só que com 1 parâmetro
    static int sumNumbers(int n1) {
        System.out.println("Método 3 chamado");
        return n1;
    }


    /*
    === RECURSÃO ===
    */

    static void counter(int value) {
        System.out.println(value);

        if(value <= 10) {
            counter(value + 1);
        } else {
            System.out.println("ENCERREI!");
        }
    }

    public static void main(String[] args) {
        /*
        === CRIAÇÃO/CHAMADA DE MÉTODOS E TIPAGENS ===
        */

        // Chamadas de método estático
        System.out.println(staticShowHelloWorld()); // >> Hello World!
        System.out.println(Main.staticShowHelloWorld()); // >> Hello World!

        // Chamada de método público
        Main main = new Main();
        System.out.println(main.publicShowHelloWorld()); // >> Hello World!


        /*
        === PARÂMETROS E RETORNO ===
        */

        // Chamada de método com parâmetros
        System.out.println(sumNumbers(1, 2)); // >> 3


        /*
        === ESCOPOS ===
        */

        sumNumbers(1, 2);
        // Não é possível acessar essa variável
        System.out.println(n1);

        if (sumNumbers(1, 2) == 3) {
            int numberInsideIf = 3;
        }
        // Não é possível acessar essa variável
        System.out.println(numberInsideTheIf);

        int numberOutsideTheIf = 0;
        if (sumNumbers(1, 2) == 3) {
            numberOutsideTheIf = 3;
        }
        // Agora é possível acessar essa variável
        System.out.println(numberOutsideTheIf); // >> 3


        /*
        === METHOD OVERLOADING ===
        */

        // Chamando o segundo método sumNumbers
        System.out.println(sumNumbers(1, 2, 3)); // >> 6

        // Chamando o terceiro método sumNumbers
        System.out.println(sumNumbers(1)); // >> 1


        /*
        === RECURSÃO ===
        */

        // Começará a contagem a partir do 0
        counter(0); // >> 0
                          // >> 1
                          // >> 2
                          // >> 3
                          // >> 4
                          // >> 5
                          // >> 6
                          // >> 7
                          // >> 8
                          // >> 9
                          // >> 10
                          // >> 11
                          // >> ENCERREI!

        // Começará a contagem a partir do 5
        counter(5); // >> 5
                          // >> 6
                          // >> 7
                          // >> 8
                          // >> 9
                          // >> 10
                          // >> 11
                          // >> ENCERREI!
    }

}
