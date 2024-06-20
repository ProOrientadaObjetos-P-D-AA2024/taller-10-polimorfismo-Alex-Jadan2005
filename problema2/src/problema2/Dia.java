
package problema2;
public class Dia extends Menu{
    private double postre;
    private double bebida;

    public Dia(String nombre, double menuInicial, double postre, double bebida) {
        super(nombre, menuInicial);
        this.postre = postre;
        this.bebida = bebida;
    }

    public double getPostre() {
        return postre;
    }

    public void setPostre(double postre) {
        this.postre = postre;
    }

    public double getBebida() {
        return bebida;
    }

    public void setBebida(double bebida) {
        this.bebida = bebida;
    }
    
    @Override
    public double calcularMenu(){
        double n=menuInicial+postre+bebida;
        return n;
    }
    
    @Override
    public String menu(){
        return "\n\nMenu del Dia\n     Plato: "+nombre+"\n     Valor Inicial: "+menuInicial+
                "\n     Valor bebida: "+bebida+"\n     Valor postre: "+postre+"\n     Valor del Menú: "+calcularMenu();
    }
    
}
