/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ajedrez;

/**
 *
 * @author froya
 */
public class Cronometro_Blanco {
    private long tiempoInicio;
    private long tiempoPausa;
    private boolean enMarcha;
    private boolean enPausa;

    public Cronometro_Blanco() {
        tiempoInicio = 0;
        tiempoPausa = 0;
        enMarcha = false;
        enPausa = false;
    }

    // Inicia el cronómetro
    public void iniciar() {
        if (!enMarcha) {
            tiempoInicio = System.currentTimeMillis();
            enMarcha = true;
            enPausa = false;
        }
    }

    // Pausa el cronómetro
    public void pausar() {
        if (enMarcha && !enPausa) {
            tiempoPausa = System.currentTimeMillis();
            enPausa = true;
        }
    }

    // Reanuda el cronómetro desde donde fue pausado
    public void reanudar() {
        if (enMarcha && enPausa) {
            tiempoInicio += System.currentTimeMillis() - tiempoPausa;
            enPausa = false;
        }
    }

    // Reinicia el cronómetro
    public void reiniciar() {
        tiempoInicio = System.currentTimeMillis();
        tiempoPausa = 0;
        enPausa = false;
    }

    // Obtiene el tiempo transcurrido en milisegundos
    public long obtenerTiempo() {
        if (enMarcha) {
            if (enPausa) {
                return tiempoPausa - tiempoInicio;
            } else {
                return System.currentTimeMillis() - tiempoInicio;
            }
        }
        return 0;
    }

    // Obtiene el tiempo transcurrido en formato hh:mm:ss
    public String obtenerTiempoFormato() {
        long tiempoTotal = obtenerTiempo();
        long segundos = (tiempoTotal / 1000) % 60;
        long minutos = (tiempoTotal / 60000) % 60;
        long horas = (tiempoTotal / 3600000);

        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}