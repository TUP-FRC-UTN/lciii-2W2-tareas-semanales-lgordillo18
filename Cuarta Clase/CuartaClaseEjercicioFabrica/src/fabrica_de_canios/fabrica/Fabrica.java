/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica_de_canios.fabrica;

import fabrica_de_canios.Produccion.Material;
import fabrica_de_canios.Produccion.Producto;
import java.util.Scanner;

/**
 *
 * @author franc
 */
/*
Desarrolle un programa principal que permita ingresar los datos de un producto, (1 SOLO PRODUCTO) 
cree un objeto de esa clase y luego posibilite mediante un menú llamar a los 
métodos de los puntos 4 a 8 todas las veces y en el orden que el usuario quiera.
*/
public class Fabrica
{
    private Scanner teclado;
    private Producto producto;
    private int cantidad;
    public Fabrica()
    {
        teclado = new Scanner(System.in);
        CantidadMateriales();
        producto = new Producto(cantidad);
        CargarDatos();
    }
    public void CantidadMateriales()
    {
        System.out.println("Ingrese la cantidad de materiales que va a tener el producto: ");
        cantidad = teclado.nextInt();
    }
    public void CargarDatos()
    {
        System.out.println("Ingrese la Descripcion del producto: ");
        teclado.nextLine();
        producto.setDescripcion(teclado.nextLine());
        System.out.println("-------------------------------------------\n"
                          +"           CARGAR MATERIALES\n"
                          +"-------------------------------------------\n");
        Material material;
        for(int x=0; x<producto.cantidadMateriales();x++)
        {
            material = new Material();
            System.out.println("[-] Material Nº "+(x+1)+"\n"
                              +"-------------------------------------------");
            System.out.println("Ingrese el codigo del material: ");
            material.setCodigo(teclado.nextInt());
            teclado.nextLine();
            
            System.out.println("Ingrese la descripcion del material: ");
            material.setDescripcion(teclado.nextLine());
            
            System.out.println("Ingrese el costo unitario del material:\n"
                              +"(Ingrese el precio con COMA. Ej: 95,50 | 0,0 |etc)"); // Ingresar con COMA
            material.setValorUnitario(teclado.nextFloat());
            System.out.println("-------------------------------------------\n");
            producto.addMaterial(material);
        }
        Menu_ConsultaDatos();
    }
    public void Menu_ConsultaDatos()
    {
        int eleccion = 0;
        do
        {
            System.out.println("            CONSULTA DE DATOS\n"
                              +"-------------------------------------------\n"
                              +"[-1-] Costo Total del Producto\n"
                              +"[-2-] Consulta por material en producto por codigo de ID\n"
                              +"[-3-] Consultar por materiales acorde a costo\n"
                              +"[-4-] Cantidad de materiales por precio\n"
                              +"[-0-] SALIR\n"
                              +"-------------------------------------------");
            eleccion = teclado.nextInt();
            switch(eleccion)
            {
                case 1:
                {
                    System.out.println("COSTO TOTAL: $"+producto.getCostoTotal()+"\n"
                                      +"-------------------------------------------\n");
                }
                break;
                case 2:
                {
                    System.out.println("Ingrese el ID del Material: ");
                    int ID = teclado.nextInt();
                    boolean resultado  = producto.materialExiste(ID);
                    if(resultado)
                    {
                        System.out.println("El material indicado \n"
                                          +"SI se Encuentra en el producto\n"
                                          +"-------------------------------------------\n");
                    }
                    else
                    {
                       System.out.println("El material indicado \n"
                                          +"NO se Encuentra en el producto\n"
                                          +"-------------------------------------------\n");
                    }
                }
                break;
                case 3:
                {
                    System.out.println("Ingrese el monto para consultar\n"
                                       +"(Se devolveran todos los materiales\n"
                                       +"cuyo costo unitario sea menor que el\n"
                                       +"monto ingresado)\n"
                                       +"ACLARACION: ingresar el valor con ,\n"
                                       +"Ej: 15,50 | 0,90 | etc");
                    float costo = teclado.nextFloat();
                    Material[] materiales_MenoresQue = producto.materialesMenorQue(costo);
                    System.out.println("-------------------------------------------\n"
                                      +"LISTA DE MATERIALES CON COSTO MENOR A : $"+costo+"\n"
                                      +"-------------------------------------------\n");
                    for(Material material : materiales_MenoresQue)
                    {
                        System.out.println(material.datosMaterial());
                    }
                }
                break;
                case 4:
                {
                    System.out.println(producto.getMaterialesPorPrecio());
                }
                break;
                case 0:
                {
                    System.out.println("Gracias por utilizar el programa");
                }
                break;
                default:
                {
                    System.out.println("ERROR: Opcion incorrecta\n"
                                      +"debe ingresar un valor entre 0 y 4");
                }
                break;
            }
        }
        while(eleccion!=0);
    }
}
