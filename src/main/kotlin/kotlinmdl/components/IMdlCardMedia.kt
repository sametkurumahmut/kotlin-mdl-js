package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlCardMedia<out T : Element> : IMdlComponent<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-card__media"
    }
}
