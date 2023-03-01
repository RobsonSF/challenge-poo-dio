package br.com.dio.challenge.domain;

public class Course {
    private String title;
    private String description;
    private int workload;
    public Course(String title, String description, int workload) {
        this.title = title;
        this.description = description;
        this.workload = workload;
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
    public int getWorkload() {
        return workload;
    }
    public void setWorkload(int workload) {
        this.workload = workload;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Course [title=" + title + ", description=" + description + ", workload=" + workload + "]";
    }
    
}
