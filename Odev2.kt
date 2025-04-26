package com.example.kotlinlessons.oop

class Odev2 {
    fun soru1(degree:Int): Double {
        return degree * 1.8 + 32
    }

    fun soru2(k1:Int,k2:Int,k3:Int,k4:Int){
        println("${k1+k2+k3+k4}")
    }

    fun soru3(number:Int): Int {
        var output = 1
        for(i in number downTo 1){
            output *= i
        }
        return output
    }


    fun soru4(word:String){
        println("${word.count {it.equals('a', ignoreCase = true)}}")
    }

    fun soru5(corner:Int):Int? {
        if(corner >= 3) {
            return (corner - 2) * 180
        }else {
            println("Min corner should be 3")
            return null
        }
    }


    fun soru6(days:Int):Int{
        val hours = days * 8
        if (hours <= 160 ){
            return hours * 10
        } else {
            return 160 * 10 + (hours - 160) * 20
        }
    }

    fun soru7(kota:Int):Int{
        var price = 100
        if(kota > 50) {
            price+= (kota - 50) * 4
        }
        return price
    }
}