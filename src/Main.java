import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");;
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        System.out.println();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("Phuong trinh co hai nghiem phan biet: x1 = "+quadraticEquation.getRoot1()+" , x2 = "+quadraticEquation.getRoot2());;
        } else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("Phuong trinh co nghiem duy nhat: x = "+quadraticEquation.getRoot1());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
