package com.github.kongpf8848.updatedialog.ui.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.github.kongpf8848.updatedialog.R

class MainAdapter(datas: MutableList<Pair<Int,Int>>):BaseQuickAdapter<Pair<Int,Int>,BaseViewHolder>(
    R.layout.item_menu,datas){

    override fun convert(holder: BaseViewHolder, item: Pair<Int, Int>) {
        holder.setImageResource(R.id.iv_menu,item.first)
        holder.setText(R.id.tv_title,item.second)
    }

}