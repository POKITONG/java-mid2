package collection.map.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

    Queue<Task> tasks = new ArrayDeque<>();
    int remainingTasks = 0;

    public void addTask(Task task) {
        tasks.offer(task);
        remainingTasks++;
    }

    public int getRemainingTasks() {
        return remainingTasks;
    }

    public void processNextTask() {
        tasks.peek().execute();
        tasks.poll();
        remainingTasks--;
    }
}
