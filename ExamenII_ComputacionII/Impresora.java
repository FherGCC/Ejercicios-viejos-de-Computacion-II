
/**
 * Write a description of class Impresora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Impresora extends Periferico
{
    // instance variables - replace the example below with your own
    public Impresora(String marca_n, String modelo_n)
    {
        super (marca_n, modelo_n, "Impresora");
    }
    
    public String toString()
    {
        return "Impresora:\n" + super.toString();
    }
    
    public void mostrarDatos()
    {
        System.out.println(toString());
    }
}
