import java.util.ArrayList;
import java.util.List;

class Project {
    int completionTime;
    int dueTime;

    public Project(int completionTime, int dueTime) {
        this.completionTime = completionTime;
        this.dueTime = dueTime;
    }
}

public class ProjectCompletionStatus {

    public static void main(String[] args) {
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(5, 5));
        projects.add(new Project(4, 5));
        projects.add(new Project(6, 5));
        projects.add(new Project(3, 5));
        projects.add(new Project(5, 5));

 
        int onTime = 0;
        int late = 0;
        int early = 0;
        int totalCompletionTime = 0;

        for (Project project : projects) {
            if (project.completionTime == project.dueTime) {
                onTime++;
            } else if (project.completionTime < project.dueTime) {
                early++;
            } else {
                late++;
            }

            totalCompletionTime += project.completionTime;
        }

        int numProjects = projects.size();
        double avgCompletionTime = (double) totalCompletionTime / numProjects;

     
        System.out.println("On time: " + onTime);
        System.out.println("Late: " + late);
        System.out.println("Early: " + early);
        System.out.println("Average completion time: " + avgCompletionTime);
    }
}
