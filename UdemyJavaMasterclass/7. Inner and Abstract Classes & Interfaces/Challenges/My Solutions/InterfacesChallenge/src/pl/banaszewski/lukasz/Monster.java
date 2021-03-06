package pl.banaszewski.lukasz;

import java.util.ArrayList;

public class Monster implements Saveable {
    private String name;
    private double health;
    private ArrayList<String> progress;
    private ArrayList<String> lastSave;

    public Monster(String name) {
        this.name = name;
        this.health = 100.00d;
        this.progress = new ArrayList<>();
        this.lastSave = new ArrayList<>();
        System.out.println("New monster created: " + this.name);
    }

    @Override
    public void save() {
        this.lastSave = new ArrayList<>();
        this.lastSave.addAll(progress);
        System.out.println("Progress saved for monster " + this.name + ".");
    }

    @Override
    public ArrayList<String> progress(ArrayList<String> actions) {
        for(String action: actions) {
            this.progress.add("Monster " + this.name + ": " + action);
        }

        return this.progress;
    }

    @Override
    public void showLastSave() {
        System.out.println("#################################");
        System.out.println("List of saved actions for Monster:");
        System.out.println(this.toString());
        for(String action: this.lastSave) {
            System.out.println((this.lastSave.indexOf(action) + 1) + " - " + action + ".");
        }
        System.out.println("#################################");
    }

    @Override
    public String toString() {
        return "Monster " + this.name + " has " + String.valueOf(health) + " health points.";
    }
}