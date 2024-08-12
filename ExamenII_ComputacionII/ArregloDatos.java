import java.util.List;
import java.util.ArrayList;
/**
 * Clase que se encarga de crear un ArrayList para los perifericos y
 * que tiene metodos para agregar dispositivos asi como tambien imprimirlos en 
 * pantalla
 * 
 * @author Fhernando Castellano
 * @version 1.0
 */
public class ArregloDatos
{
    //
    private ArrayList<Periferico> periferico;
    
    /**
     * Constructor en donde se crea una nueva lista para los perifericos
     */
    public ArregloDatos()
    {
     periferico = new ArrayList<Periferico>();   
    }
    public void añadirPeriferico(Periferico periferico_n)
    {
        periferico.add(periferico_n);
    }
    public void listar()
    {
        for(Periferico equipos: periferico)
        {
            System.out.println(equipos);
        }
    }
}
