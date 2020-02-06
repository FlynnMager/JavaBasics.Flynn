public class Runner {
    public static void main (String[] args){
   Car Lisas = new Car(2006, "BMW", 70000, "Z4");
   System.out.println(Lisas.toString());
   Lisas.drive(100);
   System.out.println(Lisas.toString());
   Rectangle dash = new Rectangle(20,50);
   System.out.println(dash.getArea());
   System.out.println(dash.isSquare());
   System.out.println(dash.getDiagonal());
    }
}
