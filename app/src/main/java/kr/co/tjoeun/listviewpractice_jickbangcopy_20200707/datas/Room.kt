package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas

class Room(val price:Int, val address : String, val floor:Int, val description : String) {

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

}