package Controller;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

import Model.Analytics;
import Model.Inventory;
import Model.Product;
import Model.Seller;
import View.SellerView;

public class SellerController {
    private Seller seller;
    private Inventory inventory = new Inventory();
    private Map<String, Integer> salesData = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private SellerView view = new SellerView();

    public void start() {
        while (true) {
            int choice = view.showStartMenu();
            switch (choice) {
                case 1 -> login();
                case 2 -> {
                    return;
                }
                default -> view.showInvalidOption();
            }
        }
    }

    private void login() {
        String username = view.promptUsername();
        String password = view.promptPassword();
        seller = new Seller(username, password);
        view.showLoginSuccess();
        showDashboard();
    }

    private void showDashboard() {
        while (true) {
            int choice = view.showDashboardMenu();
            switch (choice) {
                case 1 -> addProduct();
                case 2 -> editProduct();
                case 3 -> deleteProduct();
                case 4 -> inventory.viewInventory();
                case 5 -> new Analytics(salesData).displaySales();
                case 6 -> { return; }
                default -> view.showInvalidOption();
            }
        }
    }

    private void addProduct() {
        String name = view.promptProductName();
        int stock = view.promptStockQuantity();
        inventory.addProduct(new Product(name, stock));
        salesData.put(name, 0);
        view.showProductAdded();
    }

    private void editProduct() {
        String name = view.promptProductToEdit();
        int stock = view.promptStockQuantity();
        inventory.updateStock(name, stock);
        view.showStockUpdated();
    }

    private void deleteProduct() {
        String name = view.promptProductToDelete();
        inventory.removeProduct(name);
        salesData.remove(name);
        view.showProductRemoved();
    }
}
