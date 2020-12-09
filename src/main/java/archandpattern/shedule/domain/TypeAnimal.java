package archandpattern.shedule.domain;

public class TypeAnimal {
    private String classAnimal;
    private int weight;

    public TypeAnimal(String classAnimal, int weight) {
        this.classAnimal = classAnimal;
        this.weight = weight;
    }

    //Только геттеры, т.к. нечего менять мнение после принятия решения.
    public String getClassAnimal() {
        return classAnimal;
    }

    public int getWeight() {
        return weight;
    }

    public TypeAnimal getHairCut() {
        return this;
    }

}
