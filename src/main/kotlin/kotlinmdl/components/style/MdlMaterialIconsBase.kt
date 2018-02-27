package kotlinmdl.components.style

import kotlinmdl.material.style.MaterialIcons
import kotlinmdl.style.IMdlTextColor
import org.w3c.dom.Element

abstract class MdlMaterialIconsBase : IMdlMaterialIcons {

	// region Action
    override fun threeDRotation(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.threeDRotation, color, classes).apply(block)

    override fun <T : Element> threeDRotation(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.threeDRotation, color, classes) {}.apply(block)

    override fun accessibility(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.accessibility, color, classes).apply(block)

    override fun <T : Element> accessibility(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.accessibility, color, classes) {}.apply(block)

    override fun accessible(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.accessible, color, classes).apply(block)

    override fun <T : Element> accessible(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.accessible, color, classes) {}.apply(block)

    override fun accountBalance(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.accountBalance, color, classes).apply(block)

    override fun <T : Element> accountBalance(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.accountBalance, color, classes) {}.apply(block)

    override fun accountBalanceWallet(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.accountBalanceWallet, color, classes).apply(block)

    override fun <T : Element> accountBalanceWallet(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.accountBalanceWallet, color, classes) {}.apply(block)

    override fun accountBox(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.accountBox, color, classes).apply(block)

    override fun <T : Element> accountBox(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.accountBox, color, classes) {}.apply(block)

    override fun accountCircle(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.accountCircle, color, classes).apply(block)

    override fun <T : Element> accountCircle(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.accountCircle, color, classes) {}.apply(block)

    override fun addShoppingCart(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.addShoppingCart, color, classes).apply(block)

    override fun <T : Element> addShoppingCart(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.addShoppingCart, color, classes) {}.apply(block)

    override fun alarm(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.alarm, color, classes).apply(block)

    override fun <T : Element> alarm(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.alarm, color, classes) {}.apply(block)

    override fun alarmAdd(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.alarmAdd, color, classes).apply(block)

    override fun <T : Element> alarmAdd(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.alarmAdd, color, classes) {}.apply(block)

