package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {
    @Override
    public String getMenu() {
        return "Lista de vinhos com tipo de uva:\n" +
                "\n" +
                "1. Nome: Cabernet Sauvignon Reserva \t-> Uva: Cabernet Sauvignon\n" +
                "2. Nome: Merlot Vale dos Vinhedos \t\t-> Uva: Merlot\n" +
                "3. Nome: Malbec Mendoza Premium \t\t-> Uva: Malbec\n" +
                "4. Nome: Chardonnay Reserva Especial \t-> Uva: Chardonnay\n" +
                "5. Nome: Syrah do Vale do Rhône \t\t-> Uva: Syrah\n";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido Confirmado!";
    }
}
