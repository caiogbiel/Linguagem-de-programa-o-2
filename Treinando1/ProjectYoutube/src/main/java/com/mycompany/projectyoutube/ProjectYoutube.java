package com.mycompany.projectyoutube;
public class ProjectYoutube {
    public static void main(String[] args) 
    {
        Video v[] = new Video[3];
        v[0] = new Video("Primeiro video do Youtube");
        v[1] = new Video("Segundo video do Youtube");
        v[2] = new Video("Terceiro video do Youtube");
        
        Seguidor s[] = new Seguidor[2];
        s[0] = new Seguidor("Jubileu", 22, "M", "JubileuGameplay");
        s[1]= new Seguidor("Creuza", 18, "F", "Creuzinha");
        
        Visualizacao vis[] = new Visualizacao[3];
        vis[0] =  new Visualizacao(s[0], v[1]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] =  new Visualizacao(s[0], v[2]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
//        System.out.println(v[0].toString());
//        System.out.println(s[0].toString());
    }
    
}
