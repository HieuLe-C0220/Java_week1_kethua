public class Shape {
    String color = "Red";
    boolean filled = true;
    public Shape(){
    }
    public Shape(String color,boolean filled ){
        this.color = color;
        this.filled = filled;
    }
    protected String getColor(){
        return this.color;
    }
    protected boolean getFilled(){
        return this.filled;
    }
    protected void setColor(String color){
        this.color = color;
    }
    protected void setFilled(boolean filled){
        this.filled = filled;
    }
    public String toString(){
        return "A shape  with color of "+
                this.getColor()+" and "+
                (this.getFilled()?"Filled":"not Filled");
    }
}
