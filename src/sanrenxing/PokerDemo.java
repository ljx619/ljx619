package sanrenxing;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        //创建牌堆
        ArrayList<String> array = new ArrayList<String>();
        //牌堆里装牌
        //定义两个数组来分别存储花色和点数
        //花色
        String[] colors = {"♠","♣","♦","♥"};
        //numbers
        String[] numbers = {"2","3","4","5","6","7","8","9","10"};
        //装盒
        for (String color : colors){
            for (String number:numbers){
                    array.add(color+number);
                }
        }
        array.add("小王");
        array.add("大王");

        //System.out.println(array);
        //洗牌打乱
        Collections.shuffle(array);

        //发牌
        ArrayList<String> st1 = new ArrayList<>();
        ArrayList<String> st2 = new ArrayList<>();
        ArrayList<String> st3 = new ArrayList<>();
        ArrayList<String> dpArray = new ArrayList<>();

        for(int i = 0;i< array.size();i++){
            if(i>=array.size()-3){
                dpArray.add(array.get(i));
            }else if(i % 3 == 0){
                st1.add(array.get(i));
            }else if(i % 3 == 1){
                st2.add(array.get(i));
            }else if(i % 3 == 2){
                st3.add(array.get(i));
            }
        }

        lookPoker("李佳佳",st1);
        lookPoker("李佳佳",st2);
        lookPoker("李佳佳",st3);
        lookPoker("李佳佳",dpArray);


    }
    public static void lookPoker(String name,ArrayList<String> array){
        System.out.print(name+"的牌是：");
        for (String st:array){
            System.out.print(st+" ");
        }
        System.out.println();
    }
}
