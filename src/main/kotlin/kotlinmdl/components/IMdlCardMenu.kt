package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlCardMenu<out T : Element> : IMdlComponent<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-card__menu"
    }
}
