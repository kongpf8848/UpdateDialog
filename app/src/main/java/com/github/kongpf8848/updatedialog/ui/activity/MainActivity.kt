package com.github.kongpf8848.updatedialog.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.github.kongpf8848.updatedialog.R
import com.github.kongpf8848.updatedialog.ui.adapter.MainAdapter
import com.github.kongpf8848.updatedialog.ui.dialog.*
import com.github.kongpf8848.updatedialog.ui.views.GridSpacingItemDecoration
import com.kongpf.commonhelper.ScreenHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        const val SPAN_COUNT=3
    }
    private val iconList= listOf(R.mipmap.icon_pdj, R.mipmap.icon_jianshu,R.mipmap.icon_csdn,
        R.mipmap.icon_dingdong,R.mipmap.icon_huobi,R.mipmap.icon_cloudmusic,
        R.mipmap.icon_wealth
    )
    private val titleList= listOf(R.string.dialog_pdj, R.string.dialog_jianshu,R.string.dialog_csdn,R.string.dialog_dingdong,R.string.dialog_huobi,R.string.dialog_cloudmusic,R.string.dialog_wealth)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview.apply {
            layoutManager=  GridLayoutManager(this@MainActivity, SPAN_COUNT)
            adapter= MainAdapter(getData()).apply {
                setOnItemClickListener { adapter, view, position ->
                    onItemClick(position)
                }
            }
            addItemDecoration(GridSpacingItemDecoration(SPAN_COUNT,ScreenHelper.dp2px(this@MainActivity,8f),true))
        }
    }

    private fun getData():MutableList<Pair<Int,Int>>{
        return mutableListOf<Pair<Int,Int>>().apply {
            addAll(iconList.zip(titleList))
        }
    }

    private fun onItemClick(position:Int){
        when(position){
            0->{
                UpdateDialog_Pdj(this).show()
            }
            1->{
                UpdateDialog_Jianshu(this).show()
            }
            2->{
                UpdateDialog_CSDN(this).show()
            }
            3->{
                UpdateDialog_Dingdong(this).show()
            }
            4->{
                UpdateDialog_Huobi(this).show()
            }
            5->{
                UpdateDialog_Cloudmusic(this).show()
            }
            6->{
                UpdateDialog_Wealth(this).show()
            }
        }
    }
}