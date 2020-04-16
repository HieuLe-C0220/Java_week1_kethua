import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f,ySpeed = 0.0f;
    public MoveablePoint() {
    }
    public MoveablePoint(float x,float y,float xSpeed,float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getxSpeed() {
        return xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[]array = {super.getX(),super.getY(),this.xSpeed,this.ySpeed};
        return array;
    }
    public void setSpeed(float x,float y,float xSpeed,float ySpeed) {
        super.getX();
        super.getY();
        this.getxSpeed();
        this.getySpeed();
    }
    public void move(){
        float a = super.getX() + this.getxSpeed();
        float b = super.getY() + this.getySpeed();
        super.setXY(a,b);
    }
    public String toString() {
        return "("+Arrays.toString(getSpeed())+")";
    }
}
