package io.github.ted005;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import io.github.ted005.pojo.Dish;
import io.github.ted005.pojo.DishType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@DubboComponentScan(basePackages = "io.github.ted005.firstdubbo")
public class FirstConsumer {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CosumerConfig.class);
        context.start();

        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("鱼香肉丝", 300, false, DishType.MEAT));
        dishes.add(new Dish("糖醋里脊", 500, false, DishType.MEAT));
        dishes.add(new Dish("清炒时蔬", 80, true, DishType.VEGETABLE));
        dishes.add(new Dish("番茄炒蛋", 130, true, DishType.VEGETABLE));
        dishes.add(new Dish("清蒸桂鱼", 270, false, DishType.FISH));
        dishes.add(new Dish("鲜牛奶", 200, true, DishType.MILK));

        ConsumerService consumerService = context.getBean(ConsumerService.class);
        List<Dish> hightCaloryDishes = consumerService.getHightCaloryDishes(dishes);
        hightCaloryDishes.stream().forEach(dish -> System.out.println(dish.getName()));
    }
}
