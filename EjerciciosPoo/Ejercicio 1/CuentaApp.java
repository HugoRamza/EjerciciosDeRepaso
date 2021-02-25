package EjerciciosPoo;

public class CuentaApp {    
    public static void main(String[] args)
    {
       Cuenta cuenta_1 = new Cuenta("DiscoDurodeRoer");
        Cuenta cuenta_2 = new Cuenta("Fernando", 300);
              
        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);
         
            cuenta_1.retirar(500);
        cuenta_2.retirar(100);
         
   
        System.out.println(cuenta_1); // 0 euros
        System.out.println(cuenta_2); // 600 euros
    }
    
}
