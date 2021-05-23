public class CustomerTest {
    public static void main(String[] args){
        Customer one = new Customer("Nurlan", "Shaidullaev", "310 Lenin st, Naryn", "13022020",
                1234, "n.shaidullaev");
        System.out.println(one.getPassword());
        System.out.println(one.toString());

        Customer two = new Customer("Sear Ahmad", "Shir Ahmad", "310 Lenin st, Naryn", "13022020",
                1111, "sear.ahmad");
        System.out.println(two.getPassword());
        System.out.println(two.toString());

    }
}