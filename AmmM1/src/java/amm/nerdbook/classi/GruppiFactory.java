/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.classi;

import java.util.ArrayList;

/**
 *
 * @author Andrea
 */
public class GruppiFactory {
     //Pattern Design Singleton
    private static GruppiFactory singleton;

    public static GruppiFactory getInstance() {
        if (singleton == null) {
            singleton = new GruppiFactory();
        }
        return singleton;
    }
    private ArrayList<Gruppi> listaGruppi = new ArrayList<>();
    
    
     private GruppiFactory() {
        
       

        //Creazione Gruppi
        Gruppi gruppo1 = new Gruppi();
        gruppo1.setNome("AMM");
        gruppo1.setUrlFotoGruppo("");
        gruppo1.setIdGruppo(0);
        
        
        Gruppi gruppo2 = new Gruppi();
        gruppo2.setNome("Manga");
        gruppo2.setUrlFotoGruppo("");
        gruppo2.setIdGruppo(1);
        
        
        Gruppi gruppo3 = new Gruppi();  
        gruppo3.setNome("Università");
        gruppo3.setUrlFotoGruppo("");
        gruppo3.setIdGruppo(2);
        

        
        listaGruppi.add(gruppo1);
        listaGruppi.add(gruppo2);
        listaGruppi.add(gruppo3);
    }
     
     public ArrayList<Gruppi> getListaGruppi() {

        return this.listaGruppi;
    }
    
    public Gruppi getGruppiId(int id) {
        for (Gruppi gruppi : this.listaGruppi) {
            if (gruppi.getIdGruppo() == id) {
                return gruppi;
            }
        }
        return null;
    }
    
}
