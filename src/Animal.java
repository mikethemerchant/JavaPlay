public class Animal {
    private String petName = null;

    public Animal(String name) {
        petName = name;
    }

    public Animal() {
        //do something
    }

    public String getName() {
        return petName;
    }

    public void setName(String newName) {
        this.petName = newName;
    }
}
