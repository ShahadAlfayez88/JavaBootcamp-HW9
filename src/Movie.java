public class Movie extends Product{

    private String director;

    public Movie() {

    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        double disscount =   super.getPrice()*0.15;
        return super.getPrice()-disscount ;
    }

    @Override
    public String toString() {
        return super.toString()+" and product type is Movie " +
                " and Movie director is " + director + '\'' +
                '}';
    }
}
