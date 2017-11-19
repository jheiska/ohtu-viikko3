package ohtu;

import java.util.ArrayList;
import java.util.List;

public class Submission {

    private int week;
    private int hours;
    private List exercises = new ArrayList<>();
 //   private List totalExercises = Main.viikot.get(0).getExercises();
  //  List totalExercises = Main.viikot.getExercises();
    
    public void setWeek(int week) {
        this.week = week;
    }

    public int getWeek() {
        return week;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public List getExercises() {
        return exercises;
    }

    public void setExercises(List exercises) {
        this.exercises = exercises;
    }

    @Override
    public String toString() {
        return "Viikolla " + week + " tehtiin yhteensä " +exercises.size() + " tehtävää (yhteensä, joihin kului " + hours + " tuntia. Tehdyt tehtävät olivat "
                + exercises.toString();
    
    }
}