    override fun alarmOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.alarmOff, color, classes).apply(block)

    override fun <T : Element> alarmOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.alarmOff, color, classes) {}.apply(block)

    override fun alarmOn(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.alarmOn, color, classes).apply(block)

    override fun <T : Element> alarmOn(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.alarmOn, color, classes) {}.apply(block)

    override fun allOut(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.allOut, color, classes).apply(block)

    override fun <T : Element> allOut(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.allOut, color, classes) {}.apply(block)

    override fun android(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.android, color, classes).apply(block)

    override fun <T : Element> android(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.android, color, classes) {}.apply(block)

    override fun announcement(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.announcement, color, classes).apply(block)

    override fun <T : Element> announcement(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.announcement, color, classes) {}.apply(block)

    override fun aspectRatio(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.aspectRatio, color, classes).apply(block)

    override fun <T : Element> aspectRatio(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.aspectRatio, color, classes) {}.apply(block)

    override fun assessment(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.assessment, color, classes).apply(block)

    override fun <T : Element> assessment(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.assessment, color, classes) {}.apply(block)

    override fun assignment(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.assignment, color, classes).apply(block)

    override fun <T : Element> assignment(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.assignment, color, classes) {}.apply(block)

    override fun assignmentInd(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.assignmentInd, color, classes).apply(block)

    override fun <T : Element> assignmentInd(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.assignmentInd, color, classes) {}.apply(block)

    override fun assignmentLate(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.assignmentLate, color, classes).apply(block)

    override fun <T : Element> assignmentLate(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.assignmentLate, color, classes) {}.apply(block)

    override fun assignmentReturn(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.assignmentReturn, color, classes).apply(block)

    override fun <T : Element> assignmentReturn(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.assignmentReturn, color, classes) {}.apply(block)

    override fun assignmentReturned(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.assignmentReturned, color, classes).apply(block)

    override fun <T : Element> assignmentReturned(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.assignmentReturned, color, classes) {}.apply(block)

    override fun assignmentTurnedIn(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.assignmentTurnedIn, color, classes).apply(block)

    override fun <T : Element> assignmentTurnedIn(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.assignmentTurnedIn, color, classes) {}.apply(block)

    override fun autorenew(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.autorenew, color, classes).apply(block)

    override fun <T : Element> autorenew(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.autorenew, color, classes) {}.apply(block)

    override fun backup(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.backup, color, classes).apply(block)

    override fun <T : Element> backup(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.backup, color, classes) {}.apply(block)

    override fun book(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.book, color, classes).apply(block)

    override fun <T : Element> book(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.book, color, classes) {}.apply(block)

    override fun bookmark(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.bookmark, color, classes).apply(block)

    override fun <T : Element> bookmark(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.bookmark, color, classes) {}.apply(block)

    override fun bookmarkBorder(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.bookmarkBorder, color, classes).apply(block)

    override fun <T : Element> bookmarkBorder(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.bookmarkBorder, color, classes) {}.apply(block)

    override fun bugReport(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.bugReport, color, classes).apply(block)

    override fun <T : Element> bugReport(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.bugReport, color, classes) {}.apply(block)

    override fun build(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.build, color, classes).apply(block)

    override fun <T : Element> build(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.build, color, classes) {}.apply(block)

    override fun cached(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cached, color, classes).apply(block)

    override fun <T : Element> cached(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cached, color, classes) {}.apply(block)

    override fun cameraEnhance(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cameraEnhance, color, classes).apply(block)

    override fun <T : Element> cameraEnhance(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cameraEnhance, color, classes) {}.apply(block)

    override fun cardGiftcard(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cardGiftcard, color, classes).apply(block)

    override fun <T : Element> cardGiftcard(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cardGiftcard, color, classes) {}.apply(block)

    override fun cardMembership(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cardMembership, color, classes).apply(block)

    override fun <T : Element> cardMembership(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cardMembership, color, classes) {}.apply(block)

    override fun cardTravel(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cardTravel, color, classes).apply(block)

    override fun <T : Element> cardTravel(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cardTravel, color, classes) {}.apply(block)

    override fun changeHistory(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.changeHistory, color, classes).apply(block)

    override fun <T : Element> changeHistory(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.changeHistory, color, classes) {}.apply(block)

    override fun checkCircle(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.checkCircle, color, classes).apply(block)

    override fun <T : Element> checkCircle(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.checkCircle, color, classes) {}.apply(block)

    override fun chromeReaderMode(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.chromeReaderMode, color, classes).apply(block)

    override fun <T : Element> chromeReaderMode(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.chromeReaderMode, color, classes) {}.apply(block)

    override fun `class`(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.`class`, color, classes).apply(block)

    override fun <T : Element> `class`(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.`class`, color, classes) {}.apply(block)

    override fun code(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.code, color, classes).apply(block)

    override fun <T : Element> code(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.code, color, classes) {}.apply(block)

    override fun compareArrows(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.compareArrows, color, classes).apply(block)

    override fun <T : Element> compareArrows(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.compareArrows, color, classes) {}.apply(block)

    override fun copyright(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.copyright, color, classes).apply(block)

    override fun <T : Element> copyright(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.copyright, color, classes) {}.apply(block)

    override fun creditCard(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.creditCard, color, classes).apply(block)

    override fun <T : Element> creditCard(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.creditCard, color, classes) {}.apply(block)

    override fun dashboard(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.dashboard, color, classes).apply(block)

    override fun <T : Element> dashboard(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.dashboard, color, classes) {}.apply(block)

    override fun dateRange(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.dateRange, color, classes).apply(block)

    override fun <T : Element> dateRange(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.dateRange, color, classes) {}.apply(block)

    override fun delete(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.delete, color, classes).apply(block)

    override fun <T : Element> delete(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.delete, color, classes) {}.apply(block)

    override fun description(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.description, color, classes).apply(block)

    override fun <T : Element> description(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.description, color, classes) {}.apply(block)

    override fun dns(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.dns, color, classes).apply(block)

    override fun <T : Element> dns(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.dns, color, classes) {}.apply(block)

    override fun done(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.done, color, classes).apply(block)

    override fun <T : Element> done(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.done, color, classes) {}.apply(block)

    override fun doneAll(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.doneAll, color, classes).apply(block)

    override fun <T : Element> doneAll(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.doneAll, color, classes) {}.apply(block)

    override fun donutLarge(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.donutLarge, color, classes).apply(block)

    override fun <T : Element> donutLarge(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.donutLarge, color, classes) {}.apply(block)

    override fun donutSmall(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.donutSmall, color, classes).apply(block)

    override fun <T : Element> donutSmall(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.donutSmall, color, classes) {}.apply(block)

    override fun eject(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.eject, color, classes).apply(block)

    override fun <T : Element> eject(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.eject, color, classes) {}.apply(block)

    override fun event(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.event, color, classes).apply(block)

    override fun <T : Element> event(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.event, color, classes) {}.apply(block)

    override fun eventSeat(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.eventSeat, color, classes).apply(block)

    override fun <T : Element> eventSeat(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.eventSeat, color, classes) {}.apply(block)

    override fun exitToApp(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.exitToApp, color, classes).apply(block)

    override fun <T : Element> exitToApp(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.exitToApp, color, classes) {}.apply(block)

    override fun explore(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.explore, color, classes).apply(block)

    override fun <T : Element> explore(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.explore, color, classes) {}.apply(block)

    override fun extension(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.extension, color, classes).apply(block)

    override fun <T : Element> extension(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.extension, color, classes) {}.apply(block)

    override fun face(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.face, color, classes).apply(block)

    override fun <T : Element> face(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.face, color, classes) {}.apply(block)

    override fun favorite(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.favorite, color, classes).apply(block)

    override fun <T : Element> favorite(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.favorite, color, classes) {}.apply(block)

    override fun favoriteBorder(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.favoriteBorder, color, classes).apply(block)

    override fun <T : Element> favoriteBorder(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.favoriteBorder, color, classes) {}.apply(block)

    override fun feedback(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.feedback, color, classes).apply(block)

    override fun <T : Element> feedback(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.feedback, color, classes) {}.apply(block)

    override fun findInPage(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.findInPage, color, classes).apply(block)

    override fun <T : Element> findInPage(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.findInPage, color, classes) {}.apply(block)

    override fun findReplace(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.findReplace, color, classes).apply(block)

    override fun <T : Element> findReplace(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.findReplace, color, classes) {}.apply(block)

    override fun fingerprint(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.fingerprint, color, classes).apply(block)

    override fun <T : Element> fingerprint(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.fingerprint, color, classes) {}.apply(block)

    override fun flightLand(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.flightLand, color, classes).apply(block)

    override fun <T : Element> flightLand(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.flightLand, color, classes) {}.apply(block)

    override fun flightTakeoff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.flightTakeoff, color, classes).apply(block)

    override fun <T : Element> flightTakeoff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.flightTakeoff, color, classes) {}.apply(block)

    override fun flipToBack(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.flipToBack, color, classes).apply(block)

    override fun <T : Element> flipToBack(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.flipToBack, color, classes) {}.apply(block)

    override fun flipToFront(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.flipToFront, color, classes).apply(block)

    override fun <T : Element> flipToFront(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.flipToFront, color, classes) {}.apply(block)

    override fun gavel(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.gavel, color, classes).apply(block)

    override fun <T : Element> gavel(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.gavel, color, classes) {}.apply(block)

    override fun getApp(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.getApp, color, classes).apply(block)

    override fun <T : Element> getApp(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.getApp, color, classes) {}.apply(block)

    override fun gif(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.gif, color, classes).apply(block)

    override fun <T : Element> gif(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.gif, color, classes) {}.apply(block)

    override fun grade(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.grade, color, classes).apply(block)

    override fun <T : Element> grade(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.grade, color, classes) {}.apply(block)

    override fun groupWork(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.groupWork, color, classes).apply(block)

    override fun <T : Element> groupWork(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.groupWork, color, classes) {}.apply(block)

    override fun help(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.help, color, classes).apply(block)

    override fun <T : Element> help(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.help, color, classes) {}.apply(block)

    override fun helpOutline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.helpOutline, color, classes).apply(block)

    override fun <T : Element> helpOutline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.helpOutline, color, classes) {}.apply(block)

    override fun highlightOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.highlightOff, color, classes).apply(block)

    override fun <T : Element> highlightOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.highlightOff, color, classes) {}.apply(block)

    override fun history(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.history, color, classes).apply(block)

    override fun <T : Element> history(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.history, color, classes) {}.apply(block)

    override fun home(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.home, color, classes).apply(block)

    override fun <T : Element> home(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.home, color, classes) {}.apply(block)

    override fun hourglassEmpty(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.hourglassEmpty, color, classes).apply(block)

    override fun <T : Element> hourglassEmpty(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.hourglassEmpty, color, classes) {}.apply(block)

    override fun hourglassFull(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.hourglassFull, color, classes).apply(block)

    override fun <T : Element> hourglassFull(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.hourglassFull, color, classes) {}.apply(block)

    override fun http(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.http, color, classes).apply(block)

    override fun <T : Element> http(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.http, color, classes) {}.apply(block)

    override fun https(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.https, color, classes).apply(block)

    override fun <T : Element> https(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.https, color, classes) {}.apply(block)

    override fun importantDevices(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.importantDevices, color, classes).apply(block)

    override fun <T : Element> importantDevices(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.importantDevices, color, classes) {}.apply(block)

    override fun info(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.info, color, classes).apply(block)

    override fun <T : Element> info(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.info, color, classes) {}.apply(block)

    override fun infoOutline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.infoOutline, color, classes).apply(block)

    override fun <T : Element> infoOutline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.infoOutline, color, classes) {}.apply(block)

    override fun input(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.input, color, classes).apply(block)

    override fun <T : Element> input(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.input, color, classes) {}.apply(block)

    override fun invertColors(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.invertColors, color, classes).apply(block)

    override fun <T : Element> invertColors(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.invertColors, color, classes) {}.apply(block)

    override fun label(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.label, color, classes).apply(block)

    override fun <T : Element> label(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.label, color, classes) {}.apply(block)

    override fun labelOutline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.labelOutline, color, classes).apply(block)

    override fun <T : Element> labelOutline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.labelOutline, color, classes) {}.apply(block)

    override fun language(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.language, color, classes).apply(block)

    override fun <T : Element> language(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.language, color, classes) {}.apply(block)

    override fun launch(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.launch, color, classes).apply(block)

    override fun <T : Element> launch(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.launch, color, classes) {}.apply(block)

    override fun lightbulbOutline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.lightbulbOutline, color, classes).apply(block)

    override fun <T : Element> lightbulbOutline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.lightbulbOutline, color, classes) {}.apply(block)

    override fun lineStyle(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.lineStyle, color, classes).apply(block)

    override fun <T : Element> lineStyle(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.lineStyle, color, classes) {}.apply(block)

    override fun lineWeight(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.lineWeight, color, classes).apply(block)

    override fun <T : Element> lineWeight(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.lineWeight, color, classes) {}.apply(block)

    override fun list(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.list, color, classes).apply(block)

    override fun <T : Element> list(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.list, color, classes) {}.apply(block)

    override fun lock(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.lock, color, classes).apply(block)

    override fun <T : Element> lock(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.lock, color, classes) {}.apply(block)

    override fun lockOpen(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.lockOpen, color, classes).apply(block)

    override fun <T : Element> lockOpen(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.lockOpen, color, classes) {}.apply(block)

    override fun lockOutline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.lockOutline, color, classes).apply(block)

    override fun <T : Element> lockOutline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.lockOutline, color, classes) {}.apply(block)

    override fun loyalty(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.loyalty, color, classes).apply(block)

    override fun <T : Element> loyalty(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.loyalty, color, classes) {}.apply(block)

    override fun markunreadMailbox(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.markunreadMailbox, color, classes).apply(block)

    override fun <T : Element> markunreadMailbox(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.markunreadMailbox, color, classes) {}.apply(block)

    override fun motorcycle(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.motorcycle, color, classes).apply(block)

    override fun <T : Element> motorcycle(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.motorcycle, color, classes) {}.apply(block)

    override fun noteAdd(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.noteAdd, color, classes).apply(block)

    override fun <T : Element> noteAdd(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.noteAdd, color, classes) {}.apply(block)

    override fun offlinePin(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.offlinePin, color, classes).apply(block)

    override fun <T : Element> offlinePin(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.offlinePin, color, classes) {}.apply(block)

    override fun opacity(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.opacity, color, classes).apply(block)

    override fun <T : Element> opacity(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.opacity, color, classes) {}.apply(block)

    override fun openInBrowser(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.openInBrowser, color, classes).apply(block)

    override fun <T : Element> openInBrowser(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.openInBrowser, color, classes) {}.apply(block)

    override fun openInNew(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.openInNew, color, classes).apply(block)

    override fun <T : Element> openInNew(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.openInNew, color, classes) {}.apply(block)

    override fun openWith(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.openWith, color, classes).apply(block)

    override fun <T : Element> openWith(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.openWith, color, classes) {}.apply(block)

    override fun pageview(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.pageview, color, classes).apply(block)

    override fun <T : Element> pageview(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.pageview, color, classes) {}.apply(block)

    override fun panTool(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.panTool, color, classes).apply(block)

    override fun <T : Element> panTool(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.panTool, color, classes) {}.apply(block)

    override fun payment(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.payment, color, classes).apply(block)

    override fun <T : Element> payment(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.payment, color, classes) {}.apply(block)

    override fun permCameraMic(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.permCameraMic, color, classes).apply(block)

    override fun <T : Element> permCameraMic(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.permCameraMic, color, classes) {}.apply(block)

    override fun permContactCalendar(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.permContactCalendar, color, classes).apply(block)

    override fun <T : Element> permContactCalendar(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.permContactCalendar, color, classes) {}.apply(block)

    override fun permDataSetting(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.permDataSetting, color, classes).apply(block)

    override fun <T : Element> permDataSetting(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.permDataSetting, color, classes) {}.apply(block)

    override fun permDeviceInformation(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.permDeviceInformation, color, classes).apply(block)

    override fun <T : Element> permDeviceInformation(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.permDeviceInformation, color, classes) {}.apply(block)

    override fun permIdentity(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.permIdentity, color, classes).apply(block)

    override fun <T : Element> permIdentity(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.permIdentity, color, classes) {}.apply(block)

    override fun permMedia(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.permMedia, color, classes).apply(block)

    override fun <T : Element> permMedia(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.permMedia, color, classes) {}.apply(block)

    override fun permPhoneMsg(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.permPhoneMsg, color, classes).apply(block)

    override fun <T : Element> permPhoneMsg(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.permPhoneMsg, color, classes) {}.apply(block)

    override fun permScanWifi(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.permScanWifi, color, classes).apply(block)

    override fun <T : Element> permScanWifi(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.permScanWifi, color, classes) {}.apply(block)

    override fun pets(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.pets, color, classes).apply(block)

    override fun <T : Element> pets(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.pets, color, classes) {}.apply(block)

    override fun pictureInPicture(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.pictureInPicture, color, classes).apply(block)

    override fun <T : Element> pictureInPicture(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.pictureInPicture, color, classes) {}.apply(block)

    override fun pictureInPictureAlt(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.pictureInPictureAlt, color, classes).apply(block)

    override fun <T : Element> pictureInPictureAlt(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.pictureInPictureAlt, color, classes) {}.apply(block)

    override fun playForWork(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.playForWork, color, classes).apply(block)

    override fun <T : Element> playForWork(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.playForWork, color, classes) {}.apply(block)

    override fun polymer(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.polymer, color, classes).apply(block)

    override fun <T : Element> polymer(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.polymer, color, classes) {}.apply(block)

    override fun powerSettingsNew(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.powerSettingsNew, color, classes).apply(block)

    override fun <T : Element> powerSettingsNew(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.powerSettingsNew, color, classes) {}.apply(block)

    override fun pregnantWoman(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.pregnantWoman, color, classes).apply(block)

    override fun <T : Element> pregnantWoman(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.pregnantWoman, color, classes) {}.apply(block)

    override fun print(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.print, color, classes).apply(block)

    override fun <T : Element> print(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.print, color, classes) {}.apply(block)

    override fun queryBuilder(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.queryBuilder, color, classes).apply(block)

    override fun <T : Element> queryBuilder(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.queryBuilder, color, classes) {}.apply(block)

    override fun questionAnswer(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.questionAnswer, color, classes).apply(block)

    override fun <T : Element> questionAnswer(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.questionAnswer, color, classes) {}.apply(block)

    override fun receipt(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.receipt, color, classes).apply(block)

    override fun <T : Element> receipt(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.receipt, color, classes) {}.apply(block)

    override fun recordVoiceOver(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.recordVoiceOver, color, classes).apply(block)

    override fun <T : Element> recordVoiceOver(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.recordVoiceOver, color, classes) {}.apply(block)

    override fun redeem(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.redeem, color, classes).apply(block)

    override fun <T : Element> redeem(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.redeem, color, classes) {}.apply(block)

    override fun reorder(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.reorder, color, classes).apply(block)

    override fun <T : Element> reorder(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.reorder, color, classes) {}.apply(block)

    override fun reportProblem(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.reportProblem, color, classes).apply(block)

    override fun <T : Element> reportProblem(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.reportProblem, color, classes) {}.apply(block)

    override fun restore(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.restore, color, classes).apply(block)

    override fun <T : Element> restore(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.restore, color, classes) {}.apply(block)

    override fun room(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.room, color, classes).apply(block)

    override fun <T : Element> room(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.room, color, classes) {}.apply(block)

    override fun roundedCorner(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.roundedCorner, color, classes).apply(block)

    override fun <T : Element> roundedCorner(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.roundedCorner, color, classes) {}.apply(block)

    override fun rowing(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.rowing, color, classes).apply(block)

    override fun <T : Element> rowing(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.rowing, color, classes) {}.apply(block)

    override fun schedule(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.schedule, color, classes).apply(block)

    override fun <T : Element> schedule(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.schedule, color, classes) {}.apply(block)

    override fun search(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.search, color, classes).apply(block)

    override fun <T : Element> search(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.search, color, classes) {}.apply(block)

    override fun settings(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settings, color, classes).apply(block)

    override fun <T : Element> settings(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settings, color, classes) {}.apply(block)

    override fun settingsApplications(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsApplications, color, classes).apply(block)

    override fun <T : Element> settingsApplications(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsApplications, color, classes) {}.apply(block)

    override fun settingsBackupRestore(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsBackupRestore, color, classes).apply(block)

    override fun <T : Element> settingsBackupRestore(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsBackupRestore, color, classes) {}.apply(block)

    override fun settingsBluetooth(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsBluetooth, color, classes).apply(block)

    override fun <T : Element> settingsBluetooth(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsBluetooth, color, classes) {}.apply(block)

    override fun settingsBrightness(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsBrightness, color, classes).apply(block)

    override fun <T : Element> settingsBrightness(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsBrightness, color, classes) {}.apply(block)

    override fun settingsCell(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsCell, color, classes).apply(block)

    override fun <T : Element> settingsCell(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsCell, color, classes) {}.apply(block)

    override fun settingsEthernet(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsEthernet, color, classes).apply(block)

    override fun <T : Element> settingsEthernet(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsEthernet, color, classes) {}.apply(block)

    override fun settingsInputAntenna(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsInputAntenna, color, classes).apply(block)

    override fun <T : Element> settingsInputAntenna(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsInputAntenna, color, classes) {}.apply(block)

    override fun settingsInputComponent(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsInputComponent, color, classes).apply(block)

    override fun <T : Element> settingsInputComponent(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsInputComponent, color, classes) {}.apply(block)

    override fun settingsInputComposite(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsInputComposite, color, classes).apply(block)

    override fun <T : Element> settingsInputComposite(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsInputComposite, color, classes) {}.apply(block)

    override fun settingsInputHdmi(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsInputHdmi, color, classes).apply(block)

    override fun <T : Element> settingsInputHdmi(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsInputHdmi, color, classes) {}.apply(block)

    override fun settingsInputSvideo(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsInputSvideo, color, classes).apply(block)

    override fun <T : Element> settingsInputSvideo(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsInputSvideo, color, classes) {}.apply(block)

    override fun settingsOverscan(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsOverscan, color, classes).apply(block)

    override fun <T : Element> settingsOverscan(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsOverscan, color, classes) {}.apply(block)

    override fun settingsPhone(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsPhone, color, classes).apply(block)

    override fun <T : Element> settingsPhone(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsPhone, color, classes) {}.apply(block)

    override fun settingsPower(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsPower, color, classes).apply(block)

    override fun <T : Element> settingsPower(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsPower, color, classes) {}.apply(block)

    override fun settingsRemote(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsRemote, color, classes).apply(block)

    override fun <T : Element> settingsRemote(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsRemote, color, classes) {}.apply(block)

    override fun settingsVoice(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsVoice, color, classes).apply(block)

    override fun <T : Element> settingsVoice(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsVoice, color, classes) {}.apply(block)

    override fun shop(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.shop, color, classes).apply(block)

    override fun <T : Element> shop(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.shop, color, classes) {}.apply(block)

    override fun shopTwo(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.shopTwo, color, classes).apply(block)

    override fun <T : Element> shopTwo(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.shopTwo, color, classes) {}.apply(block)

    override fun shoppingBasket(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.shoppingBasket, color, classes).apply(block)

    override fun <T : Element> shoppingBasket(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.shoppingBasket, color, classes) {}.apply(block)

    override fun shoppingCart(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.shoppingCart, color, classes).apply(block)

    override fun <T : Element> shoppingCart(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.shoppingCart, color, classes) {}.apply(block)

    override fun speakerNotes(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.speakerNotes, color, classes).apply(block)

    override fun <T : Element> speakerNotes(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.speakerNotes, color, classes) {}.apply(block)

    override fun spellcheck(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.spellcheck, color, classes).apply(block)

    override fun <T : Element> spellcheck(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.spellcheck, color, classes) {}.apply(block)

    override fun starRate(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.starRate, color, classes).apply(block)

    override fun <T : Element> starRate(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.starRate, color, classes) {}.apply(block)

    override fun stars(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.stars, color, classes).apply(block)

    override fun <T : Element> stars(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.stars, color, classes) {}.apply(block)

    override fun store(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.store, color, classes).apply(block)

    override fun <T : Element> store(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.store, color, classes) {}.apply(block)

    override fun subject(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.subject, color, classes).apply(block)

    override fun <T : Element> subject(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.subject, color, classes) {}.apply(block)

    override fun supervisorAccount(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.supervisorAccount, color, classes).apply(block)

    override fun <T : Element> supervisorAccount(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.supervisorAccount, color, classes) {}.apply(block)

    override fun swapHorizontal(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.swapHorizontal, color, classes).apply(block)

    override fun <T : Element> swapHorizontal(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.swapHorizontal, color, classes) {}.apply(block)

    override fun swapVertical(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.swapVertical, color, classes).apply(block)

    override fun <T : Element> swapVertical(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.swapVertical, color, classes) {}.apply(block)

    override fun swapVerticalCircle(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.swapVerticalCircle, color, classes).apply(block)

    override fun <T : Element> swapVerticalCircle(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.swapVerticalCircle, color, classes) {}.apply(block)

    override fun systemUpdateAlt(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.systemUpdateAlt, color, classes).apply(block)

    override fun <T : Element> systemUpdateAlt(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.systemUpdateAlt, color, classes) {}.apply(block)

    override fun tab(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.tab, color, classes).apply(block)

    override fun <T : Element> tab(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.tab, color, classes) {}.apply(block)

    override fun tabUnselected(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.tabUnselected, color, classes).apply(block)

    override fun <T : Element> tabUnselected(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.tabUnselected, color, classes) {}.apply(block)

    override fun theaters(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.theaters, color, classes).apply(block)

    override fun <T : Element> theaters(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.theaters, color, classes) {}.apply(block)

    override fun thumbDown(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.thumbDown, color, classes).apply(block)

    override fun <T : Element> thumbDown(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.thumbDown, color, classes) {}.apply(block)

    override fun thumbUp(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.thumbUp, color, classes).apply(block)

    override fun <T : Element> thumbUp(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.thumbUp, color, classes) {}.apply(block)

    override fun thumbsUpDown(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.thumbsUpDown, color, classes).apply(block)

    override fun <T : Element> thumbsUpDown(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.thumbsUpDown, color, classes) {}.apply(block)

    override fun timeline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.timeline, color, classes).apply(block)

    override fun <T : Element> timeline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.timeline, color, classes) {}.apply(block)

    override fun toc(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.toc, color, classes).apply(block)

    override fun <T : Element> toc(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.toc, color, classes) {}.apply(block)

    override fun today(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.today, color, classes).apply(block)

    override fun <T : Element> today(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.today, color, classes) {}.apply(block)

    override fun toll(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.toll, color, classes).apply(block)

    override fun <T : Element> toll(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.toll, color, classes) {}.apply(block)

    override fun touchApp(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.touchApp, color, classes).apply(block)

    override fun <T : Element> touchApp(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.touchApp, color, classes) {}.apply(block)

    override fun trackChanges(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.trackChanges, color, classes).apply(block)

    override fun <T : Element> trackChanges(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.trackChanges, color, classes) {}.apply(block)

    override fun translate(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.translate, color, classes).apply(block)

    override fun <T : Element> translate(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.translate, color, classes) {}.apply(block)

    override fun trendingDown(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.trendingDown, color, classes).apply(block)

    override fun <T : Element> trendingDown(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.trendingDown, color, classes) {}.apply(block)

    override fun trendingFlat(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.trendingFlat, color, classes).apply(block)

    override fun <T : Element> trendingFlat(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.trendingFlat, color, classes) {}.apply(block)

    override fun trendingUp(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.trendingUp, color, classes).apply(block)

    override fun <T : Element> trendingUp(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.trendingUp, color, classes) {}.apply(block)

    override fun turnedIn(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.turnedIn, color, classes).apply(block)

    override fun <T : Element> turnedIn(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.turnedIn, color, classes) {}.apply(block)

    override fun turnedInNot(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.turnedInNot, color, classes).apply(block)

    override fun <T : Element> turnedInNot(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.turnedInNot, color, classes) {}.apply(block)

    override fun update(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.update, color, classes).apply(block)

    override fun <T : Element> update(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.update, color, classes) {}.apply(block)

    override fun verifiedUser(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.verifiedUser, color, classes).apply(block)

    override fun <T : Element> verifiedUser(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.verifiedUser, color, classes) {}.apply(block)

    override fun viewAgenda(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.viewAgenda, color, classes).apply(block)

    override fun <T : Element> viewAgenda(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.viewAgenda, color, classes) {}.apply(block)

    override fun viewArray(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.viewArray, color, classes).apply(block)

    override fun <T : Element> viewArray(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.viewArray, color, classes) {}.apply(block)

    override fun viewCarousel(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.viewCarousel, color, classes).apply(block)

    override fun <T : Element> viewCarousel(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.viewCarousel, color, classes) {}.apply(block)

    override fun viewColumn(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.viewColumn, color, classes).apply(block)

    override fun <T : Element> viewColumn(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.viewColumn, color, classes) {}.apply(block)

    override fun viewDay(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.viewDay, color, classes).apply(block)

    override fun <T : Element> viewDay(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.viewDay, color, classes) {}.apply(block)

    override fun viewHeadline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.viewHeadline, color, classes).apply(block)

    override fun <T : Element> viewHeadline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.viewHeadline, color, classes) {}.apply(block)

    override fun viewList(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.viewList, color, classes).apply(block)

    override fun <T : Element> viewList(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.viewList, color, classes) {}.apply(block)

    override fun viewModule(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.viewModule, color, classes).apply(block)

    override fun <T : Element> viewModule(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.viewModule, color, classes) {}.apply(block)

    override fun viewQuilt(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.viewQuilt, color, classes).apply(block)

    override fun <T : Element> viewQuilt(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.viewQuilt, color, classes) {}.apply(block)

    override fun viewStream(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.viewStream, color, classes).apply(block)

    override fun <T : Element> viewStream(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.viewStream, color, classes) {}.apply(block)

    override fun viewWeek(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.viewWeek, color, classes).apply(block)

    override fun <T : Element> viewWeek(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.viewWeek, color, classes) {}.apply(block)

    override fun visibility(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.visibility, color, classes).apply(block)

    override fun <T : Element> visibility(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.visibility, color, classes) {}.apply(block)

    override fun visibilityOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.visibilityOff, color, classes).apply(block)

    override fun <T : Element> visibilityOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.visibilityOff, color, classes) {}.apply(block)

    override fun watchLater(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.watchLater, color, classes).apply(block)

    override fun <T : Element> watchLater(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.watchLater, color, classes) {}.apply(block)

    override fun work(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.work, color, classes).apply(block)

    override fun <T : Element> work(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.work, color, classes) {}.apply(block)

    override fun youtubeSearchedFor(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.youtubeSearchedFor, color, classes).apply(block)

    override fun <T : Element> youtubeSearchedFor(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.youtubeSearchedFor, color, classes) {}.apply(block)

    override fun zoomIn(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.zoomIn, color, classes).apply(block)

    override fun <T : Element> zoomIn(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.zoomIn, color, classes) {}.apply(block)

    override fun zoomOut(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.zoomOut, color, classes).apply(block)

    override fun <T : Element> zoomOut(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.zoomOut, color, classes) {}.apply(block)
    //endregion

    // region Alert
    override fun addAlert(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.addAlert, color, classes).apply(block)

    override fun <T : Element> addAlert(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.addAlert, color, classes) {}.apply(block)

    override fun error(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.error, color, classes).apply(block)

    override fun <T : Element> error(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.error, color, classes) {}.apply(block)

    override fun errorOutline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.errorOutline, color, classes).apply(block)

    override fun <T : Element> errorOutline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.errorOutline, color, classes) {}.apply(block)

    override fun warning(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.warning, color, classes).apply(block)

    override fun <T : Element> warning(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.warning, color, classes) {}.apply(block)
	//endregion

    // region AV
    override fun addToQueue(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.addToQueue, color, classes).apply(block)

    override fun <T : Element> addToQueue(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.addToQueue, color, classes) {}.apply(block)

    override fun airplay(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.airplay, color, classes).apply(block)

    override fun <T : Element> airplay(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.airplay, color, classes) {}.apply(block)

    override fun album(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.album, color, classes).apply(block)

    override fun <T : Element> album(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.album, color, classes) {}.apply(block)

    override fun artTrack(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.artTrack, color, classes).apply(block)

    override fun <T : Element> artTrack(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.artTrack, color, classes) {}.apply(block)

    override fun avTimer(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.avTimer, color, classes).apply(block)

    override fun <T : Element> avTimer(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.avTimer, color, classes) {}.apply(block)

    override fun closedCaption(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.closedCaption, color, classes).apply(block)

    override fun <T : Element> closedCaption(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.closedCaption, color, classes) {}.apply(block)

    override fun equalizer(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.equalizer, color, classes).apply(block)

    override fun <T : Element> equalizer(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.equalizer, color, classes) {}.apply(block)

    override fun explicit(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.explicit, color, classes).apply(block)

    override fun <T : Element> explicit(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.explicit, color, classes) {}.apply(block)

    override fun fastForward(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.fastForward, color, classes).apply(block)

    override fun <T : Element> fastForward(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.fastForward, color, classes) {}.apply(block)

    override fun fastRewind(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.fastRewind, color, classes).apply(block)

    override fun <T : Element> fastRewind(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.fastRewind, color, classes) {}.apply(block)

    override fun fiberDvr(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.fiberDvr, color, classes).apply(block)

    override fun <T : Element> fiberDvr(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.fiberDvr, color, classes) {}.apply(block)

    override fun fiberManualRecord(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.fiberManualRecord, color, classes).apply(block)

    override fun <T : Element> fiberManualRecord(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.fiberManualRecord, color, classes) {}.apply(block)

    override fun fiberNew(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.fiberNew, color, classes).apply(block)

    override fun <T : Element> fiberNew(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.fiberNew, color, classes) {}.apply(block)

    override fun fiberPin(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.fiberPin, color, classes).apply(block)

    override fun <T : Element> fiberPin(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.fiberPin, color, classes) {}.apply(block)

    override fun fiberSmartRecord(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.fiberSmartRecord, color, classes).apply(block)

    override fun <T : Element> fiberSmartRecord(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.fiberSmartRecord, color, classes) {}.apply(block)

    override fun forward5(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.forward5, color, classes).apply(block)

    override fun <T : Element> forward5(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.forward5, color, classes) {}.apply(block)

    override fun forward10(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.forward10, color, classes).apply(block)

    override fun <T : Element> forward10(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.forward10, color, classes) {}.apply(block)

    override fun forward30(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.forward30, color, classes).apply(block)

    override fun <T : Element> forward30(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.forward30, color, classes) {}.apply(block)

    override fun games(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.games, color, classes).apply(block)

    override fun <T : Element> games(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.games, color, classes) {}.apply(block)

    override fun hd(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.hd, color, classes).apply(block)

    override fun <T : Element> hd(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.hd, color, classes) {}.apply(block)

    override fun hearing(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.hearing, color, classes).apply(block)

    override fun <T : Element> hearing(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.hearing, color, classes) {}.apply(block)

    override fun highQuality(
            color: IMdlTextColor?,
            classes: String,
            block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.highQuality, color, classes).apply(block)

    override fun <T : Element> highQuality(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.highQuality, color, classes) {}.apply(block)

    override fun libraryAdd(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.libraryAdd, color, classes).apply(block)

    override fun <T : Element> libraryAdd(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.libraryAdd, color, classes) {}.apply(block)

    override fun libraryBooks(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.libraryBooks, color, classes).apply(block)

    override fun <T : Element> libraryBooks(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.libraryBooks, color, classes) {}.apply(block)

    override fun libraryMusic(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.libraryMusic, color, classes).apply(block)

    override fun <T : Element> libraryMusic(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.libraryMusic, color, classes) {}.apply(block)

    override fun loop(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.loop, color, classes).apply(block)

    override fun <T : Element> loop(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.loop, color, classes) {}.apply(block)

    override fun mic(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.mic, color, classes).apply(block)

    override fun <T : Element> mic(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.mic, color, classes) {}.apply(block)

    override fun micNone(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.micNone, color, classes).apply(block)

    override fun <T : Element> micNone(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.micNone, color, classes) {}.apply(block)

    override fun micOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.micOff, color, classes).apply(block)

    override fun <T : Element> micOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.micOff, color, classes) {}.apply(block)

    override fun movie(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.movie, color, classes).apply(block)

    override fun <T : Element> movie(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.movie, color, classes) {}.apply(block)

    override fun musicVideo(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.musicVideo, color, classes).apply(block)

    override fun <T : Element> musicVideo(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.musicVideo, color, classes) {}.apply(block)

    override fun newReleases(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.newReleases, color, classes).apply(block)

    override fun <T : Element> newReleases(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.newReleases, color, classes) {}.apply(block)

    override fun notInterested(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.notInterested, color, classes).apply(block)

    override fun <T : Element> notInterested(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.notInterested, color, classes) {}.apply(block)

    override fun pause(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.pause, color, classes).apply(block)

    override fun <T : Element> pause(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.pause, color, classes) {}.apply(block)

    override fun pauseCircleFilled(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.pauseCircleFilled, color, classes).apply(block)

    override fun <T : Element> pauseCircleFilled(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.pauseCircleFilled, color, classes) {}.apply(block)

    override fun pauseCircleOutline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.pauseCircleOutline, color, classes).apply(block)

    override fun <T : Element> pauseCircleOutline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.pauseCircleOutline, color, classes) {}.apply(block)

    override fun playArrow(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.playArrow, color, classes).apply(block)

    override fun <T : Element> playArrow(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.playArrow, color, classes) {}.apply(block)

    override fun playCircleFilled(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.playCircleFilled, color, classes).apply(block)

    override fun <T : Element> playCircleFilled(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.playCircleFilled, color, classes) {}.apply(block)

    override fun playCircleOutline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.playCircleOutline, color, classes).apply(block)

    override fun <T : Element> playCircleOutline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.playCircleOutline, color, classes) {}.apply(block)

    override fun playlistAdd(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.playlistAdd, color, classes).apply(block)

    override fun <T : Element> playlistAdd(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.playlistAdd, color, classes) {}.apply(block)

    override fun playlistAddCheck(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.playlistAddCheck, color, classes).apply(block)

    override fun <T : Element> playlistAddCheck(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.playlistAddCheck, color, classes) {}.apply(block)

    override fun playlistPlay(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.playlistPlay, color, classes).apply(block)

    override fun <T : Element> playlistPlay(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.playlistPlay, color, classes) {}.apply(block)

    override fun queue(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.queue, color, classes).apply(block)

    override fun <T : Element> queue(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.queue, color, classes) {}.apply(block)

    override fun queueMusic(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.queueMusic, color, classes).apply(block)

    override fun <T : Element> queueMusic(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.queueMusic, color, classes) {}.apply(block)

    override fun queuePlayNext(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.queuePlayNext, color, classes).apply(block)

    override fun <T : Element> queuePlayNext(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.queuePlayNext, color, classes) {}.apply(block)

    override fun radio(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.radio, color, classes).apply(block)

    override fun <T : Element> radio(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.radio, color, classes) {}.apply(block)

    override fun recentActors(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.recentActors, color, classes).apply(block)

    override fun <T : Element> recentActors(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.recentActors, color, classes) {}.apply(block)

    override fun removeFromQueue(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.removeFromQueue, color, classes).apply(block)

    override fun <T : Element> removeFromQueue(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.removeFromQueue, color, classes) {}.apply(block)

    override fun repeat(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.repeat, color, classes).apply(block)

    override fun <T : Element> repeat(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.repeat, color, classes) {}.apply(block)

    override fun repeatOne(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.repeatOne, color, classes).apply(block)

    override fun <T : Element> repeatOne(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.repeatOne, color, classes) {}.apply(block)

    override fun replay(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.replay, color, classes).apply(block)

    override fun <T : Element> replay(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.replay, color, classes) {}.apply(block)

    override fun replay5(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.replay5, color, classes).apply(block)

    override fun <T : Element> replay5(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.replay5, color, classes) {}.apply(block)

    override fun replay10(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.replay10, color, classes).apply(block)

    override fun <T : Element> replay10(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.replay10, color, classes) {}.apply(block)

    override fun replay30(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.replay30, color, classes).apply(block)

    override fun <T : Element> replay30(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.replay30, color, classes) {}.apply(block)

    override fun shuffle(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.shuffle, color, classes).apply(block)

    override fun <T : Element> shuffle(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.shuffle, color, classes) {}.apply(block)

    override fun skipNext(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.skipNext, color, classes).apply(block)

    override fun <T : Element> skipNext(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.skipNext, color, classes) {}.apply(block)

    override fun skipPrevious(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.skipPrevious, color, classes).apply(block)

    override fun <T : Element> skipPrevious(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.skipPrevious, color, classes) {}.apply(block)

    override fun slowMotionVideo(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.slowMotionVideo, color, classes).apply(block)

    override fun <T : Element> slowMotionVideo(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.slowMotionVideo, color, classes) {}.apply(block)

    override fun snooze(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.snooze, color, classes).apply(block)

    override fun <T : Element> snooze(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.snooze, color, classes) {}.apply(block)

    override fun sortByAlpha(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.sortByAlpha, color, classes).apply(block)

    override fun <T : Element> sortByAlpha(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.sortByAlpha, color, classes) {}.apply(block)

    override fun stop(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.stop, color, classes).apply(block)

    override fun <T : Element> stop(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.stop, color, classes) {}.apply(block)

    override fun subscriptions(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.subscriptions, color, classes).apply(block)

    override fun <T : Element> subscriptions(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.subscriptions, color, classes) {}.apply(block)

    override fun subtitles(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.subtitles, color, classes).apply(block)

    override fun <T : Element> subtitles(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.subtitles, color, classes) {}.apply(block)

    override fun surroundSound(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.surroundSound, color, classes).apply(block)

    override fun <T : Element> surroundSound(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.surroundSound, color, classes) {}.apply(block)

    override fun videoLibrary(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.videoLibrary, color, classes).apply(block)

    override fun <T : Element> videoLibrary(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.videoLibrary, color, classes) {}.apply(block)

    override fun videocam(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.videocam, color, classes).apply(block)

    override fun <T : Element> videocam(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.videocam, color, classes) {}.apply(block)

    override fun videocamOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.videocamOff, color, classes).apply(block)

    override fun <T : Element> videocamOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.videocamOff, color, classes) {}.apply(block)

    override fun volumeDown(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.volumeDown, color, classes).apply(block)

    override fun <T : Element> volumeDown(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.volumeDown, color, classes) {}.apply(block)

    override fun volumeMute(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.volumeMute, color, classes).apply(block)

    override fun <T : Element> volumeMute(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.volumeMute, color, classes) {}.apply(block)

    override fun volumeOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.volumeOff, color, classes).apply(block)

    override fun <T : Element> volumeOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.volumeOff, color, classes) {}.apply(block)

    override fun volumeUp(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.volumeUp, color, classes).apply(block)

    override fun <T : Element> volumeUp(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.volumeUp, color, classes) {}.apply(block)

    override fun web(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.web, color, classes).apply(block)

    override fun <T : Element> web(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.web, color, classes) {}.apply(block)

    override fun webAsset(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.webAsset, color, classes).apply(block)

    override fun <T : Element> webAsset(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.webAsset, color, classes) {}.apply(block)
	//endregion

    // region Communication
    override fun business(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.business, color, classes).apply(block)

    override fun <T : Element> business(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.business, color, classes) {}.apply(block)

    override fun call(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.call, color, classes).apply(block)

    override fun <T : Element> call(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.call, color, classes) {}.apply(block)

    override fun callEnd(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.callEnd, color, classes).apply(block)

    override fun <T : Element> callEnd(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.callEnd, color, classes) {}.apply(block)

    override fun callMade(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.callMade, color, classes).apply(block)

    override fun <T : Element> callMade(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.callMade, color, classes) {}.apply(block)

    override fun callMerge(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.callMerge, color, classes).apply(block)

    override fun <T : Element> callMerge(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.callMerge, color, classes) {}.apply(block)

    override fun callMissed(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.callMissed, color, classes).apply(block)

    override fun <T : Element> callMissed(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.callMissed, color, classes) {}.apply(block)

    override fun callMissedOutgoing(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.callMissedOutgoing, color, classes).apply(block)

    override fun <T : Element> callMissedOutgoing(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.callMissedOutgoing, color, classes) {}.apply(block)

    override fun callReceived(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.callReceived, color, classes).apply(block)

    override fun <T : Element> callReceived(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.callReceived, color, classes) {}.apply(block)

    override fun callSplit(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.callSplit, color, classes).apply(block)

    override fun <T : Element> callSplit(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.callSplit, color, classes) {}.apply(block)

    override fun chat(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.chat, color, classes).apply(block)

    override fun <T : Element> chat(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.chat, color, classes) {}.apply(block)

    override fun chatBubble(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.chatBubble, color, classes).apply(block)

    override fun <T : Element> chatBubble(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.chatBubble, color, classes) {}.apply(block)

    override fun chatBubbleOutline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.chatBubbleOutline, color, classes).apply(block)

    override fun <T : Element> chatBubbleOutline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.chatBubbleOutline, color, classes) {}.apply(block)

    override fun clearAll(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.clearAll, color, classes).apply(block)

    override fun <T : Element> clearAll(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.clearAll, color, classes) {}.apply(block)

    override fun comment(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.comment, color, classes).apply(block)

    override fun <T : Element> comment(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.comment, color, classes) {}.apply(block)

    override fun contactMail(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.contactMail, color, classes).apply(block)

    override fun <T : Element> contactMail(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.contactMail, color, classes) {}.apply(block)

    override fun contactPhone(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.contactPhone, color, classes).apply(block)

    override fun <T : Element> contactPhone(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.contactPhone, color, classes) {}.apply(block)

    override fun contacts(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.contacts, color, classes).apply(block)

    override fun <T : Element> contacts(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.contacts, color, classes) {}.apply(block)

    override fun dialerSip(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.dialerSip, color, classes).apply(block)

    override fun <T : Element> dialerSip(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.dialerSip, color, classes) {}.apply(block)

    override fun dialpad(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.dialpad, color, classes).apply(block)

    override fun <T : Element> dialpad(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.dialpad, color, classes) {}.apply(block)

    override fun email(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.email, color, classes).apply(block)

    override fun <T : Element> email(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.email, color, classes) {}.apply(block)

    override fun forum(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.forum, color, classes).apply(block)

    override fun <T : Element> forum(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.forum, color, classes) {}.apply(block)

    override fun importContacts(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.importContacts, color, classes).apply(block)

    override fun <T : Element> importContacts(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.importContacts, color, classes) {}.apply(block)

    override fun importExport(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.importExport, color, classes).apply(block)

    override fun <T : Element> importExport(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.importExport, color, classes) {}.apply(block)

    override fun invertColorsOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.invertColorsOff, color, classes).apply(block)

    override fun <T : Element> invertColorsOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.invertColorsOff, color, classes) {}.apply(block)

    override fun liveHelp(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.liveHelp, color, classes).apply(block)

    override fun <T : Element> liveHelp(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.liveHelp, color, classes) {}.apply(block)

    override fun locationOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.locationOff, color, classes).apply(block)

    override fun <T : Element> locationOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.locationOff, color, classes) {}.apply(block)

    override fun locationOn(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.locationOn, color, classes).apply(block)

    override fun <T : Element> locationOn(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.locationOn, color, classes) {}.apply(block)

    override fun mailOutline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.mailOutline, color, classes).apply(block)

    override fun <T : Element> mailOutline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.mailOutline, color, classes) {}.apply(block)

    override fun message(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.message, color, classes).apply(block)

    override fun <T : Element> message(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.message, color, classes) {}.apply(block)

    override fun noSim(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.noSim, color, classes).apply(block)

    override fun <T : Element> noSim(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.noSim, color, classes) {}.apply(block)

    override fun phone(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.phone, color, classes).apply(block)

    override fun <T : Element> phone(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.phone, color, classes) {}.apply(block)

    override fun phonelinkErase(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.phonelinkErase, color, classes).apply(block)

    override fun <T : Element> phonelinkErase(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.phonelinkErase, color, classes) {}.apply(block)

    override fun phonelinkLock(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.phonelinkLock, color, classes).apply(block)

    override fun <T : Element> phonelinkLock(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.phonelinkLock, color, classes) {}.apply(block)

    override fun phonelinkRing(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.phonelinkRing, color, classes).apply(block)

    override fun <T : Element> phonelinkRing(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.phonelinkRing, color, classes) {}.apply(block)

    override fun phonelinkSetup(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.phonelinkSetup, color, classes).apply(block)

    override fun <T : Element> phonelinkSetup(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.phonelinkSetup, color, classes) {}.apply(block)

    override fun portableWifiOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.portableWifiOff, color, classes).apply(block)

    override fun <T : Element> portableWifiOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.portableWifiOff, color, classes) {}.apply(block)

    override fun presentToAll(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.presentToAll, color, classes).apply(block)

    override fun <T : Element> presentToAll(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.presentToAll, color, classes) {}.apply(block)

    override fun ringVolume(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.ringVolume, color, classes).apply(block)

    override fun <T : Element> ringVolume(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.ringVolume, color, classes) {}.apply(block)

    override fun screenShare(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.screenShare, color, classes).apply(block)

    override fun <T : Element> screenShare(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.screenShare, color, classes) {}.apply(block)

    override fun speakerPhone(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.speakerPhone, color, classes).apply(block)

    override fun <T : Element> speakerPhone(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.speakerPhone, color, classes) {}.apply(block)

    override fun stayCurrentLandscape(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.stayCurrentLandscape, color, classes).apply(block)

    override fun <T : Element> stayCurrentLandscape(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.stayCurrentLandscape, color, classes) {}.apply(block)

    override fun stayCurrentPortrait(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.stayCurrentPortrait, color, classes).apply(block)

    override fun <T : Element> stayCurrentPortrait(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.stayCurrentPortrait, color, classes) {}.apply(block)

    override fun stayPrimaryLandscape(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.stayPrimaryLandscape, color, classes).apply(block)

    override fun <T : Element> stayPrimaryLandscape(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.stayPrimaryLandscape, color, classes) {}.apply(block)

    override fun stayPrimaryPortrait(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.stayPrimaryPortrait, color, classes).apply(block)

    override fun <T : Element> stayPrimaryPortrait(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.stayPrimaryPortrait, color, classes) {}.apply(block)

    override fun stopScreenShare(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.stopScreenShare, color, classes).apply(block)

    override fun <T : Element> stopScreenShare(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.stopScreenShare, color, classes) {}.apply(block)

    override fun swapCalls(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.swapCalls, color, classes).apply(block)

    override fun <T : Element> swapCalls(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.swapCalls, color, classes) {}.apply(block)

    override fun textsms(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.textsms, color, classes).apply(block)

    override fun <T : Element> textsms(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.textsms, color, classes) {}.apply(block)

    override fun voicemail(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.voicemail, color, classes).apply(block)

    override fun <T : Element> voicemail(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.voicemail, color, classes) {}.apply(block)

    override fun vpnKey(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.vpnKey, color, classes).apply(block)

    override fun <T : Element> vpnKey(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.vpnKey, color, classes) {}.apply(block)
	//endregion

    // region Content
    override fun add(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.add, color, classes).apply(block)

    override fun <T : Element> add(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.add, color, classes) {}.apply(block)

    override fun addBox(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.addBox, color, classes).apply(block)

    override fun <T : Element> addBox(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.addBox, color, classes) {}.apply(block)

    override fun addCircle(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.addCircle, color, classes).apply(block)

    override fun <T : Element> addCircle(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.addCircle, color, classes) {}.apply(block)

    override fun addCircleOutline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.addCircleOutline, color, classes).apply(block)

    override fun <T : Element> addCircleOutline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.addCircleOutline, color, classes) {}.apply(block)

    override fun archive(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.archive, color, classes).apply(block)

    override fun <T : Element> archive(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.archive, color, classes) {}.apply(block)

    override fun backspace(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.backspace, color, classes).apply(block)

    override fun <T : Element> backspace(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.backspace, color, classes) {}.apply(block)

    override fun block(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.block, color, classes).apply(block)

    override fun <T : Element> block(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.block, color, classes) {}.apply(block)

    override fun clear(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.clear, color, classes).apply(block)

    override fun <T : Element> clear(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.clear, color, classes) {}.apply(block)

    override fun contentCopy(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.contentCopy, color, classes).apply(block)

    override fun <T : Element> contentCopy(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.contentCopy, color, classes) {}.apply(block)

    override fun contentCut(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.contentCut, color, classes).apply(block)

    override fun <T : Element> contentCut(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.contentCut, color, classes) {}.apply(block)

    override fun contentPaste(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.contentPaste, color, classes).apply(block)

    override fun <T : Element> contentPaste(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.contentPaste, color, classes) {}.apply(block)

    override fun create(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.create, color, classes).apply(block)

    override fun <T : Element> create(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.create, color, classes) {}.apply(block)

    override fun drafts(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.drafts, color, classes).apply(block)

    override fun <T : Element> drafts(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.drafts, color, classes) {}.apply(block)

    override fun filterList(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filterList, color, classes).apply(block)

    override fun <T : Element> filterList(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filterList, color, classes) {}.apply(block)

    override fun flag(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.flag, color, classes).apply(block)

    override fun <T : Element> flag(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.flag, color, classes) {}.apply(block)

    override fun fontDownload(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.fontDownload, color, classes).apply(block)

    override fun <T : Element> fontDownload(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.fontDownload, color, classes) {}.apply(block)

    override fun forward(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.forward, color, classes).apply(block)

    override fun <T : Element> forward(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.forward, color, classes) {}.apply(block)

    override fun gesture(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.gesture, color, classes).apply(block)

    override fun <T : Element> gesture(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.gesture, color, classes) {}.apply(block)

    override fun inbox(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.inbox, color, classes).apply(block)

    override fun <T : Element> inbox(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.inbox, color, classes) {}.apply(block)

    override fun link(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.link, color, classes).apply(block)

    override fun <T : Element> link(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.link, color, classes) {}.apply(block)

    override fun mail(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.mail, color, classes).apply(block)

    override fun <T : Element> mail(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.mail, color, classes) {}.apply(block)

    override fun markunread(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.markunread, color, classes).apply(block)

    override fun <T : Element> markunread(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.markunread, color, classes) {}.apply(block)

    override fun moveToInbox(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.moveToInbox, color, classes).apply(block)

    override fun <T : Element> moveToInbox(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.moveToInbox, color, classes) {}.apply(block)

    override fun nextWeek(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.nextWeek, color, classes).apply(block)

    override fun <T : Element> nextWeek(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.nextWeek, color, classes) {}.apply(block)

    override fun redo(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.redo, color, classes).apply(block)

    override fun <T : Element> redo(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.redo, color, classes) {}.apply(block)

    override fun remove(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.remove, color, classes).apply(block)

    override fun <T : Element> remove(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.remove, color, classes) {}.apply(block)

    override fun removeCircle(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.removeCircle, color, classes).apply(block)

    override fun <T : Element> removeCircle(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.removeCircle, color, classes) {}.apply(block)

    override fun removeCircleOutline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.removeCircleOutline, color, classes).apply(block)

    override fun <T : Element> removeCircleOutline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.removeCircleOutline, color, classes) {}.apply(block)

    override fun reply(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.reply, color, classes).apply(block)

    override fun <T : Element> reply(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.reply, color, classes) {}.apply(block)

    override fun replyAll(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.replyAll, color, classes).apply(block)

    override fun <T : Element> replyAll(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.replyAll, color, classes) {}.apply(block)

    override fun report(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.report, color, classes).apply(block)

    override fun <T : Element> report(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.report, color, classes) {}.apply(block)

    override fun save(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.save, color, classes).apply(block)

    override fun <T : Element> save(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.save, color, classes) {}.apply(block)

    override fun selectAll(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.selectAll, color, classes).apply(block)

    override fun <T : Element> selectAll(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.selectAll, color, classes) {}.apply(block)

    override fun send(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.send, color, classes).apply(block)

    override fun <T : Element> send(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.send, color, classes) {}.apply(block)

    override fun sort(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.sort, color, classes).apply(block)

    override fun <T : Element> sort(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.sort, color, classes) {}.apply(block)

    override fun textFormat(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.textFormat, color, classes).apply(block)

    override fun <T : Element> textFormat(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.textFormat, color, classes) {}.apply(block)

    override fun unarchive(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.unarchive, color, classes).apply(block)

    override fun <T : Element> unarchive(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.unarchive, color, classes) {}.apply(block)

    override fun undo(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.undo, color, classes).apply(block)

    override fun <T : Element> undo(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.undo, color, classes) {}.apply(block)

    override fun weekend(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.weekend, color, classes).apply(block)

    override fun <T : Element> weekend(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.weekend, color, classes) {}.apply(block)
	//endregion

    // region Device
    override fun accessAlarm(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.accessAlarm, color, classes).apply(block)

    override fun <T : Element> accessAlarm(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.accessAlarm, color, classes) {}.apply(block)

    override fun accessAlarms(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.accessAlarms, color, classes).apply(block)

    override fun <T : Element> accessAlarms(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.accessAlarms, color, classes) {}.apply(block)

    override fun accessTime(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.accessTime, color, classes).apply(block)

    override fun <T : Element> accessTime(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.accessTime, color, classes) {}.apply(block)

    override fun addAlarm(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.addAlarm, color, classes).apply(block)

    override fun <T : Element> addAlarm(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.addAlarm, color, classes) {}.apply(block)

    override fun airplanemodeActive(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.airplanemodeActive, color, classes).apply(block)

    override fun <T : Element> airplanemodeActive(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.airplanemodeActive, color, classes) {}.apply(block)

    override fun airplanemodeInactive(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.airplanemodeInactive, color, classes).apply(block)

    override fun <T : Element> airplanemodeInactive(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.airplanemodeInactive, color, classes) {}.apply(block)

    override fun batteryAlert(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.batteryAlert, color, classes).apply(block)

    override fun <T : Element> batteryAlert(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.batteryAlert, color, classes) {}.apply(block)

    override fun batteryChargingFull(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.batteryChargingFull, color, classes).apply(block)

    override fun <T : Element> batteryChargingFull(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.batteryChargingFull, color, classes) {}.apply(block)

    override fun batteryFull(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.batteryFull, color, classes).apply(block)

    override fun <T : Element> batteryFull(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.batteryFull, color, classes) {}.apply(block)

    override fun batteryStd(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.batteryStd, color, classes).apply(block)

    override fun <T : Element> batteryStd(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.batteryStd, color, classes) {}.apply(block)

    override fun batteryUnknown(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.batteryUnknown, color, classes).apply(block)

    override fun <T : Element> batteryUnknown(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.batteryUnknown, color, classes) {}.apply(block)

    override fun bluetooth(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.bluetooth, color, classes).apply(block)

    override fun <T : Element> bluetooth(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.bluetooth, color, classes) {}.apply(block)

    override fun bluetoothConnected(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.bluetoothConnected, color, classes).apply(block)

    override fun <T : Element> bluetoothConnected(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.bluetoothConnected, color, classes) {}.apply(block)

    override fun bluetoothDisabled(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.bluetoothDisabled, color, classes).apply(block)

    override fun <T : Element> bluetoothDisabled(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.bluetoothDisabled, color, classes) {}.apply(block)

    override fun bluetoothSearching(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.bluetoothSearching, color, classes).apply(block)

    override fun <T : Element> bluetoothSearching(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.bluetoothSearching, color, classes) {}.apply(block)

    override fun brightnessAuto(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.brightnessAuto, color, classes).apply(block)

    override fun <T : Element> brightnessAuto(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.brightnessAuto, color, classes) {}.apply(block)

    override fun brightnessHigh(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.brightnessHigh, color, classes).apply(block)

    override fun <T : Element> brightnessHigh(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.brightnessHigh, color, classes) {}.apply(block)

    override fun brightnessLow(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.brightnessLow, color, classes).apply(block)

    override fun <T : Element> brightnessLow(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.brightnessLow, color, classes) {}.apply(block)

    override fun brightnessMedium(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.brightnessMedium, color, classes).apply(block)

    override fun <T : Element> brightnessMedium(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.brightnessMedium, color, classes) {}.apply(block)

    override fun dataUsage(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.dataUsage, color, classes).apply(block)

    override fun <T : Element> dataUsage(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.dataUsage, color, classes) {}.apply(block)

    override fun developerMode(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.developerMode, color, classes).apply(block)

    override fun <T : Element> developerMode(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.developerMode, color, classes) {}.apply(block)

    override fun devices(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.devices, color, classes).apply(block)

    override fun <T : Element> devices(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.devices, color, classes) {}.apply(block)

    override fun dvr(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.dvr, color, classes).apply(block)

    override fun <T : Element> dvr(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.dvr, color, classes) {}.apply(block)

    override fun gpsFixed(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.gpsFixed, color, classes).apply(block)

    override fun <T : Element> gpsFixed(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.gpsFixed, color, classes) {}.apply(block)

    override fun gpsNotFixed(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.gpsNotFixed, color, classes).apply(block)

    override fun <T : Element> gpsNotFixed(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.gpsNotFixed, color, classes) {}.apply(block)

    override fun gpsOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.gpsOff, color, classes).apply(block)

    override fun <T : Element> gpsOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.gpsOff, color, classes) {}.apply(block)

    override fun graphicEq(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.graphicEq, color, classes).apply(block)

    override fun <T : Element> graphicEq(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.graphicEq, color, classes) {}.apply(block)

    override fun locationDisabled(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.locationDisabled, color, classes).apply(block)

    override fun <T : Element> locationDisabled(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.locationDisabled, color, classes) {}.apply(block)

    override fun locationSearching(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.locationSearching, color, classes).apply(block)

    override fun <T : Element> locationSearching(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.locationSearching, color, classes) {}.apply(block)

    override fun networkCell(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.networkCell, color, classes).apply(block)

    override fun <T : Element> networkCell(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.networkCell, color, classes) {}.apply(block)

    override fun networkWifi(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.networkWifi, color, classes).apply(block)

    override fun <T : Element> networkWifi(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.networkWifi, color, classes) {}.apply(block)

    override fun nfc(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.nfc, color, classes).apply(block)

    override fun <T : Element> nfc(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.nfc, color, classes) {}.apply(block)

    override fun screenLockLandscape(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.screenLockLandscape, color, classes).apply(block)

    override fun <T : Element> screenLockLandscape(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.screenLockLandscape, color, classes) {}.apply(block)

    override fun screenLockPortrait(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.screenLockPortrait, color, classes).apply(block)

    override fun <T : Element> screenLockPortrait(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.screenLockPortrait, color, classes) {}.apply(block)

    override fun screenLockRotation(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.screenLockRotation, color, classes).apply(block)

    override fun <T : Element> screenLockRotation(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.screenLockRotation, color, classes) {}.apply(block)

    override fun screenRotation(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.screenRotation, color, classes).apply(block)

    override fun <T : Element> screenRotation(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.screenRotation, color, classes) {}.apply(block)

    override fun sdStorage(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.sdStorage, color, classes).apply(block)

    override fun <T : Element> sdStorage(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.sdStorage, color, classes) {}.apply(block)

    override fun settingsSystemDaydream(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.settingsSystemDaydream, color, classes).apply(block)

    override fun <T : Element> settingsSystemDaydream(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.settingsSystemDaydream, color, classes) {}.apply(block)

    override fun signalCellular4Bar(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.signalCellular4Bar, color, classes).apply(block)

    override fun <T : Element> signalCellular4Bar(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.signalCellular4Bar, color, classes) {}.apply(block)

    override fun signalCellularConnectedNoInternet4Bar(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.signalCellularConnectedNoInternet4Bar, color, classes).apply(block)

    override fun <T : Element> signalCellularConnectedNoInternet4Bar(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.signalCellularConnectedNoInternet4Bar, color, classes) {}.apply(block)

    override fun signalCellularNoSim(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.signalCellularNoSim, color, classes).apply(block)

    override fun <T : Element> signalCellularNoSim(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.signalCellularNoSim, color, classes) {}.apply(block)

    override fun signalCellularNull(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.signalCellularNull, color, classes).apply(block)

    override fun <T : Element> signalCellularNull(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.signalCellularNull, color, classes) {}.apply(block)

    override fun signalCellularOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.signalCellularOff, color, classes).apply(block)

    override fun <T : Element> signalCellularOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.signalCellularOff, color, classes) {}.apply(block)

    override fun signalWifi4Bar(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.signalWifi4Bar, color, classes).apply(block)

    override fun <T : Element> signalWifi4Bar(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.signalWifi4Bar, color, classes) {}.apply(block)

    override fun signalWifi4BarLock(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.signalWifi4BarLock, color, classes).apply(block)

    override fun <T : Element> signalWifi4BarLock(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.signalWifi4BarLock, color, classes) {}.apply(block)

    override fun signalWifiOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.signalWifiOff, color, classes).apply(block)

    override fun <T : Element> signalWifiOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.signalWifiOff, color, classes) {}.apply(block)

    override fun storage(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.storage, color, classes).apply(block)

    override fun <T : Element> storage(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.storage, color, classes) {}.apply(block)

    override fun usb(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.usb, color, classes).apply(block)

    override fun <T : Element> usb(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.usb, color, classes) {}.apply(block)

    override fun wallpaper(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.wallpaper, color, classes).apply(block)

    override fun <T : Element> wallpaper(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.wallpaper, color, classes) {}.apply(block)

    override fun widgets(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.widgets, color, classes).apply(block)

    override fun <T : Element> widgets(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.widgets, color, classes) {}.apply(block)

    override fun wifiLock(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.wifiLock, color, classes).apply(block)

    override fun <T : Element> wifiLock(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.wifiLock, color, classes) {}.apply(block)

    override fun wifiTethering(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.wifiTethering, color, classes).apply(block)

    override fun <T : Element> wifiTethering(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.wifiTethering, color, classes) {}.apply(block)
	//endregion

    // region Editor
    override fun attachFile(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.attachFile, color, classes).apply(block)

    override fun <T : Element> attachFile(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.attachFile, color, classes) {}.apply(block)

    override fun attachMoney(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.attachMoney, color, classes).apply(block)

    override fun <T : Element> attachMoney(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.attachMoney, color, classes) {}.apply(block)

    override fun borderAll(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.borderAll, color, classes).apply(block)

    override fun <T : Element> borderAll(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.borderAll, color, classes) {}.apply(block)

    override fun borderBottom(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.borderBottom, color, classes).apply(block)

    override fun <T : Element> borderBottom(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.borderBottom, color, classes) {}.apply(block)

    override fun borderClear(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.borderClear, color, classes).apply(block)

    override fun <T : Element> borderClear(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.borderClear, color, classes) {}.apply(block)

    override fun borderColor(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.borderColor, color, classes).apply(block)

    override fun <T : Element> borderColor(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.borderColor, color, classes) {}.apply(block)

    override fun borderHorizontal(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.borderHorizontal, color, classes).apply(block)

    override fun <T : Element> borderHorizontal(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.borderHorizontal, color, classes) {}.apply(block)

    override fun borderInner(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.borderInner, color, classes).apply(block)

    override fun <T : Element> borderInner(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.borderInner, color, classes) {}.apply(block)

    override fun borderLeft(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.borderLeft, color, classes).apply(block)

    override fun <T : Element> borderLeft(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.borderLeft, color, classes) {}.apply(block)

    override fun borderOuter(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.borderOuter, color, classes).apply(block)

    override fun <T : Element> borderOuter(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.borderOuter, color, classes) {}.apply(block)

    override fun borderRight(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.borderRight, color, classes).apply(block)

    override fun <T : Element> borderRight(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.borderRight, color, classes) {}.apply(block)

    override fun borderStyle(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.borderStyle, color, classes).apply(block)

    override fun <T : Element> borderStyle(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.borderStyle, color, classes) {}.apply(block)

    override fun borderTop(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.borderTop, color, classes).apply(block)

    override fun <T : Element> borderTop(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.borderTop, color, classes) {}.apply(block)

    override fun borderVertical(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.borderVertical, color, classes).apply(block)

    override fun <T : Element> borderVertical(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.borderVertical, color, classes) {}.apply(block)

    override fun dragHandle(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.dragHandle, color, classes).apply(block)

    override fun <T : Element> dragHandle(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.dragHandle, color, classes) {}.apply(block)

    override fun formatAlignCenter(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatAlignCenter, color, classes).apply(block)

    override fun <T : Element> formatAlignCenter(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatAlignCenter, color, classes) {}.apply(block)

    override fun formatAlignJustify(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatAlignJustify, color, classes).apply(block)

    override fun <T : Element> formatAlignJustify(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatAlignJustify, color, classes) {}.apply(block)

    override fun formatAlignLeft(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatAlignLeft, color, classes).apply(block)

    override fun <T : Element> formatAlignLeft(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatAlignLeft, color, classes) {}.apply(block)

    override fun formatAlignRight(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatAlignRight, color, classes).apply(block)

    override fun <T : Element> formatAlignRight(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatAlignRight, color, classes) {}.apply(block)

    override fun formatBold(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatBold, color, classes).apply(block)

    override fun <T : Element> formatBold(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatBold, color, classes) {}.apply(block)

    override fun formatClear(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatClear, color, classes).apply(block)

    override fun <T : Element> formatClear(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatClear, color, classes) {}.apply(block)

    override fun formatColorFill(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatColorFill, color, classes).apply(block)

    override fun <T : Element> formatColorFill(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatColorFill, color, classes) {}.apply(block)

    override fun formatColorReset(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatColorReset, color, classes).apply(block)

    override fun <T : Element> formatColorReset(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatColorReset, color, classes) {}.apply(block)

    override fun formatColorText(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatColorText, color, classes).apply(block)

    override fun <T : Element> formatColorText(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatColorText, color, classes) {}.apply(block)

    override fun formatIndentDecrease(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatIndentDecrease, color, classes).apply(block)

    override fun <T : Element> formatIndentDecrease(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatIndentDecrease, color, classes) {}.apply(block)

    override fun formatIndentIncrease(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatIndentIncrease, color, classes).apply(block)

    override fun <T : Element> formatIndentIncrease(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatIndentIncrease, color, classes) {}.apply(block)

    override fun formatItalic(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatItalic, color, classes).apply(block)

    override fun <T : Element> formatItalic(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatItalic, color, classes) {}.apply(block)

    override fun formatLineSpacing(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatLineSpacing, color, classes).apply(block)

    override fun <T : Element> formatLineSpacing(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatLineSpacing, color, classes) {}.apply(block)

    override fun formatListBulleted(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatListBulleted, color, classes).apply(block)

    override fun <T : Element> formatListBulleted(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatListBulleted, color, classes) {}.apply(block)

    override fun formatListNumbered(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatListNumbered, color, classes).apply(block)

    override fun <T : Element> formatListNumbered(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatListNumbered, color, classes) {}.apply(block)

    override fun formatPaint(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatPaint, color, classes).apply(block)

    override fun <T : Element> formatPaint(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatPaint, color, classes) {}.apply(block)

    override fun formatQuote(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatQuote, color, classes).apply(block)

    override fun <T : Element> formatQuote(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatQuote, color, classes) {}.apply(block)

    override fun formatShapes(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatShapes, color, classes).apply(block)

    override fun <T : Element> formatShapes(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatShapes, color, classes) {}.apply(block)

    override fun formatSize(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatSize, color, classes).apply(block)

    override fun <T : Element> formatSize(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatSize, color, classes) {}.apply(block)

    override fun formatStrikethrough(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatStrikethrough, color, classes).apply(block)

    override fun <T : Element> formatStrikethrough(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatStrikethrough, color, classes) {}.apply(block)

    override fun formatTextdirectionLToR(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatTextdirectionLToR, color, classes).apply(block)

    override fun <T : Element> formatTextdirectionLToR(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatTextdirectionLToR, color, classes) {}.apply(block)

    override fun formatTextdirectionRToL(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatTextdirectionRToL, color, classes).apply(block)

    override fun <T : Element> formatTextdirectionRToL(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatTextdirectionRToL, color, classes) {}.apply(block)

    override fun formatUnderlined(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.formatUnderlined, color, classes).apply(block)

    override fun <T : Element> formatUnderlined(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.formatUnderlined, color, classes) {}.apply(block)

    override fun functions(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.functions, color, classes).apply(block)

    override fun <T : Element> functions(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.functions, color, classes) {}.apply(block)

    override fun highlight(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.highlight, color, classes).apply(block)

    override fun <T : Element> highlight(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.highlight, color, classes) {}.apply(block)

    override fun insertChart(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.insertChart, color, classes).apply(block)

    override fun <T : Element> insertChart(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.insertChart, color, classes) {}.apply(block)

    override fun insertComment(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.insertComment, color, classes).apply(block)

    override fun <T : Element> insertComment(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.insertComment, color, classes) {}.apply(block)

    override fun insertDriveFile(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.insertDriveFile, color, classes).apply(block)

    override fun <T : Element> insertDriveFile(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.insertDriveFile, color, classes) {}.apply(block)

    override fun insertEmoticon(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.insertEmoticon, color, classes).apply(block)

    override fun <T : Element> insertEmoticon(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.insertEmoticon, color, classes) {}.apply(block)

    override fun insertInvitation(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.insertInvitation, color, classes).apply(block)

    override fun <T : Element> insertInvitation(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.insertInvitation, color, classes) {}.apply(block)

    override fun insertLink(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.insertLink, color, classes).apply(block)

    override fun <T : Element> insertLink(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.insertLink, color, classes) {}.apply(block)

    override fun insertPhoto(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.insertPhoto, color, classes).apply(block)

    override fun <T : Element> insertPhoto(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.insertPhoto, color, classes) {}.apply(block)

    override fun linearScale(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.linearScale, color, classes).apply(block)

    override fun <T : Element> linearScale(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.linearScale, color, classes) {}.apply(block)

    override fun mergeType(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.mergeType, color, classes).apply(block)

    override fun <T : Element> mergeType(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.mergeType, color, classes) {}.apply(block)

    override fun modeComment(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.modeComment, color, classes).apply(block)

    override fun <T : Element> modeComment(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.modeComment, color, classes) {}.apply(block)

    override fun modeEdit(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.modeEdit, color, classes).apply(block)

    override fun <T : Element> modeEdit(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.modeEdit, color, classes) {}.apply(block)

    override fun moneyOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.moneyOff, color, classes).apply(block)

    override fun <T : Element> moneyOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.moneyOff, color, classes) {}.apply(block)

    override fun publish(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.publish, color, classes).apply(block)

    override fun <T : Element> publish(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.publish, color, classes) {}.apply(block)

    override fun shortText(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.shortText, color, classes).apply(block)

    override fun <T : Element> shortText(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.shortText, color, classes) {}.apply(block)

    override fun spaceBar(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.spaceBar, color, classes).apply(block)

    override fun <T : Element> spaceBar(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.spaceBar, color, classes) {}.apply(block)

    override fun strikethroughS(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.strikethroughS, color, classes).apply(block)

    override fun <T : Element> strikethroughS(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.strikethroughS, color, classes) {}.apply(block)

    override fun textFields(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.textFields, color, classes).apply(block)

    override fun <T : Element> textFields(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.textFields, color, classes) {}.apply(block)

    override fun verticalAlignBottom(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.verticalAlignBottom, color, classes).apply(block)

    override fun <T : Element> verticalAlignBottom(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.verticalAlignBottom, color, classes) {}.apply(block)

    override fun verticalAlignCenter(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.verticalAlignCenter, color, classes).apply(block)

    override fun <T : Element> verticalAlignCenter(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.verticalAlignCenter, color, classes) {}.apply(block)

    override fun verticalAlignTop(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.verticalAlignTop, color, classes).apply(block)

    override fun <T : Element> verticalAlignTop(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.verticalAlignTop, color, classes) {}.apply(block)

    override fun wrapText(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.wrapText, color, classes).apply(block)

    override fun <T : Element> wrapText(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.wrapText, color, classes) {}.apply(block)
	//endregion

    // region File
    override fun attachment(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.attachment, color, classes).apply(block)

    override fun <T : Element> attachment(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.attachment, color, classes) {}.apply(block)

    override fun cloud(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cloud, color, classes).apply(block)

    override fun <T : Element> cloud(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cloud, color, classes) {}.apply(block)

    override fun cloudCircle(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cloudCircle, color, classes).apply(block)

    override fun <T : Element> cloudCircle(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cloudCircle, color, classes) {}.apply(block)

    override fun cloudDone(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cloudDone, color, classes).apply(block)

    override fun <T : Element> cloudDone(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cloudDone, color, classes) {}.apply(block)

    override fun cloudDownload(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cloudDownload, color, classes).apply(block)

    override fun <T : Element> cloudDownload(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cloudDownload, color, classes) {}.apply(block)

    override fun cloudOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cloudOff, color, classes).apply(block)

    override fun <T : Element> cloudOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cloudOff, color, classes) {}.apply(block)

    override fun cloudQueue(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cloudQueue, color, classes).apply(block)

    override fun <T : Element> cloudQueue(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cloudQueue, color, classes) {}.apply(block)

    override fun cloudUpload(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cloudUpload, color, classes).apply(block)

    override fun <T : Element> cloudUpload(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cloudUpload, color, classes) {}.apply(block)

    override fun createNewFolder(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.createNewFolder, color, classes).apply(block)

    override fun <T : Element> createNewFolder(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.createNewFolder, color, classes) {}.apply(block)

    override fun fileDownload(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.fileDownload, color, classes).apply(block)

    override fun <T : Element> fileDownload(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.fileDownload, color, classes) {}.apply(block)

    override fun fileUpload(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.fileUpload, color, classes).apply(block)

    override fun <T : Element> fileUpload(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.fileUpload, color, classes) {}.apply(block)

    override fun folder(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.folder, color, classes).apply(block)

    override fun <T : Element> folder(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.folder, color, classes) {}.apply(block)

    override fun folderOpen(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.folderOpen, color, classes).apply(block)

    override fun <T : Element> folderOpen(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.folderOpen, color, classes) {}.apply(block)

    override fun folderShared(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.folderShared, color, classes).apply(block)

    override fun <T : Element> folderShared(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.folderShared, color, classes) {}.apply(block)
	//endregion

    // region Hardware
    override fun cast(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cast, color, classes).apply(block)

    override fun <T : Element> cast(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cast, color, classes) {}.apply(block)

    override fun castConnected(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.castConnected, color, classes).apply(block)

    override fun <T : Element> castConnected(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.castConnected, color, classes) {}.apply(block)

    override fun computer(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.computer, color, classes).apply(block)

    override fun <T : Element> computer(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.computer, color, classes) {}.apply(block)

    override fun desktopMac(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.desktopMac, color, classes).apply(block)

    override fun <T : Element> desktopMac(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.desktopMac, color, classes) {}.apply(block)

    override fun desktopWindows(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.desktopWindows, color, classes).apply(block)

    override fun <T : Element> desktopWindows(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.desktopWindows, color, classes) {}.apply(block)

    override fun developerBoard(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.developerBoard, color, classes).apply(block)

    override fun <T : Element> developerBoard(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.developerBoard, color, classes) {}.apply(block)

    override fun deviceHub(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.deviceHub, color, classes).apply(block)

    override fun <T : Element> deviceHub(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.deviceHub, color, classes) {}.apply(block)

    override fun devicesOther(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.devicesOther, color, classes).apply(block)

    override fun <T : Element> devicesOther(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.devicesOther, color, classes) {}.apply(block)

    override fun dock(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.dock, color, classes).apply(block)

    override fun <T : Element> dock(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.dock, color, classes) {}.apply(block)

    override fun gamepad(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.gamepad, color, classes).apply(block)

    override fun <T : Element> gamepad(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.gamepad, color, classes) {}.apply(block)

    override fun headset(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.headset, color, classes).apply(block)

    override fun <T : Element> headset(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.headset, color, classes) {}.apply(block)

    override fun headsetMic(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.headsetMic, color, classes).apply(block)

    override fun <T : Element> headsetMic(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.headsetMic, color, classes) {}.apply(block)

    override fun keyboard(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.keyboard, color, classes).apply(block)

    override fun <T : Element> keyboard(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.keyboard, color, classes) {}.apply(block)

    override fun keyboardArrowDown(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.keyboardArrowDown, color, classes).apply(block)

    override fun <T : Element> keyboardArrowDown(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.keyboardArrowDown, color, classes) {}.apply(block)

    override fun keyboardArrowLeft(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.keyboardArrowLeft, color, classes).apply(block)

    override fun <T : Element> keyboardArrowLeft(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.keyboardArrowLeft, color, classes) {}.apply(block)

    override fun keyboardArrowRight(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.keyboardArrowRight, color, classes).apply(block)

    override fun <T : Element> keyboardArrowRight(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.keyboardArrowRight, color, classes) {}.apply(block)

    override fun keyboardArrowUp(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.keyboardArrowUp, color, classes).apply(block)

    override fun <T : Element> keyboardArrowUp(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.keyboardArrowUp, color, classes) {}.apply(block)

    override fun keyboardBackspace(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.keyboardBackspace, color, classes).apply(block)

    override fun <T : Element> keyboardBackspace(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.keyboardBackspace, color, classes) {}.apply(block)

    override fun keyboardCapslock(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.keyboardCapslock, color, classes).apply(block)

    override fun <T : Element> keyboardCapslock(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.keyboardCapslock, color, classes) {}.apply(block)

    override fun keyboardHide(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.keyboardHide, color, classes).apply(block)

    override fun <T : Element> keyboardHide(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.keyboardHide, color, classes) {}.apply(block)

    override fun keyboardReturn(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.keyboardReturn, color, classes).apply(block)

    override fun <T : Element> keyboardReturn(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.keyboardReturn, color, classes) {}.apply(block)

    override fun keyboardTab(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.keyboardTab, color, classes).apply(block)

    override fun <T : Element> keyboardTab(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.keyboardTab, color, classes) {}.apply(block)

    override fun keyboardVoice(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.keyboardVoice, color, classes).apply(block)

    override fun <T : Element> keyboardVoice(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.keyboardVoice, color, classes) {}.apply(block)

    override fun laptop(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.laptop, color, classes).apply(block)

    override fun <T : Element> laptop(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.laptop, color, classes) {}.apply(block)

    override fun laptopChromebook(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.laptopChromebook, color, classes).apply(block)

    override fun <T : Element> laptopChromebook(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.laptopChromebook, color, classes) {}.apply(block)

    override fun laptopMac(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.laptopMac, color, classes).apply(block)

    override fun <T : Element> laptopMac(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.laptopMac, color, classes) {}.apply(block)

    override fun laptopWindows(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.laptopWindows, color, classes).apply(block)

    override fun <T : Element> laptopWindows(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.laptopWindows, color, classes) {}.apply(block)

    override fun memory(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.memory, color, classes).apply(block)

    override fun <T : Element> memory(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.memory, color, classes) {}.apply(block)

    override fun mouse(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.mouse, color, classes).apply(block)

    override fun <T : Element> mouse(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.mouse, color, classes) {}.apply(block)

    override fun phoneAndroid(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.phoneAndroid, color, classes).apply(block)

    override fun <T : Element> phoneAndroid(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.phoneAndroid, color, classes) {}.apply(block)

    override fun phoneIphone(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.phoneIphone, color, classes).apply(block)

    override fun <T : Element> phoneIphone(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.phoneIphone, color, classes) {}.apply(block)

    override fun phonelink(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.phonelink, color, classes).apply(block)

    override fun <T : Element> phonelink(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.phonelink, color, classes) {}.apply(block)

    override fun phonelinkOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.phonelinkOff, color, classes).apply(block)

    override fun <T : Element> phonelinkOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.phonelinkOff, color, classes) {}.apply(block)

    override fun powerInput(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.powerInput, color, classes).apply(block)

    override fun <T : Element> powerInput(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.powerInput, color, classes) {}.apply(block)

    override fun router(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.router, color, classes).apply(block)

    override fun <T : Element> router(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.router, color, classes) {}.apply(block)

    override fun scanner(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.scanner, color, classes).apply(block)

    override fun <T : Element> scanner(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.scanner, color, classes) {}.apply(block)

    override fun security(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.security, color, classes).apply(block)

    override fun <T : Element> security(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.security, color, classes) {}.apply(block)

    override fun simCard(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.simCard, color, classes).apply(block)

    override fun <T : Element> simCard(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.simCard, color, classes) {}.apply(block)

    override fun smartphone(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.smartphone, color, classes).apply(block)

    override fun <T : Element> smartphone(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.smartphone, color, classes) {}.apply(block)

    override fun speaker(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.speaker, color, classes).apply(block)

    override fun <T : Element> speaker(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.speaker, color, classes) {}.apply(block)

    override fun speakerGroup(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.speakerGroup, color, classes).apply(block)

    override fun <T : Element> speakerGroup(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.speakerGroup, color, classes) {}.apply(block)

    override fun tablet(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.tablet, color, classes).apply(block)

    override fun <T : Element> tablet(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.tablet, color, classes) {}.apply(block)

    override fun tabletAndroid(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.tabletAndroid, color, classes).apply(block)

    override fun <T : Element> tabletAndroid(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.tabletAndroid, color, classes) {}.apply(block)

    override fun tabletMac(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.tabletMac, color, classes).apply(block)

    override fun <T : Element> tabletMac(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.tabletMac, color, classes) {}.apply(block)

    override fun toys(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.toys, color, classes).apply(block)

    override fun <T : Element> toys(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.toys, color, classes) {}.apply(block)

    override fun tv(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.tv, color, classes).apply(block)

    override fun <T : Element> tv(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.tv, color, classes) {}.apply(block)

    override fun videogameAsset(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.videogameAsset, color, classes).apply(block)

    override fun <T : Element> videogameAsset(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.videogameAsset, color, classes) {}.apply(block)

    override fun watch(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.watch, color, classes).apply(block)

    override fun <T : Element> watch(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.watch, color, classes) {}.apply(block)
	//endregion

    // region Image
    override fun addAPhoto(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.addAPhoto, color, classes).apply(block)

    override fun <T : Element> addAPhoto(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.addAPhoto, color, classes) {}.apply(block)

    override fun addToPhotos(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.addToPhotos, color, classes).apply(block)

    override fun <T : Element> addToPhotos(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.addToPhotos, color, classes) {}.apply(block)

    override fun adjust(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.adjust, color, classes).apply(block)

    override fun <T : Element> adjust(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.adjust, color, classes) {}.apply(block)

    override fun assistant(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.assistant, color, classes).apply(block)

    override fun <T : Element> assistant(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.assistant, color, classes) {}.apply(block)

    override fun assistantPhoto(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.assistantPhoto, color, classes).apply(block)

    override fun <T : Element> assistantPhoto(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.assistantPhoto, color, classes) {}.apply(block)

    override fun audiotrack(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.audiotrack, color, classes).apply(block)

    override fun <T : Element> audiotrack(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.audiotrack, color, classes) {}.apply(block)

    override fun blurCircular(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.blurCircular, color, classes).apply(block)

    override fun <T : Element> blurCircular(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.blurCircular, color, classes) {}.apply(block)

    override fun blurLinear(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.blurLinear, color, classes).apply(block)

    override fun <T : Element> blurLinear(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.blurLinear, color, classes) {}.apply(block)

    override fun blurOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.blurOff, color, classes).apply(block)

    override fun <T : Element> blurOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.blurOff, color, classes) {}.apply(block)

    override fun blurOn(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.blurOn, color, classes).apply(block)

    override fun <T : Element> blurOn(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.blurOn, color, classes) {}.apply(block)

    override fun brightness1(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.brightness1, color, classes).apply(block)

    override fun <T : Element> brightness1(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.brightness1, color, classes) {}.apply(block)

    override fun brightness2(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.brightness2, color, classes).apply(block)

    override fun <T : Element> brightness2(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.brightness2, color, classes) {}.apply(block)

    override fun brightness3(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.brightness3, color, classes).apply(block)

    override fun <T : Element> brightness3(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.brightness3, color, classes) {}.apply(block)

    override fun brightness4(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.brightness4, color, classes).apply(block)

    override fun <T : Element> brightness4(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.brightness4, color, classes) {}.apply(block)

    override fun brightness5(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.brightness5, color, classes).apply(block)

    override fun <T : Element> brightness5(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.brightness5, color, classes) {}.apply(block)

    override fun brightness6(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.brightness6, color, classes).apply(block)

    override fun <T : Element> brightness6(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.brightness6, color, classes) {}.apply(block)

    override fun brightness7(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.brightness7, color, classes).apply(block)

    override fun <T : Element> brightness7(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.brightness7, color, classes) {}.apply(block)

    override fun brokenImage(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.brokenImage, color, classes).apply(block)

    override fun <T : Element> brokenImage(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.brokenImage, color, classes) {}.apply(block)

    override fun brush(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.brush, color, classes).apply(block)

    override fun <T : Element> brush(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.brush, color, classes) {}.apply(block)

    override fun camera(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.camera, color, classes).apply(block)

    override fun <T : Element> camera(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.camera, color, classes) {}.apply(block)

    override fun cameraAlt(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cameraAlt, color, classes).apply(block)

    override fun <T : Element> cameraAlt(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cameraAlt, color, classes) {}.apply(block)

    override fun cameraFront(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cameraFront, color, classes).apply(block)

    override fun <T : Element> cameraFront(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cameraFront, color, classes) {}.apply(block)

    override fun cameraRear(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cameraRear, color, classes).apply(block)

    override fun <T : Element> cameraRear(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cameraRear, color, classes) {}.apply(block)

    override fun cameraRoll(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cameraRoll, color, classes).apply(block)

    override fun <T : Element> cameraRoll(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cameraRoll, color, classes) {}.apply(block)

    override fun centerFocusStrong(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.centerFocusStrong, color, classes).apply(block)

    override fun <T : Element> centerFocusStrong(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.centerFocusStrong, color, classes) {}.apply(block)

    override fun centerFocusWeak(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.centerFocusWeak, color, classes).apply(block)

    override fun <T : Element> centerFocusWeak(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.centerFocusWeak, color, classes) {}.apply(block)

    override fun collections(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.collections, color, classes).apply(block)

    override fun <T : Element> collections(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.collections, color, classes) {}.apply(block)

    override fun collectionsBookmark(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.collectionsBookmark, color, classes).apply(block)

    override fun <T : Element> collectionsBookmark(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.collectionsBookmark, color, classes) {}.apply(block)

    override fun colorLens(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.colorLens, color, classes).apply(block)

    override fun <T : Element> colorLens(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.colorLens, color, classes) {}.apply(block)

    override fun colorize(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.colorize, color, classes).apply(block)

    override fun <T : Element> colorize(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.colorize, color, classes) {}.apply(block)

    override fun compare(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.compare, color, classes).apply(block)

    override fun <T : Element> compare(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.compare, color, classes) {}.apply(block)

    override fun controlPoint(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.controlPoint, color, classes).apply(block)

    override fun <T : Element> controlPoint(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.controlPoint, color, classes) {}.apply(block)

    override fun controlPointDuplicate(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.controlPointDuplicate, color, classes).apply(block)

    override fun <T : Element> controlPointDuplicate(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.controlPointDuplicate, color, classes) {}.apply(block)

    override fun crop(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.crop, color, classes).apply(block)

    override fun <T : Element> crop(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.crop, color, classes) {}.apply(block)

    override fun crop16_9(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.crop16_9, color, classes).apply(block)

    override fun <T : Element> crop16_9(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.crop16_9, color, classes) {}.apply(block)

    override fun crop3_2(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.crop3_2, color, classes).apply(block)

    override fun <T : Element> crop3_2(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.crop3_2, color, classes) {}.apply(block)

    override fun crop5_4(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.crop5_4, color, classes).apply(block)

    override fun <T : Element> crop5_4(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.crop5_4, color, classes) {}.apply(block)

    override fun crop7_5(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.crop7_5, color, classes).apply(block)

    override fun <T : Element> crop7_5(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.crop7_5, color, classes) {}.apply(block)

    override fun cropDin(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cropDin, color, classes).apply(block)

    override fun <T : Element> cropDin(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cropDin, color, classes) {}.apply(block)

    override fun cropFree(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cropFree, color, classes).apply(block)

    override fun <T : Element> cropFree(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cropFree, color, classes) {}.apply(block)

    override fun cropLandscape(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cropLandscape, color, classes).apply(block)

    override fun <T : Element> cropLandscape(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cropLandscape, color, classes) {}.apply(block)

    override fun cropOriginal(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cropOriginal, color, classes).apply(block)

    override fun <T : Element> cropOriginal(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cropOriginal, color, classes) {}.apply(block)

    override fun cropPortrait(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cropPortrait, color, classes).apply(block)

    override fun <T : Element> cropPortrait(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cropPortrait, color, classes) {}.apply(block)

    override fun cropRotate(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cropRotate, color, classes).apply(block)

    override fun <T : Element> cropRotate(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cropRotate, color, classes) {}.apply(block)

    override fun cropSquare(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cropSquare, color, classes).apply(block)

    override fun <T : Element> cropSquare(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cropSquare, color, classes) {}.apply(block)

    override fun dehaze(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.dehaze, color, classes).apply(block)

    override fun <T : Element> dehaze(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.dehaze, color, classes) {}.apply(block)

    override fun details(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.details, color, classes).apply(block)

    override fun <T : Element> details(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.details, color, classes) {}.apply(block)

    override fun edit(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.edit, color, classes).apply(block)

    override fun <T : Element> edit(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.edit, color, classes) {}.apply(block)

    override fun exposure(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.exposure, color, classes).apply(block)

    override fun <T : Element> exposure(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.exposure, color, classes) {}.apply(block)

    override fun exposureNeg1(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.exposureNeg1, color, classes).apply(block)

    override fun <T : Element> exposureNeg1(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.exposureNeg1, color, classes) {}.apply(block)

    override fun exposureNeg2(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.exposureNeg2, color, classes).apply(block)

    override fun <T : Element> exposureNeg2(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.exposureNeg2, color, classes) {}.apply(block)

    override fun exposurePlus1(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.exposurePlus1, color, classes).apply(block)

    override fun <T : Element> exposurePlus1(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.exposurePlus1, color, classes) {}.apply(block)

    override fun exposurePlus2(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.exposurePlus2, color, classes).apply(block)

    override fun <T : Element> exposurePlus2(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.exposurePlus2, color, classes) {}.apply(block)

    override fun exposureZero(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.exposureZero, color, classes).apply(block)

    override fun <T : Element> exposureZero(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.exposureZero, color, classes) {}.apply(block)

    override fun filter(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filter, color, classes).apply(block)

    override fun <T : Element> filter(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filter, color, classes) {}.apply(block)

    override fun filter1(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filter1, color, classes).apply(block)

    override fun <T : Element> filter1(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filter1, color, classes) {}.apply(block)

    override fun filter2(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filter2, color, classes).apply(block)

    override fun <T : Element> filter2(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filter2, color, classes) {}.apply(block)

    override fun filter3(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filter3, color, classes).apply(block)

    override fun <T : Element> filter3(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filter3, color, classes) {}.apply(block)

    override fun filter4(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filter4, color, classes).apply(block)

    override fun <T : Element> filter4(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filter4, color, classes) {}.apply(block)

    override fun filter5(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filter5, color, classes).apply(block)

    override fun <T : Element> filter5(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filter5, color, classes) {}.apply(block)

    override fun filter6(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filter6, color, classes).apply(block)

    override fun <T : Element> filter6(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filter6, color, classes) {}.apply(block)

    override fun filter7(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filter7, color, classes).apply(block)

    override fun <T : Element> filter7(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filter7, color, classes) {}.apply(block)

    override fun filter8(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filter8, color, classes).apply(block)

    override fun <T : Element> filter8(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filter8, color, classes) {}.apply(block)

    override fun filter9(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filter9, color, classes).apply(block)

    override fun <T : Element> filter9(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filter9, color, classes) {}.apply(block)

    override fun filter9Plus(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filter9Plus, color, classes).apply(block)

    override fun <T : Element> filter9Plus(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filter9Plus, color, classes) {}.apply(block)

    override fun filterBAndW(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filterBAndW, color, classes).apply(block)

    override fun <T : Element> filterBAndW(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filterBAndW, color, classes) {}.apply(block)

    override fun filterCenterFocus(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filterCenterFocus, color, classes).apply(block)

    override fun <T : Element> filterCenterFocus(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filterCenterFocus, color, classes) {}.apply(block)

    override fun filterDrama(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filterDrama, color, classes).apply(block)

    override fun <T : Element> filterDrama(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filterDrama, color, classes) {}.apply(block)

    override fun filterFrames(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filterFrames, color, classes).apply(block)

    override fun <T : Element> filterFrames(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filterFrames, color, classes) {}.apply(block)

    override fun filterHdr(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filterHdr, color, classes).apply(block)

    override fun <T : Element> filterHdr(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filterHdr, color, classes) {}.apply(block)

    override fun filterNone(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filterNone, color, classes).apply(block)

    override fun <T : Element> filterNone(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filterNone, color, classes) {}.apply(block)

    override fun filterTiltShift(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filterTiltShift, color, classes).apply(block)

    override fun <T : Element> filterTiltShift(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filterTiltShift, color, classes) {}.apply(block)

    override fun filterVintage(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.filterVintage, color, classes).apply(block)

    override fun <T : Element> filterVintage(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.filterVintage, color, classes) {}.apply(block)

    override fun flare(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.flare, color, classes).apply(block)

    override fun <T : Element> flare(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.flare, color, classes) {}.apply(block)

    override fun flashAuto(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.flashAuto, color, classes).apply(block)

    override fun <T : Element> flashAuto(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.flashAuto, color, classes) {}.apply(block)

    override fun flashOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.flashOff, color, classes).apply(block)

    override fun <T : Element> flashOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.flashOff, color, classes) {}.apply(block)

    override fun flashOn(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.flashOn, color, classes).apply(block)

    override fun <T : Element> flashOn(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.flashOn, color, classes) {}.apply(block)

    override fun flip(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.flip, color, classes).apply(block)

    override fun <T : Element> flip(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.flip, color, classes) {}.apply(block)

    override fun gradient(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.gradient, color, classes).apply(block)

    override fun <T : Element> gradient(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.gradient, color, classes) {}.apply(block)

    override fun grain(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.grain, color, classes).apply(block)

    override fun <T : Element> grain(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.grain, color, classes) {}.apply(block)

    override fun gridOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.gridOff, color, classes).apply(block)

    override fun <T : Element> gridOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.gridOff, color, classes) {}.apply(block)

    override fun gridOn(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.gridOn, color, classes).apply(block)

    override fun <T : Element> gridOn(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.gridOn, color, classes) {}.apply(block)

    override fun hdrOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.hdrOff, color, classes).apply(block)

    override fun <T : Element> hdrOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.hdrOff, color, classes) {}.apply(block)

    override fun hdrOn(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.hdrOn, color, classes).apply(block)

    override fun <T : Element> hdrOn(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.hdrOn, color, classes) {}.apply(block)

    override fun hdrStrong(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.hdrStrong, color, classes).apply(block)

    override fun <T : Element> hdrStrong(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.hdrStrong, color, classes) {}.apply(block)

    override fun hdrWeak(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.hdrWeak, color, classes).apply(block)

    override fun <T : Element> hdrWeak(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.hdrWeak, color, classes) {}.apply(block)

    override fun healing(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.healing, color, classes).apply(block)

    override fun <T : Element> healing(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.healing, color, classes) {}.apply(block)

    override fun image(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.image, color, classes).apply(block)

    override fun <T : Element> image(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.image, color, classes) {}.apply(block)

    override fun imageAspectRatio(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.imageAspectRatio, color, classes).apply(block)

    override fun <T : Element> imageAspectRatio(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.imageAspectRatio, color, classes) {}.apply(block)

    override fun iso(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.iso, color, classes).apply(block)

    override fun <T : Element> iso(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.iso, color, classes) {}.apply(block)

    override fun landscape(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.landscape, color, classes).apply(block)

    override fun <T : Element> landscape(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.landscape, color, classes) {}.apply(block)

    override fun leakAdd(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.leakAdd, color, classes).apply(block)

    override fun <T : Element> leakAdd(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.leakAdd, color, classes) {}.apply(block)

    override fun leakRemove(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.leakRemove, color, classes).apply(block)

    override fun <T : Element> leakRemove(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.leakRemove, color, classes) {}.apply(block)

    override fun lens(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.lens, color, classes).apply(block)

    override fun <T : Element> lens(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.lens, color, classes) {}.apply(block)

    override fun linkedCamera(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.linkedCamera, color, classes).apply(block)

    override fun <T : Element> linkedCamera(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.linkedCamera, color, classes) {}.apply(block)

    override fun looks(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.looks, color, classes).apply(block)

    override fun <T : Element> looks(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.looks, color, classes) {}.apply(block)

    override fun looks3(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.looks3, color, classes).apply(block)

    override fun <T : Element> looks3(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.looks3, color, classes) {}.apply(block)

    override fun looks4(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.looks4, color, classes).apply(block)

    override fun <T : Element> looks4(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.looks4, color, classes) {}.apply(block)

    override fun looks5(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.looks5, color, classes).apply(block)

    override fun <T : Element> looks5(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.looks5, color, classes) {}.apply(block)

    override fun looks6(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.looks6, color, classes).apply(block)

    override fun <T : Element> looks6(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.looks6, color, classes) {}.apply(block)

    override fun looksOne(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.looksOne, color, classes).apply(block)

    override fun <T : Element> looksOne(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.looksOne, color, classes) {}.apply(block)

    override fun looksTwo(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.looksTwo, color, classes).apply(block)

    override fun <T : Element> looksTwo(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.looksTwo, color, classes) {}.apply(block)

    override fun loupe(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.loupe, color, classes).apply(block)

    override fun <T : Element> loupe(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.loupe, color, classes) {}.apply(block)

    override fun monochromePhotos(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.monochromePhotos, color, classes).apply(block)

    override fun <T : Element> monochromePhotos(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.monochromePhotos, color, classes) {}.apply(block)

    override fun movieCreation(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.movieCreation, color, classes).apply(block)

    override fun <T : Element> movieCreation(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.movieCreation, color, classes) {}.apply(block)

    override fun movieFilter(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.movieFilter, color, classes).apply(block)

    override fun <T : Element> movieFilter(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.movieFilter, color, classes) {}.apply(block)

    override fun musicNote(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.musicNote, color, classes).apply(block)

    override fun <T : Element> musicNote(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.musicNote, color, classes) {}.apply(block)

    override fun nature(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.nature, color, classes).apply(block)

    override fun <T : Element> nature(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.nature, color, classes) {}.apply(block)

    override fun naturePeople(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.naturePeople, color, classes).apply(block)

    override fun <T : Element> naturePeople(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.naturePeople, color, classes) {}.apply(block)

    override fun navigateBefore(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.navigateBefore, color, classes).apply(block)

    override fun <T : Element> navigateBefore(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.navigateBefore, color, classes) {}.apply(block)

    override fun navigateNext(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.navigateNext, color, classes).apply(block)

    override fun <T : Element> navigateNext(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.navigateNext, color, classes) {}.apply(block)

    override fun palette(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.palette, color, classes).apply(block)

    override fun <T : Element> palette(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.palette, color, classes) {}.apply(block)

    override fun panorama(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.panorama, color, classes).apply(block)

    override fun <T : Element> panorama(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.panorama, color, classes) {}.apply(block)

    override fun panoramaFishEye(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.panoramaFishEye, color, classes).apply(block)

    override fun <T : Element> panoramaFishEye(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.panoramaFishEye, color, classes) {}.apply(block)

    override fun panoramaHorizontal(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.panoramaHorizontal, color, classes).apply(block)

    override fun <T : Element> panoramaHorizontal(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.panoramaHorizontal, color, classes) {}.apply(block)

    override fun panoramaVertical(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.panoramaVertical, color, classes).apply(block)

    override fun <T : Element> panoramaVertical(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.panoramaVertical, color, classes) {}.apply(block)

    override fun panoramaWideAngle(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.panoramaWideAngle, color, classes).apply(block)

    override fun <T : Element> panoramaWideAngle(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.panoramaWideAngle, color, classes) {}.apply(block)

    override fun photo(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.photo, color, classes).apply(block)

    override fun <T : Element> photo(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.photo, color, classes) {}.apply(block)

    override fun photoAlbum(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.photoAlbum, color, classes).apply(block)

    override fun <T : Element> photoAlbum(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.photoAlbum, color, classes) {}.apply(block)

    override fun photoCamera(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.photoCamera, color, classes).apply(block)

    override fun <T : Element> photoCamera(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.photoCamera, color, classes) {}.apply(block)

    override fun photoFilter(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.photoFilter, color, classes).apply(block)

    override fun <T : Element> photoFilter(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.photoFilter, color, classes) {}.apply(block)

    override fun photoLibrary(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.photoLibrary, color, classes).apply(block)

    override fun <T : Element> photoLibrary(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.photoLibrary, color, classes) {}.apply(block)

    override fun photoSizeSelectActual(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.photoSizeSelectActual, color, classes).apply(block)

    override fun <T : Element> photoSizeSelectActual(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.photoSizeSelectActual, color, classes) {}.apply(block)

    override fun photoSizeSelectLarge(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.photoSizeSelectLarge, color, classes).apply(block)

    override fun <T : Element> photoSizeSelectLarge(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.photoSizeSelectLarge, color, classes) {}.apply(block)

    override fun photoSizeSelectSmall(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.photoSizeSelectSmall, color, classes).apply(block)

    override fun <T : Element> photoSizeSelectSmall(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.photoSizeSelectSmall, color, classes) {}.apply(block)

    override fun pictureAsPdf(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.pictureAsPdf, color, classes).apply(block)

    override fun <T : Element> pictureAsPdf(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.pictureAsPdf, color, classes) {}.apply(block)

    override fun portrait(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.portrait, color, classes).apply(block)

    override fun <T : Element> portrait(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.portrait, color, classes) {}.apply(block)

    override fun removeRedEye(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.removeRedEye, color, classes).apply(block)

    override fun <T : Element> removeRedEye(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.removeRedEye, color, classes) {}.apply(block)

    override fun rotate90DegreesCcw(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.rotate90DegreesCcw, color, classes).apply(block)

    override fun <T : Element> rotate90DegreesCcw(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.rotate90DegreesCcw, color, classes) {}.apply(block)

    override fun rotateLeft(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.rotateLeft, color, classes).apply(block)

    override fun <T : Element> rotateLeft(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.rotateLeft, color, classes) {}.apply(block)

    override fun rotateRight(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.rotateRight, color, classes).apply(block)

    override fun <T : Element> rotateRight(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.rotateRight, color, classes) {}.apply(block)

    override fun slideshow(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.slideshow, color, classes).apply(block)

    override fun <T : Element> slideshow(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.slideshow, color, classes) {}.apply(block)

    override fun straighten(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.straighten, color, classes).apply(block)

    override fun <T : Element> straighten(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.straighten, color, classes) {}.apply(block)

    override fun style(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.style, color, classes).apply(block)

    override fun <T : Element> style(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.style, color, classes) {}.apply(block)

    override fun switchCamera(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.switchCamera, color, classes).apply(block)

    override fun <T : Element> switchCamera(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.switchCamera, color, classes) {}.apply(block)

    override fun switchVideo(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.switchVideo, color, classes).apply(block)

    override fun <T : Element> switchVideo(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.switchVideo, color, classes) {}.apply(block)

    override fun tagFaces(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.tagFaces, color, classes).apply(block)

    override fun <T : Element> tagFaces(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.tagFaces, color, classes) {}.apply(block)

    override fun texture(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.texture, color, classes).apply(block)

    override fun <T : Element> texture(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.texture, color, classes) {}.apply(block)

    override fun timelapse(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.timelapse, color, classes).apply(block)

    override fun <T : Element> timelapse(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.timelapse, color, classes) {}.apply(block)

    override fun timer(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.timer, color, classes).apply(block)

    override fun <T : Element> timer(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.timer, color, classes) {}.apply(block)

    override fun timer3(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.timer3, color, classes).apply(block)

    override fun <T : Element> timer3(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.timer3, color, classes) {}.apply(block)

    override fun timer10(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.timer10, color, classes).apply(block)

    override fun <T : Element> timer10(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.timer10, color, classes) {}.apply(block)

    override fun timerOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.timerOff, color, classes).apply(block)

    override fun <T : Element> timerOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.timerOff, color, classes) {}.apply(block)

    override fun tonality(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.tonality, color, classes).apply(block)

    override fun <T : Element> tonality(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.tonality, color, classes) {}.apply(block)

    override fun transform(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.transform, color, classes).apply(block)

    override fun <T : Element> transform(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.transform, color, classes) {}.apply(block)

    override fun tune(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.tune, color, classes).apply(block)

    override fun <T : Element> tune(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.tune, color, classes) {}.apply(block)

    override fun viewComfy(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.viewComfy, color, classes).apply(block)

    override fun <T : Element> viewComfy(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.viewComfy, color, classes) {}.apply(block)

    override fun viewCompact(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.viewCompact, color, classes).apply(block)

    override fun <T : Element> viewCompact(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.viewCompact, color, classes) {}.apply(block)

    override fun vignette(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.vignette, color, classes).apply(block)

    override fun <T : Element> vignette(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.vignette, color, classes) {}.apply(block)

    override fun wbAuto(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.wbAuto, color, classes).apply(block)

    override fun <T : Element> wbAuto(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.wbAuto, color, classes) {}.apply(block)

    override fun wbCloudy(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.wbCloudy, color, classes).apply(block)

    override fun <T : Element> wbCloudy(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.wbCloudy, color, classes) {}.apply(block)

    override fun wbIncandescent(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.wbIncandescent, color, classes).apply(block)

    override fun <T : Element> wbIncandescent(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.wbIncandescent, color, classes) {}.apply(block)

    override fun wbIridescent(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.wbIridescent, color, classes).apply(block)

    override fun <T : Element> wbIridescent(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.wbIridescent, color, classes) {}.apply(block)

    override fun wbSunny(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.wbSunny, color, classes).apply(block)

    override fun <T : Element> wbSunny(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.wbSunny, color, classes) {}.apply(block)
	//endregion

    // region Maps
    override fun addLocation(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.addLocation, color, classes).apply(block)

    override fun <T : Element> addLocation(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.addLocation, color, classes) {}.apply(block)

    override fun beenhere(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.beenhere, color, classes).apply(block)

    override fun <T : Element> beenhere(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.beenhere, color, classes) {}.apply(block)

    override fun directions(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.directions, color, classes).apply(block)

    override fun <T : Element> directions(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.directions, color, classes) {}.apply(block)

    override fun directionsBike(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.directionsBike, color, classes).apply(block)

    override fun <T : Element> directionsBike(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.directionsBike, color, classes) {}.apply(block)

    override fun directionsBoat(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.directionsBoat, color, classes).apply(block)

    override fun <T : Element> directionsBoat(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.directionsBoat, color, classes) {}.apply(block)

    override fun directionsBus(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.directionsBus, color, classes).apply(block)

    override fun <T : Element> directionsBus(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.directionsBus, color, classes) {}.apply(block)

    override fun directionsCar(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.directionsCar, color, classes).apply(block)

    override fun <T : Element> directionsCar(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.directionsCar, color, classes) {}.apply(block)

    override fun directionsRailway(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.directionsRailway, color, classes).apply(block)

    override fun <T : Element> directionsRailway(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.directionsRailway, color, classes) {}.apply(block)

    override fun directionsRun(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.directionsRun, color, classes).apply(block)

    override fun <T : Element> directionsRun(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.directionsRun, color, classes) {}.apply(block)

    override fun directionsSubway(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.directionsSubway, color, classes).apply(block)

    override fun <T : Element> directionsSubway(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.directionsSubway, color, classes) {}.apply(block)

    override fun directionsTransit(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.directionsTransit, color, classes).apply(block)

    override fun <T : Element> directionsTransit(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.directionsTransit, color, classes) {}.apply(block)

    override fun directionsWalk(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.directionsWalk, color, classes).apply(block)

    override fun <T : Element> directionsWalk(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.directionsWalk, color, classes) {}.apply(block)

    override fun editLocation(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.editLocation, color, classes).apply(block)

    override fun <T : Element> editLocation(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.editLocation, color, classes) {}.apply(block)

    override fun flight(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.flight, color, classes).apply(block)

    override fun <T : Element> flight(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.flight, color, classes) {}.apply(block)

    override fun hotel(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.hotel, color, classes).apply(block)

    override fun <T : Element> hotel(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.hotel, color, classes) {}.apply(block)

    override fun layers(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.layers, color, classes).apply(block)

    override fun <T : Element> layers(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.layers, color, classes) {}.apply(block)

    override fun layersClear(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.layersClear, color, classes).apply(block)

    override fun <T : Element> layersClear(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.layersClear, color, classes) {}.apply(block)

    override fun localActivity(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localActivity, color, classes).apply(block)

    override fun <T : Element> localActivity(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localActivity, color, classes) {}.apply(block)

    override fun localAirport(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localAirport, color, classes).apply(block)

    override fun <T : Element> localAirport(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localAirport, color, classes) {}.apply(block)

    override fun localAtm(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localAtm, color, classes).apply(block)

    override fun <T : Element> localAtm(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localAtm, color, classes) {}.apply(block)

    override fun localBar(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localBar, color, classes).apply(block)

    override fun <T : Element> localBar(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localBar, color, classes) {}.apply(block)

    override fun localCafe(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localCafe, color, classes).apply(block)

    override fun <T : Element> localCafe(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localCafe, color, classes) {}.apply(block)

    override fun localCarWash(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localCarWash, color, classes).apply(block)

    override fun <T : Element> localCarWash(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localCarWash, color, classes) {}.apply(block)

    override fun localConvenienceStore(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localConvenienceStore, color, classes).apply(block)

    override fun <T : Element> localConvenienceStore(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localConvenienceStore, color, classes) {}.apply(block)

    override fun localDining(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localDining, color, classes).apply(block)

    override fun <T : Element> localDining(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localDining, color, classes) {}.apply(block)

    override fun localDrink(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localDrink, color, classes).apply(block)

    override fun <T : Element> localDrink(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localDrink, color, classes) {}.apply(block)

    override fun localFlorist(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localFlorist, color, classes).apply(block)

    override fun <T : Element> localFlorist(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localFlorist, color, classes) {}.apply(block)

    override fun localGasStation(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localGasStation, color, classes).apply(block)

    override fun <T : Element> localGasStation(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localGasStation, color, classes) {}.apply(block)

    override fun localGroceryStore(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localGroceryStore, color, classes).apply(block)

    override fun <T : Element> localGroceryStore(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localGroceryStore, color, classes) {}.apply(block)

    override fun localHospital(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localHospital, color, classes).apply(block)

    override fun <T : Element> localHospital(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localHospital, color, classes) {}.apply(block)

    override fun localHotel(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localHotel, color, classes).apply(block)

    override fun <T : Element> localHotel(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localHotel, color, classes) {}.apply(block)

    override fun localLaundryService(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localLaundryService, color, classes).apply(block)

    override fun <T : Element> localLaundryService(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localLaundryService, color, classes) {}.apply(block)

    override fun localLibrary(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localLibrary, color, classes).apply(block)

    override fun <T : Element> localLibrary(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localLibrary, color, classes) {}.apply(block)

    override fun localMall(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localMall, color, classes).apply(block)

    override fun <T : Element> localMall(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localMall, color, classes) {}.apply(block)

    override fun localMovies(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localMovies, color, classes).apply(block)

    override fun <T : Element> localMovies(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localMovies, color, classes) {}.apply(block)

    override fun localOffer(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localOffer, color, classes).apply(block)

    override fun <T : Element> localOffer(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localOffer, color, classes) {}.apply(block)

    override fun localParking(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localParking, color, classes).apply(block)

    override fun <T : Element> localParking(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localParking, color, classes) {}.apply(block)

    override fun localPharmacy(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localPharmacy, color, classes).apply(block)

    override fun <T : Element> localPharmacy(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localPharmacy, color, classes) {}.apply(block)

    override fun localPhone(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localPhone, color, classes).apply(block)

    override fun <T : Element> localPhone(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localPhone, color, classes) {}.apply(block)

    override fun localPizza(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localPizza, color, classes).apply(block)

    override fun <T : Element> localPizza(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localPizza, color, classes) {}.apply(block)

    override fun localPlay(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localPlay, color, classes).apply(block)

    override fun <T : Element> localPlay(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localPlay, color, classes) {}.apply(block)

    override fun localPostOffice(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localPostOffice, color, classes).apply(block)

    override fun <T : Element> localPostOffice(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localPostOffice, color, classes) {}.apply(block)

    override fun localPrintshop(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localPrintshop, color, classes).apply(block)

    override fun <T : Element> localPrintshop(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localPrintshop, color, classes) {}.apply(block)

    override fun localSee(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localSee, color, classes).apply(block)

    override fun <T : Element> localSee(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localSee, color, classes) {}.apply(block)

    override fun localShipping(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localShipping, color, classes).apply(block)

    override fun <T : Element> localShipping(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localShipping, color, classes) {}.apply(block)

    override fun localTaxi(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.localTaxi, color, classes).apply(block)

    override fun <T : Element> localTaxi(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.localTaxi, color, classes) {}.apply(block)

    override fun map(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.map, color, classes).apply(block)

    override fun <T : Element> map(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.map, color, classes) {}.apply(block)

    override fun myLocation(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.myLocation, color, classes).apply(block)

    override fun <T : Element> myLocation(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.myLocation, color, classes) {}.apply(block)

    override fun navigation(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.navigation, color, classes).apply(block)

    override fun <T : Element> navigation(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.navigation, color, classes) {}.apply(block)

    override fun nearMe(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.nearMe, color, classes).apply(block)

    override fun <T : Element> nearMe(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.nearMe, color, classes) {}.apply(block)

    override fun personPin(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.personPin, color, classes).apply(block)

    override fun <T : Element> personPin(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.personPin, color, classes) {}.apply(block)

    override fun personPinCircle(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.personPinCircle, color, classes).apply(block)

    override fun <T : Element> personPinCircle(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.personPinCircle, color, classes) {}.apply(block)

    override fun pinDrop(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.pinDrop, color, classes).apply(block)

    override fun <T : Element> pinDrop(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.pinDrop, color, classes) {}.apply(block)

    override fun place(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.place, color, classes).apply(block)

    override fun <T : Element> place(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.place, color, classes) {}.apply(block)

    override fun rateReview(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.rateReview, color, classes).apply(block)

    override fun <T : Element> rateReview(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.rateReview, color, classes) {}.apply(block)

    override fun restaurantMenu(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.restaurantMenu, color, classes).apply(block)

    override fun <T : Element> restaurantMenu(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.restaurantMenu, color, classes) {}.apply(block)

    override fun satellite(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.satellite, color, classes).apply(block)

    override fun <T : Element> satellite(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.satellite, color, classes) {}.apply(block)

    override fun storeMallDirectory(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.storeMallDirectory, color, classes).apply(block)

    override fun <T : Element> storeMallDirectory(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.storeMallDirectory, color, classes) {}.apply(block)

    override fun terrain(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.terrain, color, classes).apply(block)

    override fun <T : Element> terrain(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.terrain, color, classes) {}.apply(block)

    override fun traffic(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.traffic, color, classes).apply(block)

    override fun <T : Element> traffic(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.traffic, color, classes) {}.apply(block)

    override fun zoomOutMap(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.zoomOutMap, color, classes).apply(block)

    override fun <T : Element> zoomOutMap(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.zoomOutMap, color, classes) {}.apply(block)
	//endregion

    // region Navigation
    override fun apps(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.apps, color, classes).apply(block)

    override fun <T : Element> apps(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.apps, color, classes) {}.apply(block)

    override fun arrowBack(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.arrowBack, color, classes).apply(block)

    override fun <T : Element> arrowBack(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.arrowBack, color, classes) {}.apply(block)

    override fun arrowDownward(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.arrowDownward, color, classes).apply(block)

    override fun <T : Element> arrowDownward(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.arrowDownward, color, classes) {}.apply(block)

    override fun arrowDropDown(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.arrowDropDown, color, classes).apply(block)

    override fun <T : Element> arrowDropDown(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.arrowDropDown, color, classes) {}.apply(block)

    override fun arrowDropDownCircle(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.arrowDropDownCircle, color, classes).apply(block)

    override fun <T : Element> arrowDropDownCircle(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.arrowDropDownCircle, color, classes) {}.apply(block)

    override fun arrowDropUp(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.arrowDropUp, color, classes).apply(block)

    override fun <T : Element> arrowDropUp(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.arrowDropUp, color, classes) {}.apply(block)

    override fun arrowForward(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.arrowForward, color, classes).apply(block)

    override fun <T : Element> arrowForward(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.arrowForward, color, classes) {}.apply(block)

    override fun arrowUpward(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.arrowUpward, color, classes).apply(block)

    override fun <T : Element> arrowUpward(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.arrowUpward, color, classes) {}.apply(block)

    override fun cancel(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cancel, color, classes).apply(block)

    override fun <T : Element> cancel(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cancel, color, classes) {}.apply(block)

    override fun check(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.check, color, classes).apply(block)

    override fun <T : Element> check(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.check, color, classes) {}.apply(block)

    override fun chevronLeft(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.chevronLeft, color, classes).apply(block)

    override fun <T : Element> chevronLeft(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.chevronLeft, color, classes) {}.apply(block)

    override fun chevronRight(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.chevronRight, color, classes).apply(block)

    override fun <T : Element> chevronRight(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.chevronRight, color, classes) {}.apply(block)

    override fun close(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.close, color, classes).apply(block)

    override fun <T : Element> close(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.close, color, classes) {}.apply(block)

    override fun expandLess(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.expandLess, color, classes).apply(block)

    override fun <T : Element> expandLess(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.expandLess, color, classes) {}.apply(block)

    override fun expandMore(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.expandMore, color, classes).apply(block)

    override fun <T : Element> expandMore(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.expandMore, color, classes) {}.apply(block)

    override fun fullscreen(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.fullscreen, color, classes).apply(block)

    override fun <T : Element> fullscreen(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.fullscreen, color, classes) {}.apply(block)

    override fun fullscreenExit(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.fullscreenExit, color, classes).apply(block)

    override fun <T : Element> fullscreenExit(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.fullscreenExit, color, classes) {}.apply(block)

    override fun menu(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.menu, color, classes).apply(block)

    override fun <T : Element> menu(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.menu, color, classes) {}.apply(block)

    override fun moreHorizontal(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.moreHorizontal, color, classes).apply(block)

    override fun <T : Element> moreHorizontal(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.moreHorizontal, color, classes) {}.apply(block)

    override fun moreVertical(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.moreVertical, color, classes).apply(block)

    override fun <T : Element> moreVertical(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.moreVertical, color, classes) {}.apply(block)

    override fun refresh(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.refresh, color, classes).apply(block)

    override fun <T : Element> refresh(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.refresh, color, classes) {}.apply(block)

    override fun subdirectoryArrowLeft(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.subdirectoryArrowLeft, color, classes).apply(block)

    override fun <T : Element> subdirectoryArrowLeft(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.subdirectoryArrowLeft, color, classes) {}.apply(block)

    override fun subdirectoryArrowRight(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.subdirectoryArrowRight, color, classes).apply(block)

    override fun <T : Element> subdirectoryArrowRight(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.subdirectoryArrowRight, color, classes) {}.apply(block)
	//endregion

    // region Notification
    override fun adb(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.adb, color, classes).apply(block)

    override fun <T : Element> adb(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.adb, color, classes) {}.apply(block)

    override fun airlineSeatFlat(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.airlineSeatFlat, color, classes).apply(block)

    override fun <T : Element> airlineSeatFlat(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.airlineSeatFlat, color, classes) {}.apply(block)

    override fun airlineSeatFlatAngled(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.airlineSeatFlatAngled, color, classes).apply(block)

    override fun <T : Element> airlineSeatFlatAngled(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.airlineSeatFlatAngled, color, classes) {}.apply(block)

    override fun airlineSeatIndividualSuite(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.airlineSeatIndividualSuite, color, classes).apply(block)

    override fun <T : Element> airlineSeatIndividualSuite(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.airlineSeatIndividualSuite, color, classes) {}.apply(block)

    override fun airlineSeatLegroomExtra(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.airlineSeatLegroomExtra, color, classes).apply(block)

    override fun <T : Element> airlineSeatLegroomExtra(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.airlineSeatLegroomExtra, color, classes) {}.apply(block)

    override fun airlineSeatLegroomNormal(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.airlineSeatLegroomNormal, color, classes).apply(block)

    override fun <T : Element> airlineSeatLegroomNormal(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.airlineSeatLegroomNormal, color, classes) {}.apply(block)

    override fun airlineSeatLegroomReduced(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.airlineSeatLegroomReduced, color, classes).apply(block)

    override fun <T : Element> airlineSeatLegroomReduced(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.airlineSeatLegroomReduced, color, classes) {}.apply(block)

    override fun airlineSeatReclineExtra(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.airlineSeatReclineExtra, color, classes).apply(block)

    override fun <T : Element> airlineSeatReclineExtra(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.airlineSeatReclineExtra, color, classes) {}.apply(block)

    override fun airlineSeatReclineNormal(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.airlineSeatReclineNormal, color, classes).apply(block)

    override fun <T : Element> airlineSeatReclineNormal(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.airlineSeatReclineNormal, color, classes) {}.apply(block)

    override fun bluetoothAudio(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.bluetoothAudio, color, classes).apply(block)

    override fun <T : Element> bluetoothAudio(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.bluetoothAudio, color, classes) {}.apply(block)

    override fun confirmationNumber(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.confirmationNumber, color, classes).apply(block)

    override fun <T : Element> confirmationNumber(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.confirmationNumber, color, classes) {}.apply(block)

    override fun discFull(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.discFull, color, classes).apply(block)

    override fun <T : Element> discFull(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.discFull, color, classes) {}.apply(block)

    override fun doNotDisturb(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.doNotDisturb, color, classes).apply(block)

    override fun <T : Element> doNotDisturb(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.doNotDisturb, color, classes) {}.apply(block)

    override fun doNotDisturbAlt(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.doNotDisturbAlt, color, classes).apply(block)

    override fun <T : Element> doNotDisturbAlt(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.doNotDisturbAlt, color, classes) {}.apply(block)

    override fun driveEta(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.driveEta, color, classes).apply(block)

    override fun <T : Element> driveEta(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.driveEta, color, classes) {}.apply(block)

    override fun enhancedEncryption(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.enhancedEncryption, color, classes).apply(block)

    override fun <T : Element> enhancedEncryption(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.enhancedEncryption, color, classes) {}.apply(block)

    override fun eventAvailable(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.eventAvailable, color, classes).apply(block)

    override fun <T : Element> eventAvailable(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.eventAvailable, color, classes) {}.apply(block)

    override fun eventBusy(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.eventBusy, color, classes).apply(block)

    override fun <T : Element> eventBusy(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.eventBusy, color, classes) {}.apply(block)

    override fun eventNote(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.eventNote, color, classes).apply(block)

    override fun <T : Element> eventNote(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.eventNote, color, classes) {}.apply(block)

    override fun folderSpecial(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.folderSpecial, color, classes).apply(block)

    override fun <T : Element> folderSpecial(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.folderSpecial, color, classes) {}.apply(block)

    override fun liveTv(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.liveTv, color, classes).apply(block)

    override fun <T : Element> liveTv(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.liveTv, color, classes) {}.apply(block)

    override fun mms(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.mms, color, classes).apply(block)

    override fun <T : Element> mms(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.mms, color, classes) {}.apply(block)

    override fun more(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.more, color, classes).apply(block)

    override fun <T : Element> more(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.more, color, classes) {}.apply(block)

    override fun networkCheck(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.networkCheck, color, classes).apply(block)

    override fun <T : Element> networkCheck(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.networkCheck, color, classes) {}.apply(block)

    override fun networkLocked(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.networkLocked, color, classes).apply(block)

    override fun <T : Element> networkLocked(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.networkLocked, color, classes) {}.apply(block)

    override fun noEncryption(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.noEncryption, color, classes).apply(block)

    override fun <T : Element> noEncryption(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.noEncryption, color, classes) {}.apply(block)

    override fun ondemandVideo(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.ondemandVideo, color, classes).apply(block)

    override fun <T : Element> ondemandVideo(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.ondemandVideo, color, classes) {}.apply(block)

    override fun personalVideo(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.personalVideo, color, classes).apply(block)

    override fun <T : Element> personalVideo(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.personalVideo, color, classes) {}.apply(block)

    override fun phoneBluetoothSpeaker(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.phoneBluetoothSpeaker, color, classes).apply(block)

    override fun <T : Element> phoneBluetoothSpeaker(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.phoneBluetoothSpeaker, color, classes) {}.apply(block)

    override fun phoneForwarded(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.phoneForwarded, color, classes).apply(block)

    override fun <T : Element> phoneForwarded(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.phoneForwarded, color, classes) {}.apply(block)

    override fun phoneInTalk(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.phoneInTalk, color, classes).apply(block)

    override fun <T : Element> phoneInTalk(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.phoneInTalk, color, classes) {}.apply(block)

    override fun phoneLocked(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.phoneLocked, color, classes).apply(block)

    override fun <T : Element> phoneLocked(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.phoneLocked, color, classes) {}.apply(block)

    override fun phoneMissed(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.phoneMissed, color, classes).apply(block)

    override fun <T : Element> phoneMissed(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.phoneMissed, color, classes) {}.apply(block)

    override fun phonePaused(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.phonePaused, color, classes).apply(block)

    override fun <T : Element> phonePaused(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.phonePaused, color, classes) {}.apply(block)

    override fun power(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.power, color, classes).apply(block)

    override fun <T : Element> power(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.power, color, classes) {}.apply(block)

    override fun sdCard(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.sdCard, color, classes).apply(block)

    override fun <T : Element> sdCard(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.sdCard, color, classes) {}.apply(block)

    override fun simCardAlert(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.simCardAlert, color, classes).apply(block)

    override fun <T : Element> simCardAlert(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.simCardAlert, color, classes) {}.apply(block)

    override fun sms(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.sms, color, classes).apply(block)

    override fun <T : Element> sms(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.sms, color, classes) {}.apply(block)

    override fun smsFailed(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.smsFailed, color, classes).apply(block)

    override fun <T : Element> smsFailed(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.smsFailed, color, classes) {}.apply(block)

    override fun sync(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.sync, color, classes).apply(block)

    override fun <T : Element> sync(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.sync, color, classes) {}.apply(block)

    override fun syncDisabled(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.syncDisabled, color, classes).apply(block)

    override fun <T : Element> syncDisabled(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.syncDisabled, color, classes) {}.apply(block)

    override fun syncProblem(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.syncProblem, color, classes).apply(block)

    override fun <T : Element> syncProblem(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.syncProblem, color, classes) {}.apply(block)

    override fun systemUpdate(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.systemUpdate, color, classes).apply(block)

    override fun <T : Element> systemUpdate(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.systemUpdate, color, classes) {}.apply(block)

    override fun tapAndPlay(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.tapAndPlay, color, classes).apply(block)

    override fun <T : Element> tapAndPlay(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.tapAndPlay, color, classes) {}.apply(block)

    override fun timeToLeave(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.timeToLeave, color, classes).apply(block)

    override fun <T : Element> timeToLeave(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.timeToLeave, color, classes) {}.apply(block)

    override fun vibration(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.vibration, color, classes).apply(block)

    override fun <T : Element> vibration(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.vibration, color, classes) {}.apply(block)

    override fun voiceChat(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.voiceChat, color, classes).apply(block)

    override fun <T : Element> voiceChat(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.voiceChat, color, classes) {}.apply(block)

    override fun vpnLock(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.vpnLock, color, classes).apply(block)

    override fun <T : Element> vpnLock(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.vpnLock, color, classes) {}.apply(block)

    override fun wc(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.wc, color, classes).apply(block)

    override fun <T : Element> wc(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.wc, color, classes) {}.apply(block)

    override fun wifi(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.wifi, color, classes).apply(block)

    override fun <T : Element> wifi(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.wifi, color, classes) {}.apply(block)
	//endregion

    // region Places
    override fun acUnit(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.acUnit, color, classes).apply(block)

    override fun <T : Element> acUnit(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.acUnit, color, classes) {}.apply(block)

    override fun airportShuttle(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.airportShuttle, color, classes).apply(block)

    override fun <T : Element> airportShuttle(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.airportShuttle, color, classes) {}.apply(block)

    override fun allInclusive(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.allInclusive, color, classes).apply(block)

    override fun <T : Element> allInclusive(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.allInclusive, color, classes) {}.apply(block)

    override fun beachAccess(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.beachAccess, color, classes).apply(block)

    override fun <T : Element> beachAccess(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.beachAccess, color, classes) {}.apply(block)

    override fun businessCenter(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.businessCenter, color, classes).apply(block)

    override fun <T : Element> businessCenter(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.businessCenter, color, classes) {}.apply(block)

    override fun casino(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.casino, color, classes).apply(block)

    override fun <T : Element> casino(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.casino, color, classes) {}.apply(block)

    override fun childCare(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.childCare, color, classes).apply(block)

    override fun <T : Element> childCare(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.childCare, color, classes) {}.apply(block)

    override fun childFriendly(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.childFriendly, color, classes).apply(block)

    override fun <T : Element> childFriendly(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.childFriendly, color, classes) {}.apply(block)

    override fun fitnessCenter(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.fitnessCenter, color, classes).apply(block)

    override fun <T : Element> fitnessCenter(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.fitnessCenter, color, classes) {}.apply(block)

    override fun freeBreakfast(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.freeBreakfast, color, classes).apply(block)

    override fun <T : Element> freeBreakfast(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.freeBreakfast, color, classes) {}.apply(block)

    override fun golfCourse(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.golfCourse, color, classes).apply(block)

    override fun <T : Element> golfCourse(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.golfCourse, color, classes) {}.apply(block)

    override fun hotTub(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.hotTub, color, classes).apply(block)

    override fun <T : Element> hotTub(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.hotTub, color, classes) {}.apply(block)

    override fun kitchen(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.kitchen, color, classes).apply(block)

    override fun <T : Element> kitchen(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.kitchen, color, classes) {}.apply(block)

    override fun pool(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.pool, color, classes).apply(block)

    override fun <T : Element> pool(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.pool, color, classes) {}.apply(block)

    override fun roomService(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.roomService, color, classes).apply(block)

    override fun <T : Element> roomService(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.roomService, color, classes) {}.apply(block)

    override fun rvHookup(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.rvHookup, color, classes).apply(block)

    override fun <T : Element> rvHookup(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.rvHookup, color, classes) {}.apply(block)

    override fun smokeFree(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.smokeFree, color, classes).apply(block)

    override fun <T : Element> smokeFree(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.smokeFree, color, classes) {}.apply(block)

    override fun smokingRooms(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.smokingRooms, color, classes).apply(block)

    override fun <T : Element> smokingRooms(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.smokingRooms, color, classes) {}.apply(block)

    override fun spa(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.spa, color, classes).apply(block)

    override fun <T : Element> spa(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.spa, color, classes) {}.apply(block)
	//endregion

    // region Social
    override fun cake(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.cake, color, classes).apply(block)

    override fun <T : Element> cake(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.cake, color, classes) {}.apply(block)

    override fun domain(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.domain, color, classes).apply(block)

    override fun <T : Element> domain(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.domain, color, classes) {}.apply(block)

    override fun group(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.group, color, classes).apply(block)

    override fun <T : Element> group(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.group, color, classes) {}.apply(block)

    override fun groupAdd(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.groupAdd, color, classes).apply(block)

    override fun <T : Element> groupAdd(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.groupAdd, color, classes) {}.apply(block)

    override fun locationCity(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.locationCity, color, classes).apply(block)

    override fun <T : Element> locationCity(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.locationCity, color, classes) {}.apply(block)

    override fun mood(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.mood, color, classes).apply(block)

    override fun <T : Element> mood(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.mood, color, classes) {}.apply(block)

    override fun moodBad(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.moodBad, color, classes).apply(block)

    override fun <T : Element> moodBad(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.moodBad, color, classes) {}.apply(block)

    override fun notifications(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.notifications, color, classes).apply(block)

    override fun <T : Element> notifications(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.notifications, color, classes) {}.apply(block)

    override fun notificationsActive(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.notificationsActive, color, classes).apply(block)

    override fun <T : Element> notificationsActive(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.notificationsActive, color, classes) {}.apply(block)

    override fun notificationsNone(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.notificationsNone, color, classes).apply(block)

    override fun <T : Element> notificationsNone(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.notificationsNone, color, classes) {}.apply(block)

    override fun notificationsOff(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.notificationsOff, color, classes).apply(block)

    override fun <T : Element> notificationsOff(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.notificationsOff, color, classes) {}.apply(block)

    override fun notificationsPaused(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.notificationsPaused, color, classes).apply(block)

    override fun <T : Element> notificationsPaused(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.notificationsPaused, color, classes) {}.apply(block)

    override fun pages(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.pages, color, classes).apply(block)

    override fun <T : Element> pages(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.pages, color, classes) {}.apply(block)

    override fun partyMode(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.partyMode, color, classes).apply(block)

    override fun <T : Element> partyMode(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.partyMode, color, classes) {}.apply(block)

    override fun people(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.people, color, classes).apply(block)

    override fun <T : Element> people(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.people, color, classes) {}.apply(block)

    override fun peopleOutline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.peopleOutline, color, classes).apply(block)

    override fun <T : Element> peopleOutline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.peopleOutline, color, classes) {}.apply(block)

    override fun person(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.person, color, classes).apply(block)

    override fun <T : Element> person(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.person, color, classes) {}.apply(block)

    override fun personAdd(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.personAdd, color, classes).apply(block)

    override fun <T : Element> personAdd(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.personAdd, color, classes) {}.apply(block)

    override fun personOutline(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.personOutline, color, classes).apply(block)

    override fun <T : Element> personOutline(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.personOutline, color, classes) {}.apply(block)

    override fun plusOne(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.plusOne, color, classes).apply(block)

    override fun <T : Element> plusOne(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.plusOne, color, classes) {}.apply(block)

    override fun poll(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.poll, color, classes).apply(block)

    override fun <T : Element> poll(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.poll, color, classes) {}.apply(block)

    override fun public(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.public, color, classes).apply(block)

    override fun <T : Element> public(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.public, color, classes) {}.apply(block)

    override fun school(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.school, color, classes).apply(block)

    override fun <T : Element> school(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.school, color, classes) {}.apply(block)

    override fun share(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.share, color, classes).apply(block)

    override fun <T : Element> share(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.share, color, classes) {}.apply(block)

    override fun whatshot(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.whatshot, color, classes).apply(block)

    override fun <T : Element> whatshot(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.whatshot, color, classes) {}.apply(block)
	//endregion

    // region Toggle
    override fun checkBox(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.checkBox, color, classes).apply(block)

    override fun <T : Element> checkBox(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.checkBox, color, classes) {}.apply(block)

    override fun checkBoxOutlineBlank(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.checkBoxOutlineBlank, color, classes).apply(block)

    override fun <T : Element> checkBoxOutlineBlank(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.checkBoxOutlineBlank, color, classes) {}.apply(block)

    override fun indeterminateCheckBox(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.indeterminateCheckBox, color, classes).apply(block)

    override fun <T : Element> indeterminateCheckBox(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.indeterminateCheckBox, color, classes) {}.apply(block)

    override fun radioButtonChecked(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.radioButtonChecked, color, classes).apply(block)

    override fun <T : Element> radioButtonChecked(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.radioButtonChecked, color, classes) {}.apply(block)

    override fun radioButtonUnchecked(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.radioButtonUnchecked, color, classes).apply(block)

    override fun <T : Element> radioButtonUnchecked(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.radioButtonUnchecked, color, classes) {}.apply(block)

    override fun star(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.star, color, classes).apply(block)

    override fun <T : Element> star(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.star, color, classes) {}.apply(block)

    override fun starBorder(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.starBorder, color, classes).apply(block)

    override fun <T : Element> starBorder(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.starBorder, color, classes) {}.apply(block)

    override fun starHalf(color: IMdlTextColor?, classes: String, block: MdlMaterialIcon.() -> Unit)
        = MdlMaterialIcon(MaterialIcons.starHalf, color, classes).apply(block)

    override fun <T : Element> starHalf(
            element: T,
            color: IMdlTextColor?,
            classes: String,
            block: IMdlMaterialIcon<T>.() -> Unit): IMdlMaterialIcon<T>
        = object : MdlMaterialIconBase<T>(element, MaterialIcons.starHalf, color, classes) {}.apply(block)
	//endregion
}
