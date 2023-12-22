public class Ball {
    private String color;
    private double diameter;

    public Ball(String color, double diameter) {
        this.color = color;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Ball{color='" + color + "', diameter=" + diameter + '}';
    }
}
