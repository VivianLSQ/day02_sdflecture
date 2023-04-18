package sg.edu.nus.iss;

public class MountainBike extends Bicycle {
    
    public int seatHeight;

    
    //Constructor
    //Note: gear and speed part of superclass (only possible because MB is extended from parent class)
    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
        //The this keyword allows us to the class-level attribute. 
    }

    //Getter and Setter
    public MountainBike(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
        //This refers to the class-level function
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        //return "MountainBike [seatHeight=" + seatHeight + "]";
        return super.toString() + "\nSeatHeight=" + seatHeight;
    }

    

}
