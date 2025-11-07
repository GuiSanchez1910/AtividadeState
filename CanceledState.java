public class CanceledState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("   ERRO: O pedido foi cancelado e não pode ser pago.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("   ERRO: O pedido foi cancelado e não pode ser enviado.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("   ERRO: O pedido foi cancelado e não pode ser entregue.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("   AVISO: O pedido já se encontra no estado Cancelado.");
    }
}