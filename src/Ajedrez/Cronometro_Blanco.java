
package Ajedrez;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author froya
 */
public class Cronometro_Blanco {
    private int segundos;
    private Timer timer;
    private boolean enMarcha;

    public Cronometro_Blanco() {
        this.segundos = 0;
        this.enMarcha = false;
    }

    public void iniciar() {
        if (enMarcha) return; // Si ya está en marcha, no hace nada
        enMarcha = true;
        timer = new Timer();
        
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                segundos++;
                System.out.println("Tiempo Blancas: " + formatoTiempo());
            }
        }, 1000, 1000); // Ejecuta cada segundo
    }

    public void pausar() {
        if (!enMarcha) return; // Si no está en marcha, no hace nada
        enMarcha = false;
        timer.cancel();
    }

    public void reiniciar() {
        pausar();  // Pausa el temporizador
        segundos = 0;  // Resetea los segundos
    }

    public String formatoTiempo() {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;
        return String.format("%02d:%02d:%02d", horas, minutos, segundosRestantes);
    }

    public int getSegundos() {
        return segundos;}

}
