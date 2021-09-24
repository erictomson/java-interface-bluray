import java.text.NumberFormat;
import java.util.Scanner;
import java.io.PrintStream;

public class Programa {

    public static void main(String[] args) {
        // Declarando e Instanciando um objeto Blu-Ray
        BluRay bluRay = new BluRay();
        // Declarando uma variável do tipo itemBluRay
        ItemBluRay itemBluRay;
        // Menu Principal: mostrando enquanto não executar break (opção 4)
        while(true) {
            // Instanciando um objeto Blu-Ray para salvar os dados de Blu-Ray
            itemBluRay = new ItemBluRay();
            System.out.println("1 - Cadastrar Blu-Ray");
            System.out.println("2 - Imprimir lista de Blu-Ray");
            System.out.println("3 - Cadastrar Blu-Ray com Desconto");
            System.out.println("4 - Fim");
            System.out.println("Entre com a opção desejada: ");
            // Lendo a opção do usuário
            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            // Sai do menu caso opção selecionada for 4
            if(opcao==4) { break; }
            switch (opcao) {
                case 1:
                    bluRay.cadastrarBluRay(itemBluRay);
                    bluRay.adicionarLista(itemBluRay);
                    break;
                case 2:
                    bluRay.imprimirLista();
                    break;
                case 3:
                    bluRay.cadastrarBluRay(itemBluRay);
                    // Calculando o valor do desconto
                    double valorDesconto =
                            itemBluRay.getPreco() - (itemBluRay.getPreco()*InterfaceBluRay.PROMOCAO)/100;
                    // Lendo o percentual de desconto no atributo PROMOCAO da InterfaceBluRay
                    System.out.printf("Valor do Blu-Ray com promoção de %.2f de desconto: %s",InterfaceBluRay.PROMOCAO, NumberFormat.getCurrencyInstance().format(valorDesconto));
                    System.out.println();
                    // Gravando o valor do blu-ray com o desconto calculado
                    itemBluRay.setPreco(valorDesconto);
                    // Adicionando o novo blu-ray à lista de Blu-Rays
                    bluRay.adicionarLista(itemBluRay);
                    System.out.println();
                    System.out.println();
                    break;
                default:
                    System.out.println("Opcao Invalida");
            }
        }
    }
}
