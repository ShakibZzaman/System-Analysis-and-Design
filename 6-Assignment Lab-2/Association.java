public class Association {
    
       public static void main (String args[]){
            
           customer cust1 = new customer("Sakib", "Sakib163432577", "4321");
           address addr1 = new address(2, 3, "Dhanmondi", "8-A", "Dhaka", "Dhaka");
           
           System.out.println(cust1.customer() + " " + addr1.address());
           
           
           admin admin1 = new admin("Administrator", "admin", "Admin@4321");
           address addr2 = new address(4, 2, ""Dhanmondi", ", "8-A", "Dhaka", "Dhaka");
           
           
           System.out.println(admin1.admin() + " " + addr2.address());
           
           
        }
    
    
}
