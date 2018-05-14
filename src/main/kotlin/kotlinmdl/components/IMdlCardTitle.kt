package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlCardTitle<out T : Element> : IMdlCardElement<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-card__title"
    }
}
