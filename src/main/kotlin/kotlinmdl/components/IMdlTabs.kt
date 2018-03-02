package kotlinmdl.components

import kotlinmdl.style.HasMdlRippleEffect
import org.w3c.dom.Element

interface IMdlTabs<out T : Element> : IMdlComponent<T>, HasMdlRippleEffect {

    companion object {

        const val ELEMENT_NAME = "mdl-tabs mdl-js-tabs"
    }
}
