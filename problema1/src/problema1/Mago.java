
package problema1;
public class Mago extends Personaje {
    private int hechizo;

    public Mago(String nombre, int Vida, int nivelExperiencia, int hechizo) {
        super(nombre, Vida, nivelExperiencia);
        this.hechizo = hechizo;
    }

    public int getHechizo() {
        return hechizo;
    }

    public void setHechizo(int hechizo) {
        this.hechizo = hechizo;
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
        System.out.println(nombre+"\nTipo: Mago|   Puntos de vida: "+Vida+"|   Nivel de Experiencia: "+nivelExperiencia);
    }
    
}
