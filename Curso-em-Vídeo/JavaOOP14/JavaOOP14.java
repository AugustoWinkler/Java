
package javaoop14;


public class JavaOOP14 {

   
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video ("Aula 12 PHP");
        v[2] = new Video ("Aula 10 HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] =  new Gafanhoto("Augusto",22,"M","win");
        g[1] = new Gafanhoto("Creuza",12,"F","creuzita");
        
        //System.out.println(g[0].toString());
        
        //System.out.println(v[0].toString());
        
        Visualizacao vis[] = new Visualizacao[5];
        
        vis[0] = new Visualizacao(g[0],v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0],v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
        
    }
    
}
