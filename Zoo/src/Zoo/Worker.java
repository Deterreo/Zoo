package Zoo;

class Worker {
    private String name;
    private Animal pet;

    Worker(String name){
        this.name = name;
    }
    void takeCare(Animal pet) {
        this.pet = pet;
    }
    String feed(String food) throws WrongTypeOfFood {
        if (food.equals(pet.getRightFood())) {
            return "Animal " + pet.getName() + " has been fed up.\n";
        } else {
            throw new WrongTypeOfFood("The food for animal " + pet.getName() + " is not right!\n");
        }
    }
}