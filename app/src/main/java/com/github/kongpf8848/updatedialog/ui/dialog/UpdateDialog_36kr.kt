package com.github.kongpf8848.updatedialog.ui.dialog

import android.content.Context
import com.github.kongpf8848.updatedialog.R
import com.kongpf.commonhelper.ScreenHelper
import kotlinx.android.synthetic.main.dialog_version_36kr.*

/**
 * 36氪
 */

class UpdateDialog_36kr(context: Context) : BaseDialog(context=context,
    width = ScreenHelper.getScreenWidth(context) - ScreenHelper.dp2px(context,75f)) {

    override fun getLayoutId(): Int {
        return R.layout.dialog_version_36kr
    }

    override fun initView() {
        super.initView()
        close.setOnClickListener {
            dismiss()
        }
    }
}