import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
//Set +- atribuir
// Get +- ler
        //
        //contrutor----------------aqui a baixo $$

var leitor = new Scanner(System.in);
        var cadastro = new Cadastro();
        var conta1 = new Conta("12423-09(000)",123033, cadastro.setCadastroDoTitular(), cadastro.setCriarSenha());

        conta1.setSaldo(1300);

        System.out.println("Digite o quanto quer sacar ");
        double saque = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite sua senha");
        int numeroSenha = leitor.nextInt();


        var lista =  new ArrayList<>();
        lista.add(conta1.getAgencia());
        lista.add(conta1.getTitular());
        lista.add(conta1.getNumero());

        if (  conta1.setSenha(numeroSenha) && conta1.operacaoSacar(saque)) {

            System.out.println("Suas informaçoes: "+lista);
        }
        System.out.println("Fim");
        System.out.println("Obrigado Deus depois de duas semanas nisso termine !!!!! ALELÓIA");
    }
}

