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
public class Post {
    private String frase;
    private int idPost;
    private UtentiRegistrati user;
    private Gruppi gruppo;
    
    
    public Post(){
        this.frase="";
        this.idPost=-1;
        this.user=null;
        this.gruppo=null;
    }

    /**
     * @return the frase
     */
    public String getFrase() {
        return frase;
    }

    /**
     * @param frase the frase to set
     */
    public void setFrase(String frase) {
        this.frase = frase;
    }

    /**
     * @return the idPost
     */
    public int getIdPost() {
        return idPost;
    }

    /**
     * @param idPost the idPost to set
     */
    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    /**
     * @return the user
     */
    public UtentiRegistrati getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(UtentiRegistrati user) {
        this.user = user;
    }

    /**
     * @return the gruppo
     */
    public Gruppi getGruppo() {
        return gruppo;
    }

    /**
     * @param gruppo the gruppo to set
     */
    public void setGruppo(Gruppi gruppo) {
        this.gruppo = gruppo;
    }
}
