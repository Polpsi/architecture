package archandpattern.shedule.service;

public class StartHairCutAnimal extends StartHairCutTemplate {
    @Override
    protected void getCutter() {
        System.out.println("Взять инструмент для стрижки животных");
    }

    @Override
    protected void hairCut() {
        System.out.println("Подстричь мордочку и спинку");
        System.out.println("Угостить вкусняшкой");
        System.out.println("Подстричь каждую из лапок");
        System.out.println("Угостить вкусняшкой");
        System.out.println("Подровнять хвост!");
        System.out.println("Угостить вкусняшкой");
        System.out.println("Вы и собачка великолепны!");
    }

    @Override
    protected void putCutter() {
        System.out.println("Убрать инструмент для стрижки животных");
    }
}
