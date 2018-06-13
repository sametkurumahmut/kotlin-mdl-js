package kotlinmdl.components

import kotlinmdl.components.style.MdlMaterialIconBase
import kotlinmdl.internal.extensions.empty
import kotlinmdl.material.style.IMaterialIcon
import kotlinmdl.style.IMdlTextColor
import org.w3c.dom.Element

abstract class MdlIconToggleLabelBase<out T : Element> protected constructor(
        element: T,
        icon: IMaterialIcon,
        color: IMdlTextColor? = null,
        classes: String = String.empty)
    : MdlMaterialIconBase<T>(
        element.apply { classList.add(IMdlIconToggleLabel.ELEMENT_NAME) },
        icon,
        color,
        classes), IMdlIconToggleLabel<T>
