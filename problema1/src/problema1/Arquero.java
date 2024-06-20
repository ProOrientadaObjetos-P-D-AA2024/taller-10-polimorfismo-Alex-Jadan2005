
package problema1;
public class Arquero extends Personaje {
    
    private int flecha;

    public Arquero(String nombre, int Vida, int nivelExperiencia, int flecha) {
        super(nombre, Vida, nivelExperiencia);
        this.flecha = flecha;
    }

    public int getFlecha() {
        return flecha;
    }

    public void setFlecha(int flecha) {
        this.flecha = flecha;
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
        System.out.println(nombre+"\nTipo: Arquero|   Puntos de vida: "+Vida+"|   Nivel de Experiencia: "+nivelExperiencia);
    }
}
