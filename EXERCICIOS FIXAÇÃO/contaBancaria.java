/*Crie uma classe "ContaBancaria" com atributos privados para "numeroDaConta", "agencia", "saldo" e "senha". Use métodos getter para "agencia", "numeroDaConta" e "saldo", mas apenas um método setter para "senha".*/

public class contaBancaria{
    private int numeroDaConta;
    private int agencia;
    private float saldo;
    private int senha;

    public contaBancaria(int numeroDaConta, int agencia, float saldo, int senha) { // Método construtor
            this.numeroDaConta = numeroDaConta;
            this.agencia = agencia;
            this.saldo = saldo;
            this.senha = senha;
        }

        public int getnumeroDaConta() { // Retorna valor do atributo privado “marca”;
            return numeroDaConta;
        }
        public int getagencia() { // Retorna valor do atributo privado “marca”;
                    return agencia;
        }
         public float getsaldo() { // Retorna valor do atributo privado “marca”;
            return saldo;
         }
         public void setsenha(int senha) {  // Altera valor de “marca”;
        this.senha = senha;
    }

    public static void main(String[] args) {
        contaBancaria conta1 = new contaBancaria(888777666, 333, 59.33, 40028922);
        System.out.println("Conta1 - Número" + conta1.get.numeroDaConta, "," + conta1.get.agencia, "," + conta1.get.saldo );
}
//CONTINUAR EXERCÍCIO DAQUI!!!!!!---------!!!!!!1