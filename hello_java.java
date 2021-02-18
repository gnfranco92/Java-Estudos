class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
        System.out.println("------------------------------");

        // Declarando Variáveis
        // String - Texto
        // byte - números inteiros ( -128 até 127 - "valores pequenos"
        // int - números interios 
        // long - Números 
        // float - números decimais (1.321685416 até 7 casas decimais) - Lembrete: "f no final"
        // double - números decimais (1.321685416 até 15 casas decimais)
        // boolean - valores booleanos - true or false 

        String nome = "Guilherme Neto Franco";
        System.out.print("Nome declarado: ");
        System.out.println(nome);
        System.out.println("------------------------------");

        Float preco = 1.20f; // Float deve tem o f no final
        System.out.print("R$ ");
        System.out.println(preco);
        System.out.println("------------------------------");

        Double preco2 = 25.8762138; 
        System.out.print("R$ ");
        System.out.println(preco2);
        System.out.println("------------------------------");

        Boolean verdadeiro =  true;
        System.out.println(verdadeiro);
        Boolean falso =  false;
        System.out.println(falso);


    }


}