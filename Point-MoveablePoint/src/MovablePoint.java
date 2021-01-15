import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{getXSpeed(), getYSpeed()};
    }

    public float[] move(float x, float y, float xSpeed, float ySpeed) {
        float x1 = x + xSpeed;
        float x2 = y + ySpeed;
        return new float[]{x1,x2};
    }
    @Override
    public String toString() {
        return super.toString() + ", (xSpeed, ySpeed) = "
                + Arrays.toString(getSpeed())
                +", (x+=xSpeed, y+=ySpeed) = "
                + Arrays.toString(move(getX(), getY(), getXSpeed(), getYSpeed()));
    }


}

class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(2.5f, 3.5f);
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(4, 6, 2, 4);
        System.out.println(movablePoint);
    }
}
