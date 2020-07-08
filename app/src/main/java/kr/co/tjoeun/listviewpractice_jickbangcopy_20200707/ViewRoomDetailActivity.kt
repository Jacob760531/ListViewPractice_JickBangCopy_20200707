package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_room_detail.*
import kotlinx.android.synthetic.main.room_list_item.*
import kotlinx.android.synthetic.main.room_list_item.priceTxt
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas.Room
import kotlinx.android.synthetic.main.room_list_item.addressTxt as addressTxt1

class ViewRoomDetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
        val receivedRoom = intent.getSerializableExtra("room") as Room

        priceTxt.text = receivedRoom.getFormatedPrice()
        descTxt.text = receivedRoom.description
        addressTxt.text = receivedRoom.address
        floorTxt.text = receivedRoom.getFormatedFloor()

    }

}
