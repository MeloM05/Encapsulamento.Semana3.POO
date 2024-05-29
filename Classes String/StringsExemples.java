public class StringExamples {

    public static void main(String[] args) {
        String txt;

        txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Comprimento de [" + txt + "] = " + txt.length());

        txt = "Olá Mundo!";
        System.out.println(txt.toUpperCase());   // Saída = "OLÁ MUNDO!"
        System.out.println(txt.toLowerCase());   // Saída = "olá mundo"

        txt = "Localize a posição da palavra 'eureka' neste texto!";
        System.out.println(txt.indexOf("eureka")); // Saída = 31
    }
}

/*Veja que este código demonstra algumas das operações comuns que podem ser realizadas em objetos String. Vamos passar por cada seção:

String txt;: aqui, estamos declarando uma variável chamada txt do tipo String. Ela será usada para armazenar várias Strings ao longo do programa.
txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";: nesta linha, atribuímos à variável txt à String contendo todas as letras do alfabeto em maiúsculas.
System.out.println("Comprimeto de [" + txt + "] = " + txt.length());: aqui, estamos imprimindo o comprimento da string armazenada em txt usando o método length(). Portanto, a saída será "Comprimento de [ABCDEFGHIJKLMNOPQRSTUVWXYZ] = 26".
txt = "Olá Mundo!";: agora, estamos alterando o valor de txt para "Olá Mundo!".
System.out.println(txt.toUpperCase()); e System.out.println(txt.toLowerCase());: Nestas linhas, estamos demonstrando o uso dos métodos toUpperCase() e toLowerCase(), que transformam todas as letras da string em maiúsculas e minúsculas, respectivamente. Portanto, as saídas serão "OLÁ MUNDO!" e "olá mundo".
txt = "Localize a posição da palavra 'eureka' neste texto!";: Aqui, alteramos o valor de txt para a frase especificada.
System.out.println(txt.indexOf("eureka"));: Finalmente, demonstramos o uso do método indexOf(), que retorna a posição da primeira ocorrência da substring especificada na String. Nesse caso, estamos procurando a posição de "eureka" na frase, que começa no índice 31 (lembrando que a contagem começa de 0). Portanto, a saída será 31. A lógica aqui é a mesma ideia das listas que trabalhamos em Python, anteriormente.
*/