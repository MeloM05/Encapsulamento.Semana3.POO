//MÉTODOS GETTER E SETTER

/*Exemplo de aplicação 3: crie um projeto em Java contendo uma classe chamada Carro. Ela possui dois atributos privados: marca (o nome da marca) e ligado (se o carro está ligado ou desligado). A classe precisa de métodos públicos getter e setter para cada um destes atributos.*/

public class Carro {
    private String  marca;  // atributo oculto (encapsulado/privado)
    private boolean ligado; // atributo oculto (encapsulado/privado)

    public Carro(String marca, boolean ligado) { // Método construtor
        this.marca = marca;
        this.ligado = ligado;
    }

    public String getMarca() { // Retorna valor do atributo privado “marca”;
        return marca;
    }

    public void setMarca(String marca) {  // Altera valor de “marca”;
        this.marca = marca;
    }

    public boolean isLigado() {  // Retorna valor do atributo privado “ligado”;
        return ligado;
    }

    public void setLigado(boolean ligado) { //  Altera valor de “ligado”;
        this.ligado = ligado;
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Ford",false); //instancia Carro
        System.out.println("Marca: " + meuCarro.getMarca()); //Retorna valor
        System.out.println("Ligado: " + (meuCarro.isLigado() == true ? "Ligado" : "Desligado"));

        meuCarro.setMarca("Renault"); //Altera valor de atributo privado
        meuCarro.setLigado(true);     //Altera valor de atributo privado

        System.out.println("Marca: " + meuCarro.getMarca()); // Retorna valor
        System.out.println("Ligado: " + (meuCarro.isLigado() == true ? "Ligado" : "Desligado"));
    }
}

