public class Main {
    public static void main(String[] args) {
        SimpleTask simpleTask = new SimpleTask(
                "Check the documents",
                "check for fraud documents",
                10

        );

        simpleTask.tasks();

        ComplexTask task = new ComplexTask("New project","prepare everything for a new project", 10 );

        task.addSubTask(simpleTask);

        System.out.println(simpleTask);

        System.out.println(AbstractTask.getTaskCount());



    }
}