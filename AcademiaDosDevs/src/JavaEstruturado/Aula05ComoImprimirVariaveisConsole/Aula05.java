package JavaEstruturado.Aula05ComoImprimirVariaveisConsole;

public class Aula05 {
    public static void main(String[] args) {
        String filme = "Vingadores"; // fortat: %s
        int ano = 2015; // format: %d
        char letraInicial ='V'; //format: %c
        boolean foiSucesso = true; // format: %b
            // criando as variaves, definindo o tipo e o valor delas
        
        System.out.println("O nome do filme é:" + filme);
        System.out.println("A ano de lançamento foi: " + ano);
        System.out.println("A letra inicial é: " + letraInicial);
        System.out.println("O filme foi um sucesso? " + foiSucesso);
            // imprimindo strings junto com as variaveis

        System.out.println("");

        System.out.println("O nome do filme é " + filme + ", ele foi lançado em " + ano + 
        ", sua leta inicial é " + letraInicial + ", e ele foi um sucesso? " + foiSucesso);
            // imprimindo mais de uma string e variavel no mesmo comando
        
        System.out.println("");

        System.out.format("O nome do filme é %s, ele foi lançado em %d, sua primeira letra é %c, e foi um sucesso? %b \n"
        , filme, ano, letraInicial, foiSucesso);
            // imprimindo strings com variaveis usando format

        String texto = "O nome do filme é " + filme + ", ele foi lançado em " + ano + 
        ", sua leta inicial é " + letraInicial + ", e ele foi um sucesso? " + foiSucesso;
            // criando uma variavel que a a concatenação das variaveis acima com strings
        
        String texto2 = String.format("O nome do filme é %s, ele foi lançado em %d, sua primeira letra é %c, e foi um sucesso? %b \n"
        , filme, ano, letraInicial, foiSucesso);
            // criando uma variavel que a a concatenação das variaveis acima com strings porem com .format

        System.out.println(texto);
        System.out.println("");
        System.out.println(texto2);
    }
}
