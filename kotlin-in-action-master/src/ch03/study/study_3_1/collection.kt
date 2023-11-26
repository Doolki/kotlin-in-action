package ch03.study.study_3_1
import java.util.HashSet
import java.util.ArrayList
import java.util.HashMap


//코틀린은 자신만의 컬렉션 기능만을 제공하는것이 아니여서 자바코드에 컬랙션을 코틀린 컬렉션으로 변환해줄 필요 없이 가져와서 사용 가능하다


/* 코틀린에서 자바컬랙션을 그대로 사용할수있음 */
fun main(args: Array<String>) {
    val set3 = HashSet<Int>()
    set3.addAll(listOf(1, 1, 53))
    val list3 = ArrayList<Int>()
    list3.addAll(listOf(1, 1, 53))
    val map3 = HashMap<Int, String>()
    map3[1] = "one"
    map3[7] = "seven"
    map3[53] = "fifty-three"

    // 자바 클래스의 인스턴스 생성
    val myCollection = collection(set3, list3, map3)

    // 결과 출력
    println(myCollection.getSet())
    println(myCollection.getList())
    println(myCollection.getMap())

    test_1();
}

/* 코틀린 컬랙션을 그대로 사용하여 자바 클래스에 넘겨주는것이 가능 */
fun test_1(){
    var set = hashSetOf(1, 2)
    val list = arrayListOf(1, 2, 53)
    val map = hashMapOf(1 to "one", 7 to "kt", 53 to "fifty-three")

    val myKotlinCollection = collection(set, list, map)

    println("코틀린 결과값 set: ${myKotlinCollection.getSet()}");
    println("코틀린 결과값 list: ${myKotlinCollection.getList()}");
    println("코틀린 결과값 map: ${myKotlinCollection.getMap()}");
}

//위의 소스 결과로 코틀린 컬렉션은 자바 컬렉션과 똑같은 클래스이다



//다만 다른점은 코틀린에서는 자바보다 더 많은 컬랙션 기능을 제공하고 있어서 자바의 컬렉션 코드를 더욱 활용하는것이 가능하다.
fun test_2(){
    val String = arrayListOf("frist","second","fourteenth");
    println(String.last()); //ArrayList 컬렉션에서 더 많은 기능을 코틀린에서 제공

    val number = hashSetOf(1,14,2)
    println(number.max());  //HashSet 컬렉션에서 더 많은 기능을 코틀린에서 제공
}


/*
      위의 코드를 자바로 변환하려면

      [listOf]

      List<String> stringList = Arrays.asList("first", "second", "fourteenth");
      System.out.println(stringList.get(stringList.size() - 1));

      [setOf]

       Set<Integer> number = new HashSet<>();
        number.add(1);
        number.add(14);
        number.add(2);

      int max = Integer.MIN_VALUE;
      for (int num : number) {
           if (num > max) {
                max = num;
           }
       }
       System.out.println(max);
 */