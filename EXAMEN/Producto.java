import java.util.*;
public class Producto {
    private int prod_id;
    private String prod_nombre;
    private int prod_precio;
    private String prod_marca;

    Producto (int prod_id, String prod_nombre,int prod_precio,String prod_marca ){
        this.prod_id=prod_id;
        this.prod_nombre=prod_nombre;
        this.prod_precio=prod_precio;
        this.prod_marca=prod_marca;
    }

    public int getProd_id(){
       return prod_id;
    }
    public String getProd_nombre(){
       return prod_nombre;
    }
    public int getProd_precio(){
        return prod_precio;
    }
    public String getProd_marca(){
        return prod_marca;
    }
    public void setProd_id(int prod_id){
        this.prod_id=prod_id;  
    }
    public void setProd_nombre(String prod_nombre){
        this.prod_nombre=prod_nombre;  
    }
    public void setProd_precio(int prod_precio){
        this.prod_precio=prod_precio;  
    }
    public void setProd_marca(String prod_marca){
        this.prod_marca=prod_marca;  
    }

    public String Pongame20(){
        return prod_id+" "+prod_nombre+" "+prod_precio+" "+prod_marca;
    }
    
}
class CRUDProducto{
    public static void main(String[] args) {
        Collection<Producto>   c = new ArrayList<Producto>();

        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        int ch;
        do{
            System.out.println("1.Crear");
            System.out.println("2.Leer");
            System.out.println("3.Actualizar");
            System.out.println("4.Borrar");
            System.out.print("Ingrese su elección: ");
            ch = s.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter Id del producto:");
                    int prodid=s.nextInt();
                    System.out.print("Enter el Nombre del Producto:");
                    String prodnombre= s1.nextLine();
                    System.out.print("Enter el precio :");
                    int prodprecio=s.nextInt();
                    System.out.print("Enter la marca:");
                    String prodmarca=s1.nextLine();
                     
                    c.add(new Producto(prodid,prodnombre,prodprecio,prodmarca ));
                break;
                case 2:
                    System.out.println(c);
                break;
            }
        }while(ch!=0);
    }
 }
