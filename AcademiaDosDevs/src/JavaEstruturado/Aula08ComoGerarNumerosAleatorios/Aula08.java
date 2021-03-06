package JavaEstruturado.Aula08ComoGerarNumerosAleatorios;

import java.util.Random;

import javax.swing.JOptionPane;

public class Aula08 {
    public static void main(String[] args) {
        double dado6Lados = 1 + (int) (Math.random() * 6); /*o metodo .random gera um número double aleatório entre 0 e 1
        nesse comando estou somando +1 para que o valor minimo seja 1, transformando em int para ter número inteiros
        e multiplicando por 6 para o valor maximo ser 6 */

        System.out.println(dado6Lados); // imprimindo no console
        JOptionPane.showMessageDialog(null, dado6Lados); // abrindo uma janela com a impressão

        Random gerador = new Random(); /* agora usando a classe Random para criar a variavel gerador
        obs: se um valor for adicionado dentro do parenteses o número gerado sempre irá começar com ele
        int numero = gerador.nextInt(6) + 1; /* criando a variavel numero que vai receber o valor da variavel gerador
        estando definido para gerar um número inteiro aleatório entre 1 e 6 */

        System.out.println(gerador);
    }
}
