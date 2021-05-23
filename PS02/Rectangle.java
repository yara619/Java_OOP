public class Rectangle {
    float length = 1.0f;
    float width = 1.0f;

    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.width = width;
        this.length = length;
    }

    public float getLength() {
        return this.length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return (double)(this.width * this.length);
    }

    public double getPerimeter() {
        return (double)(2.0F * (this.length + this.width));
    }

    public String toString() {
        return "Rectangle[length=" + this.length + ",width=" + this.width + "]";
    }
}
