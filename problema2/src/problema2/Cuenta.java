
package problema2;

import java.util.ArrayList;

public class Cuenta extends Menu{
    private double subtotal;
    private double total;
    private ArrayList<Menu> m;

    public Cuenta(String nombre,ArrayList<Menu> m) {
        super(nombre, 0);
        this.m = m;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal() {
        for (Menu menu : m) {
            subtotal=subtotal+menu.calcularMenu();
        }

    }

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        total=subtotal+(subtotal*0.15);
    }

   
    
    @Override
    public double calcularMenu(){
        return 0;
    }
    @Override
    public String menu(){
        return "";
    }
    
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Factura\nCliente: ").append(nombre+"\n");
        for(Menu menu: m){
            sb.append(menu.menu());
        }
        sb.append("\n\nSubtotal: "+subtotal+"\nIVA: 10%\nTotal a Pagar: "+total);
        return sb.toString();
        
    }
    
}
