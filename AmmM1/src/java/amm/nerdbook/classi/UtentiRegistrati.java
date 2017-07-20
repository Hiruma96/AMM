/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.classi;

/**
 *
 * @author Andrea
 */
public class UtentiRegistrati {
    private String nome;
    private int idUtente;
    private String cognome;
    private String urlFotoUser;
    private String data;
    private String email;
    private String password;
    private String frasePresentazione;
    private int gruppoId;
    
    public UtentiRegistrati(){
        this.nome="";
        this.idUtente=-1;
        this.cognome="";
        this.urlFotoUser="";
        this.data="";
        this.email="";
        this.password="";
        this.frasePresentazione="";
        this.gruppoId=-1;
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
     * @return the idUtente
     */
    public int getIdUtente() {
        return idUtente;
    }

    /**
     * @param idUtente the idUtente to set
     */
    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }

    /**
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the urlFotoUser
     */
    public String getUrlFotoUser() {
        return urlFotoUser;
    }

    /**
     * @param urlFotoUser the urlFotoUser to set
     */
    public void setUrlFotoUser(String urlFotoUser) {
        this.urlFotoUser = urlFotoUser;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the frasePresentazione
     */
    public String getFrasePresentazione() {
        return frasePresentazione;
    }

    /**
     * @param frasePresentazione the frasePresentazione to set
     */
    public void setFrasePresentazione(String frasePresentazione) {
        this.frasePresentazione = frasePresentazione;
    }

    /**
     * @return the gruppoId
     */
    public int getGruppoId() {
        return gruppoId;
    }

    /**
     * @param gruppoId the gruppoId to set
     */
    public void setGruppoId(int gruppoId) {
        this.gruppoId = gruppoId;
    }
}
