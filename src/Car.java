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
        if(state == false ) {
            System.out.println("it's already turn offed");;
        }
        return state = false;
    }



    // ainda tenho que implementar mais coisa
    public void accelerate() {
        if(gear == 0 || state == false)  {
            System.out.println("You can't accelerate, turn on the car or up down gear!");
        }if (gear == 1) {
            if(speed < 20 ) {
                speed += 1;
            }else {
                System.out.println("Limite de velocidade atingida!");
            }
        }if (gear == 2) {
            if(speed < 40) {
                speed += 1;
            }else {
                System.out.println("Limite de velocidade atingida!");
            }
        }if (gear == 3) {
            if(speed < 60) {
                speed += 1;
            }else {
                System.out.println("Limite de velocidade atingida!");
            }
        }if (gear == 4) {
            if(speed < 80) {
                speed += 1;
            }else {
                System.out.println("Limite de velocidade atingida!");
            }
        }if (gear == 5) {
            if(speed < 100) {
                speed += 1;
            }else {
                System.out.println("Limite de velocidade atingida!");
            }
        }if (gear == 6) {
            if(speed < 120) {
                speed += 1;
            }else {
                System.out.println("Limite de velocidade atingida!");
            }
        }if(speed > 120) {
            System.out.println("You can't accelerate!");
        }
    }



    public void decelerate() {
        if(state == false) {
            System.out.println("You can't decelarate, turn on the car!");
        }else {
            speed = -1;
        }
    }

    public void sGear() {
        if(!state) {
            gear += 1;
        }else {
            System.out.println("You can't decelarate!!");
        }
    }


    public String verifySpeed() {
        if (state) {
            return String.valueOf(speed);
        } else {
            return "O carro está desligado";
        }
    }

    public void sDirection() {
        if(speed >= 1 && speed <= 40) {
            System.out.println("Virou para um lado!");
        } else if (speed < 1) {
            System.out.println("Velocidade muito baixa!");
        }else {
            System.out.println("Velocidade muito alta!");
        }
    }


}
