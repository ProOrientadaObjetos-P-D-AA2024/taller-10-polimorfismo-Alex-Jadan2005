
package problema2;
public abstract class Menu {
    protected String nombre;
    protected double valorMenu;
    protected double menuInicial;

    public Menu(String nombre, double menuInicial) {
        this.nombre = nombre;
        this.menuInicial = menuInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    public void setValorMenu(double valorMenu) {
        this.valorMenu = valorMenu;
    }

    public double getMenuInicial() {
        return menuInicial;
    }

    public void setMenuInicial(double menuInicial) {
        this.menuInicial = menuInicial;
    }

    
    
    public abstract double calcularMenu();
    public abstract String menu();
    
}
