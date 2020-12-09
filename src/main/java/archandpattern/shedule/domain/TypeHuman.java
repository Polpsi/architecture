package archandpattern.shedule.domain;

public class TypeHuman {
    private String gender;
    private String model;
    private int length;

    public TypeHuman(String gender, String model, int length) {
        this.gender = gender;
        this.model = model;
        this.length = length;
    }

    //Только геттеры, т.к. нечего менять мнение после принятия решения.
    public String getGender() {
        return gender;
    }

    public String getModel() {
        return model;
    }

    public int getLength() {
        return length;
    }

    public TypeHuman getHairCut() {
        return this;
    }
}
