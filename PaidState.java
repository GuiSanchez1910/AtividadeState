public class PaidState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("   AVISO: O pedido já se encontra no estado Pago.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("   SUCESSO: Pedido despachado para o cliente. Mudando para o estado Enviado.");
        
        order.setState(new ShippedState()); 
    }

    @Override
    public void entregar(Order order) {
        System.out.println("   ERRO: Não é possível entregar um pedido que ainda não foi enviado.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("   SUCESSO: Pedido cancelado. Mudando para o estado Cancelado.");
        
        order.setState(new CanceledState()); 
    }
}