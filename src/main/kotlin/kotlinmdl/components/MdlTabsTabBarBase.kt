package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlTabsTabBarBase<out T : Element> protected constructor(element: T, classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlTabsTabBar.ELEMENT_NAME) }, classes), IMdlTabsTabBar<T>
