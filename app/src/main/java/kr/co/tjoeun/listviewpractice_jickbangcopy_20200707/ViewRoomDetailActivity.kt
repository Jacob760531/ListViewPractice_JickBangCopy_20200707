package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas.Room

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


    }

}
