package teamwork.affirmingwellnessapp;

public class Nutrient {
    private String name;
    private int dailyNeed = 1;
    private int current;
    private boolean overview;
    public Nutrient(String name, int dailyNeed){
        this.name = name;
        this.dailyNeed = dailyNeed;
        current = 0;
        overview = true;
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
    public String getPercent(){
        int percent = current/dailyNeed;
        return percent + "% ";
    }
    public int getCurrent(){
        return current;
    }
    public boolean getOverview(){
        return overview;
    }
    public void setDailyNeed(int dailyNeed){
        this.dailyNeed = dailyNeed;
    }
    public void setCurrent(int current) {
        this.current = current;
    }
    public void setOverview(boolean bool){
        overview = bool;
    }


}
