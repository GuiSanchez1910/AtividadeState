public class Main {

    public static void main(String[] args) {
        
        System.out.println("--- INICIANDO O SISTEMA DE PEDIDOS (PADRÃO STATE) ---\n");
        
        Order meuPedido = new Order("001A");
        
        meuPedido.setState(new NewState()); 
        
        System.out.println("\n--- TESTE 1: Fluxo de Sucesso (New -> Paid -> Shipped -> Delivered) ---");
        
        meuPedido.enviar();
        meuPedido.pagar(); 
        
        meuPedido.pagar();  
        meuPedido.entregar();
        meuPedido.enviar(); 
        
        meuPedido.enviar(); 
        meuPedido.entregar(); 
        
        meuPedido.cancelar(); 
        meuPedido.pagar();    
        
        System.out.println("\n--- TESTE 2: Fluxo de Cancelamento (New -> Canceled) ---");
        
        Order pedidoCancelado = new Order("002B");
        pedidoCancelado.setState(new NewState());
        
        pedidoCancelado.cancelar(); 
        
        pedidoCancelado.pagar();  
        pedidoCancelado.enviar(); 
        
        System.out.println("\n--- FIM DO TESTE ---");
    }
}