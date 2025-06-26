/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.evaluado.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author pipe-
 */
public class CasoEvaluado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Agente agente = new Agente();
       // INPUTS
       agente.setNombreAgente(JOptionPane.showInputDialog("Digite el nombre del agente"));
       agente.setCedulaAgente(JOptionPane.showInputDialog("Digite la cedula del agente"));
       agente.setIdAgente(JOptionPane.showInputDialog("Ingrese el ID del agente"));
       agente.setSedeAgente(JOptionPane.showInputDialog("Digite la sede del agente"));
       agente.setVehiculoAgente(JOptionPane.showInputDialog("Inserte -SI- si tiene vehiculo -NO- si no tiene vehiculo "));
       
JOptionPane.showMessageDialog(null, agente.getNombreAgente());    
JOptionPane.showMessageDialog(null, agente.getCedulaAgente());
JOptionPane.showMessageDialog(null, agente.getIdAgente());
JOptionPane.showMessageDialog(null, agente.getSedeAgente());  
JOptionPane.showMessageDialog(null, agente.getVehiculoAgente());
    
    // input cantidad facturas
        int cantidadfactura = Integer.parseInt(JOptionPane.showInputDialog("Cuantas facturas va a ingresas"));
        double totalfacturas = 0;
        for (int i = 0; i <= cantidadfactura; i++) {

           Cliente cliente = new Cliente();
           cliente.setNombrecliente(JOptionPane.showInputDialog("Ingrese el nombre del cliente"));
           cliente.setCedulacliente(JOptionPane.showInputDialog("Ingrese la cedula del cliente"));
           cliente.setIdcliente(JOptionPane.showInputDialog("Ingrese el id del cliente"));
           cliente.setMontocliente(JOptionPane.showInputDialog("Ingrese el monto del cliente"));
           cliente.setNumerodemes(JOptionPane.showInputDialog("Ingrese el numero del mes"));
           cliente.setPedirautomotriz(JOptionPane.showInputDialog("cuantos prodructos automotrices lleva"));
           cliente.setPedirconstruccion(JOptionPane.showInputDialog("cuantos productos de construccion lleva"));
           cliente.setPedirelectrico(JOptionPane.showInputDialog("cuantos productos de electrico lleva "));

            totalfacturas = totalfacturas+ totalfacturas;
            }
        }
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
            
    

