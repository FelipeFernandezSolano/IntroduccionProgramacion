/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.evaluado.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author pipe-
 */
public class Cliente {
    public int cantidadfactura;
    private String nombrecliente;
    private String cedulacliente;
    private String idcliente;
    private String montocliente;
    private String numerodemes;
    private String pedirelectrico;
    private String pedirautomotriz;
    private String pedirconstruccion;
    private  boolean bonoextra = false;
    
    private int electricos;
    private int automotriz;
    private int construccion;
    private double monto;
    private double totalcomisiones;
    
    private double comisiones = 0;
    private int puntos = 0;

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getCedulacliente() {
        return cedulacliente;
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public double getMontocliente() {
        return monto;
    }

    public double setMontocliente(String montocliente) {
         monto = Integer.parseInt(montocliente);
         return monto;
    }

    public String getNumerodemes() {
        return numerodemes;
    }

    public void setNumerodemes(String numerodemes) {
        this.numerodemes = numerodemes;
    }

    public int getPedirelectrico() {
        return electricos;
    }

    public int setPedirelectrico(String pedirelectrico) {
       electricos = Integer.parseInt(pedirelectrico);
        return electricos;
    }

    public int getPedirautomotriz() {
        return automotriz;
    }

    public int setPedirautomotriz(String pedirautomotriz) {
           
        automotriz = Integer.parseInt(pedirautomotriz);
        return automotriz;
    
    
    
}

    public int getPedirconstruccion() {
        return construccion;
    }

    public int setPedirconstruccion(String pedirconstruccion) {
      construccion = Integer.parseInt(pedirconstruccion);
        return construccion;
    }
    
    
    
    public void condicion1(int cantidadFactura , double totalfacturas , boolean vehiculoA , String sedeAgente){
        
        if (monto > 50000) {
            comisiones = comisiones + (monto * 0.05);
            puntos = puntos + 1;

            if (electricos > 1 && automotriz > 1 && construccion > 1) {
                comisiones = comisiones + (monto * 0.1);
                puntos = puntos + 3;

            } else {

                if (electricos >= 3) {
                    comisiones = comisiones + (monto * 0.04);

                    puntos = puntos + 1;
                } else {
                    comisiones = comisiones + (monto * 0.02);
                    puntos = puntos + 1;
                }

                if (automotriz >= 4) {
                    comisiones = comisiones + (monto * 0.04);

                    puntos = puntos + 1;
                } else {
                    comisiones = comisiones + (monto * 0.02);
                    puntos = puntos + 1;
                }
                if (construccion >= 1) {
                    comisiones = comisiones + (monto * 0.08);

                    puntos = puntos + 2;
                }
                if (cantidadFactura >= 3 || totalfacturas >300000  ) { 
                    comisiones = comisiones + 20000;
                    bonoextra = true;
                    
                }
            }
            
        }
        
         JOptionPane.showMessageDialog(null, "Vendio un total de " + totalfacturas);
         JOptionPane.showMessageDialog(null, "Total de comisiones" + comisiones);
         JOptionPane.showMessageDialog(null, "pudo el vendedor logar el bono extra?" + bonoextra);
         JOptionPane.showMessageDialog(null, "Puntos totales:" + puntos);
         JOptionPane.showMessageDialog(null, "Tiene vehiculo propio el agente?" +vehiculoA );
         JOptionPane.showMessageDialog(null,"Sede:" + sedeAgente );
                 
            
                 
    }
}
