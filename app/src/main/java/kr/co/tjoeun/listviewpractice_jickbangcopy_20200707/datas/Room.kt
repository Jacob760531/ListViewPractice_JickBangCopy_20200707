package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas

import java.io.Serializable

class Room(val price:Int, val address : String, val floor:Int, val description : String) : Serializable {

    fun getFormatedPrice() : String {
// 1억이 초과 미만에 따라 다르게
        if (this.price >= 10000) {
//            return "1억이상"
//            몇억? 85000 / 10000 = 8.5
            val uk = this.price / 10000
//            val rest = uk - this.price
            val rest = this.price % 10000
            return String.format("%d억 %,d만원",uk,rest)
        }
        else {
//            1억이 안되는 경우 => 8,500만원 가공
            return String.format("%,d만원",this.price)
        }
    }

    fun getFormatedFloor() : String {
//        지상층(1이상) / 반지하(0) / 지하(-1 이하)
        if (this.floor >=1) {
            return "${this.floor}층"
        }
        else if (this.floor ==0){
            return "반지하"
        }
        else {
//            들어있는 값이 음수일 경우 정수로 만듬
            return "지하 ${-1*this.floor}층"
        }
    }
}