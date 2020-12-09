package archandpattern.shedule.service;

public class startHairCutHuman extends StartHairCutTemplate {
    @Override
    protected void getCutter() {
        System.out.println("Взять ножницы для людей");
    }

    @Override
    protected void hairCut() {
        System.out.println("Подстричь левую сторону");
        System.out.println("Подстричь правую сторону");
        System.out.println("Подстричь затылок");
        System.out.println("Подстричь макушку");
        System.out.println("Подровнять чёлку");
    }

    @Override
    protected void putCutter() {
        System.out.println("Убрать ножницы для людей");
    }
}
