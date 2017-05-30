    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj_despertador;

import java.time.LocalTime;

/**
 * 
 * @author bveloso
 */
public  class Display {

    public static boolean ledclock, ledalarm, ledset;

    /**
     * show the hour
     */
   public static void showHr() {
        System.out.println(LocalTime.now().getHour() + Reloj.hora.getHour() + ":"
                + (LocalTime.now().getMinute() + Reloj.hora.getMinute())
                + ":" + LocalTime.now().getSecond());
    }

    /**
     * show the alarm hour
     */
    public static void showAlarm() {
        System.out.println(Reloj.alarma.getHour()+":"+Reloj.alarma.getMinute());
    }

    /**
     * put on/off the clock leds
     *
     * @param ledclock 
     * @param ledAlarm
     * @param ledset
     */
    public static void showLED(boolean ledclock, boolean ledAlarm, boolean ledset) {
        Display.ledclock = ledclock;
      
    }

}