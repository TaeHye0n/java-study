package chap13_generic.exam04_generic_method;

import chap13_generic.exam02_generic_type.Box;

public class BoxingMethodExample {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.<Integer>boxing(100);
        int intValue = box1.get();

        Box<String> box2= Util.<String>boxing("홍길동");
        String strValue = box2.get();
    }
}
