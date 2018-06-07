package kotlinmdl.components

import kotlinmdl.style.HasMdlRippleEffect
import org.w3c.dom.Element

interface IMdlRadio<out T : Element> : IMdlComponent<T>, HasMdlRippleEffect {

    companion object {

        const val BLOCK_NAME = "mdl-radio mdl-js-radio"
    }
}
