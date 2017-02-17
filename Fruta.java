
public class Fruta
{
    private String nombre;
    private Estacion temporada;

    public Fruta(String nombre, Estacion temporada)
    {
        this.nombre = nombre;
        this.temporada = temporada;
    }
    
    public String toString()
    {
        return nombre + " (temporada: " + temporada + ")";
    }
    
    public void mostrarEstaciones()
    {
        for(Estacion estacionActual : Estacion.values())
        {
            System.out.println(estacionActual);
        }
    }
}
