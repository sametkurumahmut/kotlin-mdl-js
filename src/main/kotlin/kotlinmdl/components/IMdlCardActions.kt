package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlCardActions<out T : Element> : IMdlCardElement<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-card__actions"
    }
}
