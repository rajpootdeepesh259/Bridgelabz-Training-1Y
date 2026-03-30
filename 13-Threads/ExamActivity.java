class ExamActivity implements Runnable {
    private String activityName;
    private int startDelay; 

    public ExamActivity(String activityName, int startDelay) {
        this.activityName = activityName;
        this.startDelay = startDelay;
    }

    @Override
    public void run() {
        try {
            System.out.println(activityName + " thread state: " +
                    Thread.currentThread().getState());

            Thread.sleep(startDelay);

            for (int i = 1; i <= 3; i++) {
                System.out.println(activityName + " in progress... Step " + i +
                        " | Thread: " + Thread.currentThread().getName() +
                        " | Priority: " + Thread.currentThread().getPriority());

                Thread.sleep(2000);
            }

            System.out.println(activityName + " completed.");

        } catch (InterruptedException e) {
            System.out.println(activityName + " interrupted.");
        }
    }
}

public class ExamHallManagement {
    public static void main(String[] args) {

        ExamActivity entry = new ExamActivity("Student Entry Monitoring", 0);
        ExamActivity questionPaper = new ExamActivity("Question Paper Distribution", 5000);
        ExamActivity attendance = new ExamActivity("Attendance Marking", 10000);
        ExamActivity collection = new ExamActivity("Answer Sheet Collection", 20000);

        Thread t1 = new Thread(entry, "EntryThread");
        Thread t2 = new Thread(questionPaper, "QuestionPaperThread");
        Thread t3 = new Thread(attendance, "AttendanceThread");
        Thread t4 = new Thread(collection, "CollectionThread");

        t2.setPriority(10); 
        t3.setPriority(8);
        t4.setPriority(7);
        t1.setPriority(5); 

        System.out.println("Initial Thread States:");
        System.out.println("Entry: " + t1.getState());
        System.out.println("Question Paper: " + t2.getState());
        System.out.println("Attendance: " + t3.getState());
        System.out.println("Collection: " + t4.getState());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            Thread.sleep(2000);
            System.out.println("\nThread States after starting:");
            System.out.println("Entry: " + t1.getState());
            System.out.println("Question Paper: " + t2.getState());
            System.out.println("Attendance: " + t3.getState());
            System.out.println("Collection: " + t4.getState());

            t1.join();
            t2.join();
            t3.join();
            t4.join()

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFinal Thread States:");
        System.out.println("Entry: " + t1.getState());
        System.out.println("Question Paper: " + t2.getState());
        System.out.println("Attendance: " + t3.getState());
        System.out.println("Collection: " + t4.getState());

        System.out.println("\nAll activities completed successfully.");
    }
}