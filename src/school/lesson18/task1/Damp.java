package school.lesson18.task1;

import school.lesson18.task1.detal.Detail;
import school.lesson18.task1.detal.FactoryDetail;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class Damp {
    private final int MAX_DETAIL = 4;
    private final int BEGIN_DETAIL = 100;

    private List<Detail> details;

    public Damp() {
        details = new ArrayList<>();
        night(BEGIN_DETAIL, false);
    }

    public void night() {
        this.night(MAX_DETAIL, true);
    }

    public void night(int detail, boolean flag) {
        int maxDetail;
        if (flag) {
            Random random = new Random();
            maxDetail = random.nextInt(detail)+1;
        } else {
            maxDetail = detail;
        }
        for (int i = 0; i < maxDetail; i++) {
            this.getDetails().add(FactoryDetail.getDetail());
        }
        System.out.println("Деталей выбрашено на свалку = " + getDetails().size());
    }

    public synchronized Detail getDetail() {
        if (getDetails().size() > 0) {
            return getDetails().remove(0);
        } else {
            return null;
        }
    }

    public List<Detail> getDetails() {
        return this.details;
    }
}
