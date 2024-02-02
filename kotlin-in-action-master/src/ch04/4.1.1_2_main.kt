package ch04.main

interface Clickable { //인터페이스 정의
    fun click() // override 필수
    fun showOff() = println("I'm Clickable!") //디폴트 구현
}

interface Focusable {
    fun setFocus(b: Boolean) =
            println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {
    // touch를 오버라이드했기 때문에 가능
    override fun click() = println("Button was clicked")
    override fun showOff() = println("I'm Button")
}

//class Text : Clickable, Focusable  {
//    // error : 두 인터페이스에 같은 이름의 디폴트 구현 함수가 있기때문에 불가능
//    override fun click() = println("Text was clicked")
//}

class Page : Clickable, Focusable  {
    override fun click() = println("Page was clicked")

    override fun showOff() {
//        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(args: Array<String>) {
    Button().click() // Button was clicked
    Button().showOff() // I'm Button
//    Text().click() // Text was clicked
//    Text().showOff() // error
    Page().click() // Page was clicked
    Page().showOff() // error
    Page().setFocus(true)
}