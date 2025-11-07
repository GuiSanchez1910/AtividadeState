public class Order {
    
    private OrderState currenState;
    private String orderId;

    public Order(String id) {
        this.orderId = id;
        this.currenState = null;
        System.out.println("Pedido " + orderId + " criado");
    }

    public void setState(OrderState newState) {
        this.currenState = newState;
        System.out.println(" -> Pedido " + orderId + " mudou para o estado: " + newState.getClass().getSimpleName());
    }

    public void enviar() {
        System.out.println("Ação de enviar o pedido: " + orderId);
        if(currenState != null) {
            currenState.enviar(this);
        } else {
            System.out.println("ERRO, estado não definido");
        }
    }

    public void entregar() {
        System.out.println("Ação de entregar o pedido: " + orderId);
        if(currenState != null) {
            currenState.entregar(this);
        } else {
            System.out.println("ERRO, estado não definido");
        }
    }

    public void cancelar() {
        System.out.println("Ação de cancelar o pedido: " + orderId);
        if(currenState != null) {
            currenState.cancelar(this);
        } else {
            System.out.println("ERRO, estado não definido");
        }
    }

    public void pagar() {
        System.out.println("Ação de pagar o pedido: " + orderId);
        if(currenState != null) {
            currenState.pagar(this);
        } else {
            System.out.println("ERRO, estado não definido");
        }
    }

}
