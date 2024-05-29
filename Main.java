/* Crie um algoritmo em Java contendo uma classe chamada Automovel. Ela deve possuir atributos públicos (public), protegidos (protected) e privados (private).
*/
public class Automóvel{
    public String modelo;
    protected String marca;
    private String placa;
}

public Automovel(String modelo, String marca, String placa){
    this.modelo = modelo;
    this.marca = marca;
    this.placa = placa;
}

public String getPlaca(){
    return this.placa;
}