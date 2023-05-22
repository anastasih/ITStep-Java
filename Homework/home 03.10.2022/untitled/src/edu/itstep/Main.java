package edu.itstep;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        User user = new User("Ivan", "Ivanov", "066", "@gmail.com");
        User userCLone = (User)clone(user);
        //перевірка
        user.setMail("@ukr.net");
        System.out.println(user);
        System.out.println(userCLone);
    }
    public static Object clone(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();
        Object clone = null;
        try {
            clone = object.getClass().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.getAnnotation(BlockCopy.class) == null) {
                try {
                    field.set(clone, field.get(object));
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return clone;
    }
}
