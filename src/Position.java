
class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public void setX(int value) { x = value; }
    public int getY() { return y; }
    public void setY(int value) { y = value; }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

/*game01
10
# # # # # # # # # #
# # # # # # G G G #
# B B B # # # # # #
# # # # # # # # # #
# # # # R # # # # #
# # # # R # # # # #
# # # # R # # # # #
# # # # R # # # # #
# # # # R # # # # #
# # # # # # # # # #
*/



/*game02
5
# # # # #
# A A A #
# # # # #
# # # B #
# # # B #
*/