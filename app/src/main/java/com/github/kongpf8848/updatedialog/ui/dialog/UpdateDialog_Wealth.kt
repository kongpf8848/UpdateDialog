package com.github.kongpf8848.updatedialog.ui.dialog

import android.content.Context
import com.github.kongpf8848.updatedialog.R
import com.kongpf.commonhelper.ScreenHelper
import kotlinx.android.synthetic.main.dialog_version_wealth.*

/**
 * 蚂蚁财富
 */

class UpdateDialog_Wealth(context: Context) : BaseDialog(context=context,
    width = ScreenHelper.getScreenWidth(context) - ScreenHelper.dp2px(context,80f)) {

    override fun getLayoutId(): Int {
        return R.layout.dialog_version_wealth
    }

    override fun initView() {
        super.initView()
        iv_close.setOnClickListener {
            dismiss()
        }
    }
}