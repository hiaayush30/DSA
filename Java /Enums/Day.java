public enum Day {
    // each of them is a final instance of final class Day
    // SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
    // or
    SUNDAY(100), 
    MONDAY(200),
    TUESDAY(300),
    WEDNESDAY(400),
    THURSDAY(500),
    FRIDAY(600),
    SATURDAY(700);

    //each member has a name and ordinal feild by default

    private final int dayNumber;

    // constructor fn called for each element
    Day(int dayNumber) {  //alloting a custom value to each element
        this.dayNumber = dayNumber; 
    }

    public int getDayNumber() {
        return this.dayNumber;
    }

    public String display(){
        return "Today is "+this.name();
    }
}
