package PS07;

public class MyCustomer {
    private int ID;
    private String name;
    private char gender;

    public MyCustomer (int ID, String name, char gender){
        this.ID = ID;
        this.name = name;
        if (gender == 'm' || gender == 'f'){
            this.gender = gender;
        } else {
            System.out.println("Please put correct gender!");
        }
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString (){
        return  "name" + "(" + ID + ")";
    }
}