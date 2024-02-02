package ch05.ex4_2_SAMConstructors

import kotlin.reflect.KFunction1

fun createAllDoneRunnable(): Runnable { //SAM 사용
    return Runnable { println("All done!") }
}

//fun createAllDoneRunnable2(): Runnable {
//    return { println("All done!") }
//}

fun runRunnable(runnable: Runnable) {
    runnable.run()
}

// 람다를 사용하여 코드 블록을 함수에게 인자로 전달하는 경우
fun executeWithLambda(lamda: () -> Unit) {
    lamda()
}

fun main(args: Array<String>) {
    createAllDoneRunnable().run()

    executeWithLambda {
        println("This code is inside the lambda")
    }
}
