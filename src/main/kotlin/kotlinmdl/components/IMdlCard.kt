package kotlinmdl.components

import kotlinmdl.style.IMdlShadow
import org.w3c.dom.Element

interface IMdlCard<out T : Element> : IMdlComponent<T> {

    var shadow: IMdlShadow?

    companion object {

        const val BLOCK_NAME = "mdl-card"
    }
}
