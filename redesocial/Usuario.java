/*Exercício: crie um projeto em Java de uma rede social contendo duas classes: Postagem e Usuario. Ambas as classes pertencem ao pacote redeSocial. Não use modificadores de acesso.*/

package redesocial;

public class Usuario {
    static void curtirPostagem() {
        System.out.println("Usuário curtiu a postagem");
        Postagem.mostrarCurtidas();
        int x = Postagem.curtidas;
        System.out.println("Curtidas antes = " + x);
        Postagem.curtidas++;
        System.out.println("Curtidas agora = " + Postagem.curtidas);
    }

    public static void main(String args[]) {
        curtirPostagem();
    }
}