/*Exemplos : membros Public
Um membro (atributo ou método) público é visível e acessível por qualquer outra classe */

class A {

    public static void g( ) // método A.g() é público

    { … }

    public static int k;     // atributo A.k é público

}

class B {

   static void f( ) // método B.f() é default

   {

      A.g();        // B.f() chama o método A.g()  

      int x = A.k;  // B.f() lê o atributo A.k

      A.k = 10;     // B.f() escreve ou modifica o atributo A.k    

   }

}

/*Exemplos: membros Private
em o seu acesso restrito por outras classes */
class A {

    private static void g( ) // método A.g() é privado
    { … }

    private static int k;     // atributo A.k é privado
  
    static void f( )          // método A.f() é default
    {
        g();       // método A.g() é chamado na própria classe, em A.f()
        int x = k;
        k = 10;    // atributo A.k é lido na própria classe, em A.f()) 
    }
}

//Exemplos: Packages

//Classe A e B pertencem ao pacote P1
package P1;
class A{
…
}

package P1;
class B{
…
}

//Classe C e D pertencem ao pacote P2
package P2;
class C{
…
}

package P2;
class D{
…
}

//Classe E e F pertencem ao pacote default
// default
class E{
…
}

// default
class F{
…
}

