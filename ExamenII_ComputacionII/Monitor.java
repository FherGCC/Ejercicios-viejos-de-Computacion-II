
/**
 * Write a description of class Monitor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monitor extends Periferico
{
    // instance variables - replace the example below with your own
    private String nuevaMarca;

    public Monitor(String marca_n, String modelo_n)
    {
        super (marca_n, modelo_n, "Monitor");
    }
    
    public String toString()
    {
        return "Monitor:\n" + super.toString();
    }
    
    public void mostrarDatos()
    {
        System.out.println(toString());
    }
}
