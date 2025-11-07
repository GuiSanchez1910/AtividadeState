public class DeliveredState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("   AVISO: O pedido já foi entregue e finalizado.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("   AVISO: O pedido já foi entregue, não pode ser enviado novamente.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("   AVISO: O pedido já está no estado Entregue.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("   ERRO: Não é possível cancelar um pedido que já foi entregue.");
    }
}