public class Ship {
    private int length;
    private boolean[] hits;
    public Ship(int length) {
        this.length = length;
        hits = new boolean[length];
    }
    public int getLength() {
        return length;
    }
    public void recordHit() {
        for (int i = 0; i < hits.length; i++) {
            if (!hits[i]) {
                hits[i] = true;
                break;
            }
        }
    }
    public boolean isSunk() {
        for (boolean hit : hits) {
            if (!hit) return false;
        }
        return true;
    }
}
