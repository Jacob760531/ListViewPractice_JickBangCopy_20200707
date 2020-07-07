package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.Adapter.RoomAdapter
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas.Room

class MainActivity : BaseActivity() {

    val mRoomList= ArrayList<Room>()

    lateinit var mAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
        mAdapter.notifyDataSetChanged()
    }

    override fun setupEvents() {
        mAdapter = RoomAdapter(this,R.layout.room_list_item,mRoomList)
        roomListView.adapter = mAdapter
    }

    override fun setValues() {
        mRoomList.add(Room(9000,"종로구 혜화동",0,"대학로역에서 1초"))
        mRoomList.add(Room(12000,"강남구 신사동",-1,"신사역에서 0.5초"))
        mRoomList.add(Room(6000,"마포구 망원동",2,"망원시장에서 10초"))
    }
}
