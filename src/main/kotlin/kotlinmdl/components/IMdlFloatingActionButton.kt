package kotlinmdl.components

import kotlinmdl.components.style.IMdlMaterialIcon
import org.w3c.dom.Element

interface IMdlFloatingActionButton<out T : Element> : IMdlComponent<T> {

    var icon: IMdlMaterialIcon<Element>?

    companion object {

        const val MODIFIER_NAME = "mdl-button--fab"
    }
}
