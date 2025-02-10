package gr.aueb.cf.ch14;

public class Dog extends Animal{
    private String bread;

    public Dog(){

    }

    public Dog(String name, int age, String bread) {
        super(name, age);
        this.bread = bread;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void searchForFood() {
        super.searchForFood();
        System.out.println("Dog ate the food.");
    }
}
