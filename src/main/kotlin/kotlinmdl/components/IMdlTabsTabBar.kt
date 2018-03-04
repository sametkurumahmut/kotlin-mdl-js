package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlTabsTabBar<out T : Element> : IMdlComponent<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-tabs__tab-bar"
    }
}
