package com.github.kongpf8848.updatedialog.ui.dialog

import android.content.Context
import com.github.kongpf8848.updatedialog.R
import com.kongpf.commonhelper.ScreenHelper
import kotlinx.android.synthetic.main.dialog_version_jianshu.*

/**
 * 简书
 */

class UpdateDialog_Jianshu(context: Context) : BaseDialog(context=context,
    width = ScreenHelper.getScreenWidth(context) - ScreenHelper.dp2px(context,40f)) {

    override fun getLayoutId(): Int {
        return R.layout.dialog_version_jianshu
    }

    override fun initView() {
        super.initView()
        tv_cancel.setOnClickListener { dismiss() }

    }
}