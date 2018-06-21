package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlWaterfallLayoutHeader<out T : Element> : IMdlLayoutHeader<T> {

    var isTopHideable: Boolean

    companion object {

        const val HIDE_TOP_MODIFIER_NAME = "mdl-layout__header--waterfall-hide-top"
        const val MODIFIER_NAME = "mdl-layout__header--waterfall"
    }
}
