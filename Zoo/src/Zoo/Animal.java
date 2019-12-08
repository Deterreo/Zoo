package Zoo;

class Animal{
    private String name;
    private String food;
    private String rightFood;

    Animal(String name){
        this.name = name;
    }

    void setRightFood(String rightFood){
        this.rightFood = rightFood;
    }

    String getRightFood(){
        return this.rightFood;
    }

    String getName() {
        return this.name;
    }
}