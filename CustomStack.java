class CustomStack {

    private int currentIndex = -1;
    private Directions internalArray[] = new Directions[15];

    public void checkAndPush(Directions direction) {
        switch (direction) {
            case LEFT: {
                if (currentIndex!=-1 && peek() == Directions.RIGHT) { //Checking if top value is opposite
                    pop(); //Removing the opposite direction to cancel each other
                } else {
                    push(direction);
                }
                break;
            }
            case RIGHT: {
                if (currentIndex!=-1 && peek() == Directions.LEFT) { //Checking if top value is opposite
                    pop(); //Removing the opposite direction to cancel each other
                } else {
                    push(direction);
                }
                break;
            }
            case FORWARD: {
                if (currentIndex!=-1 && peek() == Directions.BACKWARD) { //Checking if top value is opposite
                    pop(); //Removing the opposite direction to cancel each other
                } else {
                    push(direction);
                }
                break;
            }
            case BACKWARD: {
                if (currentIndex!=-1 && peek() == Directions.FORWARD) { //Checking if top value is opposite
                    pop(); //Removing the opposite direction to cancel each other
                } else {
                    push(direction);
                }
                break;
            }
        }
    }

    public Directions peek() {
        return internalArray[currentIndex];
    }

    public Directions pop() {
        return internalArray[currentIndex--]; //1,2,3,4,5
    }

    private void push(Directions direction) {
        internalArray[++currentIndex] = direction;
    }

    public String finalPath() {
        String resultPath = "";
        if(currentIndex == -1) {
            resultPath += "Resulting path is empty";
        } else {
            for (int i = 0; i <= currentIndex; i++) {
                if (i == (currentIndex)) {
                    resultPath += internalArray[i];
                } else {
                    resultPath += internalArray[i] + " -> ";
                }
            }
        }
        return resultPath;
    }
}