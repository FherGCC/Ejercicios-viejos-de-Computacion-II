/**
 * Write a description of class Periferico here.
 * 
 * @author Fhernando Castellano
 * @version 1.0.00
 */
public class Periferico extends Hardware
{
    // Se definen las variables que se utilizaran.
    
    private String marca;
    private String modelo;
    private String equipo;
    private boolean tieneMantenimiento = false;
    
    //
    //Se procede a realizar los constructores
    //
    
    public Periferico()
    {
        marca = "Generic";
        modelo = "generico";
        equipo = "periferico";
    }
    public Periferico(String marca_n, String modelo_n, String equipo_n)
    {
        marca = marca_n;
        modelo = modelo_n;
        equipo = equipo_n;
    }
    
    //
    //Se elaboran los metodos que se relacionan con el mantenimiento
    //
    
    public void mantenimiento()
    {
        tieneMantenimiento = true;
    }
    public void mostrarMantenimiento()
    {
        if(tieneMantenimiento == true)
        {
            System.out.println("A este periferico se le ha hecho mantenimiento");
            System.out.println();
        }
        else
        {
            System.out.println("A este periferico le hace falta mantenimiento");
            System.out.println();
        }
    }
    public boolean getMantenimiento()
    {
        return tieneMantenimiento;
    }
    
    //
    //Se elaboran los metodos que se relacionan con la marca
    //
    
    public void setMarca(String marca_n)
    {
        marca = marca_n;
    }
    public void mostrarMarca()
    {
        System.out.println("la marca del dispositivo es: " + marca);
        System.out.println();
    }
    public String getMarca()
    {
        return marca;
    }
    
    //
    //Se elaboran los metodos que se relacionan con el modelo
    //
    
    public void setModelo(String modelo_n)
    {
        modelo = modelo_n;
    }
    public void mostrarModelo()
    {
        System.out.println("el modelo del dispositivo es: " + modelo);
        System.out.println();
    }
    public String getModelo()
    {
        return modelo;
    }
    
    //
    //Se elaboran los metodos que se relacionan con el equipo
    //
    
    public void setEquipo(String equipo_n)
    {
        equipo = equipo_n;
    }
    public void mostrarEquipo()
    {
        System.out.println("El dispositivo es un: " + equipo);
        System.out.println();
    }
    public String getEquipo()
    {
        return equipo;
    }
    
    
    //
    //Se elaboran los metodos que se relacionan con el equipo
    //
    
    public String toString(){
        //se sobreescribe el toString()
        String objetos = "\nPeriferico:" + "\nMarca: "+ marca + "\nModelo: " + modelo + 
        "\nEquipo: " + equipo + "\n*******************************";
        return objetos;
    }
}
