package kotlinmdl.components.style

import kotlinmdl.internal.extensions.empty
import kotlinmdl.style.IMdlTextColor
import org.w3c.dom.Element

interface IMdlMaterialIcons {

    // region Action
    fun threeDRotation(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> threeDRotation(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun accessibility(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> accessibility(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun accessible(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> accessible(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun accountBalance(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> accountBalance(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun accountBalanceWallet(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> accountBalanceWallet(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun accountBox(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> accountBox(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun accountCircle(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> accountCircle(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun addShoppingCart(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> addShoppingCart(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun alarm(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> alarm(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun alarmAdd(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> alarmAdd(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun alarmOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> alarmOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun alarmOn(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> alarmOn(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun allOut(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> allOut(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun android(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> android(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun announcement(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> announcement(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun aspectRatio(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> aspectRatio(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun assessment(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> assessment(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun assignment(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> assignment(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun assignmentInd(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> assignmentInd(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun assignmentLate(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> assignmentLate(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun assignmentReturn(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> assignmentReturn(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun assignmentReturned(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> assignmentReturned(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun assignmentTurnedIn(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> assignmentTurnedIn(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun autorenew(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> autorenew(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun backup(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> backup(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun book(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> book(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun bookmark(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> bookmark(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun bookmarkBorder(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> bookmarkBorder(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun bugReport(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> bugReport(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun build(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> build(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cached(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cached(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cameraEnhance(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cameraEnhance(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cardGiftcard(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cardGiftcard(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cardMembership(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cardMembership(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cardTravel(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cardTravel(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun changeHistory(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> changeHistory(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun checkCircle(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> checkCircle(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun chromeReaderMode(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> chromeReaderMode(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun `class`(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> `class`(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun code(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> code(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun compareArrows(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> compareArrows(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun copyright(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> copyright(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun creditCard(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> creditCard(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun dashboard(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> dashboard(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun dateRange(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> dateRange(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun delete(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> delete(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun description(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> description(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun dns(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> dns(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun done(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> done(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun doneAll(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> doneAll(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun donutLarge(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> donutLarge(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun donutSmall(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> donutSmall(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun eject(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> eject(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun event(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> event(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun eventSeat(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> eventSeat(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun exitToApp(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> exitToApp(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun explore(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> explore(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun extension(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> extension(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun face(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> face(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun favorite(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> favorite(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun favoriteBorder(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> favoriteBorder(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun feedback(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> feedback(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun findInPage(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> findInPage(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun findReplace(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> findReplace(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun fingerprint(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> fingerprint(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun flightLand(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> flightLand(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun flightTakeoff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> flightTakeoff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun flipToBack(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> flipToBack(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun flipToFront(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> flipToFront(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun gavel(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> gavel(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun getApp(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> getApp(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun gif(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> gif(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun grade(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> grade(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun groupWork(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> groupWork(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun help(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> help(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun helpOutline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> helpOutline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun highlightOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> highlightOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun history(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> history(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun home(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> home(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun hourglassEmpty(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> hourglassEmpty(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun hourglassFull(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> hourglassFull(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun http(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> http(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun https(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> https(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun importantDevices(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> importantDevices(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun info(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> info(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun infoOutline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> infoOutline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun input(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> input(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun invertColors(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> invertColors(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun label(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> label(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun labelOutline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> labelOutline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun language(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> language(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun launch(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> launch(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun lightbulbOutline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> lightbulbOutline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun lineStyle(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> lineStyle(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun lineWeight(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> lineWeight(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun list(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> list(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun lock(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> lock(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun lockOpen(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> lockOpen(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun lockOutline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> lockOutline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun loyalty(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> loyalty(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun markunreadMailbox(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> markunreadMailbox(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun motorcycle(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> motorcycle(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun noteAdd(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> noteAdd(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun offlinePin(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> offlinePin(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun opacity(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> opacity(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun openInBrowser(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> openInBrowser(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun openInNew(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> openInNew(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun openWith(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> openWith(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun pageview(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> pageview(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun panTool(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> panTool(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun payment(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> payment(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun permCameraMic(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> permCameraMic(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun permContactCalendar(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> permContactCalendar(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun permDataSetting(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> permDataSetting(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun permDeviceInformation(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> permDeviceInformation(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun permIdentity(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> permIdentity(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun permMedia(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> permMedia(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun permPhoneMsg(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> permPhoneMsg(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun permScanWifi(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> permScanWifi(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun pets(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> pets(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun pictureInPicture(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> pictureInPicture(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun pictureInPictureAlt(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> pictureInPictureAlt(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun playForWork(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> playForWork(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun polymer(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> polymer(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun powerSettingsNew(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> powerSettingsNew(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun pregnantWoman(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> pregnantWoman(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun print(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> print(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun queryBuilder(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> queryBuilder(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun questionAnswer(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> questionAnswer(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun receipt(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> receipt(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun recordVoiceOver(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> recordVoiceOver(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun redeem(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> redeem(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun reorder(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> reorder(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun reportProblem(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> reportProblem(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun restore(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> restore(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun room(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> room(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun roundedCorner(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> roundedCorner(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun rowing(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> rowing(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun schedule(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> schedule(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun search(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> search(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settings(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settings(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsApplications(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsApplications(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsBackupRestore(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsBackupRestore(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsBluetooth(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsBluetooth(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsBrightness(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsBrightness(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsCell(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsCell(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsEthernet(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsEthernet(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsInputAntenna(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsInputAntenna(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsInputComponent(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsInputComponent(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsInputComposite(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsInputComposite(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsInputHdmi(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsInputHdmi(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsInputSvideo(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsInputSvideo(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsOverscan(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsOverscan(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsPhone(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsPhone(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsPower(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsPower(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsRemote(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsRemote(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsVoice(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsVoice(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun shop(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> shop(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun shopTwo(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> shopTwo(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun shoppingBasket(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> shoppingBasket(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun shoppingCart(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> shoppingCart(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun speakerNotes(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> speakerNotes(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun spellcheck(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> spellcheck(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun starRate(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> starRate(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun stars(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> stars(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun store(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> store(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun subject(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> subject(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun supervisorAccount(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> supervisorAccount(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun swapHorizontal(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> swapHorizontal(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun swapVertical(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> swapVertical(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun swapVerticalCircle(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> swapVerticalCircle(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun systemUpdateAlt(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> systemUpdateAlt(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun tab(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> tab(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun tabUnselected(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> tabUnselected(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun theaters(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> theaters(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun thumbDown(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> thumbDown(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun thumbUp(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> thumbUp(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun thumbsUpDown(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> thumbsUpDown(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun timeline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> timeline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun toc(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> toc(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun today(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> today(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun toll(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> toll(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun touchApp(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> touchApp(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun trackChanges(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> trackChanges(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun translate(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> translate(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun trendingDown(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> trendingDown(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun trendingFlat(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> trendingFlat(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun trendingUp(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> trendingUp(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun turnedIn(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> turnedIn(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun turnedInNot(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> turnedInNot(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun update(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> update(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun verifiedUser(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> verifiedUser(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun viewAgenda(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> viewAgenda(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun viewArray(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> viewArray(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun viewCarousel(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> viewCarousel(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun viewColumn(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> viewColumn(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun viewDay(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> viewDay(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun viewHeadline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> viewHeadline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun viewList(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> viewList(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun viewModule(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> viewModule(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun viewQuilt(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> viewQuilt(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun viewStream(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> viewStream(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun viewWeek(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> viewWeek(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun visibility(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> visibility(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun visibilityOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> visibilityOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun watchLater(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> watchLater(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun work(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> work(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun youtubeSearchedFor(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> youtubeSearchedFor(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun zoomIn(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> zoomIn(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun zoomOut(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> zoomOut(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion

    // region Alert
    fun addAlert(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> addAlert(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun error(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> error(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun errorOutline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> errorOutline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun warning(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> warning(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion

    // region AV
    fun addToQueue(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> addToQueue(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun airplay(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> airplay(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun album(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> album(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun artTrack(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> artTrack(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun avTimer(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> avTimer(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun closedCaption(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> closedCaption(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun equalizer(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> equalizer(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun explicit(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> explicit(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun fastForward(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> fastForward(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun fastRewind(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> fastRewind(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun fiberDvr(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> fiberDvr(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun fiberManualRecord(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> fiberManualRecord(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun fiberNew(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> fiberNew(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun fiberPin(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> fiberPin(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun fiberSmartRecord(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> fiberSmartRecord(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun forward5(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> forward5(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun forward10(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> forward10(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun forward30(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> forward30(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun games(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> games(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun hd(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> hd(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun hearing(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> hearing(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun highQuality(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> highQuality(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun libraryAdd(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> libraryAdd(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun libraryBooks(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> libraryBooks(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun libraryMusic(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> libraryMusic(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun loop(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> loop(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun mic(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> mic(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun micNone(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> micNone(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun micOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> micOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun movie(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> movie(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun musicVideo(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> musicVideo(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun newReleases(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> newReleases(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun notInterested(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> notInterested(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun pause(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> pause(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun pauseCircleFilled(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> pauseCircleFilled(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun pauseCircleOutline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> pauseCircleOutline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun playArrow(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> playArrow(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun playCircleFilled(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> playCircleFilled(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun playCircleOutline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> playCircleOutline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun playlistAdd(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> playlistAdd(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun playlistAddCheck(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> playlistAddCheck(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun playlistPlay(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> playlistPlay(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun queue(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> queue(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun queueMusic(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> queueMusic(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun queuePlayNext(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> queuePlayNext(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun radio(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> radio(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun recentActors(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> recentActors(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun removeFromQueue(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> removeFromQueue(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun repeat(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> repeat(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun repeatOne(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> repeatOne(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun replay(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> replay(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun replay5(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> replay5(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun replay10(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> replay10(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun replay30(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> replay30(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun shuffle(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> shuffle(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun skipNext(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> skipNext(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun skipPrevious(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> skipPrevious(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun slowMotionVideo(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> slowMotionVideo(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun snooze(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> snooze(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun sortByAlpha(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> sortByAlpha(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun stop(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> stop(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun subscriptions(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> subscriptions(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun subtitles(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> subtitles(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun surroundSound(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> surroundSound(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun videoLibrary(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> videoLibrary(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun videocam(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> videocam(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun videocamOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> videocamOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun volumeDown(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> volumeDown(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun volumeMute(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> volumeMute(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun volumeOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> volumeOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun volumeUp(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> volumeUp(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun web(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> web(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun webAsset(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> webAsset(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion

    // region Communication
    fun business(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> business(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun call(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> call(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun callEnd(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> callEnd(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun callMade(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> callMade(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun callMerge(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> callMerge(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun callMissed(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> callMissed(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun callMissedOutgoing(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> callMissedOutgoing(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun callReceived(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> callReceived(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun callSplit(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> callSplit(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun chat(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> chat(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun chatBubble(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> chatBubble(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun chatBubbleOutline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> chatBubbleOutline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun clearAll(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> clearAll(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun comment(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> comment(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun contactMail(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> contactMail(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun contactPhone(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> contactPhone(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun contacts(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> contacts(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun dialerSip(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> dialerSip(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun dialpad(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> dialpad(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun email(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> email(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun forum(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> forum(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun importContacts(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> importContacts(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun importExport(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> importExport(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun invertColorsOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> invertColorsOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun liveHelp(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> liveHelp(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun locationOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> locationOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun locationOn(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> locationOn(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun mailOutline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> mailOutline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun message(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> message(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun noSim(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> noSim(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun phone(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> phone(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun phonelinkErase(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> phonelinkErase(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun phonelinkLock(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> phonelinkLock(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun phonelinkRing(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> phonelinkRing(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun phonelinkSetup(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> phonelinkSetup(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun portableWifiOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> portableWifiOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun presentToAll(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> presentToAll(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun ringVolume(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> ringVolume(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun screenShare(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> screenShare(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun speakerPhone(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> speakerPhone(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun stayCurrentLandscape(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> stayCurrentLandscape(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun stayCurrentPortrait(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> stayCurrentPortrait(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun stayPrimaryLandscape(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> stayPrimaryLandscape(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun stayPrimaryPortrait(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> stayPrimaryPortrait(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun stopScreenShare(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> stopScreenShare(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun swapCalls(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> swapCalls(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun textsms(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> textsms(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun voicemail(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> voicemail(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun vpnKey(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> vpnKey(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion

    // region Content
    fun add(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> add(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun addBox(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> addBox(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun addCircle(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> addCircle(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun addCircleOutline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> addCircleOutline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun archive(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> archive(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun backspace(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> backspace(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun block(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> block(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun clear(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> clear(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun contentCopy(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> contentCopy(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun contentCut(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> contentCut(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun contentPaste(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> contentPaste(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun create(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> create(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun drafts(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> drafts(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filterList(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filterList(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun flag(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> flag(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun fontDownload(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> fontDownload(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun forward(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> forward(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun gesture(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> gesture(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun inbox(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> inbox(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun link(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> link(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun mail(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> mail(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun markunread(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> markunread(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun moveToInbox(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> moveToInbox(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun nextWeek(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> nextWeek(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun redo(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> redo(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun remove(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> remove(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun removeCircle(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> removeCircle(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun removeCircleOutline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> removeCircleOutline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun reply(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> reply(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun replyAll(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> replyAll(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun report(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> report(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun save(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> save(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun selectAll(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> selectAll(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun send(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> send(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun sort(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> sort(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun textFormat(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> textFormat(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun unarchive(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> unarchive(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun undo(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> undo(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun weekend(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> weekend(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion

    // region Device
    fun accessAlarm(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> accessAlarm(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun accessAlarms(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> accessAlarms(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun accessTime(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> accessTime(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun addAlarm(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> addAlarm(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun airplanemodeActive(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> airplanemodeActive(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun airplanemodeInactive(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> airplanemodeInactive(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun batteryAlert(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> batteryAlert(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun batteryChargingFull(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> batteryChargingFull(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun batteryFull(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> batteryFull(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun batteryStd(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> batteryStd(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun batteryUnknown(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> batteryUnknown(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun bluetooth(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> bluetooth(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun bluetoothConnected(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> bluetoothConnected(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun bluetoothDisabled(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> bluetoothDisabled(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun bluetoothSearching(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> bluetoothSearching(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun brightnessAuto(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> brightnessAuto(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun brightnessHigh(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> brightnessHigh(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun brightnessLow(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> brightnessLow(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun brightnessMedium(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> brightnessMedium(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun dataUsage(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> dataUsage(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun developerMode(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> developerMode(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun devices(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> devices(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun dvr(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> dvr(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun gpsFixed(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> gpsFixed(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun gpsNotFixed(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> gpsNotFixed(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun gpsOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> gpsOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun graphicEq(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> graphicEq(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun locationDisabled(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> locationDisabled(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun locationSearching(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> locationSearching(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun networkCell(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> networkCell(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun networkWifi(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> networkWifi(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun nfc(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> nfc(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun screenLockLandscape(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> screenLockLandscape(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun screenLockPortrait(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> screenLockPortrait(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun screenLockRotation(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> screenLockRotation(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun screenRotation(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> screenRotation(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun sdStorage(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> sdStorage(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun settingsSystemDaydream(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> settingsSystemDaydream(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun signalCellular4Bar(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> signalCellular4Bar(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun signalCellularConnectedNoInternet4Bar(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> signalCellularConnectedNoInternet4Bar(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun signalCellularNoSim(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> signalCellularNoSim(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun signalCellularNull(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> signalCellularNull(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun signalCellularOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> signalCellularOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun signalWifi4Bar(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> signalWifi4Bar(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun signalWifi4BarLock(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> signalWifi4BarLock(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun signalWifiOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> signalWifiOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun storage(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> storage(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun usb(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> usb(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun wallpaper(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> wallpaper(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun widgets(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> widgets(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun wifiLock(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> wifiLock(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun wifiTethering(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> wifiTethering(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion

    // region Editor
    fun attachFile(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> attachFile(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun attachMoney(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> attachMoney(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun borderAll(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> borderAll(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun borderBottom(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> borderBottom(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun borderClear(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> borderClear(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun borderColor(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> borderColor(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun borderHorizontal(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> borderHorizontal(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun borderInner(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> borderInner(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun borderLeft(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> borderLeft(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun borderOuter(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> borderOuter(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun borderRight(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> borderRight(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun borderStyle(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> borderStyle(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun borderTop(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> borderTop(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun borderVertical(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> borderVertical(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun dragHandle(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> dragHandle(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatAlignCenter(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatAlignCenter(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatAlignJustify(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatAlignJustify(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatAlignLeft(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatAlignLeft(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatAlignRight(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatAlignRight(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatBold(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatBold(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatClear(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatClear(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatColorFill(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatColorFill(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatColorReset(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatColorReset(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatColorText(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatColorText(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatIndentDecrease(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatIndentDecrease(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatIndentIncrease(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatIndentIncrease(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatItalic(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatItalic(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatLineSpacing(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatLineSpacing(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatListBulleted(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatListBulleted(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatListNumbered(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatListNumbered(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatPaint(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatPaint(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatQuote(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatQuote(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatShapes(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatShapes(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatSize(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatSize(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatStrikethrough(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatStrikethrough(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatTextdirectionLToR(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatTextdirectionLToR(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatTextdirectionRToL(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatTextdirectionRToL(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun formatUnderlined(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> formatUnderlined(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun functions(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> functions(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun highlight(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> highlight(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun insertChart(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> insertChart(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun insertComment(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> insertComment(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun insertDriveFile(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> insertDriveFile(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun insertEmoticon(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> insertEmoticon(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun insertInvitation(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> insertInvitation(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun insertLink(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> insertLink(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun insertPhoto(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> insertPhoto(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun linearScale(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> linearScale(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun mergeType(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> mergeType(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun modeComment(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> modeComment(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun modeEdit(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> modeEdit(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun moneyOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> moneyOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun publish(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> publish(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun shortText(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> shortText(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun spaceBar(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> spaceBar(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun strikethroughS(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> strikethroughS(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun textFields(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> textFields(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun verticalAlignBottom(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> verticalAlignBottom(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun verticalAlignCenter(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> verticalAlignCenter(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun verticalAlignTop(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> verticalAlignTop(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun wrapText(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> wrapText(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion

    // region File
    fun attachment(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> attachment(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cloud(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cloud(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cloudCircle(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cloudCircle(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cloudDone(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cloudDone(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cloudDownload(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cloudDownload(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cloudOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cloudOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cloudQueue(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cloudQueue(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cloudUpload(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cloudUpload(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun createNewFolder(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> createNewFolder(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun fileDownload(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> fileDownload(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun fileUpload(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> fileUpload(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun folder(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> folder(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun folderOpen(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> folderOpen(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun folderShared(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> folderShared(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion

    // region Hardware
    fun cast(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cast(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun castConnected(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> castConnected(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun computer(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> computer(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun desktopMac(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> desktopMac(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun desktopWindows(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> desktopWindows(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun developerBoard(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> developerBoard(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun deviceHub(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> deviceHub(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun devicesOther(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> devicesOther(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun dock(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> dock(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun gamepad(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> gamepad(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun headset(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> headset(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun headsetMic(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> headsetMic(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun keyboard(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> keyboard(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun keyboardArrowDown(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> keyboardArrowDown(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun keyboardArrowLeft(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> keyboardArrowLeft(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun keyboardArrowRight(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> keyboardArrowRight(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun keyboardArrowUp(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> keyboardArrowUp(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun keyboardBackspace(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> keyboardBackspace(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun keyboardCapslock(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> keyboardCapslock(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun keyboardHide(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> keyboardHide(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun keyboardReturn(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> keyboardReturn(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun keyboardTab(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> keyboardTab(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun keyboardVoice(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> keyboardVoice(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun laptop(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> laptop(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun laptopChromebook(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> laptopChromebook(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun laptopMac(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> laptopMac(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun laptopWindows(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> laptopWindows(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun memory(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> memory(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun mouse(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> mouse(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun phoneAndroid(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> phoneAndroid(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun phoneIphone(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> phoneIphone(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun phonelink(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> phonelink(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun phonelinkOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> phonelinkOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun powerInput(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> powerInput(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun router(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> router(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun scanner(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> scanner(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun security(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> security(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun simCard(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> simCard(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun smartphone(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> smartphone(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun speaker(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> speaker(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun speakerGroup(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> speakerGroup(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun tablet(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> tablet(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun tabletAndroid(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> tabletAndroid(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun tabletMac(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> tabletMac(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun toys(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> toys(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun tv(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> tv(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun videogameAsset(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> videogameAsset(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun watch(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> watch(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion

    // region Image
    fun addAPhoto(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> addAPhoto(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun addToPhotos(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> addToPhotos(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun adjust(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> adjust(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun assistant(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> assistant(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun assistantPhoto(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> assistantPhoto(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun audiotrack(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> audiotrack(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun blurCircular(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> blurCircular(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun blurLinear(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> blurLinear(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun blurOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> blurOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun blurOn(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> blurOn(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun brightness1(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> brightness1(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun brightness2(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> brightness2(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun brightness3(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> brightness3(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun brightness4(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> brightness4(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun brightness5(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> brightness5(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun brightness6(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> brightness6(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun brightness7(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> brightness7(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun brokenImage(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> brokenImage(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun brush(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> brush(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun camera(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> camera(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cameraAlt(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cameraAlt(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cameraFront(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cameraFront(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cameraRear(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cameraRear(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cameraRoll(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cameraRoll(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun centerFocusStrong(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> centerFocusStrong(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun centerFocusWeak(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> centerFocusWeak(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun collections(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> collections(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun collectionsBookmark(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> collectionsBookmark(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun colorLens(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> colorLens(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun colorize(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> colorize(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun compare(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> compare(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun controlPoint(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> controlPoint(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun controlPointDuplicate(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> controlPointDuplicate(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun crop(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> crop(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun crop16_9(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> crop16_9(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun crop3_2(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> crop3_2(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun crop5_4(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> crop5_4(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun crop7_5(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> crop7_5(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cropDin(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cropDin(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cropFree(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cropFree(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cropLandscape(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cropLandscape(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cropOriginal(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cropOriginal(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cropPortrait(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cropPortrait(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cropRotate(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cropRotate(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cropSquare(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cropSquare(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun dehaze(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> dehaze(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun details(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> details(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun edit(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> edit(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun exposure(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> exposure(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun exposureNeg1(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> exposureNeg1(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun exposureNeg2(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> exposureNeg2(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun exposurePlus1(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> exposurePlus1(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun exposurePlus2(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> exposurePlus2(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun exposureZero(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> exposureZero(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filter(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filter(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filter1(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filter1(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filter2(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filter2(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filter3(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filter3(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filter4(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filter4(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filter5(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filter5(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filter6(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filter6(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filter7(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filter7(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filter8(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filter8(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filter9(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filter9(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filter9Plus(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filter9Plus(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filterBAndW(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filterBAndW(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filterCenterFocus(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filterCenterFocus(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filterDrama(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filterDrama(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filterFrames(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filterFrames(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filterHdr(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filterHdr(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filterNone(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filterNone(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filterTiltShift(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filterTiltShift(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun filterVintage(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> filterVintage(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun flare(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> flare(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun flashAuto(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> flashAuto(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun flashOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> flashOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun flashOn(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> flashOn(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun flip(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> flip(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun gradient(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> gradient(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun grain(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> grain(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun gridOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> gridOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun gridOn(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> gridOn(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun hdrOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> hdrOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun hdrOn(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> hdrOn(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun hdrStrong(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> hdrStrong(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun hdrWeak(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> hdrWeak(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun healing(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> healing(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun image(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> image(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun imageAspectRatio(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> imageAspectRatio(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun iso(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> iso(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun landscape(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> landscape(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun leakAdd(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> leakAdd(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun leakRemove(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> leakRemove(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun lens(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> lens(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun linkedCamera(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> linkedCamera(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun looks(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> looks(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun looks3(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> looks3(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun looks4(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> looks4(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun looks5(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> looks5(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun looks6(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> looks6(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun looksOne(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> looksOne(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun looksTwo(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> looksTwo(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun loupe(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> loupe(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun monochromePhotos(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> monochromePhotos(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun movieCreation(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> movieCreation(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun movieFilter(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> movieFilter(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun musicNote(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> musicNote(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun nature(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> nature(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun naturePeople(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> naturePeople(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun navigateBefore(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> navigateBefore(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun navigateNext(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> navigateNext(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun palette(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> palette(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun panorama(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> panorama(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun panoramaFishEye(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> panoramaFishEye(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun panoramaHorizontal(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> panoramaHorizontal(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun panoramaVertical(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> panoramaVertical(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun panoramaWideAngle(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> panoramaWideAngle(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun photo(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> photo(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun photoAlbum(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> photoAlbum(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun photoCamera(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> photoCamera(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun photoFilter(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> photoFilter(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun photoLibrary(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> photoLibrary(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun photoSizeSelectActual(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> photoSizeSelectActual(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun photoSizeSelectLarge(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> photoSizeSelectLarge(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun photoSizeSelectSmall(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> photoSizeSelectSmall(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun pictureAsPdf(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> pictureAsPdf(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun portrait(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> portrait(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun removeRedEye(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> removeRedEye(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun rotate90DegreesCcw(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> rotate90DegreesCcw(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun rotateLeft(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> rotateLeft(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun rotateRight(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> rotateRight(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun slideshow(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> slideshow(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun straighten(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> straighten(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun style(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> style(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun switchCamera(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> switchCamera(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun switchVideo(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> switchVideo(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun tagFaces(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> tagFaces(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun texture(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> texture(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun timelapse(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> timelapse(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun timer(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> timer(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun timer3(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> timer3(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun timer10(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> timer10(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun timerOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> timerOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun tonality(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> tonality(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun transform(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> transform(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun tune(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> tune(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun viewComfy(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> viewComfy(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun viewCompact(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> viewCompact(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun vignette(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> vignette(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun wbAuto(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> wbAuto(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun wbCloudy(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> wbCloudy(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun wbIncandescent(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> wbIncandescent(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun wbIridescent(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> wbIridescent(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun wbSunny(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> wbSunny(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion

    // region Maps
    fun addLocation(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> addLocation(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun beenhere(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> beenhere(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun directions(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> directions(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun directionsBike(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> directionsBike(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun directionsBoat(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> directionsBoat(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun directionsBus(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> directionsBus(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun directionsCar(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> directionsCar(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun directionsRailway(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> directionsRailway(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun directionsRun(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> directionsRun(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun directionsSubway(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> directionsSubway(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun directionsTransit(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> directionsTransit(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun directionsWalk(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> directionsWalk(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun editLocation(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> editLocation(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun flight(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> flight(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun hotel(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> hotel(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun layers(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> layers(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun layersClear(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> layersClear(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localActivity(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localActivity(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localAirport(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localAirport(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localAtm(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localAtm(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localBar(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localBar(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localCafe(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localCafe(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localCarWash(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localCarWash(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localConvenienceStore(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localConvenienceStore(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localDining(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localDining(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localDrink(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localDrink(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localFlorist(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localFlorist(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localGasStation(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localGasStation(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localGroceryStore(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localGroceryStore(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localHospital(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localHospital(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localHotel(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localHotel(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localLaundryService(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localLaundryService(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localLibrary(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localLibrary(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localMall(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localMall(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localMovies(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localMovies(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localOffer(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localOffer(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localParking(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localParking(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localPharmacy(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localPharmacy(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localPhone(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localPhone(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localPizza(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localPizza(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localPlay(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localPlay(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localPostOffice(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localPostOffice(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localPrintshop(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localPrintshop(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localSee(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localSee(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localShipping(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localShipping(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun localTaxi(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> localTaxi(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun map(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> map(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun myLocation(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> myLocation(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun navigation(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> navigation(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun nearMe(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> nearMe(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun personPin(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> personPin(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun personPinCircle(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> personPinCircle(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun pinDrop(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> pinDrop(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun place(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> place(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun rateReview(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> rateReview(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun restaurantMenu(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> restaurantMenu(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun satellite(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> satellite(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun storeMallDirectory(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> storeMallDirectory(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun terrain(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> terrain(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun traffic(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> traffic(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun zoomOutMap(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> zoomOutMap(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion

    // region Navigation
    fun apps(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> apps(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun arrowBack(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> arrowBack(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun arrowDownward(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> arrowDownward(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun arrowDropDown(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> arrowDropDown(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun arrowDropDownCircle(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> arrowDropDownCircle(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun arrowDropUp(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> arrowDropUp(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun arrowForward(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> arrowForward(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun arrowUpward(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> arrowUpward(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun cancel(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cancel(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun check(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> check(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun chevronLeft(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> chevronLeft(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun chevronRight(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> chevronRight(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun close(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> close(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun expandLess(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> expandLess(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun expandMore(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> expandMore(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun fullscreen(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> fullscreen(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun fullscreenExit(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> fullscreenExit(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun menu(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> menu(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun moreHorizontal(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> moreHorizontal(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun moreVertical(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> moreVertical(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun refresh(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> refresh(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun subdirectoryArrowLeft(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> subdirectoryArrowLeft(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun subdirectoryArrowRight(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> subdirectoryArrowRight(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion

    // region Notification
    fun adb(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> adb(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun airlineSeatFlat(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> airlineSeatFlat(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun airlineSeatFlatAngled(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> airlineSeatFlatAngled(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun airlineSeatIndividualSuite(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> airlineSeatIndividualSuite(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun airlineSeatLegroomExtra(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> airlineSeatLegroomExtra(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun airlineSeatLegroomNormal(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> airlineSeatLegroomNormal(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun airlineSeatLegroomReduced(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> airlineSeatLegroomReduced(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun airlineSeatReclineExtra(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> airlineSeatReclineExtra(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun airlineSeatReclineNormal(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> airlineSeatReclineNormal(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun bluetoothAudio(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> bluetoothAudio(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun confirmationNumber(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> confirmationNumber(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun discFull(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> discFull(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun doNotDisturb(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> doNotDisturb(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun doNotDisturbAlt(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> doNotDisturbAlt(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun driveEta(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> driveEta(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun enhancedEncryption(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> enhancedEncryption(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun eventAvailable(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> eventAvailable(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun eventBusy(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> eventBusy(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun eventNote(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> eventNote(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun folderSpecial(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> folderSpecial(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun liveTv(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> liveTv(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun mms(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> mms(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun more(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> more(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun networkCheck(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> networkCheck(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun networkLocked(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> networkLocked(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun noEncryption(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> noEncryption(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun ondemandVideo(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> ondemandVideo(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun personalVideo(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> personalVideo(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun phoneBluetoothSpeaker(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> phoneBluetoothSpeaker(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun phoneForwarded(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> phoneForwarded(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun phoneInTalk(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> phoneInTalk(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun phoneLocked(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> phoneLocked(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun phoneMissed(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> phoneMissed(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun phonePaused(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> phonePaused(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun power(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> power(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun sdCard(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> sdCard(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun simCardAlert(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> simCardAlert(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun sms(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> sms(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun smsFailed(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> smsFailed(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun sync(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> sync(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun syncDisabled(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> syncDisabled(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun syncProblem(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> syncProblem(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun systemUpdate(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> systemUpdate(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun tapAndPlay(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> tapAndPlay(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun timeToLeave(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> timeToLeave(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun vibration(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> vibration(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun voiceChat(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> voiceChat(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun vpnLock(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> vpnLock(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun wc(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> wc(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun wifi(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> wifi(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion

    // region Places
    fun acUnit(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> acUnit(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun airportShuttle(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> airportShuttle(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun allInclusive(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> allInclusive(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun beachAccess(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> beachAccess(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun businessCenter(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> businessCenter(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun casino(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> casino(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun childCare(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> childCare(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun childFriendly(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> childFriendly(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun fitnessCenter(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> fitnessCenter(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun freeBreakfast(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> freeBreakfast(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun golfCourse(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> golfCourse(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun hotTub(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> hotTub(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun kitchen(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> kitchen(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun pool(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> pool(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun roomService(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> roomService(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun rvHookup(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> rvHookup(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun smokeFree(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> smokeFree(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun smokingRooms(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> smokingRooms(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun spa(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> spa(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion

    // region Social
    fun cake(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> cake(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun domain(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> domain(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun group(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> group(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun groupAdd(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> groupAdd(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun locationCity(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> locationCity(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun mood(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> mood(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun moodBad(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> moodBad(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun notifications(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> notifications(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun notificationsActive(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> notificationsActive(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun notificationsNone(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> notificationsNone(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun notificationsOff(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> notificationsOff(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun notificationsPaused(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> notificationsPaused(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun pages(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> pages(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun partyMode(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> partyMode(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun people(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> people(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun peopleOutline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> peopleOutline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun person(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> person(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun personAdd(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> personAdd(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun personOutline(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> personOutline(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun plusOne(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> plusOne(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun poll(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> poll(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun public(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> public(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun school(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> school(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun share(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> share(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun whatshot(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> whatshot(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion

    // region Toggle
    fun checkBox(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> checkBox(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun checkBoxOutlineBlank(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> checkBoxOutlineBlank(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun indeterminateCheckBox(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> indeterminateCheckBox(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun radioButtonChecked(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> radioButtonChecked(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun radioButtonUnchecked(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> radioButtonUnchecked(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun star(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> star(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun starBorder(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> starBorder(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>

    fun starHalf(
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: MdlMaterialIcon.() -> Unit = {}): MdlMaterialIcon

    fun <T : Element> starHalf(
            element: T,
            color: IMdlTextColor? = null,
            classes: String = String.empty,
            block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
    //endregion
}
