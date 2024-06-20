
package problema2;
public class Niños extends Menu {
    private double helado;
    private double pastel;

    public Niños(String nombre, double menuInicial, double helado, double pastel) {
        super(nombre, menuInicial);
        this.helado = helado;
        this.pastel = pastel;
    }

    public double getHelado() {
        return helado;
    }

    public void setHelado(double helado) {
        this.helado = helado;
    }

    public double getPastel() {
        return pastel;
    }

    public void setPastel(double pastel) {
        this.pastel = pastel;
    }
    
    @Override
    public double calcularMenu(){
        double n=menuInicial+helado+pastel;
        return n;
    }
    
    @Override
    public String menu(){
        return "\n\nMenu del Niño\n     Plato: "+nombre+"\n     Valor Inicial: "+menuInicial+"\n     Valor helado: "+helado+
                "\n     Valor pastel: "+pastel+"\n     Valor del Menú: "+calcularMenu();
    }
}
