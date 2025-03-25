package mypackage;

public class CallBackExample {
    public static void main(String[] args) {
        Worker worker = new Worker(); 
    
        // Boss sets up the callback using an anonymous inner class 
    
        worker.setTaskCompleteListener(new TaskCompleteListener() {

            @Override
            public void onTaskComplete(String result) {
                System.out.println("Boss: Received callback - " + result);
            }

        }); 
    
    // Start the task 
        worker.performTask(); 
    }
}
