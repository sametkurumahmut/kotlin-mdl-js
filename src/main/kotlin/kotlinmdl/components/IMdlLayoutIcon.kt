package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlLayoutIcon<out T : Element> : IMdlLayoutElement<T> {

    companion object {

        const val BLOCK_NAME = "mdl-layout-icon"
    }
}
