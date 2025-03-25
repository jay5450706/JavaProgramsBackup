package mypackage;

    // Step 2: Create a Worker class that performs a task 
public class Worker {
    private TaskCompleteListener listener; 

    // Register the callback 
	public void setTaskCompleteListener(TaskCompleteListener listener) { 
        this.listener = listener; 
    }

    // Perform a task (simulated with a print statement) 

public void performTask() {
    System.out.println("Worker: Performing task...");

        // Task completed, call the listener

        if (listener != null) {
            listener.onTaskComplete("Task Finished Successfully!");
        }
    }
}
