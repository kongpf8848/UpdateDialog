package com.github.kongpf8848.updatedialog.ui.dialog

import android.content.Context
import com.github.kongpf8848.updatedialog.R
import kotlinx.android.synthetic.main.dialog_version_huobi.*

/**
 * 火币
 */

class UpdateDialog_Huobi(context: Context) : BaseDialog(context=context) {

    override fun getLayoutId(): Int {
        return R.layout.dialog_version_huobi
    }

    override fun initView() {
        super.initView()
        tv_cancel.setOnClickListener { dismiss() }
    }
}