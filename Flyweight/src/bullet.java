public class bullet {
    private double radius;
    private double weight;
    private double xcoordinates;
    private double ycoordinates;
    private double zcoordinates;
    private double direction;
    private double speed;
    BulletState state;
    BulletType type;
    private byte[] image;
    private long userId;
    private double x_dir;
    private double y_dir;
    private double z_dir;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getXcoordinates() {
        return xcoordinates;
    }

    public void setXcoordinates(double xcoordinates) {
        this.xcoordinates = xcoordinates;
    }

    public double getYcoordinates() {
        return ycoordinates;
    }

    public void setYcoordinates(double ycoordinates) {
        this.ycoordinates = ycoordinates;
    }

    public double getZcoordinates() {
        return zcoordinates;
    }

    public void setZcoordinates(double zcoordinates) {
        this.zcoordinates = zcoordinates;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public BulletState getState() {
        return state;
    }

    public void setState(BulletState state) {
        this.state = state;
    }

    public BulletType getType() {
        return type;
    }

    public void setType(BulletType type) {
        this.type = type;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getX_dir() {
        return x_dir;
    }

    public void setX_dir(double x_dir) {
        this.x_dir = x_dir;
    }

    public double getY_dir() {
        return y_dir;
    }

    public void setY_dir(double y_dir) {
        this.y_dir = y_dir;
    }

    public double getZ_dir() {
        return z_dir;
    }

    public void setZ_dir(double z_dir) {
        this.z_dir = z_dir;
    }
}
