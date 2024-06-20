
package problema2;

import java.util.ArrayList;

public class Problema2 {
    public static void main(String[] args) {

        ArrayList <Menu> lista=new ArrayList();
        Carta c=new Carta("Carta 001",6,1.5,3,10);
        Dia d=new Dia("Dia 002",4.5,1.25,1.75);
        Dia d2=new Dia("Dia 005",5.75,2.25,1.75);
        Niños n=new Niños ("Niño 003",2.5,1.5,3);
        Economico e=new Economico("Economico 004",4,10);
        
        
        lista.add(c);
        lista.add(d);
        lista.add(d2);
        lista.add(n);
        lista.add(e);
        
        for(int i=0;i<lista.size();i++){
            lista.get(i).setValorMenu(i);
        }
        Cuenta cu=new Cuenta("Alex Jadan",lista); 
        cu.setSubtotal();
        cu.setTotal();
        System.out.println(cu.toString());
        cu.toString();
        
    }

}
