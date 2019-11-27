package ac.cr.fidelitas;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajarg
 */
public class SOAPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba una cantidad de dolares: ");
        double dolares = teclado.nextDouble();
        double colones = usdCRC(dolares);
        System.out.printf("US$ %10.2f equivale a CR¢ %10.2f\n",dolares,colones);
        System.out.print("Escriba una cantidad de colones: ");
        colones = teclado.nextDouble();
        dolares = crcUSD(colones);
        System.out.printf("CR¢ %10.2f equivale a US$ %10.2f\n",colones,dolares);
        System.out.print("Prueba de conversión finalizada...");
    }

    private static Double crcUSD(java.lang.Double colones) {
        ac.cr.fidelitas.MyWebService_Service service = new ac.cr.fidelitas.MyWebService_Service();
        ac.cr.fidelitas.MyWebService port = service.getMyWebServicePort();
        return port.crcUSD(colones);
    }

    private static Double usdCRC(java.lang.Double dolares) {
        ac.cr.fidelitas.MyWebService_Service service = new ac.cr.fidelitas.MyWebService_Service();
        ac.cr.fidelitas.MyWebService port = service.getMyWebServicePort();
        return port.usdCRC(dolares);
    }
    
    
}
