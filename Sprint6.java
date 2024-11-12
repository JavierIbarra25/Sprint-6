import java.util.Scanner;

public class Sprint6 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        final int IDMIN = 111;
        final int IDMAX = 999;
        final int EDADMIN = 14;
        final int EDADMAX = 120;
        final int COMPRARMIN = 0;
        final int COMPRARMAX = 1000;
        final int TELEFONMIN = 111111111;
        final int TELEFONMAX = 999999999;

        int id = 0;
        int edad = 0;
        int tipusVenta = 0;
        int compra = 0;
        int telefon = 0;

        final String VENTALLIURE = "Venta lliure";
        final String PENSIONISTA = "Pensionista";
        final String CARNETJOVE = "Carnet Jove";
        final String SOCI = "Soci";
        String tipusVentaString = "";
    
        boolean error = false;
        int counter = 1;

        while (!error && counter <= 5) {
            
            switch (counter) {
                case 1:
                
                System.out.println("introducir número de id del cliente");
                id = input.nextInt();
    
                if (id < IDMIN || id > IDMAX) {
                    System.out.println("error el id tiene que estar entre 111 y 999");
                    error = true;
                }
                    break; 

                case 2:
                System.out.println("introducir número de edad del cliente");
                edad = input.nextInt();

                if (edad < EDADMIN || edad > EDADMAX) {
                    System.out.println("error la edad tiene que estar entre 14 y 120 ");
                    error=true;
                }
                    break;

                case 3:
                System.out.println("introduce el tipo de venta");
                System.out.println("--------------------------");
                System.out.println("venta lliure (0)");
                System.out.println("pensionista (1)");
                System.out.println("carnet jove (2)");
                System.out.println("soci (3)");
                
                    tipusVenta = input.nextInt();

                    switch (tipusVenta) {
                        case 0:
                            tipusVentaString = VENTALLIURE;
                            break;
                        case 1:
                            tipusVentaString = PENSIONISTA;
                            break;
                        case 2:
                            tipusVentaString = CARNETJOVE;
                            break;
                        case 3:
                            tipusVentaString = SOCI;
                            break;
                        default:
                            System.out.println("error el tipo de venta es incorrecta");
                            error = true;
                            break;
                    }
                    // Añadir un break aquí
                    break;

                case 4:
                System.out.println("introducir import de la compra");
                compra = input.nextInt();
    
                if (compra < COMPRARMIN || compra > COMPRARMAX) {
                    System.out.println("error la compra tiene que estar entre 0 y 1000");
                    error = true;
                }
                    break;

                case 5:
                System.out.println("introducir el número de teléfono");
                telefon = input.nextInt();
    
                if (telefon < TELEFONMIN|| telefon > TELEFONMAX) {
                    System.out.println("error el número tiene que estar entre 111111111 y 999999999");
                    error = true;
                }
                    break;
                
            }
            counter ++;
        }
        System.out.println("ID: " + id +" | edat: "+edad+ " | Tipos de ventas: " +tipusVentaString+ " |Import " +compra+ " | Teléfono " +telefon);
            
            input.close();
        }    
}
