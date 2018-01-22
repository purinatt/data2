public class Car {
    static int count = 0;
    int id;
    int wheel;
    double lenght;
    double hight;
    double capacity;

    public Car() {

        this(0,0,0,0);

    }
    public Car(int a,double b,double  c,double  d){
        id = count++;
        wheel = a;
        lenght = b;
        hight = c;
        capacity = d;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", wheel=" + wheel +
                ", lenght=" + lenght +
                ", hight=" + hight +
                ", capacity=" + capacity +
                '}';
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getWheel() {
        return wheel;
    }

    public double getLenght() {
        return lenght;
    }

    public double getHight() {
        return hight;
    }
}
