fun main() {
    var names = arrayOf("roshan", "kunal", "Harry", "Soni", "Anshu", "Chandu", "Shuuz")
    println(names.joinToString())
    println(names.toList())

//    for(i in names){
//        println(i)
//    }
    // adding element
//    names += "keshav"
//    println(names.joinToString())

    // creating array knowing the number of entries
    val initArray = Array<Int>(3) { 0 }
    println(initArray.joinToString())

    // // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
//    val asc = Array(5) { i -> (i * i).toString() } //this is a lambda expression, remember SML?
//    asc.forEach { print(it) }

    //creating a 2-D array
    val twoDarray = Array(2) { Array<Int>(2) { 0 } }
    println(twoDarray.contentDeepToString())

    //replacing the elements
    twoDarray[0][1]= 5
    twoDarray[1][0]= 7
    println(twoDarray.contentDeepToString())
}