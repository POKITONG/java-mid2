package collection.map.test.queue;

public class CleanTask implements Task{
    @Override
    public void execute() {
        System.out.println("시용하지 않는 자원 정리...");
    }
}
