import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Candies candy1 = new Lolipop(3.6f, 5, 0, true);
        Candies candy2 = new Chocolate_candy(4.84f, 7, 83, true);
        Candies candy3 = new Chocolate_caramel_candy(8.45f, 3, 31, false);

        Sweets sweet1 = new Gummy_Bear(1f, 1, false);
        Sweets sweet2 = new Chocolate_chip_cookie(5.67f, 5, true);

        Present present = new Present(new Present_Component[]{candy1, candy2, candy3, sweet1, sweet2});

        present.sortByWeight();

        System.out.print(present.totalPrice());

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter range");

        System.out.println("\nfrom: ");
        int start = sc.nextInt();

        System.out.println("\nto: ");
        int end = sc.nextInt();

        System.out.println(present.candy_of_range(start, end));

    }
}
