package br.com.dio.challenge.domain;

public class Course extends Content{
    private int workload;

    public Course() {
    }
 
    @Override
    public double calcularXp() {
        return XP_DEFAULT * workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        
        return "Course : title = " + getTitle() 
        + ",\n          description = " + getDescription() 
        + ",\n          workload = " + workload;
    }
}
