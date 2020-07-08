package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707

import android.content.Intent
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

        roomListView.setOnItemClickListener { parent, view, position, id ->
            val clickedRoom = mRoomList[position]

//            눌린 방의 정보를 상세화면에 전달.
            val myIntent = Intent(mContext,ViewRoomDetailActivity::class.java)

//            putExtra로 방 정보 첨부 => 방 데이터를 한꺼번에 첨부
            myIntent.putExtra("room", clickedRoom)

            startActivity(myIntent)
        }
    }

    override fun setValues() {
        mRoomList.add(Room(9000,"종로구 혜화동",0,"대학로역에서 1초"))
        mRoomList.add(Room(12000,"강남구 신사동",-1,"신사역에서 0.5초"))
        mRoomList.add(Room(6000,"마포구 망원동",2,"망원시장에서 10초"))
        mAdapter = RoomAdapter(this,R.layout.room_list_item,mRoomList)
        roomListView.adapter = mAdapter
    }
}
