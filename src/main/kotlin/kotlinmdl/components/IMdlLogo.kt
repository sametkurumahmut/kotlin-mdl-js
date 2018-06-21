package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlLogo<out T : Element> : IMdlComponent<T> {

    companion object {

        const val BLOCK_NAME = "mdl-logo"
    }
}
