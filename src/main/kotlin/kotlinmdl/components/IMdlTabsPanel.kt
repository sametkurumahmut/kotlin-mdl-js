package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlTabsPanel<out T : Element> : IMdlComponent<T> {

    var isActive: Boolean

    companion object {

        const val ELEMENT_NAME = "mdl-tabs__panel"
        const val IS_ACTIVE_MODIFIER_NAME = "is-active"
    }
}
