package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlDeletableContactChip<out T : Element> : IMdlContactChip<T>, IMdlDeletableChip<T>
