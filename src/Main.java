import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        int[] numbers = {10, 5, 20, -3, 15};
        /*
        sumOfNumber(numbers);
        averageOfNumber(numbers);
        biggerNumber(numbers);
        smallestNumber(numbers);*/

        // MYSQL
        ProdottoDao table1 = new ProdottoDao();
        //table1.createDB();
        //table1.createTable();
        //table1.insertProduct(new Prodotto(1, "T-Shirt", 15.99, 100));
        //table1.insertProduct(new Prodotto(2,"Jeans",59.95,50));
        //table1.insertProduct(new Prodotto(3,"C<appello",12.50,200));
        //table1.printAllProducts();
        //table1.printByID(1);
        //table1.deleteByID(5);
        table1.updateByID(new Prodotto(1, "T-Shirt", 25.99, 200));
    }

    public static void sumOfNumber(int[] numbers){
        int result = 0;

        for(int value : numbers){
            result = value + result;
        }

        System.out.println("la somma dei numeri è: " + result);
    }

    public static void averageOfNumber(int[] numbers){
        int result = 0;

        for(int value : numbers){
            result = value + result;
        }

        result = result / numbers.length;

        System.out.println("la media dei numeri è: " + result);
    }

    public static void biggerNumber(int[] numbers){
        int result = 0;

        for(int value : numbers){
            if(value >= result){
                result = value;
            }
        }

        System.out.println("il numero maggiore è: " + result);
    }

    public static void smallestNumber(int[] numbers){
        int result = 0;

        for(int value : numbers){
            if(result == 0 || value <= result){
                result = value;
            }
        }

        System.out.println("il numero minore è: " + result);
    }
}