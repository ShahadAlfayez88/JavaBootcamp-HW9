public class Book extends Product{
    private String author;

    public Book() {
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
      double disscount =   super.getPrice()*0.10;
      return super.getPrice()-disscount ;
    }

    @Override
    public String toString() {
        return super.toString()+" and product type is Book " +
                "and the author  is '" + author + '\'' ;
    }
}
