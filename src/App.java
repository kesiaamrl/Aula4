import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int qtd;

        System.out.println("Quantos contatos deseja incluir?");
        qtd= sc.nextInt();
        Agenda [] lista = new Agenda [qtd];
        
        for (int i=1; i<=qtd; i++){
            Agenda contato = new Agenda();
System.out.println("Informe o nome: ");
contato.setNome(sc.next());
System.out.println("Informe o sobrenome: ");
contato.setSobrenome(sc.next());
System.out.println("Informe o telefone: ");
contato.setTelefone(sc.nextInt());

lista[i]=contato;
        }        
        System.out.println("Lista telefonica: ");
        for (Agenda agenda : lista) {
            System.out.println(agenda.getNome() + " " + agenda.getSobrenome() + " " + agenda.getTelefone());
    }
    }

}