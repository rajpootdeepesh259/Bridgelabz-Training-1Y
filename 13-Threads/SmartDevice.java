
import java.text.SimpleDateFormat;
import java.util.Date;

class SmartDevice implements Runnable {
    private String deviceName;
    private int interval;

    public SmartDevice(String deviceName, int interval) {
        this.deviceName = deviceName;
        this.interval = interval;
    }

    
    private String getTime() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(
                        "[" + getTime() + "] " +
                        deviceName + " running (Cycle " + i + ")" +
                        " | Thread: " + Thread.currentThread().getName() +
                        " | Priority: " + Thread.currentThread().getPriority()
                );

                Thread.sleep(interval);
            }

            System.out.println(deviceName + " stopped after 5 cycles.");

        } catch (InterruptedException e) {
            System.out.println(deviceName + " interrupted.");
        }
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {

        
        SmartDevice tempSensor = new SmartDevice("Temperature Sensor", 5000);
        SmartDevice securityCam = new SmartDevice("Security Camera", 3000);
        SmartDevice lightCtrl = new SmartDevice("Light Controller", 4000);
        SmartDevice doorMonitor = new SmartDevice("Door Lock Monitor", 6000);

      
        Thread t1 = new Thread(tempSensor, "TempThread");
        Thread t2 = new Thread(securityCam, "SecurityThread");
        Thread t3 = new Thread(lightCtrl, "LightThread");
        Thread t4 = new Thread(doorMonitor, "DoorThread");

       
        t2.setPriority(10); 
        t1.setPriority(7);  
        t3.setPriority(5); 
        t4.setPriority(5);  

        
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nAll smart home devices have completed execution.");
    }
}