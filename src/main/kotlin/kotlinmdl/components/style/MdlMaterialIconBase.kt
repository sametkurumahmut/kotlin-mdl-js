package kotlinmdl.components.style

import kotlinmdl.components.MdlComponent
import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceNewClassOfThis
import kotlinmdl.internal.extensions.setTextContentOfThis
import kotlinmdl.material.style.IMaterialIcon
import kotlinmdl.style.IMdlTextColor
import org.w3c.dom.Element

abstract class MdlMaterialIconBase<out T : Element> protected constructor(
        element: T,
        icon: IMaterialIcon,
        color: IMdlTextColor? = null,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlMaterialIcon.BLOCK_NAME) }, classes), IMdlMaterialIcon<T> {

    init {
        element.innerHTML = icon.ligature
    }

    override var color: IMdlTextColor? by this.replaceNewClassOfThis(element, color)
    override var icon by this.setTextContentOfThis(element, icon)

    override var useLigature = true
        set(value) {
            if (value) this.element.innerHTML = this.icon.ligature
            else this.element.innerHTML = this.icon.hexCharacterReference

            field = value
        }
}
