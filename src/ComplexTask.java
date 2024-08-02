import java.util.Arrays;

public class ComplexTask extends AbstractTask{
    private AbstractTask[] subTask;
    private int subTaskCount;

    public ComplexTask() {
    }

    public ComplexTask(String title, String description, int priority) {
        super(title, description, priority);
        this.subTask = new AbstractTask[10] ;
        this.subTaskCount = subTaskCount = 0;
    }

    public void addSubTask(AbstractTask task){
        if (subTaskCount < subTask.length) {
            subTask[subTaskCount++] = task;
        }
    }

    @Override
    public String toString() {
        return "Complex Tasks " +
                "Sub tasks: " + Arrays.toString(subTask) +
                ", Total sub tasks" + subTaskCount;
    }
}
