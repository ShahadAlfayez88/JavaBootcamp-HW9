public class Main {
    public static void main(String[] args) {

        System.out.println("Question 1 - Abstract");

        Book b1 = new Book("Java Basics",75,"James");
        Movie m1 = new Movie("La La Land",100,"Damien");

        System.out.println("toString Function for Book Class \n"+b1.toString()+"\n");
        System.out.println("will have a 10% discount on "+b1.getName()+" book which is will be "+b1.getDiscount()+" of the original price "+b1.getPrice());
        System.out.println();
        System.out.println("toString Function for Movie Class \n"+m1.toString()+"\n");
        System.out.println("will have a 15% discount on "+b1.getName()+" book which is will be "+m1.getDiscount()+" of the original price "+m1.getPrice());

        System.out.println("Question 2 - interface");

        MovablePoint m2 = new MovablePoint(3,5,4,7);

        System.out.println("Move up - y axis ");
        m2.moveUp();
        System.out.println("Move Down - y axis ");
        m2.moveDown();
        System.out.println("Move lef - x axis ");
        m2.moveLeft();
        System.out.println("Move Right - x axis ");
        m2.moveRight();

    }
}
