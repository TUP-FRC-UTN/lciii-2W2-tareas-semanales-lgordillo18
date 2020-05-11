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
public class Material
{
    private int codigo;
    private String descripcion;
    private float valorUnitario;
    
    public Material()
    {
        codigo = 0;
        descripcion = "";
        valorUnitario = 0.0f;
    }
     public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public float getValorUnitario()
    {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario)
    {
        this.valorUnitario = valorUnitario;
    }
    public String datosMaterial()
    {
        return "Codigo: "+codigo+"\nDescripcion: "+descripcion+"\nCosto Unitario: "+valorUnitario;
    }
}
