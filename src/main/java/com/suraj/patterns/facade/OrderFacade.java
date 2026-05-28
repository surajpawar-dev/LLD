package com.suraj.patterns.facade;

public class OrderFacade {

    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final InvoiceService invoiceService;
    private final NotificationService notificationService;

    public OrderFacade() {
        inventoryService = new InventoryService();
        paymentService = new PaymentService();
        invoiceService = new InvoiceService();
        notificationService = new NotificationService();
    }

    public void placeOrder() {

        inventoryService.checkStock();
        paymentService.pay();
        inventoryService.reduceStock();
        invoiceService.generateInvoice();
        notificationService.sendNotify();

        System.out.println("Order placed successfully");
    }
}