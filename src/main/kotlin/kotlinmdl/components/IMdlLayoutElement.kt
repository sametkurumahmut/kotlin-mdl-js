package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlLayoutElement<out T : Element> : IMdlComponent<T> {

    var isLargeScreenOnly: Boolean
    var isSmallScreenOnly: Boolean

    companion object {

        const val LARGE_SCREEN_ONLY_MODIFIER_NAME = "mdl-layout--large-screen-only"
        const val SMALL_SCREEN_ONLY_MODIFIER_NAME = "mdl-layout--small-screen-only"
    }
}
