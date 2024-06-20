
package problema2;
public class Carta extends Menu {
    private double porcion;
    private double bebida;
    private double porcentaje;

    public Carta(String nombre, double menuInicial, double porcion, double bebida, double porcentaje) {
        super(nombre, menuInicial);
        this.porcion = porcion;
        this.bebida = bebida;
        this.porcentaje = porcentaje;
    }
    
    public double getPorcion() {
        return porcion;
    }

    public void setPorcion(double porcion) {
        this.porcion = porcion;
    }

    public double getBebida() {
        return bebida;
    }

    public void setBebida(double bebida) {
        this.bebida = bebida;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
    @Override
    public double calcularMenu(){
        double n=(menuInicial+porcion+bebida)+(menuInicial*porcentaje/100);
        return n;
        
    }
    
    @Override
    public String menu(){
        return "\n\nMenu a la Carta\n     Plato: "+nombre+"\n     Valor Inicial: "+menuInicial+"\n     Valor guarnicion: "+porcion+
                "\n     Valor bebida: "+bebida+"\n     Porcentaje Adicional: "+porcentaje+"\n     Valor del Menú: "+calcularMenu();
    }
    
}
