package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlMiniFloatingActionButton<out T : Element> : IMdlFloatingActionButton<T> {

    companion object {

        const val MODIFIER_NAME = "mdl-button--mini-fab"
    }
}
