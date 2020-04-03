public class Captain {
    private RowingBoat boat;

    public Captain() {
    }

    public Captain(final RowingBoat boat) {
        this.boat = boat;
    }

    void setRowingBoat(final RowingBoat boat) {
        this.boat = boat;
    }

    void row() {
        boat.row();
    }
}
