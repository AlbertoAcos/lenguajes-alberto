package threads3;

import java.util.Calendar;

/**
 * Created by chuch on 10/07/2017.
 */
public class Aplicacion {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Calendar cal = Calendar.getInstance();
                        int hora = cal.get(Calendar.HOUR_OF_DAY);
                        int minuto = cal.get(Calendar.MINUTE);
                        int segundo = cal.get(Calendar.SECOND);
                        System.out.println("" + hora + "" + minuto + "" + segundo);
                        Thread.sleep(1000);

                    } catch (Exception e) {

                    }
                }
            }
        });
        t1.start();
    }
}



