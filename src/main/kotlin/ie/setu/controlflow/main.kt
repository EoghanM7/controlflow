package ie.setu.controlflow

import java.lang.Integer.parseInt

fun main(args: Array<String>){
    println("the max number is: "+ maxOf(4,6))
    printValue(7)
    printRange(30)
    printExpressionResult(12,"12")
    printInferredType()
    printAnimal("")
}
//if as an expression
fun maxOf(a: Int, b: Int) =
    if (a > b) {
        print("a is greater than b.  ")
        a
    }else {
        print("b is greater than a.  ")
        b
    }
fun printInferredType(){
    val number = 3;
    when(number){
        is Int -> println ("My inferred type is Int")
    }
}
fun printAnimal(aString: String){
    when{
        aString.equals("Dog") -> println("A dog")
        aString.equals("Cat") -> println("A cat")
        aString.contains("pig")-> println("a pig of some sort")
        else ->{
            println("no identifiable animal")
        }
    }
}
fun printRange(value: Int){
    when(value){
        in 1..10 -> println ("Between 1..10");
        !in 10..20 -> println ("Outside 10..20")
    }
}

fun printExpressionResult(numberValue: Int, stringValue: String){
    when (numberValue){
        parseInt(stringValue) -> println("stringValue holds the same number as numberValue")
        else -> {
            println("stringValue is not the same number as numberValue")
        }
    }
}

//when construct
fun printValue(value : Int) {
    when (value) {
        1 -> println("The value is One")
        2 -> println("The value is Two")
        in 3..5 -> println("The value is between Three and Five")
        6, 7, 8 -> println("The value is either Six, Seven or Eight")
        else -> {
            println("The value is: " + value)
        }
    }
    fun printRange(value: Int) {
        when (value) {
            in 1..10 -> println("Between 1..10");
            !in 10..20 -> println("Outside 10..20")
        }
    }
}
