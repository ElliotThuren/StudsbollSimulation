public class StudsandeBoll {
    public double velocity = 0;
    public double height = 10;
    public double acceleration = -9.82;

    public void updateVelocity() {
        velocity = velocity + acceleration * 0.1;
    }

    public void updateHeight() {
        height = height + velocity * 0.1;
    }

    public String ballPosition() {
        updateVelocity();
        updateHeight();

        return velocity + " : " + height;
    }

    public static void main(String[] args) {
        StudsandeBoll studs = new StudsandeBoll();
        while(studs.ballPosition() != null) {
            System.out.println(studs.ballPosition());
        }
    }
}
