package kotlinmdl.components.style

import kotlinmdl.components.IMdlComponent
import kotlinmdl.material.style.IMaterialIcon
import kotlinmdl.style.IMdlTextColor
import org.w3c.dom.Element

interface IMdlMaterialIcon<out T : Element> : IMdlComponent<T> {

    var color: IMdlTextColor?
    var icon: IMaterialIcon
    var useLigature: Boolean

    companion object {

        const val BLOCK_NAME = "material-icons"
    }
}
