/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frutas;

import DAOFrutas.DAOfrutas;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Xhema
 */
public class ControldeFrutas implements DAOfrutas {
    
    private static ControldeFrutas instancia;
    private String frutas[][];
    private int cFrutas;
    
    public static ControldeFrutas getInstance(){
        if(instancia==null)
            instancia= new ControldeFrutas();   
        return instancia;
    }
    
    private ControldeFrutas(){
        this.frutas =new String[6][100];
        this.cFrutas=0;
    }
    
    @Override
   public boolean GuardarFruta(String cfruta,String nfruta,String tfruta,String sfruta, String vfruta,String efruta){
        frutas[0][cFrutas]= cfruta;
        frutas[1][cFrutas]= nfruta;
        frutas[2][cFrutas]= tfruta;
        frutas[3][cFrutas]= sfruta;
        frutas[4][cFrutas]= vfruta;
        frutas[5][cFrutas]= efruta;
        cFrutas++;
        return true;
    }
 @Override
    public boolean GuardarFruta(String[] fruta) {
        frutas[0][cFrutas]=fruta[0];
        frutas[1][cFrutas]=fruta[1];
        frutas[2][cFrutas]=fruta[2];
        frutas[3][cFrutas]=fruta[3];
        frutas[4][cFrutas]=fruta[4];
        frutas[5][cFrutas]=fruta[5];
        cFrutas++;
        
        return true;
    }
    
    @Override
    public DefaultTableModel MostrarFruta() {
   DefaultTableModel modelo = new DefaultTableModel();
        //creo los encabezados de la tabla
        modelo.addColumn("codigo");
        modelo.addColumn("pokemon");
        modelo.addColumn("Tipo");
        modelo.addColumn("Sexo");
        modelo.addColumn("Variocolor");
        modelo.addColumn("Estadisticas");
        
        //agregando filas al modelo
        
        for(int i=0;i<100;i++){
            String[] fruta=new String[6];
            for(int j=0;j<6;j++){
                //System.out.println("codigo "+pokemones[i][j]+": nombre: "+pokemones[i][j]);
                if(frutas[j][i] != null)
                    fruta[j]=frutas[j][i];
            }
            modelo.addRow(fruta);
        }
        return modelo;
    }
   }   

    @Override
    public void ActualizarFruta(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EliminarFruta(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
