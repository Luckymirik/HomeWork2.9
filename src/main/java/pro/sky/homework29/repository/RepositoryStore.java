package pro.sky.homework29.repository;

import org.springframework.stereotype.Repository;
import pro.sky.homework29.essence.Item;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RepositoryStore {
    private int count = 1;
    private final Map<Integer, Item> store = new HashMap<>();

    @PostConstruct
    public void in(){
        store.put(count,new Item(count++,"Фильтр маслянный"));
        store.put(count,new Item(count++,"Фильтр воздущный"));
        store.put(count,new Item(count++,"Фильтр топливный"));
        store.put(count,new Item(count++,"Фильтр салонный"));
    }

    public  Item get(int id){
        return store.get(id);
    }




}
