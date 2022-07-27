package BaiTap3;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(){}
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x,float y, float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getxSpeed(){
        return xSpeed;
    }
    public void setxSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }

    public float getySpeed(){
        return ySpeed;
    }
    public void setySpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] array = new float[2];
        array[0] = xSpeed;
        array[1] = ySpeed;
        return array;
    }
    public float[] move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return getXY();
    }

    @Override
    public String toString(){
        return "("+super.toString()+",speed = "+"("+getxSpeed()+" , "+getySpeed()+")"+")";
    }
}