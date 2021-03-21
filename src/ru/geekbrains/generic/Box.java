package ru.geekbrains.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> FRUITS;

    public Box() {
        FRUITS = new ArrayList<>();
    }

    private List<T> getFruits(){
        return FRUITS;
    }

    public double getWeight() {
        return FRUITS.stream().mapToDouble(Fruit::getWeight).sum();
    }

    public void putToAnotherBox(Box <T> box) {
        FRUITS.addAll(box.getFruits());
        box.clear();
    }

    private void clear() {
        FRUITS.clear();
    }

    public <E extends Fruit> boolean compare(Box <T> box) {
        if (getWeight() == box.getWeight()) {
            return true;
        }
        return false;
    }

    public void putToTheBox(T fruits) {
        FRUITS.addAll(Arrays.asList(fruits));
    }
}
