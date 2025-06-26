/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.evaluado.pkg1;

/**
 *
 * @author pipe-
 */
public class Agente {
  private String nombreAgente;
  private String CedulaAgente;
  private String idAgente;
  public String sedeAgente;
  private String vehiculoAgente;
  public boolean vehiculoA;

    public String getNombreAgente() {
        return nombreAgente;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    public String getCedulaAgente() {
        return CedulaAgente;
    }

    public void setCedulaAgente(String CedulaAgente) {
        this.CedulaAgente = CedulaAgente;
    }

    public String getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(String idAgente) {
        this.idAgente = idAgente;
    }

    public String getSedeAgente() {
        return sedeAgente;
    }

    public void setSedeAgente(String sedeAgente) {
        this.sedeAgente = sedeAgente;
    }

    public boolean getVehiculoAgente() {
        return vehiculoA;
    }

    public boolean setVehiculoAgente(String vehiculoAgente) {
       
        if (vehiculoAgente.equals("SI") ) {
            vehiculoA = true;
            
            
        }else{
            vehiculoA = false;
        }
        return vehiculoA;
    }

    
  
  
}
