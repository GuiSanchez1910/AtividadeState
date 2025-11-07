public class ShippedState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("   AVISO: O pagamento já foi processado e o pedido está em trânsito.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("   AVISO: O pedido já foi despachado.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("   SUCESSO: Pedido recebido pelo cliente. Mudando para o estado Entregue.");
        
        order.setState(new DeliveredState()); 
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("   SUCESSO: O pedido foi cancelado durante o trânsito. Mudando para o estado Cancelado.");
        
        order.setState(new CanceledState()); 
    }
}