package school.lesson18.task1;

import school.lesson18.task1.detal.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Scientist {
    private String name;
    private List<Detail> details;

    private List<Body> bodies;
    private List<CPU> cpus;
    private List<HDD> hdds;
    private List<Head> heads;
    private List<LeftHand> leftHands;
    private List<LeftLed> leftLeds;
    private List<RAM> rams;
    private List<RightHand> rightHands;
    private List<RightLed> rightLeds;

    private int robots;

    public Scientist(String name) {
        this.details = new ArrayList<>();
        this.robots = 0;
        this.name = name;

        this.bodies = new ArrayList<>();
        this.cpus = new ArrayList<>();
        this.hdds = new ArrayList<>();
        this.heads = new ArrayList<>();
        this.leftHands = new ArrayList<>();
        this.leftLeds = new ArrayList<>();
        this.rams = new ArrayList<>();
        this.rightHands = new ArrayList<>();
        this.rightLeds = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(Detail detail) {
        this.getDetails().add(detail);
    }

    public void getDetailsFromDamp(Damp damp) {
        Detail detail;
        while ((detail = damp.getDetail()) != null) {
            this.add(detail);
        }
    }

    public List<Detail> getDetails() {
        return this.details;
    }

    public int getRobots() {
        return robots;
    }

    public List<Body> getBodies() {
        return bodies;
    }

    public List<CPU> getCpus() {
        return cpus;
    }

    public List<HDD> getHdds() {
        return hdds;
    }

    public List<Head> getHeads() {
        return heads;
    }

    public List<LeftHand> getLeftHands() {
        return leftHands;
    }

    public List<LeftLed> getLeftLeds() {
        return leftLeds;
    }

    public List<RAM> getRams() {
        return rams;
    }

    public List<RightHand> getRightHands() {
        return rightHands;
    }

    public List<RightLed> getRightLeds() {
        return rightLeds;
    }

    public void sortingDetails() {
        while (!this.getDetails().isEmpty()) {
            if (this.getDetails().get(0) instanceof Body) {
                getBodies().add((Body) this.getDetails().remove(0));
            } else if (this.getDetails().get(0) instanceof CPU) {
                getCpus().add((CPU) this.getDetails().remove(0));
            } else if (this.getDetails().get(0) instanceof HDD) {
                getHdds().add((HDD) this.getDetails().remove(0));
            } else if (this.getDetails().get(0) instanceof Head) {
                getHeads().add((Head) this.getDetails().remove(0));
            } else if (this.getDetails().get(0) instanceof LeftHand) {
                getLeftHands().add((LeftHand) this.getDetails().remove(0));
            } else if (this.getDetails().get(0) instanceof LeftLed) {
                getLeftLeds().add((LeftLed) this.getDetails().remove(0));
            } else if (this.getDetails().get(0) instanceof RAM) {
                getRams().add((RAM) this.getDetails().remove(0));
            } else if (this.getDetails().get(0) instanceof RightHand) {
                getRightHands().add((RightHand) this.getDetails().remove(0));
            } else if (this.getDetails().get(0) instanceof RightLed) {
                getRightLeds().add((RightLed) this.getDetails().remove(0));
            } else {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("Деталь не опознана.");
                    e.printStackTrace();
                }
            }
        }

    }

    public void setRobots(int robots) {
        this.robots = robots;
    }

    public void buildRobots() {
        sortingDetails();
        List<Integer> quantityDetails = Arrays.asList(
                this.getBodies().size()
                , this.getCpus().size()
                , this.getHdds().size()
                , this.getHeads().size()
                , this.getLeftHands().size()
                , this.getLeftLeds().size()
                , this.getRams().size()
                , this.getRightHands().size(),
                this.getRightLeds().size());
        quantityDetails.sort(Comparator.comparingInt(Integer::intValue));
        int robots = quantityDetails.get(0);
        if (robots > 0) {
            for (int i = 0; i < robots; i++) {
                this.getBodies().remove(0);
                this.getCpus().remove(0);
                this.getHdds().remove(0);
                this.getHeads().remove(0);
                this.getLeftHands().remove(0);
                this.getLeftLeds().remove(0);
                this.getRams().remove(0);
                this.getRightHands().remove(0);
                this.getRightLeds().remove(0);
            }
        }
        this.setRobots(getRobots() + robots);
    }

    public int getQuantityAllSortedDetails(){
        return bodies.size()
                +cpus.size()
                +hdds.size()
                +heads.size()
                +leftHands.size()
                +leftLeds.size()
                +rams.size()
                +rightHands.size()
                +rightLeds.size();
    }
}