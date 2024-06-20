
package problema1;
public class Problema1 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Guerrero g=new Guerrero("alex",100,20,25);
        Mago m=new Mago("mago",60,15,30);
        Arquero r=new Arquero("link",25,30,60);
        
        System.out.println("COMBATE POR TURNOS");
        
        g.ataque(m, 40);
        m.ataque(g, 30);
        r.ataque(g, 10);
        g.ataque(m, 40);
        r.ataque(g, 45);
        g.ataque(r, 40);
        System.out.println("=================================\nESTADO DE PERSONAJES");
        g.estado();
        m.estado();
        r.estado();
        
    }

}
