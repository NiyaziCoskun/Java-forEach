public class c01_Main {
    public static void main(String[] args) {
        String message = "Expiry rate";

        //get value
        //System.out.println(product1.name);

        //set value
        Product product1 = new Product();
        product1.setName("Delonghi Coffee Machine");
        product1.setDiscount(7);
        product1.setUnitPrice(1500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image.jpg");

        Product product2 = new Product();
        product2.setName("Bosch Coffee Machine");
        product2.setDiscount(5);
        product2.setUnitPrice(2500);
        product2.setUnitsInStock(2);
        product2.setImageUrl("image.jpg");

        Product product3 = new Product();
        product3.setName("Siemens Coffee Machine");
        product3.setDiscount(6);
        product3.setUnitPrice(3500);
        product3.setUnitsInStock(4);
        product3.setImageUrl("image.jpg");


        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li> " +product.getName()+ "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("015200000");
        individualCustomer.setCustomerNumber("1213541");
        individualCustomer.setFirstName("Niyaz");
        individualCustomer.setLastName("Coskun");

        CorparateCustomer corparateCustomer = new CorparateCustomer();
        corparateCustomer.setId(2);
        corparateCustomer.setCompanyName("Kodlama.io");
        corparateCustomer.setPhone("0151000000");
        corparateCustomer.setTaxNumber("111111");
        corparateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer,corparateCustomer};

    }
}

