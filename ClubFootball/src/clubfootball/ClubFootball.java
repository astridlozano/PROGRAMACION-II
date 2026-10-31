/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clubfootball;

/**
 *
 * @author astri
 */
public class ClubFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //MiembroEquipo Oscar = new MiembroEquipo("Liga Hondurenia");
        JugadorCampo Daniel = new JugadorCampo("Liga Espanola", 4);
        
        Daniel.setSalarioMensual(-5000);
        System.out.println("");
        
        Daniel.setSalarioMensual(15000);
        
        Daniel.setposicionTactica("Delantero Estrella Centro!");
        
        Daniel.disputarPartido();
        
    }
    
    
}
