
package problema1;
public class Guerrero extends Personaje {
   private int ataque;

    public Guerrero(String nombre, int Vida, int nivelExperiencia, int ataque) {
        super(nombre, Vida, nivelExperiencia);
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
   
    @Override
    public void ataque(Personaje p, int ataque){
        int daño=ataque;
        System.out.println("\n"+nombre+" atacó a "+p.nombre+" con "+ataque+" de daño.");
        p.daño(ataque);
    }
    
    @Override
    public void daño(int daño){
        Vida=Vida-daño;
        if(Vida<=0){
            System.out.println(nombre+": Ha sido derrotado");
            nivel();
        }else{
            System.out.println(nombre+" ha recibido "+daño+" de daño.");
        }
    }
    
    @Override
    public void nivel(){
        System.out.println("Has subido de nivel");
    }
    
    @Override
    public void estado(){
        if(Vida<=0){
            Vida=0;
        }
        System.out.println(nombre+"\nTipo: Guerrero|   Puntos de vida: "+Vida+"|   Nivel de Experiencia: "+nivelExperiencia);
    }
    
}
