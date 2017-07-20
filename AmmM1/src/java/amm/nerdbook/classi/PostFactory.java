/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.classi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrea
 */
public class PostFactory {
     //Pattern Design Singleton
    private static PostFactory singleton;

    public static PostFactory getInstance() {
        if (singleton == null) {
            singleton = new PostFactory();
        }
        return singleton;
    }
    
    private ArrayList<Post> listaPost = new ArrayList<>();
    
    
    private PostFactory() {
        
        UtentiRegistratiFactory user = UtentiRegistratiFactory.getInstance();
        GruppiFactory gruppi = GruppiFactory.getInstance();

        //Creazione Post
        Post post1 = new Post();
        post1.setFrase("we");
        post1.setIdPost(0);
        post1.setUser(user.getUserId(0));

        Post post2 = new Post();
        post2.setFrase("WEWE");
        post2.setIdPost(1);
        post2.setUser(user.getUserId(1));
        post2.setGruppo(gruppi.getGruppiId(1));

        Post post3 = new Post();
        post3.setFrase("wewewe");
        post3.setIdPost(2);
        post3.setUser(user.getUserId(2));

        Post post4 = new Post();
        post4.setFrase("wewewewe");
        post4.setIdPost(3);
        post4.setUser(user.getUserId(3));
        post4.setGruppo(gruppi.getGruppiId(0));

        Post post5 = new Post();
        post5.setFrase("we");
        post5.setIdPost(4);
        post5.setUser(user.getUserId(2));

        listaPost.add(post1);
        listaPost.add(post2);
        listaPost.add(post3);
        listaPost.add(post4);
        listaPost.add(post5);
    }
    
    public ArrayList<Post> getListaGruppi() {

        return this.listaPost;
    }
    
    public Post getPostId(int id) {
        for (Post post : this.listaPost) {
            if (post.getIdPost() == id) {
                return post;
            }
        }
        return null;
    }
    
    public Post getPostIdUser(UtentiRegistrati user) {
        
        

        for (Post post : this.listaPost) {
            if (post.getUser() != null) {
                if (post.getUser().equals(user)) {
                    return post;
                }
            }
        }
        return null;
    }

}
