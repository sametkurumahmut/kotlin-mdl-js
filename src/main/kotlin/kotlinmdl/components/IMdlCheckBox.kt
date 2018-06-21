package kotlinmdl.components

import kotlinmdl.style.HasMdlRippleEffect
import org.w3c.dom.Element

interface IMdlCheckBox<out T : Element> : IMdlComponent<T>, HasMdlRippleEffect {

    companion object {

        const val BLOCK_NAME = "mdl-checkbox mdl-js-checkbox"
    }
}
