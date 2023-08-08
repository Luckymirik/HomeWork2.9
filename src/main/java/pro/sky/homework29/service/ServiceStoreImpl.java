package pro.sky.homework29.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pro.sky.homework29.component.Basket;
import pro.sky.homework29.essence.Item;
import pro.sky.homework29.repository.RepositoryStore;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service

public class ServiceStoreImpl  implements ServiceStore{
    private final Basket basket;
    private final RepositoryStore repositoryStore;

    public ServiceStoreImpl(Basket basket, RepositoryStore repositoryStore) {
        this.basket = basket;
        this.repositoryStore = repositoryStore;
    }
    public void add(Set<Integer> id){
        basket.add(id);
    }
    public List<Item> get(){
        return basket.getNums().stream()
                .map(repositoryStore::get)
                .collect(Collectors.toList());
    }
}
