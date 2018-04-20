package kotlinmdl.components

import kotlinmdl.style.HasMdlRippleEffect
import kotlinmdl.style.IMdlButtonColor
import org.w3c.dom.Element

interface IMdlButton<out T : Element> : IMdlComponent<T>, HasMdlRippleEffect {

    var buttonColor: IMdlButtonColor?
    var isDisabled: Boolean

    companion object {

        const val BLOCK_NAME = "mdl-button mdl-js-button"
        const val DISABLED_MODIFIER_NAME = "mdl-button--disabled"
    }
}
