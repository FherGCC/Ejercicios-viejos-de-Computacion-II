
/**
 * Esta clase permite crear dos objetos (Luna y Sol) que se moveran en direcciones 
 * opuestas hasta sobreponerse y luego terminar de moverse.
 * 
 * @author Fhernando Castellano y Sarai Edumar 
 * @version 1.0 (19/5/2022)
 */
public class Eclipse_simple
{
    //Se definen las variables de instancias
    private Circle sol;
    private Circle luna;
    private boolean eclipse_simple;
    private boolean tamañoigual;
    
    /**
     *  Se crean dos objetos circulo, uno sera la luna y el otro sera el sol.
     *  En este caso se puede escoger si la luna y el sol son del mismo tamaño
     *  o no.
     *  
     *  "si" = Luna y sol seran del mismo tamaño.
     *  "no" = Luna y sol seran de distinto tamaño.
     */
    public Eclipse_simple(String igual_tamaño)
    {
        sol = new Circle();
        sol.changeColor("yellow");
        
        luna = new Circle();
        luna.changeColor("blue");
        luna.moveHorizontal(200);
        
        /*el programa realiza un condicional if() para saber si hacer los circulos
         * del mismo tamaño o no
         */
        sol.changeSize(50);
        
        if(igual_tamaño == "si") 
        {
            luna.changeSize(50);
            tamañoigual = true;
        }
        else if(igual_tamaño == "no")
        {
            luna.changeSize(30);   
            luna.moveVertical(10);
            tamañoigual = false;
        }
    }
    
    public void cambiartamañoluna()
    {
        //se verifica que tamaño tiene para asi hacer el cambio respectivo
        if(tamañoigual == false)
        {
            luna.changeSize(50);
            luna.moveVertical(-10);
            tamañoigual = true;
        }
        else
        {
            luna.changeSize(30);
            luna.moveVertical(10);
            tamañoigual = false;
        }
    }
    
    public void mostrar_eclipse()
    {
        //hacemos la luna y el sol visibles
        sol.makeVisible();
        luna.makeVisible();
        /*luego realizamos un condicional if() para saber hacia que direccion
         *se va a dirigir la luna y el sol durante el eclipse
         */ 
        if(eclipse_simple == false)
        {
            for(int i = 0; i < 100; i++)
            {           
                sol.slowMoveHorizontal(2);
                luna.slowMoveHorizontal(-2);
            }
            eclipse_simple = true;
        }
        else 
        {
            for(int i = 0; i < 100; i++)
            {           
                sol.slowMoveHorizontal(-2);
                luna.slowMoveHorizontal(2);
            }
            eclipse_simple = false;
        }
    }
}