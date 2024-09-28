import java.util.Scanner;

public class Cadastro {


    private String cadastroDoTitular;

    private int crieSenha;

    public String setCadastroDoTitular() {
        Scanner leitor = new Scanner(System.in);
        String nome;
        System.out.println("Registre o seu nome aqui:");
        nome = leitor.nextLine();
        this.cadastroDoTitular = nome;

        return this.cadastroDoTitular;
    }
    public void getCadastroDoTitular(){
        return;
    }
    public int setCriarSenha(){
        var leitor = new Scanner(System.in);
        int senha;
        System.out.println("Registre sua senha aqui:");
        senha = Integer.parseInt(leitor.nextLine());
        this.crieSenha = senha;
        return crieSenha;
    }
}
