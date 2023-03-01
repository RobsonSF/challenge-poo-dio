package br.com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate date;
    
    public Mentoring() {
    }

    @Override
    public double calcularXp() {
        return XP_DEFAULT + 20d;
    }
    
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring : title = " + getTitle() 
        + ",\n          description = " + getDescription()
        + ",\n          date=" + date;
    }
}
