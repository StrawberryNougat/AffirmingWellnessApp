package teamwork.affirmingwellnessapp;

public class Protein {
    private String name;
    private int dailyNeed;
    private int current;
    public Protein(String name){
        this.name = name;
        current = 0;
    }
    public void newDay(){
        current = 0;
    }

    public String getName(){
        return name;
    }
    public int getDailyNeed(){
        return dailyNeed;
    }
    public int getCurrent(){
        return current;
    }
    public void setDailyNeed(int dailyNeed){
        this.dailyNeed = dailyNeed;
    }
    public void setCurrent(int current) {
        this.current = current;
    }


}
