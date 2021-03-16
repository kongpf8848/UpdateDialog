package com.github.kongpf8848.updatedialog.ui.dialog

import android.content.Context
import com.github.kongpf8848.updatedialog.R
import kotlinx.android.synthetic.main.dialog_version_dingdong.*

/**
 * 叮咚买菜
 */
class UpdateDialog_Dingdong(context: Context) : BaseDialog(context=context) {

    override fun getLayoutId(): Int {
        return R.layout.dialog_version_dingdong
    }

    override fun initView() {
        super.initView()
        tv_next_time.setOnClickListener { dismiss() }
    }
}