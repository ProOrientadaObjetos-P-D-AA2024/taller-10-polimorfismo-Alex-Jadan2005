
package problema1;
public abstract class Personaje {
    protected String nombre;
    protected int Vida;
    protected int nivelExperiencia;

    public Personaje(String nombre, int Vida, int nivelExperiencia) {
        this.nombre = nombre;
        this.Vida = Vida;
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }
    
    
    
    public abstract void estado();
    public abstract void ataque(Personaje p, int ataque);
    public abstract void daño(int daño);
    public abstract void nivel();
    
    
}
