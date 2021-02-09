/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */

import java.util.Random;
import java.util.ArrayList;

public class Responder
{
    private Random aleatorio;
    private ArrayList<String> opciones;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        opciones = new ArrayList();
        opciones.add(0,"si");
        opciones.add(1,"no");
        opciones.add(2,"quizás");
        opciones.add(3,"tal vez");
        opciones.add(4,"tíralo");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int indexAleatorio = (int)(aleatorio.nextInt(opciones.size()));
        return (opciones.get(indexAleatorio));
    }
}
