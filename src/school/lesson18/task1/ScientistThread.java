package school.lesson18.task1;

public class ScientistThread implements Runnable {
    Damp damp;
    Scientist sc;

    public ScientistThread(Damp damp, Scientist sc) {
        this.damp = damp;
        this.sc = sc;
    }

    public Damp getDamp() {
        return damp;
    }

    public Scientist getSc() {
        return sc;
    }

    public void run() {
        getSc().getDetailsFromDamp(getDamp());
        System.out.println("Деталей у ученого " + getSc().getName() + " = " + getSc().getDetails().size());
        getSc().buildRobots();
        System.out.println("Деталей отсортированных у ученого " + getSc().getName() + " = "
                + getSc().getQuantityAllSortedDetails());
        System.out.println("Роботов у ученого " + getSc().getName() + " = " + getSc().getRobots());
    }
}
