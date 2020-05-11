/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica_de_canios.Produccion;

/**
 *
 * @author franc
 */
public class Producto
{
    private Material[] materiales;
    private String descripcion;
    private int indice = 0;
    
    public Producto(int cantidad_de_Materiales)
    {
        materiales = new Material[cantidad_de_Materiales];
        descripcion = "";
    }
    public String getDescripcion()
    {
        return descripcion;
    }
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
    public void addMaterial(Material material)
    {
        materiales[indice] = material;
        indice++;
    }
    public float getCostoTotal()
    {
        float costo_total = 0.0f;
        for (Material material : materiales)
        {
            costo_total += material.getValorUnitario();
        }
        return costo_total;
    }
    public int cantidadMateriales()
    {
        return materiales.length;
    }
    public boolean materialExiste(int codigoMaterial)
    {
        for(Material material : materiales)
        {
            if (material.getCodigo() == codigoMaterial)
            {
                return true;
            }
        }
        return false;
    }
    public Material[] materialesMenorQue(float valor)
    {
        Material[] menorQue = new Material[cantidad_menorQue(valor)];
        int index = 0;
        for(Material material  : materiales)
        {
            if(material.getValorUnitario()<valor)
            {
                menorQue[index] = material;
                index++;
            }
        }
        return menorQue;
    }
    private int cantidad_menorQue(float valor)
    {
        int cantidad = 0;
        for(Material material : materiales)
        {
            if(material.getValorUnitario()<valor)
            {
                cantidad++;
            }
        }
        return cantidad;
    }
    private String setSize_Rangos()
    {
        int menor11 = 0;
        int menor21 = 0;
        int menor31 = 0;
        int mayor30 = 0;
        for (Material material : materiales)
        {
            if(material.getValorUnitario()>0)
            {
                if(material.getValorUnitario()<11)
                {
                    menor11++;
                }
                else
                {
                    if(material.getValorUnitario()<21)
                    {
                        menor21++;
                    }
                    else
                    {
                        if(material.getValorUnitario()<31)
                        {
                            menor31++;
                        }
                        else
                        {
                            mayor30++;
                        }
                    }
                }
            }
        }
        return menor11+"-"+menor21+"-"+menor31+"-"+mayor30;
    }
    private int[] getSizeRangos()
    {
        String[] rangos = setSize_Rangos().split("-");
        int[] rango = new int[rangos.length];
        for(int x=0; x<rangos.length; x++)
        {
            rango[x] = Integer.parseInt(rangos[x]);
        }
        return rango;
    }
    public String getMaterialesPorPrecio()
    {
        int[] rangos = getSizeRangos();
        return "-------------------------------------------\n"
              +"    CANTIDAD DE MATERIALES POR PRECIO:\n"
              +"                (RANGOS)\n"
              +"-------------------------------------------\n"
              +"[COSTO] $  0 - 10: "+rangos[0]+"\n"
              +"[COSTO] $ 11 - 20: "+rangos[1]+"\n"
              +"[COSTO] $ 21 - 30: "+rangos[2]+"\n"
              +"[COSTO] $   +30  : "+rangos[3]+"\n"
              +"-------------------------------------------\n";
    }
    /*
    Desarrolle en la clase producto un método que retorne un vector donde cada 
    casillero contenga la cantidad de materiales por precio, 
    siguiendo las siguiente regla: 
    Si 0 < precio ≤ 10 contarlo en el primer casillero. 
    Si 10 < precio ≤ 20 contarlo en el segundo casillero. 
    Si 20 < precio ≤ 30 contarlo en el tercer casillero. 
    Si precio > 30 contarlo en el cuarto casillero. 
    */
}
