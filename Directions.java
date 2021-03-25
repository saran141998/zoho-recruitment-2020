enum Directions {
    LEFT(0), RIGHT(1), FORWARD(2), BACKWARD(3);
    private int direction;

    Directions(int direction) {
        this.direction = direction;
    }

    int getDirection() {
        return direction;
    }

}