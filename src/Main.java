import java.io.FileWriter;
import java.util.logging.FileHandler;

//Try with resources-те колдоно ала турган Car деген класс тузунуз
//        close() деген метод "Машина жабылып жатат" деп консольго чыгаруусу керек.
//        try unchecked exceptionдарды кармап аларды игнор кылыш керек.
//        main методдо try блоктун ичинде drive() деген методду чакырыныз, ал консольго "Машина журуп жатат" деп чыгаруусу керек
//
//        Эскертуу: маселени чыгарууда try with resources колдонуу керек.
public class Main {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}