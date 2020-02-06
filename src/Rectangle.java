import com.sun.org.apache.regexp.internal.RE;

public class Rectangle {
    private double width;
    private double length;
    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getDiagonal(){
        double x= Math.sqrt(this.width*this.width+this.length*this.length);
        return x;
    }
    public boolean isSquare(){
        if(this.length==this.width){
            return true;
        }
        return false;
    }
    public double getArea(){
        double x = this.length*this.width;
        return x;
    }
}
