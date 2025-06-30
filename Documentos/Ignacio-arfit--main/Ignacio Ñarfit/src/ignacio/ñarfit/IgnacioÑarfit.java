/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ignacio.ñarfit;

import javax.swing.JOptionPane;


/**
 *
 * @author brand
 */
public class IgnacioÑarfit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
        int opMen;
        // Bucle en caso de ingresar un valor no valido
        do {
              //Menú Principal
            opMen = Integer.parseInt(JOptionPane.showInputDialog("Digite mediante números la acción que quiere realizar: " + "\n"
                    + "1= Socio" + "\n"
                    + "2= Parqueo" + "\n"
                    + "3= Sala de pesas" + "\n"
                    + "4= "));

            switch (opMen) {
                case 1:
                    // Menu Socio
                    opMen = Integer.parseInt(JOptionPane.showInputDialog("Digite mediante números la acción que quiere realizar en SOCIO: " + "\n"
                            + "1= Registrar Socio" + "\n"
                            + "2= Informacion Socio" + "\n"
                            + "3= Eliminar Socio" + "\n"));
                    switch (opMen) {
                        case 1:
                            // Opcion Registar Socio
                            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos socios desea registar"));
                            for (int i = 1; i <= cantidad; i++) {
                                Socio socio = new Socio();
                                JOptionPane.showMessageDialog(null, "Registro de Socio num:" + i);
                                socio.setNombre("Ingrese el nombre del socio: " + i);
                                socio.setCedula("Ingrese la cedula del socio: " + i);
                                socio.setId("Ingrese le id del socio: " + i);
                                socio.setCorreo("Ingrese el correo del socio: " + i);
                                socio.setFechaPago("Ingrese la fecha de pago del socio: " + i);
                                socio.setEdad("Ingrese la edad del socio: " + i);
                            }
                            break;
                        case 2:
                            //Mostar Informacion de socio (PREGUNTAR PROFE)
                            
                            
                            
                            break;
                        case 3:
                            //Elinar Informacion de socio (PREGUNTAR PROFE)
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

            }
        } while (opMen >= 5);

    }


}
