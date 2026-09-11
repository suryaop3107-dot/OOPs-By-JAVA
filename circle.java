class circle {
    float r;

    circle(float r) {
        this.r = r;
    }

    void area() {
        System.out.println("Area is " +( 3.14 * r * r));
    }
}

class Main {
    public static void main(String[] args) {
        circle c = new circle(5);
        c.area();
    }
}