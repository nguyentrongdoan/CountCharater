import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap chuoi ban muon dem ki tu:");
        String A = input.nextLine();

//        System.out.println("nhap ki tu ma ban muon kiem tra: ");
        char C = 'a';

        int count = 0;
        for (int i =0; i < A.length(); i++){
            if (A.charAt(i) == C)
                count++;
        }
        System.out.println("so lan xuat hien cua"+ " " + C +" " + "la: " + count);
    }
}
