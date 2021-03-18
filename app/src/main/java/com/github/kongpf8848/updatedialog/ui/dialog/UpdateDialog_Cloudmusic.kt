package com.github.kongpf8848.updatedialog.ui.dialog

import android.content.Context
import com.github.kongpf8848.updatedialog.R
import com.kongpf.commonhelper.ScreenHelper

/**
 * 网易云音乐
 */

class UpdateDialog_Cloudmusic(context: Context) : BaseDialog(context=context,
    width = ScreenHelper.getScreenWidth(context) - ScreenHelper.dp2px(context,72f)) {

    override fun getLayoutId(): Int {
        return R.layout.dialog_version_cloudmusic
    }

    override fun initView() {
        super.initView()
    }
}