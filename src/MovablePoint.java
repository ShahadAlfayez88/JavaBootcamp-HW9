public class MovablePoint implements Movable{
    private int x;
    private int xSpeed;
    private int y;
    private int ySpeed;

    public MovablePoint(int x, int xSpeed, int y, int ySpeed) {
        this.x = x;
        this.xSpeed = xSpeed;
        this.y = y;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y-=ySpeed;
        System.out.println(y);
    }

    @Override
    public void moveDown() {
        y+=ySpeed;
        System.out.println(y);

    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
        System.out.println(x);

    }

    @Override
    public void moveRight() {
        x+=xSpeed;
        System.out.println(x);

    }
}
