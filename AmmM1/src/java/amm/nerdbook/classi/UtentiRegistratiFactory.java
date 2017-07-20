/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.classi;
import java.util.*;
/**
 *
 * @author Andrea
 */
public class UtentiRegistratiFactory {
     //Pattern Design Singleton
    private static UtentiRegistratiFactory singleton;

    public static UtentiRegistratiFactory getInstance() {
        if (singleton == null) {
            singleton = new UtentiRegistratiFactory();
        }
        return singleton;
    }
     private ArrayList<UtentiRegistrati> listaUser = new ArrayList<>();
     
     
     private UtentiRegistratiFactory() {
        
       

        //Creazione User
        UtentiRegistrati user1 = new UtentiRegistrati();
        user1.setNome("Pippo");
        user1.setCognome("Domodossola");
        user1.setEmail("PippoDomodossola42@mlmlml.it");
        user1.setData("18/07/2017");
        user1.setIdUtente(0);
        user1.setPassword("01234");
        user1.setUrlFotoUser("");
        user1.setFrasePresentazione("ciao");
        
        UtentiRegistrati user2 = new UtentiRegistrati();
        user2.setNome("Tex");
        user2.setCognome("Dodo");
        user2.setEmail("TexDodo@mlmlml.it");
        user2.setData("18/07/2017");
        user2.setIdUtente(1);
        user2.setPassword("56789");
        user2.setUrlFotoUser("foto");
        user2.setGruppoId(2);
        
        UtentiRegistrati user3 = new UtentiRegistrati();
        user3.setNome("Giorgio");
        user3.setCognome("Vanni");
        user3.setEmail("GiorgioVanni@mlmlml.it");
        user3.setData("18/07/2017");
        user3.setIdUtente(2);
        user3.setPassword("77777");
        user3.setUrlFotoUser("");
        user3.setFrasePresentazione("Pippo");
        
        listaUser.add(user1);
        listaUser.add(user2);
        listaUser.add(user3);
        
    }
     
     
      public ArrayList<UtentiRegistrati> getListaUser() {

        return this.listaUser;
    }
    
    public UtentiRegistrati getUserId(int id) {
        for (UtentiRegistrati user : this.listaUser) {
            if (user.getIdUtente() == id) {
                return user;
            }
        }
        return null;
    }
    
    
    
    
     public List<UtentiRegistrati> getUtentiRegistratiNomeCognome(String nome, String cognome) {
        
          List<UtentiRegistrati> lista = new ArrayList<>();
         
         for (UtentiRegistrati user : this.listaUser) {
            if (user.getNome() == nome && user.getCognome() == cognome) {
                lista.add(user);
            }
        }
        return lista;
    }
     
    public int getIdNomePassword(String nome, String password) {
        
          List<UtentiRegistrati> lista = new ArrayList<>();
         
         for (UtentiRegistrati user : this.listaUser) {
            if (user.getNome() == nome && user.getPassword() == password) {
                return user.getIdUtente();
            }
        }
        return -1;
    }
     
    public UtentiRegistrati getUtentiRegistratiEmail(String email) {
        
         
         for (UtentiRegistrati user : this.listaUser) {
            if (user.getEmail() == email) {
                return user;
            }
        }
        return null;
    }
}
