package com.github.kongpf8848.updatedialog.ui.views

import android.content.Context
import android.util.AttributeSet
import android.widget.ScrollView
import com.github.kongpf8848.updatedialog.R
import com.kongpf.commonhelper.ScreenHelper

class MaxHeightScrollView  @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ScrollView(context, attrs, defStyleAttr) {

    private var maxHeight=0
    init {
        val ta = context.obtainStyledAttributes(attrs, R.styleable.MaxHeightScrollView)
        maxHeight = ta.getDimensionPixelSize(R.styleable.MaxHeightScrollView_maxHeight, ScreenHelper.getScreenHeight(context))
        ta.recycle()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)
        var heightSize = MeasureSpec.getSize(heightMeasureSpec)
        heightSize = if (heightSize <= maxHeight) heightSize else maxHeight

        val maxHeightMeasureSpec = MeasureSpec.makeMeasureSpec(
            heightSize,
            heightMode
        )
        super.onMeasure(widthMeasureSpec, maxHeightMeasureSpec)
    }

}