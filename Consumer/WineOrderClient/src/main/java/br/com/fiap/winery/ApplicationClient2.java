package br.com.fiap.winery;

import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient2 {
    public static void main(String[] args) throws MalformedURLException {

        final String URL = "http://localhost:8085/WineStockService?wsdl";
        final String TARGET = "http://winery.fiap.com.br/";
        final String NAME = "WineStockServiceImplementationService";

        final String URL2 = "http://localhost:8086/WineWarningService?wsdl";
        final String TARGET2 = "http://winery.fiap.com.br/";
        final String NAME2 = "WineWarningServiceImplementationService";

        URL url = new URL(URL);
        QName qName = new QName(TARGET, NAME);
        Service service = Service.create(url, qName);

        URL url2 = new URL(URL2);
        QName qName2 = new QName(TARGET2, NAME2);
        Service service2 = Service.create(url2, qName2);

        WineStockService wineStockService = service.getPort(WineStockService.class);
        String order = wineStockService.placeOrder("João", 2);
        System.out.println(order);

        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);
        String warn = wineWarningService.sendWarn();
        System.out.println(warn);


    }
}
