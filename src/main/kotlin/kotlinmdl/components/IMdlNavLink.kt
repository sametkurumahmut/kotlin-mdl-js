package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlNavLink<out T : Element> : IMdlComponent<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-navigation__link"
    }
}
