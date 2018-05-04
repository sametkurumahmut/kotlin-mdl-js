package kotlinmdl.components

import kotlinmdl.components.style.IMdlMaterialIcon
import org.w3c.dom.Element

interface IMdlIconButton<out T : Element> : IMdlButton<T> {

    var icon: IMdlMaterialIcon<Element>?

    companion object {

        const val MODIFIER_NAME = "mdl-button--icon"
    }
}
