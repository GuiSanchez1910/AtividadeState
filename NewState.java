public class NewState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("SUCESSO: Pagamento efetuado. Mudando para o estado Pago.");
        order.setState(new PaidState());
    }

    @Override
    public void enviar(Order order) {
        System.out.println("   ERRO: Não é possível enviar um pedido que ainda não foi pago.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("   ERRO: Não é possível entregar um pedido que ainda não foi enviado.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("SUCESSO: Pedido cancelado. Mudando para o estado Cancelado.");
        order.setState(new CanceledState());
    }


}
