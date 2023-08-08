package pro.sky.homework29.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework29.essence.Item;
import pro.sky.homework29.service.ServiceStore;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class ControllerStore {
    private final ServiceStore serviceStore;

    public ControllerStore(ServiceStore serviceStore) {
        this.serviceStore = serviceStore;
    }
    @GetMapping("/add")
    public void add(@RequestParam("id") Set<Integer> id){
        serviceStore.add(id);
    }
    @GetMapping("/get")
    public List<Item> get(){
        return serviceStore.get();
    }
}
