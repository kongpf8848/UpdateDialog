package com.github.kongpf8848.updatedialog.ui.dialog

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.kongpf8848.updatedialog.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_update_content_item.view.*
import kotlinx.android.synthetic.main.dialog_version_bolo.*
import kotlinx.android.synthetic.main.dialog_version_bolo.recyclerview


/**
 *网易菠萝
 */

class UpdateDialog_Bolo(context: Context) : BaseDialog(context=context) {

    override fun getLayoutId(): Int {
        return R.layout.dialog_version_bolo
    }

    override fun initView() {
        super.initView()
        negativeButton.setOnClickListener {
            dismiss()
        }
        recyclerview.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        recyclerview.adapter=UpdateAdapter(context=context,dataList = listOf("分区入口更改，搞笑视频一键看","缓存播放优化，快进观看无压力"))
    }

    internal class UpdateAdapter(
        val context: Context,
        val dataList: List<String>
    ) : RecyclerView.Adapter<UpdateAdapter.UpdateViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpdateViewHolder {
            return UpdateViewHolder(LayoutInflater.from(context).inflate(R.layout.dialog_update_content_item,parent,false))
        }

        override fun getItemCount(): Int {
           return dataList.size
        }

        override fun onBindViewHolder(holder: UpdateViewHolder, position: Int) {
            holder.itemView.apply {
                update_content_tv.text=dataList[position]
            }
        }

        class UpdateViewHolder(view: View): RecyclerView.ViewHolder(view)

    }


}