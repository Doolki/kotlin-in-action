package ch03.study.study_3_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class collection {

    private HashSet<Integer> set;
    private ArrayList<Integer> list;
    private HashMap<Integer, String> map;

    // Corrected constructor
    public collection(HashSet<Integer> set, ArrayList<Integer> list, HashMap<Integer, String> map){
        this.set = set;
        this.list = list;
        this.map = map;
    }

    // Getters
    public HashSet<Integer> getSet(){
        return set;
    }

    public ArrayList<Integer> getList(){
        return list;
    }

    public HashMap<Integer, String> getMap(){
        return map;
    }

    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(53);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(7, "kt");
        map.put(53, "fifty-three");

        // 결과 출력
        System.out.println("자바 결과값 set: " + set);
        System.out.println("자바 결과값 list: " + list);
        System.out.println("자바 결과값 map: " + map);
    }
}