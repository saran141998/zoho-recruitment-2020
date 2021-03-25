public class zohoStack {
    int[] internalArray=new int[100];
    int currentIndex=-1;
    public int peek() {
        return internalArray[currentIndex];
    }

    public int pop(int index) {
        return internalArray[index];
    }

    public int  push(int direction) {
        internalArray[++currentIndex] = direction;
        return currentIndex;
    }
}
