/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj_despertador;

import java.time.LocalTime;
import javax.swing.JOptionPane;





/**
 * interfaz methods
 *
 * @author bveloso
 */
public class Botonera {

   public static boolean alarmActive, setHR, setAlarm;

    /**
     * set the alarm ON
     */
    public static void alarmON() {
        alarmActive = true;
        Altavoz.ringON=true;
    }

    /**
     * set the alarm OFF
     */
    public static void alarmOFF() {
        alarmActive = false;
    }

    /**
     * configure the clock hour
     */
    public static void configHr() {
       
        Display.showLED(true, false, true);
     
        int menu=Integer.parseInt(JOptionPane.showInputDialog("\n 1: Configurar hr \n 2 Configurar min \n 3 salir"));
        do{
            switch (menu){
                case 1:plushr("hora");
                break;
                
                case 2:plusMin("hora");
                    break;
            }
        
    }while(menu!=3);
        Display.showHr();
    }
    /**
     * configure the alarm hour
     */
    public static void configAlarm() {
       Display.showLED(false, true, true);
        int menu=Integer.parseInt(JOptionPane.showInputDialog("\n 1: Configurar hr \n 2 Configurar min \n 3 salir"));
        do{
            switch (menu){
                case 1:plushr("alarma");
                break;
                
                case 2:plusMin("alarma");
                    break;
            }
            
        }while(menu!=3);
       
        Display.showAlarm();
    }

    /**
     * increment the hour
     */
    public static void plusMin(String tiempo) {
       if(tiempo.equalsIgnoreCase("hora")){
       
           if (Display.ledset == true) {
            Reloj.hora=Reloj.hora.plusMinutes(1);
            Display.showHr();
        }else if(Display.ledset==true){
            Display.showAlarm();
            Reloj.alarma.plusMinutes(1);
            Display.showAlarm();
        }
    }
    }

    /**
     * increment the minutes
     */
    public static void plushr(String tiempo) {
      if(tiempo.equalsIgnoreCase("hora")){
       
           if (Display.ledset == true) {
            Reloj.hora=Reloj.hora.plusHours(1);
            Display.showHr();
        }else if(Display.ledset==true){
            Display.showAlarm();
            Reloj.alarma.plusHours(1);
            Display.showAlarm();
        }
    }
    }

    /**
     * stop the alarm melody
     */
    public static void stopAlarm() {
        if (Altavoz.ringON == true) {
            Altavoz.ringON = false;
        }
    }
}

