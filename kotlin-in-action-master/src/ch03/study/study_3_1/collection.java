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
}