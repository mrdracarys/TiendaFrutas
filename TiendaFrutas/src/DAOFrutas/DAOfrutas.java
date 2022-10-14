/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOFrutas;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JUAN E
 */
public interface DAOfrutas {
    
    public boolean GuardarFruta(String cfruta,String nfruta,String tfruta,String sfruta, String vfruta,String efruta);
    public boolean GuardarFruta (String[] fruta);
    public  DefaultTableModel MostrarFruta();        
    public void ActualizarFruta(int codigo);
    public void EliminarFruta(int codigo);        
    
    
   
}
