package Hello.ch05
// 5.4.1 자바 메서드에 람다를 인자로 전달
import ch05.Test
import ch05.NewFunctionalInterface

fun main(args: Array<String>) {
    val kotlinLambda: NewFunctionalInterface = NewFunctionalInterface {
        println("This is Kotlin lambda!")
    }
    val kotlinLambdaWithNoSAM = {
        println("This is Kotlin lambda!")
    }

    Test.newJavaMethod(kotlinLambda)
    Test.newJavaMethod({ println("No SAM possible") }) // 코틀린 람다를 자바형 인터페이스로 자동 변환
    Test.newJavaMethod(NewFunctionalInterface{ println("No SAM possible") }) // 불필요한 SAM 생성자
    Test.newJavaMethod(kotlinLambdaWithNoSAM)
    Test.newJavaMethod(kotlinLambda)

    fun runRunnable(runnable: Runnable) {
        runnable.run()
    }
//    runRunnable({ println("No SAM") }) // 코틀린 내에서는 자동 변환 안됨
    runRunnable(Runnable{ println("No SAM") }) //SAM 생성자 사용

    fun newFunctionWithVariable(name : String){
        val kotlinLambdaWithCapturedVariable: NewFunctionalInterface = NewFunctionalInterface {
            println("This is Kotlin lambda with ${name}!")
        }
        Test.newJavaMethod(kotlinLambdaWithCapturedVariable)
    }

    newFunctionWithVariable("Cindy")
}
