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
public class Gruppi {
    private String nome;
    private int idGruppo;
    private String urlFotoGruppo;
    
    
    public Gruppi(){
        this.nome= "";
        this.idGruppo=-1;
        this.urlFotoGruppo="";
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idGruppo
     */
    public int getIdGruppo() {
        return idGruppo;
    }

    /**
     * @param idGruppo the idGruppo to set
     */
    public void setIdGruppo(int idGruppo) {
        this.idGruppo = idGruppo;
    }

    /**
     * @return the urlFotoGruppo
     */
    public String getUrlFotoGruppo() {
        return urlFotoGruppo;
    }

    /**
     * @param urlFotoGruppo the urlFotoGruppo to set
     */
    public void setUrlFotoGruppo(String urlFotoGruppo) {
        this.urlFotoGruppo = urlFotoGruppo;
    }
    
    
    
    
}
