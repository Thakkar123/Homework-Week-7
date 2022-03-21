package homework;

// Program 15 from week 7 homework

public class Wall {
        double width;       //instance variable
        double height;      //instance variable
public static void main(String[] args) {   // main method

            Wall wall = new Wall(5, 4);
            System.out.println("area= " + wall.getArea());
            wall.setHeight(-1.5);
            System.out.println("width= " + wall.getWidth());
            System.out.println("height= " + wall.getHeight());
            System.out.println("area= " + wall.getArea());
        }

public Wall(){}  // no argument constructor

public Wall(double width, double height) // parameterized constructor
            {
            this.width = width;
            this.height = height;
            if (width < 0) {
                this.width = 0;
            }
            if (height < 0) {
                this.height = 0;
            }
            }
public void setWidth(double width)  // instance method 1
            {
            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
            }
public double getWidth() // instance method 2
            {
            return width;
            }
public void setHeight(double height) // instance method 3
            {
            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
            }
public double getHeight()   // instance method 4
            {
            return height;
            }
public double getArea()  // instance method 5
            {
            return this.width * this.height;
            }
}