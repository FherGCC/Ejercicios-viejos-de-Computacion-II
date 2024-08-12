import java.awt.Color;

/**
 * Esta clase tiene la funcion de aplicar cuatro filtros 
 * distintos a una imagen.
 * 
 * Los filtros a aplicar son:
 * -Darker a la ezquina superior derecha.
 * -Lighter a la ezquin inferior derecha.
 * -Invert a la ezquina superior izquierda.
 * -GrayScale a la ezquina inferior izquierda.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MultiplesFiltros extends Filter
{
    /**
     * se ejecuta el constructor de la clase de la misma forma que 
     * los demas filtros existentes.
     */
    public MultiplesFiltros(String name)
    {
        super(name);
    }

    public void apply(OFImage image)
    {
        //aplica este filtro multiple a la imagen
        
        int height = image.getHeight();
        int width = image.getWidth();
        
        int medioHeight = height / 2;
        int medioWidth = width / 2;
        //Se calcula la altura y ancho de la imagen
        
        /**
         * Aplicamos el primer filtro 
         */
        for(int y = 0; y < medioHeight; y++)
        {
            for(int x = 0; x < medioWidth; x++)
            {
                Color pix = image.getPixel(x, y);
                image.setPixel(x, y, new Color(255 - pix.getRed(),
                                               255 - pix.getGreen(),
                                               255 - pix.getBlue()));
            }
        }
        
        /**
         * Aplicamos el segundo filtro
         */
        for(int y = medioHeight; y < height; y++)
        {
            for(int x = 0; x < medioWidth; x++)
            {
                Color pix = image.getPixel(x, y);
                int avg = (pix.getRed() + pix.getGreen() + pix.getBlue()) / 3;
                image.setPixel(x, y, new Color(avg, avg, avg));
            }
        }
        
        /**
         * Aplicamos el tercer filtro
         */
        for(int y = 0; y < medioHeight; y++)
        {
            for(int x = medioWidth; x < width; x++)
            {
                image.setPixel(x, y, image.getPixel(x, y).darker());
            }
        }
        
        /**
         * Aplicamos el cuarto filtro
         */
        for(int y = medioHeight; y < height; y++)
        {
            for(int x = medioWidth; x < width; x++)
            {
                image.setPixel(x, y, image.getPixel(x, y).brighter());
            }
        }
    }
}
