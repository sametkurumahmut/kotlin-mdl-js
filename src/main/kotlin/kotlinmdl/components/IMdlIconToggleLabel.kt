package kotlinmdl.components

import kotlinmdl.components.style.IMdlMaterialIcon
import org.w3c.dom.Element

interface IMdlIconToggleLabel<out T : Element> : IMdlMaterialIcon<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-icon-toggle__label"
    }
}
