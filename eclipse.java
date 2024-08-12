/**
 * Esta clase crea dos objetos (Sol y Luna) que van a mover en direcciones
 * opuestas hasta sobreponerse y luego terminar de moverse.
 * 
 * @autor Nerio Alvarado Exp: 2017200149
 * @version 1.0 (23/5/2022)
 */
public class eclipse
{
    //se define las variables
    private Circle sol;
    private Circle luna;
    private boolean eclipse;
    private boolean mismotamanio;
    /**
     * Se crean dos ciculos, uno es la luna y el otro el sol.
     * En este caso se puede escoger si la luna y el sol son del mismo tamaño o no.
     * 
     * "si" = Luna y sol son del mismo tamaño
     * "no" = Luna y sol no seran del mismo tamaño
     */
    public eclipse(String mismo_tamanio)
    {
        sol = new Circle();
        sol.changeColor("red");
        
        luna = new Circle();
        luna.changeColor("black");
        luna.moveHorizontal(250);
        
        /*el programa realiza un condicional if() para saber si hacer los circulos
         * del mismo tamaño o no
         */
        sol.changeSize(60);
        
        if(mismo_tamanio == "si")
        {
            luna.changeSize(60);
            mismotamanio = true;
        }
        else if(mismo_tamanio == "no")
        {
            luna.changeSize(20);
            luna.moveVertical(10);
            mismotamanio = false;
        }
    }
        
    public void cambiartamanioluna()
    {
      //se observa que tamaño tiene para asi hacer el cambio
      if(mismotamanio == false)
      {
       luna.changeSize(60);
       luna.moveVertical(-10);
       mismotamanio = true;
      }
      else
      {
       luna.changeSize(20);
       luna.moveVertical(10);
       mismotamanio = false;
            }
            
            }
            public void mostrar_eclipse()
            {
                //hacemos que la luna y el sol se vea
                sol.makeVisible();
                luna.makeVisible();
                /**luego realizamos un if() para saber hacia que direccion se va dirigir
                 * la luna y el sol durante el eclipse
                 */
                if(eclipse == false)
                {
                    for(int i = 0; i < 100; i++)
                    {
                        sol.slowMoveHorizontal(2);
                        luna.slowMoveHorizontal(-2);
                    }
                    eclipse = true;
                }
                else
                {
                    for(int i = 0;i < 100; i++)
                    {
                        sol.slowMoveHorizontal(-2);
                        luna.slowMoveHorizontal(2);
                    }
                    eclipse = true;
                }
            
                
                    }
                }