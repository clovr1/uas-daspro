import java.util.Scanner;

public class UAS1E05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahTim05 = 4; 
        String[] namaTim05 = new String[jumlahTim05];
        int[][] skor05 = new int[jumlahTim05][2];

        
        int pilihan;
        do {
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    
                    for (int i = 0; i < jumlahTim05; i++) {
                        System.out.print("Masukkan nama tim ke-" + (i+1) + ": ");
                        namaTim05[i] = input.next();
                        for (int j = 0; j < 2; j++) {
                            System.out.print("Masukkan skor untuk level " + (j+1) + ": ");
                            skor05[i][j] = input.nextInt();
                        }
                    }
                    break;
                case 2:
                    
                    System.out.println("\nTabel Skor:");
                    System.out.printf("%-15s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total");
                    for (int i = 0; i < jumlahTim05; i++) {
                        int total = skor05[i][0] + skor05[i][1];
                        System.out.printf("%-15s %-10d %-10d %-10d\n", namaTim05[i], skor05[i][0], skor05[i][1], total);
                    }
                    break;
                case 3:
                    
                    int juara = 0;
                    int skorMax = skor05[0][0] + skor05[0][1];
                    for (int i = 1; i < jumlahTim05; i++) {
                        int totalSkor = skor05[i][0] + skor05[i][1];
                        if (totalSkor > skorMax) {
                            juara = i;
                            skorMax = totalSkor;
                        }
                    }
                    System.out.println("\nSelamat kepada Tim " + namaTim05[juara] + " yang telah memenangkan kompetisi!");
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }
}
