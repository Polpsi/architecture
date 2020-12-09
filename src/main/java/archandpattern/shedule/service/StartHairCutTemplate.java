package archandpattern.shedule.service;

public abstract class StartHairCutTemplate {

    protected final void startHaircut() {
        getCutter();
        hairCut();
        putCutter();
    };

    protected abstract void getCutter();

    protected abstract void hairCut();

    protected abstract void putCutter();
}
