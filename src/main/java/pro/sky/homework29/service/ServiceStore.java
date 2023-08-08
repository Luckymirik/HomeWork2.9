package pro.sky.homework29.service;

import pro.sky.homework29.essence.Item;

import java.util.List;
import java.util.Set;

public interface ServiceStore {
    void add(Set<Integer> id);
    List<Item> get();
}
