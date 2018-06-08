package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlRadioButton<out T : Element> : IMdlComponent<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-radio__button"
    }
}
