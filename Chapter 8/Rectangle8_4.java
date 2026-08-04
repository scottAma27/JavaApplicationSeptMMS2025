public class Rectangle8_4{
    private double length = 1.0;
    private double width = 1.0;

    public void setLength(double length){
        if(length > 0.0 && length < 20.0)
            this.length = length;
        else
            throw new IllegalArgumentException("Length must be > 0.0 and < 20.0");
    }

    public void setWidth(double width){
        if(width > 0.0 && width < 20.0)
            this.width = width;
        else
            throw new IllegalArgumentException("Width must be > 0.0 and < 20.0");
    }

    public double getLength(){
		return length; 
		}
    public double getWidth(){ 
		return width; 
		}

    public double getPerimeter(){ 
		return 2 * (length + width); 
		}
    public double getArea(){ 
		return length * width;
		}
}