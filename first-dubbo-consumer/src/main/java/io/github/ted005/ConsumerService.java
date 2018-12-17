package io.github.ted005;

import com.alibaba.dubbo.config.annotation.Reference;
import io.github.ted005.api.FirstDubboService;
import io.github.ted005.pojo.Dish;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class ConsumerService {

    @Reference
    private FirstDubboService firstDubboService;

    public List<Dish> getHightCaloryDishes(List<Dish> list) {
        return firstDubboService.filterDishes(list);
    }
}
