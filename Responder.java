/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */

import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

public class Responder
{
    private Random aleatorio;
    private ArrayList<String> opciones;
    private HashMap<String, String> respuestasAsociadas;

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
        respuestasAsociadas = new HashMap<String, String>();
        respuestasAsociadas.put("lento","reinicia el equipo" );
        respuestasAsociadas.put("enciende", "enchúfalo");
        respuestasAsociadas.put("apaga", "tíralo a la basura");
        respuestasAsociadas.put("estropeado", "vete a tienda a descambiarlo");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    /** int indexAleatorio = aleatorio.nextInt(opciones.size());
        return (opciones.get(indexAleatorio));
    */
   
    public String generateResponse(String userInput){
        String respuestaAsociada = "";
        if(respuestasAsociadas.get(userInput) != null)
            respuestaAsociada = respuestasAsociadas.get(userInput);
        else{
            int indexAleatorio = aleatorio.nextInt(opciones.size());
            respuestaAsociada = opciones.get(indexAleatorio);
        }
        return respuestaAsociada;
    }
}
