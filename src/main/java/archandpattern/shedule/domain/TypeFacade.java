package archandpattern.shedule.domain;

public class TypeFacade {
    public TypeHuman getHaircutHuman(TypeHuman haircut){
        return haircut.getHairCut();
    }

    public TypeAnimal getHaircutAnimal(TypeAnimal haircut){
        return haircut.getHairCut();
    }
}
