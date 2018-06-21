package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlCardElement<out T : Element> : IMdlComponent<T> {

    var hasBorder: Boolean
    var isExpandable: Boolean

    companion object {

        const val BORDER_MODIFIER_NAME = "mdl-card--border"
        const val EXPANDABLE_MODIFIER_NAME = "mdl-card--expand"
    }
}
