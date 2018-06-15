package kotlinmdl.components

import kotlinmdl.style.HasMdlRippleEffect
import org.w3c.dom.Element

interface IMdlSwitch<out T : Element> : IMdlComponent<T>, HasMdlRippleEffect {

    companion object {

        const val BLOCK_NAME = "mdl-switch mdl-js-switch"
    }
}
