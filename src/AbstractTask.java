public  abstract class AbstractTask {
    private String title;
    private String description;
    private int priority;
    private String status;
    private static int taskCounter = 0;

    public static int getTaskCounter() {
        return taskCounter;
    }

    public static void setTaskCounter(int taskCounter) {
        AbstractTask.taskCounter = taskCounter;
    }

    public void status1(boolean status){
        if (status == true) {
            System.out.println("Выполнено");
        }else {
            System.out.println("Не выполнено");
        }
    }

    public AbstractTask() {
    }

    public AbstractTask(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == "Выполнено" || status == "Не выполнено"){
            this.status = status;
        }else{
            System.out.println("недопустимо");
        }

    }

    @Override
    public String toString() {
        return "Tasks: " +
                "title: '" + title + '\'' +
                ", description: '" + description + '\'' +
                ", priority: '" + priority + '\'' +
                ", status: " + status;
    }

    void tasks() {
        System.out.print("Tasks: " +
                "title: '" + title + '\'' +
                ", description: '" + description + '\'' +
                ", priority: '" + priority + '\'' +
                ", status: " + status);
    }

    public static int getTaskCount(){
        return taskCounter;
    }



}
