fun main(){
    var arr = arrayOf(5, 6, 7)

    for(i in arr.indices){
        println(i)
    }
    arr[2] = 9

//    for(i in 1..9){
//        println(i)
//    }
    println("****************")

    //decrementing loop in steps of 2
    for (i in 6 downTo 0 step 2) {
        println(i)
    }


}