/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Main extends WebsiteBase{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== Tomoro Coffee Website ===");
        
        // instance Homepage
        Homepage homepage = new Homepage();
        
        // Beranda 
        homepage.displayAboutSection();
        homepage.displaySlideshow();

        // Initialize Menu
        Menu menu = new Menu();
        menu.addProduct(new Product(1, "2023-12-26", "Kopi Susu Aren", "Kopi arabika dengan gula aren lokal dan susu segar", 18.00, "Coffee", false));
        menu.addProduct(new Product(2, "2023-12-26", "Tomoro Oat Latte", "Creamy latte dengan susu oat yang sehat", 24.00, "Coffee", true));
        menu.addProduct(new Product(3, "2023-12-26", "Manuka Oat Latte", "Perpaduan madu manuka dengan susu oat bercampur dengan kopi arabika", 30.00, "Coffee", true));
        menu.addProduct(new Product(4, "2023-12-26", "Caffe Americano", "Rasa espresso yang kuat dengan cita rasa cokelat hazelnut dan gula merah", 18.00, "Coffee", true));
        menu.addProduct(new Product(5, "2023-12-26", "Breva Latte", "Bold & rich for every sip", 30.00, "Coffee", true));
        menu.addProduct(new Product(6, "2023-12-26", "Caramel Macchiato", "Espresso dengan campuran karamel dengan susu yang lembut", 26.00, "Coffee", true));
        menu.addProduct(new Product(7, "2023-12-26", "Cappuccino", "Perpaduan espresso dengan susu dan busa yang lebih tebal", 24.00, "Coffee", true));
        menu.addProduct(new Product(8, "2023-12-26", "Caffe Mocha", "Espresso dengan kombinasi cokelat ganache dan susu yang lembut", 25.00, "Coffee", true));
        menu.addProduct(new Product(9, "2023-12-26", "Spanish Latte", "Tomoro blend espresso dengan susu yang creamy", 25.00, "Coffee", true));
        menu.addProduct(new Product(10, "2023-12-26", "Coconut Choco", "Perpaduan antara coklat premium dan susu kelapa asli", 23.00, "Non-Coffee", false));
        menu.addProduct(new Product(11, "2023-12-26", "Matcha Oat Latte", "Susu oat dengan cita rasa matcha yang khas", 28.00, "Non-Coffee", false));
        menu.addProduct(new Product(12, "2023-12-26", "Choco Oat Latte", "Rasa coklat dan susu oat yang membuat menjadi luar biasa", 28.00, "Non-Coffee", false));
        menu.addProduct(new Product(13, "2023-12-26", "Pink Pop Lemonade", "Rasa lemon yang segar ditambahkan rasa manis and it's pink!", 14.00, "Non-Coffee", false));
        menu.addProduct(new Product(14, "2023-12-26", "Jasmine Green Tea", "Teh dengan green tea dan bunga melati", 17.00, "Non-Coffee", false));
        menu.addProduct(new Product(15, "2023-12-26", "Pure Chamomile", "Teh hangan dengan chamomile yang dapat merilekskan tubuh", 17.00, "Non-Coffee", false));
        menu.addProduct(new Product(16, "2023-12-26", "Hojicha Oat Latte", "Hojicha dengan wangi khas berbalut dengan susu oat yang creamy", 30.00, "Non-Coffee", false));
        menu.addProduct(new Product(17, "2023-12-26", "Cheese Danish", "Pastry dengan keju yang creamy dalam setiap gigitan", 18.00, "Food", false));
        menu.addProduct(new Product(18, "2023-12-26", "Butter Croissant", "Butter Croissant klasik dengan lapisan yang renyah dan aroma butter asli yang khas", 15.00, "Food", true));
        menu.addProduct(new Product(19, "2023-12-26", "Cocho Danish", "Pastry yang lembut dengan kombinasi susu dan coklat yang sempurna", 15.00, "Food", true));
        menu.addProduct(new Product(20, "2023-12-26", "Cinnamon Roll", "Pastry dengan isi kayu manis dan dilapisi gula", 15.00, "Food", false));
        menu.addProduct(new Product(21, "2023-12-26", "Spanish Latte(Limited Edition Cup)", "Edisi terbatas cup tomoro coffee", 25.00, "Merchandise", true));
        menu.addProduct(new Product(22, "2023-12-26", "Cold Brew Straw Cup", "Kapasitas 480ml", 99.00, "Merchandise", false));
        menu.addProduct(new Product(23, "2023-12-26", "Tomoro Merch Cup", "Kapasitas 380ml", 119.00, "Merchandise", false));
        menu.addProduct(new Product(24, "2024-12-03", "Orange reverse oat latte", "Free character cup (Yuji Itadori)", 30.00, "JJK Series", false));
        menu.addProduct(new Product(25, "2024-12-03", "Sea salt matcha garden", "Free character cup (Megumi Fushiguro)", 30.00, "JJK Series", false));
        menu.addProduct(new Product(26, "2024-12-03", "Rosy hibiscus lemonade", "Free character cup (Nobara Kugisaki)", 30.00, "JJK Series", false));
        menu.addProduct(new Product(27, "2024-12-03", "Limitless sky blue latte", "Free character cup (Satoru Gojo)", 30.00, "JJK Series", false));
        menu.addProduct(new Product(28, "2024-01-20", "Kopi Susu Epic Combo", "Kopi susu aren + Butter Croissant + Cocho Danish", 28.00, "Epic Deals Combo", true));
        menu.addProduct(new Product(29, "2024-01-20", "Kopi Susu Cinnamon Roll", "Kopi Susu Aren + Cinnamon Roll", 36.00, "Epic Deals Combo", true));
        menu.addProduct(new Product(30, "2024-01-20", "Chocolate Epic Combo", "Choco Oat Latte + Butter Croissant + Cocho Danish", 31.00, "Epic Deals Combo", true));
        menu.addProduct(new Product(31, "2024-01-20", "Caffe Latte Epic Combo", "Caffe Latte + Butter Croissant + Cocho Danish", 31.00, "Epic Deals Combo", true));
        
        
        // Initialize Stores
        FindStore findStore = new FindStore();
        findStore.addStore("Tomoro Jakarta", -6.200000, 106.816666);
        findStore.addStore("Tomoro Bandung", -6.900000, 107.600000);
        findStore.addStore("Tomoro Purwokerto", -7.424913, 109.233496);
        findStore.addStore("Tomoro Jogja", -7.797068, 110.370529);
        findStore.addStore("Tomoro Surabaya", -7.257472, 112.752088);
        findStore.addStore("Tomoro Semarang", -6.990402, 110.423637);
        findStore.addStore("Tomoro Solo", -7.559575, 110.823263);
        findStore.addStore("Tomoro Bali", -8.670458, 115.212629);
        findStore.addStore("Tomoro Medan", 3.595196, 98.672226);
        findStore.addStore("Tomoro Makassar", -5.147665, 119.432732);
        findStore.addStore("Tomoro Balikpapan", -1.283467, 116.851239);


        // Initialize Careers
        Career career = new Career();
        career.addJobOpening(new JobOpening(1, "2024-11-01", "Barista", "Barista", "Jakarta", "jakarta.barista@tomoro.com"));
        career.addJobOpening(new JobOpening(2, "2024-11-01", "Cashier", "Cashier", "Bandung", "bandung.cashier@tomoro.com"));
        career.addJobOpening(new JobOpening(3, "2024-11-01", "Barista", "Barista", "Makassar", "makassar.barista@tomoro.com"));
        career.addJobOpening(new JobOpening(4, "2024-11-01", "CS", "CS", "Jogja", "jogja.cs@tomoro.com"));
        
        
        ReviewFeature reviewFeature = new ReviewFeature();
        // Tambahkan beberapa ulasan contoh
        reviewFeature.addReview(new Review("John Doe", "Great coffee and excellent service!", 5));
        reviewFeature.addReview(new Review("Jane Smith", "Love the ambiance and the drinks!", 4));
        reviewFeature.addReview(new Review("Michael Johnson", "Affordable and tasty!", 5));


        // Main Menu Loop
        while (true) {
            
            System.out.println("\n1. View Menu");
            System.out.println("2. View Store Locations");
            System.out.println("3. View Careers");
            System.out.println("4. Download Mobile App");
            System.out.println("5. View Customer Reviews");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 -> {
                    System.out.println("\n--- Menu ---");
                    menu.displayAllCategories();
                    System.out.print("Enter category to view products (or 'promo' for promo products):  ");
                    String category = scanner.nextLine();
                    if (category.equalsIgnoreCase("promo")) {
                        menu.displayPromoProducts();
                    } else {
                        menu.displayByCategory(category);
                    }
                }
                case 2 -> {
                    System.out.println("\n--- Store Locations ---");
                    findStore.displayAllStores();
                }
                case 3 -> {
                    System.out.println("\n--- Careers ---");
                    career.listJobOpenings();
                }
                case 4 -> System.out.println("\nDownload the Tomoro Coffee Mobile App from the App Store or Google Play!");
                case 5 -> {
                    System.out.println("\n--- What They Say About Tomoro ---");
                    reviewFeature.displayAllReviews();
                }
                case 6 -> {
                    WebsiteBase.displayFooter(); // Display footer before exiting
                    System.out.println("Exiting... Thank you for visiting Tomoro Coffee!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
