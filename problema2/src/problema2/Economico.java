
package problema2;
public class Economico extends Menu{
    private double porcentaje;

    public Economico(String nombre, double menuInicial, double porcentaje) {
        super(nombre, menuInicial);
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    @Override
    public double calcularMenu(){
        double n=menuInicial+(menuInicial*porcentaje/100);
        return n;
    }
    
    @Override
    public String menu(){
        return "\n\nMenu a la Carta\n     Plato: "+nombre+"\n     Valor Inicial: "+menuInicial+"\n     Porcentaje Adicional: "
                +porcentaje+"\n     Valor del Menú: "+calcularMenu();
    }
    
}
