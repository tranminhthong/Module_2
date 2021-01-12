class Myfan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean ON = false;
    private double radius = 5;
    private String color = "blue";
    private int id = 1;

    public int getId() {
        return this.id;
    }

    public void setId(int a) {
        this.id = a;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int a) {
        this.speed = a;
    }

    public boolean getON() {
        return this.ON;
    }

    public void setON(boolean a) {
        this.ON = a;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double a) {
        this.radius = a;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String a) {
        this.color = a;
    }

    public String showInfo() {
        if (this.ON) {
            return "Fan " + this.id + ": " + "Màu: " + this.getColor() + ", bán kính " + this.getRadius() + ", tốc độ " + this.getSpeed() + ", Fan is On";
        } else {
            return "Fan " + this.id + ": " + "Màu: " + this.getColor() + ", bán kính " + this.getRadius() + ", tốc độ " + this.getSpeed() + ", Fan is Off";
        }
    }

}

public class Fan {
    public static void main(String[] args) {
        Myfan Fan1 = new Myfan();
        Fan1.setSpeed(Fan1.fast);
        Fan1.setRadius(10);
        Fan1.setColor("yellow");
        Fan1.setON(true);
        Fan1.setId(1);
        System.out.println(Fan1.showInfo());

        Myfan Fan2 = new Myfan();
        Fan2.setSpeed(Fan2.medium);
        Fan2.setRadius(5);
        Fan2.setColor("blue");
        Fan2.setON(false);
        Fan2.setId(2);
        System.out.println(Fan2.showInfo());
    }
}

