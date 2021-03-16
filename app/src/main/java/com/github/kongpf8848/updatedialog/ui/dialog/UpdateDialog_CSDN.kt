package com.github.kongpf8848.updatedialog.ui.dialog

import android.content.Context
import com.github.kongpf8848.updatedialog.R
import kotlinx.android.synthetic.main.dialog_version_csdn.*

/**
 * CSDN
 */

class UpdateDialog_CSDN(context: Context) : BaseDialog(context=context) {

    override fun getLayoutId(): Int {
        return R.layout.dialog_version_csdn
    }

    override fun initView() {
        super.initView()
        cancel.setOnClickListener { dismiss() }
    }
}