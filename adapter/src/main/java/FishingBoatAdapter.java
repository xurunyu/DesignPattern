public class FishingBoatAdapter implements RowingBoat {

    private FishingBoat boat;

    public FishingBoatAdapter() {
        this.boat = new FishingBoat();
    }

    @Override
    public void row() {
        boat.sail();
    }
}
