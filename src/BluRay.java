import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Vector;

// Classe obrigatoriamente deve implementar os métodos da interface
public class BluRay implements InterfaceBluRay {

    // Vetor para armazenar os objetos ItemBluRay
    private Vector<ItemBluRay> listaBluRay = new Vector<ItemBluRay>();

    // Sobreescrita do método adicionarLista da interface
    @Override
    public void adicionarLista(ItemBluRay obj) {
        // Adicionando novo Blu-Ray na lista
        this.listaBluRay.add(obj);
    }

    // Sobreescrita do método imprimirLista da interface
    @Override
    public void imprimirLista() {
        // Imprimindo lista de Blu-Rays cadastrados
        System.out.println("Lista de Blu-Rays");
        for(int i=0; i< this.listaBluRay.size(); i++) {
            System.out.println();
            System.out.println("Nome do Cliente: " + this.listaBluRay.get(i).getNomeCliente());;
            System.out.println("Preço do Blu-Ray: " +
                    NumberFormat.getNumberInstance().format(this.listaBluRay.get(i).getPreco()));
        }
        System.out.println("............");
        System.out.println();
    }

    // Método da classe BluRay
    public void cadastrarBluRay(ItemBluRay obj) {
        // Configurar Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do cliente: ");
        // Usando setter do objeto ItemBluRay para armazenar dado lido
        obj.setNomeCliente(scanner.nextLine());
        System.out.println("Valor do Blu-Ray: ");
        obj.setPreco(scanner.nextDouble());
    }
}
