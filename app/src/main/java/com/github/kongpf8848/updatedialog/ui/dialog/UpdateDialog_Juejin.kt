package com.github.kongpf8848.updatedialog.ui.dialog

import android.content.Context
import com.github.kongpf8848.updatedialog.R
import com.kongpf.commonhelper.ScreenHelper
import kotlinx.android.synthetic.main.dialog_version_juejin.iv_close

/**
 * Juejin
 */

class UpdateDialog_Juejin(context: Context) : BaseDialog(
    context = context,
    width = ScreenHelper.getScreenWidth(context) - ScreenHelper.dp2px(context, 72f)
) {

    override fun getLayoutId(): Int {
        return R.layout.dialog_version_juejin
    }

    override fun initView() {
        super.initView()
        iv_close.setOnClickListener { dismiss() }
    }
}