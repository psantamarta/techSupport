import java.util.HashSet;
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
    private HashMap<HashSet, String> respuestasAsociadas;
    private HashSet<String> lento;
    private HashSet<String> enciende;
    private HashSet<String> apaga;
    private HashSet<String> estropeado;

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
        lento = new HashSet<String>();
        lento.add("va");
        lento.add("lento");
        enciende = new HashSet<String>();
        enciende.add("no");
        enciende.add("enciende");
        apaga = new HashSet<String>();
        apaga.add("se");
        apaga.add("apaga");
        estropeado = new HashSet<String>();
        estropeado.add("esta");
        estropeado.add("estropeado");
        respuestasAsociadas = new HashMap<HashSet, String>();
        respuestasAsociadas.put(lento,"reinicia el equipo" );
        respuestasAsociadas.put(enciende, "enchúfalo");
        respuestasAsociadas.put(apaga, "tíralo a la basura");
        respuestasAsociadas.put(estropeado, "vete a tienda a descambiarlo");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */

    public String generateResponse(HashSet<String> conjuntoConsulta){
        String respuestaAsociada = "";
        if(respuestasAsociadas.get(conjuntoConsulta) != null){
            respuestaAsociada = respuestasAsociadas.get(conjuntoConsulta);
        }
        else{
            int indexAleatorio = aleatorio.nextInt(opciones.size());
            respuestaAsociada = opciones.get(indexAleatorio);
        }
        return respuestaAsociada;
    }    
}


