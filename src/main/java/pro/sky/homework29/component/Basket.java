package pro.sky.homework29.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Indexed;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class Basket {
    private final Set<Integer> nums = new HashSet<>();
    public void add(Set<Integer> nums){
        this.nums.addAll(nums);
    }

    public Set<Integer> getNums() {
        return Collections.unmodifiableSet(nums);
    }
}
