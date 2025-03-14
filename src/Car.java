public class Car {
    private int speed = 0;
    private int gear = 0;
    private boolean state = false;

    public Car(int speed, int gear, boolean state) {
        this.speed = speed;
        this.gear = gear;
        this.state = state;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }



    public boolean turnOn() {
        return state = true;
    }
    public boolean turnOff() {
        if(state == false) {
            System.out.println("it's already turn offed");;
        }
        return state = false;
    }

    // ainda tenho que implementar mais coisa
    public void accelerate() {
        if(gear == 0 || state == false)  {
            System.out.println("You can't accelerate");
        }else {
             speed += 1;
        }

    }

    public int decelerate() {
        return speed = -1;
    }

    public int sGear() {
        return gear = 1;
    }

    public int verifySpeed() {
        return speed;
    }
}
