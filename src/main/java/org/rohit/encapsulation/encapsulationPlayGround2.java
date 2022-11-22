package org.rohit.encapsulation;

import java.lang.reflect.Field;

public class encapsulationPlayGround {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car();
        System.out.println(car.getMiles());
        car.drive(10);
        System.out.println(car.getMiles());

        Car car2=new Car();
        car2.tow(car,20);

        System.out.println("car 2 get miles :"+car2.getMiles());

        System.out.println("car 1 get miles :"+car.getMiles());

        // encapsulation is not at all about the security we can modify the filed as well

        Field field = Car.class.getDeclaredField("miles");
        field.setAccessible(true);
        field.set(car,100);

        System.out.println(car.getMiles());

    }

}
