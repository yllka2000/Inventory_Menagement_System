package org.example.client;

import org.example.Dto.ProductDto;
import org.example.Entity.Product;
import org.example.service.ProductService;
import org.example.service.ProductServiceImpl;

import java.util.List;
import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add product");
        System.out.println("2. Display All products");
        System.out.println("3. Notify low quantity product");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                createProduct(scanner);
                break;

            case 2:
                displayAllProducts();
                break;
            case 3:
                notifyLowStock();
                break;
        }
    }

    private static void displayAllProducts() {
        ProductService productService =new ProductServiceImpl();
        List<Product>productList=
                productService.displayAllProducts();
        for (int i = 0; i < 60; i++) {
            System.out.print("_");
        }
        System.out.println("");
        System.out.print("ID| ");
        System.out.print("Modeli| ");
        System.out.print("Quantity| ");
        System.out.print("Description| ");
        System.out.print("Price| ");
        System.out.print("Koha e krijimit");



        for (Product product:productList){
            System.out.println("");
            System.out.print(product.getId() + "| ");
            System.out.print(product.getModel() + "| ");

            System.out.print(product.getDescription() + "| ");

            System.out.print(product.getQuantity() + "| ");

            System.out.print(product.getPrice() + "| ");

            System.out.print(product.getQuantity() + "| ");
            System.out.print(product.getCreatedAt() + "| ");
        }
    }

    private static void notifyLowStock() {
        ProductService productService =new ProductServiceImpl();


        List<Product>productList=
                productService.notifyLowStock();
        System.out.println("Kjo eshte lista e produkteve low stock");
        for (int i = 0; i < 60; i++) {
            System.out.print("_");
        }
        System.out.println("");
        System.out.print("ID| ");
        System.out.print("Modeli| ");
        System.out.print("Quantity| ");
        System.out.print("Description| ");
        System.out.print("Price| ");
        System.out.print("Koha e krijimit");



        for (Product product:productList){
            System.out.println("");
            System.out.print(product.getId() + "| ");
            System.out.print(product.getModel() + "| ");

            System.out.print(product.getDescription() + "| ");

            System.out.print(product.getQuantity() + "| ");

            System.out.print(product.getPrice() + "| ");

            System.out.print(product.getQuantity() + "| ");
            System.out.print(product.getCreatedAt() + "| ");
        }
    }


    private static void createProduct (Scanner scanner) throws Exception {
        System.out.println("Ju lutem fusni te dhenat e produktit");
        System.out.println("Ju lutem fusni modelin e produktit");
        String model = scanner.next();
        System.out.println("Ju lutem fusni pershkrimin e produktit");
        String description = scanner.next();
        System.out.println("Ju lutem fusni cmimin e produktit");
        Double price = scanner.nextDouble();
        System.out.println("Ju lutem fusni sasine e produktit");
        Integer quantity = scanner.nextInt();
        System.out.println("MODEL");
        ProductDto productDto = new ProductDto();
        productDto.setDescription(description);
        productDto.setModel(model);
        productDto.setPrice(price);
        productDto.setQuantity(quantity);
        System.out.println(productDto.toString());
        ProductService productService = new ProductServiceImpl();
        productService.createProduct(productDto);
    }
}
