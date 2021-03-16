package com.github.kongpf8848.updatedialog.ui.dialog

import android.content.Context
import android.view.ViewGroup
import android.widget.Toast
import com.github.kongpf8848.updatedialog.R
import kotlinx.android.synthetic.main.dialog_version_pdj.*

/**
 * 京东到家
 */

class UpdateDialog_Pdj(context: Context) : BaseDialog(context=context,width = ViewGroup.LayoutParams.MATCH_PARENT) {

    override fun getLayoutId(): Int {
        return R.layout.dialog_version_pdj
    }

    override fun initView() {
        super.initView()
        btn_ignore.setOnClickListener {
            dismiss()
        }
        btn_update.setOnClickListener {
            Toast.makeText(context,"Update",Toast.LENGTH_SHORT).show()
        }
    }
}