/**
 * Simula el juego de Piedra, Papel o tijera
 */
package ende;


public class Juego {

    public static void main(String[] args) {

        private final int EXITOS_JUGADOR1 = p1.exitos;
        private final int EXITOS_JUGADOR2 = p2.exitos;

        private Jugador p1 = new Jugador();
        private Jugador p2 = new Jugador();
        private boolean finDeJuego=false;
        private int rondasJugadas = 0;    // Número de rondas jugadas
        private int empates = 0;
        private String opcionJugador1;
        private String opcionJugador2;

        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + rondasJugadas+" *********************\n");
            System.out.println("Numero de empates: "+ empates + "\n");
            opcionJugador1=p1.opcion_al_azar();
            System.out.println("Jugador 1: " + opcionJugador1+"\t Jugador 1 - Partidas ganadas: " + EXITOS_JUGADOR1);
            opcionJugador2 = p2.opcion_al_azar();
            System.out.println("Jugador 2: " + opcionJugador2+"\t Jugador 2 - Partidas ganadas: " + EXITOS_JUGADOR2);

            if (opcionJugador1==opcionJugador2)
            {
                empates++;
                System.out.println("\n\t\t\t Empate \n");
            }else if ((opcionJugador1.equals("piedra"))&&(opcionJugador2.equals("papel")) ||
                opcionJugador1.equals("tijeras"))&&(opcionJugador2.equals("piedra")) ||
                (opcionJugador1.equals("papel"))&&(opcionJugador2.equals("tijeras"))) {

                System.out.println("Jugador 2 GANA");
                EXITOS_JUGADOR2 = ++p2.exitos;
            }
            else {
                EXITOS_JUGADOR1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            rondasJugadas++;
            if((p1.exitos>=3)||(p2.exitos>=3))
            {
                finDeJuego=true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(finDeJuego!=true);
    }
}
/**
 *
 */
class Jugador{
   
    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcion_al_azar()
    {

        private int exitos;      // número de partidas ganadas
        private int winTotal;
        private String opcion="";
        private Integer c = (int)(Math.random()*3);

        switch(c){
            case 0:
            	opcion=("piedra");
                break;
            case 1:
            	opcion=("papel");
                break;
            case 2:
            	opcion=("tijeras");
        }
        return opcion;
    }

    public void setExitos()
    {
        exitos++;
    }

    public int getExitos()
    {
        return exitos;
    }
}
