public class Domino {
    private int mTop;
    private int mBottom;
    public Domino(int top, int bottom) {
        mTop = top;
        mBottom = bottom;
    }
    public Domino() {
        mTop = 0;
        mBottom = 0;
    }
    public int getTop() {
        return mTop;
    }
    public int getBottom() {
        return mBottom;
    }
    public void setTop(int n) {
        mTop = n;
    }
    public void setBottom(int n) {
        mBottom = n;
    }
    public void flip() {
        int temp = mTop;
        mTop = mBottom;
        mBottom = temp;
    }
    public void settle() {
        if (mTop > mBottom) {
            flip();
        }
    }
    private int smallerNum() {
        return Math.min(mTop, mBottom);
    }
    private int biggerNum() {
        return Math.max(mTop, mBottom);
    }
    private int dotSum() {
        return mTop + mBottom;
    }
    public int compareTo(Domino other) {
        if (smallerNum() < other.smallerNum()) {
            return -1;
        }
        else if (smallerNum() > other.smallerNum()) {
            return 1;
        }
        if (biggerNum() < other.biggerNum()) {
            return -1;
        }
        else if (biggerNum() > other.biggerNum()) {
            return 1;
        }
        return 0;
    }
    public int compareToWeight(Domino other) {
        if (dotSum() > other.dotSum()) {
            return 1;
        }
        else if (dotSum() < other.dotSum()) {
            return -1;
        }
        return 0;
    }
    public boolean canConnect(Domino other) {
        return (mTop == other.mTop) || (mTop == other.mBottom) || (mBottom == other.mTop) || (mBottom == other.mBottom);
    }
}
