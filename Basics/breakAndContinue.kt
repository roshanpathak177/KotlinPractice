fun main(){
    for( number in 1..6){
        if(number== 5){
            continue
        }
        println(number)
    }
    for( number in 1..10){
        if(number== 5){
            break
        }
        println(number)
    }
    println("End App")

    loop@ for(number in 1..10){
        println("number: $number")
        for(i in 1..7){
            println("innerLoop: $i")
            if(i == 5){
                break@loop
            }
        }
    }

    println("End App")
}