public class Conta {
    //Atributos:
    // no metodo set se atribui o parametro no atributo e nao retorno nada.

    private int agencia;

    private String numero;

    private double saldo;

    private String titular;

    private int senha;


    public Conta(String numero, int agencia, String titular, int senha) {


        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.senha = senha;

    }

    public boolean operacaoSacar(double valorDoSaque) {
        if (valorDoSaque <= 0) {
            return false;
        }
        if (saldo >= valorDoSaque) {
            saldo -= valorDoSaque;
            System.out.println("Novo saldo " + saldo);
        }
        return true;
    }

    public double printSaldo() {
        return saldo;
    }

    public void setSaldo(double valorDoSaque) {
        saldo += valorDoSaque;
    }


    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public boolean setSenha(int senha) {

        Cadastro cadastro = new Cadastro();

        if (senha != this.senha) {
            this.senha = senha;

            System.out.println("Senha incorreta");
            return false;
        }

        if (senha == this.senha) {
            this.senha = senha;
            System.out.println("Senha correta");
        }
        return true;
    }


    public boolean getSenha(String senha) {
        return true;
    }

}
