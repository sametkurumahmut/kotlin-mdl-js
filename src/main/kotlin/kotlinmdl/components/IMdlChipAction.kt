package kotlinmdl.components

import kotlinmdl.components.style.IMdlMaterialIcon
import org.w3c.dom.Element

interface IMdlChipAction<out T : Element> : IMdlComponent<T> {

    var icon: IMdlMaterialIcon<Element>?

    companion object {

        const val ELEMENT_NAME = "mdl-chip__action"
    }
}
