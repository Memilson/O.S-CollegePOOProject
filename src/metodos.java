import java.util.ArrayList;
import java.util.Scanner;

class metodos {
    ArrayList<String> funcionarios = new ArrayList<>();
    ArrayList<String> setores = new ArrayList<>();
    ArrayList<String> problemas = new ArrayList<>();
    Scanner ler = new Scanner(System.in);

    public void CriarArray(){
    setores.add("RH");setores.add("Admistracao");setores.add("Secretaria");setores.add("Recepcao");setores.add("Cozinha");setores.add("Producao");setores.add("Pesquisa");
    funcionarios.add("Angelo");funcionarios.add("AugustinhoAmostradinho");funcionarios.add("James");funcionarios.add("Aylan");
    problemas.add("Falta de conexao");problemas.add("Nao liga");problemas.add("Falta de permissao");problemas.add("Login");
    listarEEscolher(funcionarios, "Funcionarios");listarEEscolher(setores, "Setores");listarEEscolher(Problemas, "Problemas");
    }

    public void listarEEscolher(ArrayList<String> lista, String tipo) {
        System.out.println("Escolha um " + tipo + " pelo número correspondente:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
        System.out.print("Digite o número do " + tipo + " escolhido: ");
        int escolha = ler.nextInt();
        if (escolha > 0 && escolha <= lista.size()) {
            System.out.println("Você escolheu o " + tipo + ": " + lista.get(escolha - 1));
        } else {
            System.out.println("Escolha inválida.");
        }
    }
}