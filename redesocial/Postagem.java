/*Exercício: crie um projeto em Java de uma rede social contendo duas classes: Postagem e Usuario. Ambas as classes pertencem ao pacote redeSocial. Não use modificadores de acesso.*/

package redesocial;

public class Postagem{
    static int curtidas;
    static void mostrarCurtidas() {
        System.out.println("------------------");
        System.out.println("... Postagem recebeu curtida!");
        System.out.println("... Total de curtidas = " + curtidas);
        System.out.println("------------------");
    }
}