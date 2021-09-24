public interface InterfaceBluRay {
    // final: atributo constante
    // static: atributo acessível a todas as instâncias
    final static double PROMOCAO = 20; // 20% de desconto

    // métodos públicos da interface
    // todos os atributos e métodos de interfaces devem ser púbicos
    void adicionarLista(ItemBluRay obj);

    void imprimirLista();
}
