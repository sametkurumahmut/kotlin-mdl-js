package kotlinmdl.material.style

abstract class MaterialIconsBase : IMaterialIcons {

    // region Action
    override val threeDRotation: IMaterialIcon by lazy { MaterialIcon("3d rotation", "3d_rotation", "E84D") }
    override val accessibility: IMaterialIcon by lazy { MaterialIcon("accessibility", "accessibility", "E84E") }
    override val accessible: IMaterialIcon by lazy { MaterialIcon("accessible", "accessible", "E914") }
    override val accountBalance: IMaterialIcon by lazy { MaterialIcon("account balance", "account_balance", "E84F") }
    override val accountBalanceWallet: IMaterialIcon by lazy { MaterialIcon("account balance wallet", "account_balance_wallet", "E850") }
    override val accountBox: IMaterialIcon by lazy { MaterialIcon("account box", "account_box", "E851") }
    override val accountCircle: IMaterialIcon by lazy { MaterialIcon("account circle", "account_circle", "E853") }
    override val addShoppingCart: IMaterialIcon by lazy { MaterialIcon("add shopping cart", "add_shopping_cart", "E854") }
    override val alarm: IMaterialIcon by lazy { MaterialIcon("alarm", "alarm", "E855") }
    override val alarmAdd: IMaterialIcon by lazy { MaterialIcon("alarm add", "alarm_add", "E856") }
    override val alarmOff: IMaterialIcon by lazy { MaterialIcon("alarm off", "alarm_off", "E857") }
    override val alarmOn: IMaterialIcon by lazy { MaterialIcon("alarm on", "alarm_on", "E858") }
    override val allOut: IMaterialIcon by lazy { MaterialIcon("all out", "all_out", "E90B") }
    override val android: IMaterialIcon by lazy { MaterialIcon("android", "android", "E859") }
    override val announcement: IMaterialIcon by lazy { MaterialIcon("announcement", "announcement", "E85A") }
    override val aspectRatio: IMaterialIcon by lazy { MaterialIcon("aspect ratio", "aspect_ratio", "E85B") }
    override val assessment: IMaterialIcon by lazy { MaterialIcon("assessment", "assessment", "E85C") }
    override val assignment: IMaterialIcon by lazy { MaterialIcon("assignment", "assignment", "E85D") }
    override val assignmentInd: IMaterialIcon by lazy { MaterialIcon("assignment ind", "assignment_ind", "E85E") }
    override val assignmentLate: IMaterialIcon by lazy { MaterialIcon("assignment late", "assignment_late", "E85F") }
    override val assignmentReturn: IMaterialIcon by lazy { MaterialIcon("assignment return", "assignment_return", "E860") }
    override val assignmentReturned: IMaterialIcon by lazy { MaterialIcon("assignment returned", "assignment_returned", "E861") }
    override val assignmentTurnedIn: IMaterialIcon by lazy { MaterialIcon("assignment turned in", "assignment_turned_in", "E862") }
    override val autorenew: IMaterialIcon by lazy { MaterialIcon("autorenew", "autorenew", "E863") }
    override val backup: IMaterialIcon by lazy { MaterialIcon("backup", "backup", "E864") }
    override val book: IMaterialIcon by lazy { MaterialIcon("book", "book", "E865") }
    override val bookmark: IMaterialIcon by lazy { MaterialIcon("bookmark", "bookmark", "E866") }
    override val bookmarkBorder: IMaterialIcon by lazy { MaterialIcon("bookmark border", "bookmark_border", "E867") }
    override val bugReport: IMaterialIcon by lazy { MaterialIcon("bug report", "bug_report", "E868") }
    override val build: IMaterialIcon by lazy { MaterialIcon("build", "build", "E869") }
    override val cached: IMaterialIcon by lazy { MaterialIcon("cached", "cached", "E86A") }
    override val cameraEnhance: IMaterialIcon by lazy { MaterialIcon("camera enhance", "camera_enhance", "E8FC") }
    override val cardGiftcard: IMaterialIcon by lazy { MaterialIcon("card giftcard", "card_giftcard", "E8F6") }
    override val cardMembership: IMaterialIcon by lazy { MaterialIcon("card membership", "card_membership", "E8F7") }
    override val cardTravel: IMaterialIcon by lazy { MaterialIcon("card travel", "card_travel", "E8F8") }
    override val changeHistory: IMaterialIcon by lazy { MaterialIcon("change history", "change_history", "E86B") }
    override val checkCircle: IMaterialIcon by lazy { MaterialIcon("check circle", "check_circle", "E86C") }
    override val chromeReaderMode: IMaterialIcon by lazy { MaterialIcon("chrome reader mode", "chrome_reader_mode", "E86D") }
    override val `class`: IMaterialIcon by lazy { MaterialIcon("class", "class", "E86E") }
    override val code: IMaterialIcon by lazy { MaterialIcon("code", "code", "E86F") }
    override val compareArrows: IMaterialIcon by lazy { MaterialIcon("compare arrows", "compare_arrows", "E915") }
    override val copyright: IMaterialIcon by lazy { MaterialIcon("copyright", "copyright", "E90C") }
    override val creditCard: IMaterialIcon by lazy { MaterialIcon("credit card", "credit_card", "E870") }
    override val dashboard: IMaterialIcon by lazy { MaterialIcon("dashboard", "dashboard", "E871") }
    override val dateRange: IMaterialIcon by lazy { MaterialIcon("date range", "date_range", "E916") }
    override val delete: IMaterialIcon by lazy { MaterialIcon("delete", "delete", "E872") }
    override val description: IMaterialIcon by lazy { MaterialIcon("description", "description", "E873") }
    override val dns: IMaterialIcon by lazy { MaterialIcon("dns", "dns", "E875") }
    override val done: IMaterialIcon by lazy { MaterialIcon("done", "done", "E876") }
    override val doneAll: IMaterialIcon by lazy { MaterialIcon("done all", "done_all", "E877") }
    override val donutLarge: IMaterialIcon by lazy { MaterialIcon("donut large", "donut_large", "E917") }
    override val donutSmall: IMaterialIcon by lazy { MaterialIcon("donut small", "donut_small", "E918") }
    override val eject: IMaterialIcon by lazy { MaterialIcon("eject", "eject", "E8FB") }
    override val event: IMaterialIcon by lazy { MaterialIcon("event", "event", "E878") }
    override val eventSeat: IMaterialIcon by lazy { MaterialIcon("event seat", "event_seat", "E903") }
    override val exitToApp: IMaterialIcon by lazy { MaterialIcon("exit to app", "exit_to_app", "E879") }
    override val explore: IMaterialIcon by lazy { MaterialIcon("explore", "explore", "E87A") }
    override val extension: IMaterialIcon by lazy { MaterialIcon("extension", "extension", "E87B") }
    override val face: IMaterialIcon by lazy { MaterialIcon("face", "face", "E87C") }
    override val favorite: IMaterialIcon by lazy { MaterialIcon("favorite", "favorite", "E87D") }
    override val favoriteBorder: IMaterialIcon by lazy { MaterialIcon("favorite border", "favorite_border", "E87E") }
    override val feedback: IMaterialIcon by lazy { MaterialIcon("feedback", "feedback", "E87F") }
    override val findInPage: IMaterialIcon by lazy { MaterialIcon("find in page", "find_in_page", "E880") }
    override val findReplace: IMaterialIcon by lazy { MaterialIcon("find replace", "find_replace", "E881") }
    override val fingerprint: IMaterialIcon by lazy { MaterialIcon("fingerprint", "fingerprint", "E90D") }
    override val flightLand: IMaterialIcon by lazy { MaterialIcon("flight land", "flight_land", "E904") }
    override val flightTakeoff: IMaterialIcon by lazy { MaterialIcon("flight takeoff", "flight_takeoff", "E905") }
    override val flipToBack: IMaterialIcon by lazy { MaterialIcon("flip to back", "flip_to_back", "E882") }
    override val flipToFront: IMaterialIcon by lazy { MaterialIcon("flip to front", "flip_to_front", "E883") }
    override val gavel: IMaterialIcon by lazy { MaterialIcon("gavel", "gavel", "E90E") }
    override val getApp: IMaterialIcon by lazy { MaterialIcon("get app", "get_app", "E884") }
    override val gif: IMaterialIcon by lazy { MaterialIcon("gif", "gif", "E908") }
    override val grade: IMaterialIcon by lazy { MaterialIcon("grade", "grade", "E885") }
    override val groupWork: IMaterialIcon by lazy { MaterialIcon("group work", "group_work", "E886") }
    override val help: IMaterialIcon by lazy { MaterialIcon("help", "help", "E887") }
    override val helpOutline: IMaterialIcon by lazy { MaterialIcon("help outline", "help_outline", "E8FD") }
    override val highlightOff: IMaterialIcon by lazy { MaterialIcon("highlight off", "highlight_off", "E888") }
    override val history: IMaterialIcon by lazy { MaterialIcon("history", "history", "E889") }
    override val home: IMaterialIcon by lazy { MaterialIcon("home", "home", "E88A") }
    override val hourglassEmpty: IMaterialIcon by lazy { MaterialIcon("hourglass empty", "hourglass_empty", "E88B") }
    override val hourglassFull: IMaterialIcon by lazy { MaterialIcon("hourglass full", "hourglass_full", "E88C") }
    override val http: IMaterialIcon by lazy { MaterialIcon("http", "http", "E902") }
    override val https: IMaterialIcon by lazy { MaterialIcon("https", "https", "E88D") }
    override val importantDevices: IMaterialIcon by lazy { MaterialIcon("important devices", "important_devices", "E912") }
    override val info: IMaterialIcon by lazy { MaterialIcon("info", "info", "E88E") }
    override val infoOutline: IMaterialIcon by lazy { MaterialIcon("info outline", "info_outline", "E88F") }
    override val input: IMaterialIcon by lazy { MaterialIcon("input", "input", "E890") }
    override val invertColors: IMaterialIcon by lazy { MaterialIcon("invert colors", "invert_colors", "E891") }
    override val label: IMaterialIcon by lazy { MaterialIcon("label", "label", "E892") }
    override val labelOutline: IMaterialIcon by lazy { MaterialIcon("label outline", "label_outline", "E893") }
    override val language: IMaterialIcon by lazy { MaterialIcon("language", "language", "E894") }
    override val launch: IMaterialIcon by lazy { MaterialIcon("launch", "launch", "E895") }
    override val lightbulbOutline: IMaterialIcon by lazy { MaterialIcon("lightbulb outline", "lightbulb_outline", "E90F") }
    override val lineStyle: IMaterialIcon by lazy { MaterialIcon("line style", "line_style", "E919") }
    override val lineWeight: IMaterialIcon by lazy { MaterialIcon("line weight", "line_weight", "E91A") }
    override val list: IMaterialIcon by lazy { MaterialIcon("list", "list", "E896") }
    override val lock: IMaterialIcon by lazy { MaterialIcon("lock", "lock", "E897") }
    override val lockOpen: IMaterialIcon by lazy { MaterialIcon("lock open", "lock_open", "E898") }
    override val lockOutline: IMaterialIcon by lazy { MaterialIcon("lock outline", "lock_outline", "E899") }
    override val loyalty: IMaterialIcon by lazy { MaterialIcon("loyalty", "loyalty", "E89A") }
    override val markunreadMailbox: IMaterialIcon by lazy { MaterialIcon("markunread mailbox", "markunread_mailbox", "E89B") }
    override val motorcycle: IMaterialIcon by lazy { MaterialIcon("motorcycle", "motorcycle", "E91B") }
    override val noteAdd: IMaterialIcon by lazy { MaterialIcon("note add", "note_add", "E89C") }
    override val offlinePin: IMaterialIcon by lazy { MaterialIcon("offline pin", "offline_pin", "E90A") }
    override val opacity: IMaterialIcon by lazy { MaterialIcon("opacity", "opacity", "E91C") }
    override val openInBrowser: IMaterialIcon by lazy { MaterialIcon("open in browser", "open_in_browser", "E89D") }
    override val openInNew: IMaterialIcon by lazy { MaterialIcon("open in new", "open_in_new", "E89E") }
    override val openWith: IMaterialIcon by lazy { MaterialIcon("open with", "open_with", "E89F") }
    override val pageview: IMaterialIcon by lazy { MaterialIcon("pageview", "pageview", "E8A0") }
    override val panTool: IMaterialIcon by lazy { MaterialIcon("pan tool", "pan_tool", "E925") }
    override val payment: IMaterialIcon by lazy { MaterialIcon("payment", "payment", "E8A1") }
    override val permCameraMic: IMaterialIcon by lazy { MaterialIcon("perm camera mic", "perm_camera_mic", "E8A2") }
    override val permContactCalendar: IMaterialIcon by lazy { MaterialIcon("perm contact calendar", "perm_contact_calendar", "E8A3") }
    override val permDataSetting: IMaterialIcon by lazy { MaterialIcon("perm data setting", "perm_data_setting", "E8A4") }
    override val permDeviceInformation: IMaterialIcon by lazy { MaterialIcon("perm device information", "perm_device_information", "E8A5") }
    override val permIdentity: IMaterialIcon by lazy { MaterialIcon("perm identity", "perm_identity", "E8A6") }
    override val permMedia: IMaterialIcon by lazy { MaterialIcon("perm media", "perm_media", "E8A7") }
    override val permPhoneMsg: IMaterialIcon by lazy { MaterialIcon("perm phone msg", "perm_phone_msg", "E8A8") }
    override val permScanWifi: IMaterialIcon by lazy { MaterialIcon("perm scan wifi", "perm_scan_wifi", "E8A9") }
    override val pets: IMaterialIcon by lazy { MaterialIcon("pets", "pets", "E91D") }
    override val pictureInPicture: IMaterialIcon by lazy { MaterialIcon("picture in picture", "picture_in_picture", "E8AA") }
    override val pictureInPictureAlt: IMaterialIcon by lazy { MaterialIcon("picture in picture alt", "picture_in_picture_alt", "E911") }
    override val playForWork: IMaterialIcon by lazy { MaterialIcon("play for work", "play_for_work", "E906") }
    override val polymer: IMaterialIcon by lazy { MaterialIcon("polymer", "polymer", "E8AB") }
    override val powerSettingsNew: IMaterialIcon by lazy { MaterialIcon("power settings new", "power_settings_new", "E8AC") }
    override val pregnantWoman: IMaterialIcon by lazy { MaterialIcon("pregnant woman", "pregnant_woman", "E91E") }
    override val print: IMaterialIcon by lazy { MaterialIcon("print", "print", "E8AD") }
    override val queryBuilder: IMaterialIcon by lazy { MaterialIcon("query builder", "query_builder", "E8AE") }
    override val questionAnswer: IMaterialIcon by lazy { MaterialIcon("question answer", "question_answer", "E8AF") }
    override val receipt: IMaterialIcon by lazy { MaterialIcon("receipt", "receipt", "E8B0") }
    override val recordVoiceOver: IMaterialIcon by lazy { MaterialIcon("record voice over", "record_voice_over", "E91F") }
    override val redeem: IMaterialIcon by lazy { MaterialIcon("redeem", "redeem", "E8B1") }
    override val reorder: IMaterialIcon by lazy { MaterialIcon("reorder", "reorder", "E8FE") }
    override val reportProblem: IMaterialIcon by lazy { MaterialIcon("report problem", "report_problem", "E8B2") }
    override val restore: IMaterialIcon by lazy { MaterialIcon("restore", "restore", "E8B3") }
    override val room: IMaterialIcon by lazy { MaterialIcon("room", "room", "E8B4") }
    override val roundedCorner: IMaterialIcon by lazy { MaterialIcon("rounded corner", "rounded_corner", "E920") }
    override val rowing: IMaterialIcon by lazy { MaterialIcon("rowing", "rowing", "E921") }
    override val schedule: IMaterialIcon by lazy { MaterialIcon("schedule", "schedule", "E8B5") }
    override val search: IMaterialIcon by lazy { MaterialIcon("search", "search", "E8B6") }
    override val settings: IMaterialIcon by lazy { MaterialIcon("settings", "settings", "E8B8") }
    override val settingsApplications: IMaterialIcon by lazy { MaterialIcon("settings applications", "settings_applications", "E8B9") }
    override val settingsBackupRestore: IMaterialIcon by lazy { MaterialIcon("settings backup restore", "settings_backup_restore", "E8BA") }
    override val settingsBluetooth: IMaterialIcon by lazy { MaterialIcon("settings bluetooth", "settings_bluetooth", "E8BB") }
    override val settingsBrightness: IMaterialIcon by lazy { MaterialIcon("settings brightness", "settings_brightness", "E8BD") }
    override val settingsCell: IMaterialIcon by lazy { MaterialIcon("settings cell", "settings_cell", "E8BC") }
    override val settingsEthernet: IMaterialIcon by lazy { MaterialIcon("settings ethernet", "settings_ethernet", "E8BE") }
    override val settingsInputAntenna: IMaterialIcon by lazy { MaterialIcon("settings input antenna", "settings_input_antenna", "E8BF") }
    override val settingsInputComponent: IMaterialIcon by lazy { MaterialIcon("settings input component", "settings_input_component", "E8C0") }
    override val settingsInputComposite: IMaterialIcon by lazy { MaterialIcon("settings input composite", "settings_input_composite", "E8C1") }
    override val settingsInputHdmi: IMaterialIcon by lazy { MaterialIcon("settings input hdmi", "settings_input_hdmi", "E8C2") }
    override val settingsInputSvideo: IMaterialIcon by lazy { MaterialIcon("settings input svideo", "settings_input_svideo", "E8C3") }
    override val settingsOverscan: IMaterialIcon by lazy { MaterialIcon("settings overscan", "settings_overscan", "E8C4") }
    override val settingsPhone: IMaterialIcon by lazy { MaterialIcon("settings phone", "settings_phone", "E8C5") }
    override val settingsPower: IMaterialIcon by lazy { MaterialIcon("settings power", "settings_power", "E8C6") }
    override val settingsRemote: IMaterialIcon by lazy { MaterialIcon("settings remote", "settings_remote", "E8C7") }
    override val settingsVoice: IMaterialIcon by lazy { MaterialIcon("settings voice", "settings_voice", "E8C8") }
    override val shop: IMaterialIcon by lazy { MaterialIcon("shop", "shop", "E8C9") }
    override val shopTwo: IMaterialIcon by lazy { MaterialIcon("shop two", "shop_two", "E8CA") }
    override val shoppingBasket: IMaterialIcon by lazy { MaterialIcon("shopping basket", "shopping_basket", "E8CB") }
    override val shoppingCart: IMaterialIcon by lazy { MaterialIcon("shopping cart", "shopping_cart", "E8CC") }
    override val speakerNotes: IMaterialIcon by lazy { MaterialIcon("speaker notes", "speaker_notes", "E8CD") }
    override val spellcheck: IMaterialIcon by lazy { MaterialIcon("spellcheck", "spellcheck", "E8CE") }
    override val starRate: IMaterialIcon by lazy { MaterialIcon("star rate", "star_rate", "E8CF") }
    override val stars: IMaterialIcon by lazy { MaterialIcon("stars", "stars", "E8D0") }
    override val store: IMaterialIcon by lazy { MaterialIcon("store", "store", "E8D1") }
    override val subject: IMaterialIcon by lazy { MaterialIcon("subject", "subject", "E8D2") }
    override val supervisorAccount: IMaterialIcon by lazy { MaterialIcon("supervisor account", "supervisor_account", "E8D3") }
    override val swapHorizontal: IMaterialIcon by lazy { MaterialIcon("swap horiz", "swap_horiz", "E8D4") }
    override val swapVertical: IMaterialIcon by lazy { MaterialIcon("swap vert", "swap_vert", "E8D5") }
    override val swapVerticalCircle: IMaterialIcon by lazy { MaterialIcon("swap vertical circle", "swap_vertical_circle", "E8D6") }
    override val systemUpdateAlt: IMaterialIcon by lazy { MaterialIcon("system update alt", "system_update_alt", "E8D7") }
    override val tab: IMaterialIcon by lazy { MaterialIcon("tab", "tab", "E8D8") }
    override val tabUnselected: IMaterialIcon by lazy { MaterialIcon("tab unselected", "tab_unselected", "E8D9") }
    override val theaters: IMaterialIcon by lazy { MaterialIcon("theaters", "theaters", "E8DA") }
    override val thumbDown: IMaterialIcon by lazy { MaterialIcon("thumb down", "thumb_down", "E8DB") }
    override val thumbUp: IMaterialIcon by lazy { MaterialIcon("thumb up", "thumb_up", "E8DC") }
    override val thumbsUpDown: IMaterialIcon by lazy { MaterialIcon("thumbs up down", "thumbs_up_down", "E8DD") }
    override val timeline: IMaterialIcon by lazy { MaterialIcon("timeline", "timeline", "E922") }
    override val toc: IMaterialIcon by lazy { MaterialIcon("toc", "toc", "E8DE") }
    override val today: IMaterialIcon by lazy { MaterialIcon("today", "today", "E8DF") }
    override val toll: IMaterialIcon by lazy { MaterialIcon("toll", "toll", "E8E0") }
    override val touchApp: IMaterialIcon by lazy { MaterialIcon("touch app", "touch_app", "E913") }
    override val trackChanges: IMaterialIcon by lazy { MaterialIcon("track changes", "track_changes", "E8E1") }
    override val translate: IMaterialIcon by lazy { MaterialIcon("translate", "translate", "E8E2") }
    override val trendingDown: IMaterialIcon by lazy { MaterialIcon("trending down", "trending_down", "E8E3") }
    override val trendingFlat: IMaterialIcon by lazy { MaterialIcon("trending flat", "trending_flat", "E8E4") }
    override val trendingUp: IMaterialIcon by lazy { MaterialIcon("trending up", "trending_up", "E8E5") }
    override val turnedIn: IMaterialIcon by lazy { MaterialIcon("turned in", "turned_in", "E8E6") }
    override val turnedInNot: IMaterialIcon by lazy { MaterialIcon("turned in not", "turned_in_not", "E8E7") }
    override val update: IMaterialIcon by lazy { MaterialIcon("update", "update", "E923") }
    override val verifiedUser: IMaterialIcon by lazy { MaterialIcon("verified user", "verified_user", "E8E8") }
    override val viewAgenda: IMaterialIcon by lazy { MaterialIcon("view agenda", "view_agenda", "E8E9") }
    override val viewArray: IMaterialIcon by lazy { MaterialIcon("view array", "view_array", "E8EA") }
    override val viewCarousel: IMaterialIcon by lazy { MaterialIcon("view carousel", "view_carousel", "E8EB") }
    override val viewColumn: IMaterialIcon by lazy { MaterialIcon("view column", "view_column", "E8EC") }
    override val viewDay: IMaterialIcon by lazy { MaterialIcon("view day", "view_day", "E8ED") }
    override val viewHeadline: IMaterialIcon by lazy { MaterialIcon("view headline", "view_headline", "E8EE") }
    override val viewList: IMaterialIcon by lazy { MaterialIcon("view list", "view_list", "E8EF") }
    override val viewModule: IMaterialIcon by lazy { MaterialIcon("view module", "view_module", "E8F0") }
    override val viewQuilt: IMaterialIcon by lazy { MaterialIcon("view quilt", "view_quilt", "E8F1") }
    override val viewStream: IMaterialIcon by lazy { MaterialIcon("view stream", "view_stream", "E8F2") }
    override val viewWeek: IMaterialIcon by lazy { MaterialIcon("view week", "view_week", "E8F3") }
    override val visibility: IMaterialIcon by lazy { MaterialIcon("visibility", "visibility", "E8F4") }
    override val visibilityOff: IMaterialIcon by lazy { MaterialIcon("visibility off", "visibility_off", "E8F5") }
    override val watchLater: IMaterialIcon by lazy { MaterialIcon("watch later", "watch_later", "E924") }
    override val work: IMaterialIcon by lazy { MaterialIcon("work", "work", "E8F9") }
    override val youtubeSearchedFor: IMaterialIcon by lazy { MaterialIcon("youtube searched for", "youtube_searched_for", "E8FA") }
    override val zoomIn: IMaterialIcon by lazy { MaterialIcon("zoom in", "zoom_in", "E8FF") }
    override val zoomOut: IMaterialIcon by lazy { MaterialIcon("zoom out", "zoom_out", "E900") }
    //endregion

    // region Alert
    override val addAlert: IMaterialIcon by lazy { MaterialIcon("add alert", "add_alert", "E003") }
    override val error: IMaterialIcon by lazy { MaterialIcon("error", "error", "E000") }
    override val errorOutline: IMaterialIcon by lazy { MaterialIcon("error outline", "error_outline", "E001") }
    override val warning: IMaterialIcon by lazy { MaterialIcon("warning", "warning", "E002") }
    //endregion

    // region AV
    override val addToQueue: IMaterialIcon by lazy { MaterialIcon("add to queue", "add_to_queue", "E05C") }
    override val airplay: IMaterialIcon by lazy { MaterialIcon("airplay", "airplay", "E055") }
    override val album: IMaterialIcon by lazy { MaterialIcon("album", "album", "E019") }
    override val artTrack: IMaterialIcon by lazy { MaterialIcon("art track", "art_track", "E060") }
    override val avTimer: IMaterialIcon by lazy { MaterialIcon("av timer", "av_timer", "E01B") }
    override val closedCaption: IMaterialIcon by lazy { MaterialIcon("closed caption", "closed_caption", "E01C") }
    override val equalizer: IMaterialIcon by lazy { MaterialIcon("equalizer", "equalizer", "E01D") }
    override val explicit: IMaterialIcon by lazy { MaterialIcon("explicit", "explicit", "E01E") }
    override val fastForward: IMaterialIcon by lazy { MaterialIcon("fast forward", "fast_forward", "E01F") }
    override val fastRewind: IMaterialIcon by lazy { MaterialIcon("fast rewind", "fast_rewind", "E020") }
    override val fiberDvr: IMaterialIcon by lazy { MaterialIcon("fiber dvr", "fiber_dvr", "E05D") }
    override val fiberManualRecord: IMaterialIcon by lazy { MaterialIcon("fiber manual record", "fiber_manual_record", "E061") }
    override val fiberNew: IMaterialIcon by lazy { MaterialIcon("fiber new", "fiber_new", "E05E") }
    override val fiberPin: IMaterialIcon by lazy { MaterialIcon("fiber pin", "fiber_pin", "E06A") }
    override val fiberSmartRecord: IMaterialIcon by lazy { MaterialIcon("fiber smart record", "fiber_smart_record", "E062") }
    override val forward5: IMaterialIcon by lazy { MaterialIcon("forward 5", "forward_5", "E058") }
    override val forward10: IMaterialIcon by lazy { MaterialIcon("forward 10", "forward_10", "E056") }
    override val forward30: IMaterialIcon by lazy { MaterialIcon("forward 30", "forward_30", "E057") }
    override val games: IMaterialIcon by lazy { MaterialIcon("games", "games", "E021") }
    override val hd: IMaterialIcon by lazy { MaterialIcon("hd", "hd", "E052") }
    override val hearing: IMaterialIcon by lazy { MaterialIcon("hearing", "hearing", "E023") }
    override val highQuality: IMaterialIcon by lazy { MaterialIcon("high quality", "high_quality", "E024") }
    override val libraryAdd: IMaterialIcon by lazy { MaterialIcon("library add", "library_add", "E02E") }
    override val libraryBooks: IMaterialIcon by lazy { MaterialIcon("library books", "library_books", "E02F") }
    override val libraryMusic: IMaterialIcon by lazy { MaterialIcon("library music", "library_music", "E030") }
    override val loop: IMaterialIcon by lazy { MaterialIcon("loop", "loop", "E028") }
    override val mic: IMaterialIcon by lazy { MaterialIcon("mic", "mic", "E029") }
    override val micNone: IMaterialIcon by lazy { MaterialIcon("mic none", "mic_none", "E02A") }
    override val micOff: IMaterialIcon by lazy { MaterialIcon("mic off", "mic_off", "E02B") }
    override val movie: IMaterialIcon by lazy { MaterialIcon("movie", "movie", "E02C") }
    override val musicVideo: IMaterialIcon by lazy { MaterialIcon("music video", "music_video", "E063") }
    override val newReleases: IMaterialIcon by lazy { MaterialIcon("new releases", "new_releases", "E031") }
    override val notInterested: IMaterialIcon by lazy { MaterialIcon("not interested", "not_interested", "E033") }
    override val pause: IMaterialIcon by lazy { MaterialIcon("pause", "pause", "E034") }
    override val pauseCircleFilled: IMaterialIcon by lazy { MaterialIcon("pause circle filled", "pause_circle_filled", "E035") }
    override val pauseCircleOutline: IMaterialIcon by lazy { MaterialIcon("pause circle outline", "pause_circle_outline", "E036") }
    override val playArrow: IMaterialIcon by lazy { MaterialIcon("play arrow", "play_arrow", "E037") }
    override val playCircleFilled: IMaterialIcon by lazy { MaterialIcon("play circle filled", "play_circle_filled", "E038") }
    override val playCircleOutline: IMaterialIcon by lazy { MaterialIcon("play circle outline", "play_circle_outline", "E039") }
    override val playlistAdd: IMaterialIcon by lazy { MaterialIcon("playlist add", "playlist_add", "E03B") }
    override val playlistAddCheck: IMaterialIcon by lazy { MaterialIcon("playlist add check", "playlist_add_check", "E065") }
    override val playlistPlay: IMaterialIcon by lazy { MaterialIcon("playlist play", "playlist_play", "E05F") }
    override val queue: IMaterialIcon by lazy { MaterialIcon("queue", "queue", "E03C") }
    override val queueMusic: IMaterialIcon by lazy { MaterialIcon("queue music", "queue_music", "E03D") }
    override val queuePlayNext: IMaterialIcon by lazy { MaterialIcon("queue play next", "queue_play_next", "E066") }
    override val radio: IMaterialIcon by lazy { MaterialIcon("radio", "radio", "E03E") }
    override val recentActors: IMaterialIcon by lazy { MaterialIcon("recent actors", "recent_actors", "E03F") }
    override val removeFromQueue: IMaterialIcon by lazy { MaterialIcon("remove from queue", "remove_from_queue", "E067") }
    override val repeat: IMaterialIcon by lazy { MaterialIcon("repeat", "repeat", "E040") }
    override val repeatOne: IMaterialIcon by lazy { MaterialIcon("repeat one", "repeat_one", "E041") }
    override val replay: IMaterialIcon by lazy { MaterialIcon("replay", "replay", "E042") }
    override val replay5: IMaterialIcon by lazy { MaterialIcon("replay 5", "replay_5", "E05B") }
    override val replay10: IMaterialIcon by lazy { MaterialIcon("replay 10", "replay_10", "E059") }
    override val replay30: IMaterialIcon by lazy { MaterialIcon("replay 30", "replay_30", "E05A") }
    override val shuffle: IMaterialIcon by lazy { MaterialIcon("shuffle", "shuffle", "E043") }
    override val skipNext: IMaterialIcon by lazy { MaterialIcon("skip next", "skip_next", "E044") }
    override val skipPrevious: IMaterialIcon by lazy { MaterialIcon("skip previous", "skip_previous", "E045") }
    override val slowMotionVideo: IMaterialIcon by lazy { MaterialIcon("slow motion video", "slow_motion_video", "E068") }
    override val snooze: IMaterialIcon by lazy { MaterialIcon("snooze", "snooze", "E046") }
    override val sortByAlpha: IMaterialIcon by lazy { MaterialIcon("sort: IMaterialIcon by alpha", "sort_by_alpha", "E053") }
    override val stop: IMaterialIcon by lazy { MaterialIcon("stop", "stop", "E047") }
    override val subscriptions: IMaterialIcon by lazy { MaterialIcon("subscriptions", "subscriptions", "E064") }
    override val subtitles: IMaterialIcon by lazy { MaterialIcon("subtitles", "subtitles", "E048") }
    override val surroundSound: IMaterialIcon by lazy { MaterialIcon("surround sound", "surround_sound", "E049") }
    override val videoLibrary: IMaterialIcon by lazy { MaterialIcon("video library", "video_library", "E04A") }
    override val videocam: IMaterialIcon by lazy { MaterialIcon("videocam", "videocam", "E04B") }
    override val videocamOff: IMaterialIcon by lazy { MaterialIcon("videocam off", "videocam_off", "E04C") }
    override val volumeDown: IMaterialIcon by lazy { MaterialIcon("volume down", "volume_down", "E04D") }
    override val volumeMute: IMaterialIcon by lazy { MaterialIcon("volume mute", "volume_mute", "E04E") }
    override val volumeOff: IMaterialIcon by lazy { MaterialIcon("volume off", "volume_off", "E04F") }
    override val volumeUp: IMaterialIcon by lazy { MaterialIcon("volume up", "volume_up", "E050") }
    override val web: IMaterialIcon by lazy { MaterialIcon("web", "web", "E051") }
    override val webAsset: IMaterialIcon by lazy { MaterialIcon("web asset", "web_asset", "E069") }
    //endregion

    // region Communication
    override val business: IMaterialIcon by lazy { MaterialIcon("business", "business", "E0AF") }
    override val call: IMaterialIcon by lazy { MaterialIcon("call", "call", "E0B0") }
    override val callEnd: IMaterialIcon by lazy { MaterialIcon("call end", "call_end", "E0B1") }
    override val callMade: IMaterialIcon by lazy { MaterialIcon("call made", "call_made", "E0B2") }
    override val callMerge: IMaterialIcon by lazy { MaterialIcon("call merge", "call_merge", "E0B3") }
    override val callMissed: IMaterialIcon by lazy { MaterialIcon("call missed", "call_missed", "E0B4") }
    override val callMissedOutgoing: IMaterialIcon by lazy { MaterialIcon("call missed outgoing", "call_missed_outgoing", "E0E4") }
    override val callReceived: IMaterialIcon by lazy { MaterialIcon("call received", "call_received", "E0B5") }
    override val callSplit: IMaterialIcon by lazy { MaterialIcon("call split", "call_split", "E0B6") }
    override val chat: IMaterialIcon by lazy { MaterialIcon("chat", "chat", "E0B7") }
    override val chatBubble: IMaterialIcon by lazy { MaterialIcon("chat bubble", "chat_bubble", "E0CA") }
    override val chatBubbleOutline: IMaterialIcon by lazy { MaterialIcon("chat bubble outline", "chat_bubble_outline", "E0CB") }
    override val clearAll: IMaterialIcon by lazy { MaterialIcon("clear all", "clear_all", "E0B8") }
    override val comment: IMaterialIcon by lazy { MaterialIcon("comment", "comment", "E0B9") }
    override val contactMail: IMaterialIcon by lazy { MaterialIcon("contact mail", "contact_mail", "E0D0") }
    override val contactPhone: IMaterialIcon by lazy { MaterialIcon("contact phone", "contact_phone", "E0CF") }
    override val contacts: IMaterialIcon by lazy { MaterialIcon("contacts", "contacts", "E0BA") }
    override val dialerSip: IMaterialIcon by lazy { MaterialIcon("dialer sip", "dialer_sip", "E0BB") }
    override val dialpad: IMaterialIcon by lazy { MaterialIcon("dialpad", "dialpad", "E0BC") }
    override val email: IMaterialIcon by lazy { MaterialIcon("email", "email", "E0BE") }
    override val forum: IMaterialIcon by lazy { MaterialIcon("forum", "forum", "E0BF") }
    override val importContacts: IMaterialIcon by lazy { MaterialIcon("import contacts", "import_contacts", "E0E0") }
    override val importExport: IMaterialIcon by lazy { MaterialIcon("import export", "import_export", "E0C3") }
    override val invertColorsOff: IMaterialIcon by lazy { MaterialIcon("invert colors off", "invert_colors_off", "E0C4") }
    override val liveHelp: IMaterialIcon by lazy { MaterialIcon("live help", "live_help", "E0C6") }
    override val locationOff: IMaterialIcon by lazy { MaterialIcon("location off", "location_off", "E0C7") }
    override val locationOn: IMaterialIcon by lazy { MaterialIcon("location on", "location_on", "E0C8") }
    override val mailOutline: IMaterialIcon by lazy { MaterialIcon("mail outline", "mail_outline", "E0E1") }
    override val message: IMaterialIcon by lazy { MaterialIcon("message", "message", "E0C9") }
    override val noSim: IMaterialIcon by lazy { MaterialIcon("no sim", "no_sim", "E0CC") }
    override val phone: IMaterialIcon by lazy { MaterialIcon("phone", "phone", "E0CD") }
    override val phonelinkErase: IMaterialIcon by lazy { MaterialIcon("phonelink erase", "phonelink_erase", "E0DB") }
    override val phonelinkLock: IMaterialIcon by lazy { MaterialIcon("phonelink lock", "phonelink_lock", "E0DC") }
    override val phonelinkRing: IMaterialIcon by lazy { MaterialIcon("phonelink ring", "phonelink_ring", "E0DD") }
    override val phonelinkSetup: IMaterialIcon by lazy { MaterialIcon("phonelink setup", "phonelink_setup", "E0DE") }
    override val portableWifiOff: IMaterialIcon by lazy { MaterialIcon("portable wifi off", "portable_wifi_off", "E0CE") }
    override val presentToAll: IMaterialIcon by lazy { MaterialIcon("present to all", "present_to_all", "E0DF") }
    override val ringVolume: IMaterialIcon by lazy { MaterialIcon("ring volume", "ring_volume", "E0D1") }
    override val screenShare: IMaterialIcon by lazy { MaterialIcon("screen share", "screen_share", "E0E2") }
    override val speakerPhone: IMaterialIcon by lazy { MaterialIcon("speaker phone", "speaker_phone", "E0D2") }
    override val stayCurrentLandscape: IMaterialIcon by lazy { MaterialIcon("stay current landscape", "stay_current_landscape", "E0D3") }
    override val stayCurrentPortrait: IMaterialIcon by lazy { MaterialIcon("stay current portrait", "stay_current_portrait", "E0D4") }
    override val stayPrimaryLandscape: IMaterialIcon by lazy { MaterialIcon("stay Primary landscape", "stay_primary_landscape", "E0D5") }
    override val stayPrimaryPortrait: IMaterialIcon by lazy { MaterialIcon("stay Primary portrait", "stay_primary_portrait", "E0D6") }
    override val stopScreenShare: IMaterialIcon by lazy { MaterialIcon("stop screen share", "stop_screen_share", "E0E3") }
    override val swapCalls: IMaterialIcon by lazy { MaterialIcon("swap calls", "swap_calls", "E0D7") }
    override val textsms: IMaterialIcon by lazy { MaterialIcon("textsms", "textsms", "E0D8") }
    override val voicemail: IMaterialIcon by lazy { MaterialIcon("voicemail", "voicemail", "E0D9") }
    override val vpnKey: IMaterialIcon by lazy { MaterialIcon("vpn key", "vpn_key", "E0DA") }
    //endregion

    // region Content
    override val add: IMaterialIcon by lazy { MaterialIcon("add", "add", "E145") }
    override val addBox: IMaterialIcon by lazy { MaterialIcon("add box", "add_box", "E146") }
    override val addCircle: IMaterialIcon by lazy { MaterialIcon("add circle", "add_circle", "E147") }
    override val addCircleOutline: IMaterialIcon by lazy { MaterialIcon("add circle outline", "add_circle_outline", "E148") }
    override val archive: IMaterialIcon by lazy { MaterialIcon("archive", "archive", "E149") }
    override val backspace: IMaterialIcon by lazy { MaterialIcon("backspace", "backspace", "E14A") }
    override val block: IMaterialIcon by lazy { MaterialIcon("block", "block", "E14B") }
    override val clear: IMaterialIcon by lazy { MaterialIcon("clear", "clear", "E14C") }
    override val contentCopy: IMaterialIcon by lazy { MaterialIcon("content copy", "content_copy", "E14D") }
    override val contentCut: IMaterialIcon by lazy { MaterialIcon("content cut", "content_cut", "E14E") }
    override val contentPaste: IMaterialIcon by lazy { MaterialIcon("content paste", "content_paste", "E14F") }
    override val create: IMaterialIcon by lazy { MaterialIcon("create", "create", "E150") }
    override val drafts: IMaterialIcon by lazy { MaterialIcon("drafts", "drafts", "E151") }
    override val filterList: IMaterialIcon by lazy { MaterialIcon("filter list", "filter_list", "E152") }
    override val flag: IMaterialIcon by lazy { MaterialIcon("flag", "flag", "E153") }
    override val fontDownload: IMaterialIcon by lazy { MaterialIcon("font download", "font_download", "E167") }
    override val forward: IMaterialIcon by lazy { MaterialIcon("forward", "forward", "E154") }
    override val gesture: IMaterialIcon by lazy { MaterialIcon("gesture", "gesture", "E155") }
    override val inbox: IMaterialIcon by lazy { MaterialIcon("inbox", "inbox", "E156") }
    override val link: IMaterialIcon by lazy { MaterialIcon("link", "link", "E157") }
    override val mail: IMaterialIcon by lazy { MaterialIcon("mail", "mail", "E158") }
    override val markunread: IMaterialIcon by lazy { MaterialIcon("markunread", "markunread", "E159") }
    override val moveToInbox: IMaterialIcon by lazy { MaterialIcon("move to inbox", "move_to_inbox", "E168") }
    override val nextWeek: IMaterialIcon by lazy { MaterialIcon("next week", "next_week", "E16A") }
    override val redo: IMaterialIcon by lazy { MaterialIcon("redo", "redo", "E15A") }
    override val remove: IMaterialIcon by lazy { MaterialIcon("remove", "remove", "E15B") }
    override val removeCircle: IMaterialIcon by lazy { MaterialIcon("remove circle", "remove_circle", "E15C") }
    override val removeCircleOutline: IMaterialIcon by lazy { MaterialIcon("remove circle outline", "remove_circle_outline", "E15D") }
    override val reply: IMaterialIcon by lazy { MaterialIcon("reply", "reply", "E15E") }
    override val replyAll: IMaterialIcon by lazy { MaterialIcon("reply all", "reply_all", "E15F") }
    override val report: IMaterialIcon by lazy { MaterialIcon("report", "report", "E160") }
    override val save: IMaterialIcon by lazy { MaterialIcon("save", "save", "E161") }
    override val selectAll: IMaterialIcon by lazy { MaterialIcon("select all", "select_all", "E162") }
    override val send: IMaterialIcon by lazy { MaterialIcon("send", "send", "E163") }
    override val sort: IMaterialIcon by lazy { MaterialIcon("sort", "sort", "E164") }
    override val textFormat: IMaterialIcon by lazy { MaterialIcon("text format", "text_format", "E165") }
    override val unarchive: IMaterialIcon by lazy { MaterialIcon("unarchive", "unarchive", "E169") }
    override val undo: IMaterialIcon by lazy { MaterialIcon("undo", "undo", "E166") }
    override val weekend: IMaterialIcon by lazy { MaterialIcon("weekend", "weekend", "E16B") }
    //endregion

    // region Device
    override val accessAlarm: IMaterialIcon by lazy { MaterialIcon("access alarm", "access_alarm", "E190") }
    override val accessAlarms: IMaterialIcon by lazy { MaterialIcon("access alarms", "access_alarms", "E191") }
    override val accessTime: IMaterialIcon by lazy { MaterialIcon("access time", "access_time", "E192") }
    override val addAlarm: IMaterialIcon by lazy { MaterialIcon("add alarm", "add_alarm", "E193") }
    override val airplanemodeActive: IMaterialIcon by lazy { MaterialIcon("airplanemode active", "airplanemode_active", "E195") }
    override val airplanemodeInactive: IMaterialIcon by lazy { MaterialIcon("airplanemode inactive", "airplanemode_inactive", "E194") }
    override val batteryAlert: IMaterialIcon by lazy { MaterialIcon("battery alert", "battery_alert", "E19C") }
    override val batteryChargingFull: IMaterialIcon by lazy { MaterialIcon("battery charging full", "battery_charging_full", "E1A3") }
    override val batteryFull: IMaterialIcon by lazy { MaterialIcon("battery full", "battery_full", "E1A4") }
    override val batteryStd: IMaterialIcon by lazy { MaterialIcon("battery std", "battery_std", "E1A5") }
    override val batteryUnknown: IMaterialIcon by lazy { MaterialIcon("battery unknown", "battery_unknown", "E1A6") }
    override val bluetooth: IMaterialIcon by lazy { MaterialIcon("bluetooth", "bluetooth", "E1A7") }
    override val bluetoothConnected: IMaterialIcon by lazy { MaterialIcon("bluetooth connected", "bluetooth_connected", "E1A8") }
    override val bluetoothDisabled: IMaterialIcon by lazy { MaterialIcon("bluetooth disabled", "bluetooth_disabled", "E1A9") }
    override val bluetoothSearching: IMaterialIcon by lazy { MaterialIcon("bluetooth searching", "bluetooth_searching", "E1AA") }
    override val brightnessAuto: IMaterialIcon by lazy { MaterialIcon("brightness auto", "brightness_auto", "E1AB") }
    override val brightnessHigh: IMaterialIcon by lazy { MaterialIcon("brightness high", "brightness_high", "E1AC") }
    override val brightnessLow: IMaterialIcon by lazy { MaterialIcon("brightness low", "brightness_low", "E1AD") }
    override val brightnessMedium: IMaterialIcon by lazy { MaterialIcon("brightness medium", "brightness_medium", "E1AE") }
    override val dataUsage: IMaterialIcon by lazy { MaterialIcon("data usage", "data_usage", "E1AF") }
    override val developerMode: IMaterialIcon by lazy { MaterialIcon("developer mode", "developer_mode", "E1B0") }
    override val devices: IMaterialIcon by lazy { MaterialIcon("devices", "devices", "E1B1") }
    override val dvr: IMaterialIcon by lazy { MaterialIcon("dvr", "dvr", "E1B2") }
    override val gpsFixed: IMaterialIcon by lazy { MaterialIcon("gps fixed", "gps_fixed", "E1B3") }
    override val gpsNotFixed: IMaterialIcon by lazy { MaterialIcon("gps not fixed", "gps_not_fixed", "E1B4") }
    override val gpsOff: IMaterialIcon by lazy { MaterialIcon("gps off", "gps_off", "E1B5") }
    override val graphicEq: IMaterialIcon by lazy { MaterialIcon("graphic eq", "graphic_eq", "E1B8") }
    override val locationDisabled: IMaterialIcon by lazy { MaterialIcon("location disabled", "location_disabled", "E1B6") }
    override val locationSearching: IMaterialIcon by lazy { MaterialIcon("location searching", "location_searching", "E1B7") }
    override val networkCell: IMaterialIcon by lazy { MaterialIcon("network cell", "network_cell", "E1B9") }
    override val networkWifi: IMaterialIcon by lazy { MaterialIcon("network wifi", "network_wifi", "E1BA") }
    override val nfc: IMaterialIcon by lazy { MaterialIcon("nfc", "nfc", "E1BB") }
    override val screenLockLandscape: IMaterialIcon by lazy { MaterialIcon("screen lock landscape", "screen_lock_landscape", "E1BE") }
    override val screenLockPortrait: IMaterialIcon by lazy { MaterialIcon("screen lock portrait", "screen_lock_portrait", "E1BF") }
    override val screenLockRotation: IMaterialIcon by lazy { MaterialIcon("screen lock rotation", "screen_lock_rotation", "E1C0") }
    override val screenRotation: IMaterialIcon by lazy { MaterialIcon("screen rotation", "screen_rotation", "E1C1") }
    override val sdStorage: IMaterialIcon by lazy { MaterialIcon("sd storage", "sd_storage", "E1C2") }
    override val settingsSystemDaydream: IMaterialIcon by lazy { MaterialIcon("settings system daydream", "settings_system_daydream", "E1C3") }
    override val signalCellular4Bar: IMaterialIcon by lazy { MaterialIcon("signal cellular 4 bar", "signal_cellular_4_bar", "E1C8") }
    override val signalCellularConnectedNoInternet4Bar: IMaterialIcon by lazy { MaterialIcon("signal cellular connected no internet 4 bar", "signal_cellular_connected_no_internet_4_bar", "E1CD") }
    override val signalCellularNoSim: IMaterialIcon by lazy { MaterialIcon("signal cellular no sim", "signal_cellular_no_sim", "E1CE") }
    override val signalCellularNull: IMaterialIcon by lazy { MaterialIcon("signal cellular null", "signal_cellular_null", "E1CF") }
    override val signalCellularOff: IMaterialIcon by lazy { MaterialIcon("signal cellular off", "signal_cellular_off", "E1D0") }
    override val signalWifi4Bar: IMaterialIcon by lazy { MaterialIcon("signal wifi 4 bar", "signal_wifi_4_bar", "E1D8") }
    override val signalWifi4BarLock: IMaterialIcon by lazy { MaterialIcon("signal wifi 4 bar lock", "signal_wifi_4_bar_lock", "E1D9") }
    override val signalWifiOff: IMaterialIcon by lazy { MaterialIcon("signal wifi off", "signal_wifi_off", "E1DA") }
    override val storage: IMaterialIcon by lazy { MaterialIcon("storage", "storage", "E1DB") }
    override val usb: IMaterialIcon by lazy { MaterialIcon("usb", "usb", "E1E0") }
    override val wallpaper: IMaterialIcon by lazy { MaterialIcon("wallpaper", "wallpaper", "E1BC") }
    override val widgets: IMaterialIcon by lazy { MaterialIcon("widgets", "widgets", "E1BD") }
    override val wifiLock: IMaterialIcon by lazy { MaterialIcon("wifi lock", "wifi_lock", "E1E1") }
    override val wifiTethering: IMaterialIcon by lazy { MaterialIcon("wifi tethering", "wifi_tethering", "E1E2") }
    //endregion

    // region Editor
    override val attachFile: IMaterialIcon by lazy { MaterialIcon("attach file", "attach_file", "E226") }
    override val attachMoney: IMaterialIcon by lazy { MaterialIcon("attach money", "attach_money", "E227") }
    override val borderAll: IMaterialIcon by lazy { MaterialIcon("border all", "border_all", "E228") }
    override val borderBottom: IMaterialIcon by lazy { MaterialIcon("border bottom", "border_bottom", "E229") }
    override val borderClear: IMaterialIcon by lazy { MaterialIcon("border clear", "border_clear", "E22A") }
    override val borderColor: IMaterialIcon by lazy { MaterialIcon("border color", "border_color", "E22B") }
    override val borderHorizontal: IMaterialIcon by lazy { MaterialIcon("border horizontal", "border_horizontal", "E22C") }
    override val borderInner: IMaterialIcon by lazy { MaterialIcon("border inner", "border_inner", "E22D") }
    override val borderLeft: IMaterialIcon by lazy { MaterialIcon("border left", "border_left", "E22E") }
    override val borderOuter: IMaterialIcon by lazy { MaterialIcon("border outer", "border_outer", "E22F") }
    override val borderRight: IMaterialIcon by lazy { MaterialIcon("border right", "border_right", "E230") }
    override val borderStyle: IMaterialIcon by lazy { MaterialIcon("border style", "border_style", "E231") }
    override val borderTop: IMaterialIcon by lazy { MaterialIcon("border top", "border_top", "E232") }
    override val borderVertical: IMaterialIcon by lazy { MaterialIcon("border vertical", "border_vertical", "E233") }
    override val dragHandle: IMaterialIcon by lazy { MaterialIcon("drag handle", "drag_handle", "E25D") }
    override val formatAlignCenter: IMaterialIcon by lazy { MaterialIcon("format align center", "format_align_center", "E234") }
    override val formatAlignJustify: IMaterialIcon by lazy { MaterialIcon("format align justify", "format_align_justify", "E235") }
    override val formatAlignLeft: IMaterialIcon by lazy { MaterialIcon("format align left", "format_align_left", "E236") }
    override val formatAlignRight: IMaterialIcon by lazy { MaterialIcon("format align right", "format_align_right", "E237") }
    override val formatBold: IMaterialIcon by lazy { MaterialIcon("format bold", "format_bold", "E238") }
    override val formatClear: IMaterialIcon by lazy { MaterialIcon("format clear", "format_clear", "E239") }
    override val formatColorFill: IMaterialIcon by lazy { MaterialIcon("format color fill", "format_color_fill", "E23A") }
    override val formatColorReset: IMaterialIcon by lazy { MaterialIcon("format color reset", "format_color_reset", "E23B") }
    override val formatColorText: IMaterialIcon by lazy { MaterialIcon("format color text", "format_color_text", "E23C") }
    override val formatIndentDecrease: IMaterialIcon by lazy { MaterialIcon("format indent decrease", "format_indent_decrease", "E23D") }
    override val formatIndentIncrease: IMaterialIcon by lazy { MaterialIcon("format indent increase", "format_indent_increase", "E23E") }
    override val formatItalic: IMaterialIcon by lazy { MaterialIcon("format italic", "format_italic", "E23F") }
    override val formatLineSpacing: IMaterialIcon by lazy { MaterialIcon("format line spacing", "format_line_spacing", "E240") }
    override val formatListBulleted: IMaterialIcon by lazy { MaterialIcon("format list bulleted", "format_list_bulleted", "E241") }
    override val formatListNumbered: IMaterialIcon by lazy { MaterialIcon("format list numbered", "format_list_numbered", "E242") }
    override val formatPaint: IMaterialIcon by lazy { MaterialIcon("format paint", "format_paint", "E243") }
    override val formatQuote: IMaterialIcon by lazy { MaterialIcon("format quote", "format_quote", "E244") }
    override val formatShapes: IMaterialIcon by lazy { MaterialIcon("format shapes", "format_shapes", "E25E") }
    override val formatSize: IMaterialIcon by lazy { MaterialIcon("format size", "format_size", "E245") }
    override val formatStrikethrough: IMaterialIcon by lazy { MaterialIcon("format strikethrough", "format_strikethrough", "E246") }
    override val formatTextdirectionLToR: IMaterialIcon by lazy { MaterialIcon("format textdirection l to r", "format_textdirection_l_to_r", "E247") }
    override val formatTextdirectionRToL: IMaterialIcon by lazy { MaterialIcon("format textdirection r to l", "format_textdirection_r_to_l", "E248") }
    override val formatUnderlined: IMaterialIcon by lazy { MaterialIcon("format underlined", "format_underlined", "E249") }
    override val functions: IMaterialIcon by lazy { MaterialIcon("functions", "functions", "E24A") }
    override val highlight: IMaterialIcon by lazy { MaterialIcon("highlight", "highlight", "E25F") }
    override val insertChart: IMaterialIcon by lazy { MaterialIcon("insert chart", "insert_chart", "E24B") }
    override val insertComment: IMaterialIcon by lazy { MaterialIcon("insert comment", "insert_comment", "E24C") }
    override val insertDriveFile: IMaterialIcon by lazy { MaterialIcon("insert drive file", "insert_drive_file", "E24D") }
    override val insertEmoticon: IMaterialIcon by lazy { MaterialIcon("insert emoticon", "insert_emoticon", "E24E") }
    override val insertInvitation: IMaterialIcon by lazy { MaterialIcon("insert invitation", "insert_invitation", "E24F") }
    override val insertLink: IMaterialIcon by lazy { MaterialIcon("insert link", "insert_link", "E250") }
    override val insertPhoto: IMaterialIcon by lazy { MaterialIcon("insert photo", "insert_photo", "E251") }
    override val linearScale: IMaterialIcon by lazy { MaterialIcon("linear scale", "linear_scale", "E260") }
    override val mergeType: IMaterialIcon by lazy { MaterialIcon("merge type", "merge_type", "E252") }
    override val modeComment: IMaterialIcon by lazy { MaterialIcon("mode comment", "mode_comment", "E253") }
    override val modeEdit: IMaterialIcon by lazy { MaterialIcon("mode edit", "mode_edit", "E254") }
    override val moneyOff: IMaterialIcon by lazy { MaterialIcon("money off", "money_off", "E25C") }
    override val publish: IMaterialIcon by lazy { MaterialIcon("publish", "publish", "E255") }
    override val shortText: IMaterialIcon by lazy { MaterialIcon("short text", "short_text", "E261") }
    override val spaceBar: IMaterialIcon by lazy { MaterialIcon("space bar", "space_bar", "E256") }
    override val strikethroughS: IMaterialIcon by lazy { MaterialIcon("strikethrough s", "strikethrough_s", "E257") }
    override val textFields: IMaterialIcon by lazy { MaterialIcon("text fields", "text_fields", "E262") }
    override val verticalAlignBottom: IMaterialIcon by lazy { MaterialIcon("vertical align bottom", "vertical_align_bottom", "E258") }
    override val verticalAlignCenter: IMaterialIcon by lazy { MaterialIcon("vertical align center", "vertical_align_center", "E259") }
    override val verticalAlignTop: IMaterialIcon by lazy { MaterialIcon("vertical align top", "vertical_align_top", "E25A") }
    override val wrapText: IMaterialIcon by lazy { MaterialIcon("wrap text", "wrap_text", "E25B") }
    //endregion

    // region File
    override val attachment: IMaterialIcon by lazy { MaterialIcon("attachment", "attachment", "E2BC") }
    override val cloud: IMaterialIcon by lazy { MaterialIcon("cloud", "cloud", "E2BD") }
    override val cloudCircle: IMaterialIcon by lazy { MaterialIcon("cloud circle", "cloud_circle", "E2BE") }
    override val cloudDone: IMaterialIcon by lazy { MaterialIcon("cloud done", "cloud_done", "E2BF") }
    override val cloudDownload: IMaterialIcon by lazy { MaterialIcon("cloud download", "cloud_download", "E2C0") }
    override val cloudOff: IMaterialIcon by lazy { MaterialIcon("cloud off", "cloud_off", "E2C1") }
    override val cloudQueue: IMaterialIcon by lazy { MaterialIcon("cloud queue", "cloud_queue", "E2C2") }
    override val cloudUpload: IMaterialIcon by lazy { MaterialIcon("cloud upload", "cloud_upload", "E2C3") }
    override val createNewFolder: IMaterialIcon by lazy { MaterialIcon("create new folder", "create_new_folder", "E2CC") }
    override val fileDownload: IMaterialIcon by lazy { MaterialIcon("file download", "file_download", "E2C4") }
    override val fileUpload: IMaterialIcon by lazy { MaterialIcon("file upload", "file_upload", "E2C6") }
    override val folder: IMaterialIcon by lazy { MaterialIcon("folder", "folder", "E2C7") }
    override val folderOpen: IMaterialIcon by lazy { MaterialIcon("folder open", "folder_open", "E2C8") }
    override val folderShared: IMaterialIcon by lazy { MaterialIcon("folder shared", "folder_shared", "E2C9") }
    //endregion

    // region Hardware
    override val cast: IMaterialIcon by lazy { MaterialIcon("cast", "cast", "E307") }
    override val castConnected: IMaterialIcon by lazy { MaterialIcon("cast connected", "cast_connected", "E308") }
    override val computer: IMaterialIcon by lazy { MaterialIcon("computer", "computer", "E30A") }
    override val desktopMac: IMaterialIcon by lazy { MaterialIcon("desktop mac", "desktop_mac", "E30B") }
    override val desktopWindows: IMaterialIcon by lazy { MaterialIcon("desktop windows", "desktop_windows", "E30C") }
    override val developerBoard: IMaterialIcon by lazy { MaterialIcon("developer board", "developer_board", "E30D") }
    override val deviceHub: IMaterialIcon by lazy { MaterialIcon("device hub", "device_hub", "E335") }
    override val devicesOther: IMaterialIcon by lazy { MaterialIcon("devices other", "devices_other", "E337") }
    override val dock: IMaterialIcon by lazy { MaterialIcon("dock", "dock", "E30E") }
    override val gamepad: IMaterialIcon by lazy { MaterialIcon("gamepad", "gamepad", "E30F") }
    override val headset: IMaterialIcon by lazy { MaterialIcon("headset", "headset", "E310") }
    override val headsetMic: IMaterialIcon by lazy { MaterialIcon("headset mic", "headset_mic", "E311") }
    override val keyboard: IMaterialIcon by lazy { MaterialIcon("keyboard", "keyboard", "E312") }
    override val keyboardArrowDown: IMaterialIcon by lazy { MaterialIcon("keyboard arrow down", "keyboard_arrow_down", "E313") }
    override val keyboardArrowLeft: IMaterialIcon by lazy { MaterialIcon("keyboard arrow left", "keyboard_arrow_left", "E314") }
    override val keyboardArrowRight: IMaterialIcon by lazy { MaterialIcon("keyboard arrow right", "keyboard_arrow_right", "E315") }
    override val keyboardArrowUp: IMaterialIcon by lazy { MaterialIcon("keyboard arrow up", "keyboard_arrow_up", "E316") }
    override val keyboardBackspace: IMaterialIcon by lazy { MaterialIcon("keyboard backspace", "keyboard_backspace", "E317") }
    override val keyboardCapslock: IMaterialIcon by lazy { MaterialIcon("keyboard capslock", "keyboard_capslock", "E318") }
    override val keyboardHide: IMaterialIcon by lazy { MaterialIcon("keyboard hide", "keyboard_hide", "E31A") }
    override val keyboardReturn: IMaterialIcon by lazy { MaterialIcon("keyboard return", "keyboard_return", "E31B") }
    override val keyboardTab: IMaterialIcon by lazy { MaterialIcon("keyboard tab", "keyboard_tab", "E31C") }
    override val keyboardVoice: IMaterialIcon by lazy { MaterialIcon("keyboard voice", "keyboard_voice", "E31D") }
    override val laptop: IMaterialIcon by lazy { MaterialIcon("laptop", "laptop", "E31E") }
    override val laptopChromebook: IMaterialIcon by lazy { MaterialIcon("laptop chromebook", "laptop_chromebook", "E31F") }
    override val laptopMac: IMaterialIcon by lazy { MaterialIcon("laptop mac", "laptop_mac", "E320") }
    override val laptopWindows: IMaterialIcon by lazy { MaterialIcon("laptop windows", "laptop_windows", "E321") }
    override val memory: IMaterialIcon by lazy { MaterialIcon("memory", "memory", "E322") }
    override val mouse: IMaterialIcon by lazy { MaterialIcon("mouse", "mouse", "E323") }
    override val phoneAndroid: IMaterialIcon by lazy { MaterialIcon("phone android", "phone_android", "E324") }
    override val phoneIphone: IMaterialIcon by lazy { MaterialIcon("phone iphone", "phone_iphone", "E325") }
    override val phonelink: IMaterialIcon by lazy { MaterialIcon("phonelink", "phonelink", "E326") }
    override val phonelinkOff: IMaterialIcon by lazy { MaterialIcon("phonelink off", "phonelink_off", "E327") }
    override val powerInput: IMaterialIcon by lazy { MaterialIcon("power input", "power_input", "E336") }
    override val router: IMaterialIcon by lazy { MaterialIcon("router", "router", "E328") }
    override val scanner: IMaterialIcon by lazy { MaterialIcon("scanner", "scanner", "E329") }
    override val security: IMaterialIcon by lazy { MaterialIcon("security", "security", "E32A") }
    override val simCard: IMaterialIcon by lazy { MaterialIcon("sim card", "sim_card", "E32B") }
    override val smartphone: IMaterialIcon by lazy { MaterialIcon("smartphone", "smartphone", "E32C") }
    override val speaker: IMaterialIcon by lazy { MaterialIcon("speaker", "speaker", "E32D") }
    override val speakerGroup: IMaterialIcon by lazy { MaterialIcon("speaker group", "speaker_group", "E32E") }
    override val tablet: IMaterialIcon by lazy { MaterialIcon("tablet", "tablet", "E32F") }
    override val tabletAndroid: IMaterialIcon by lazy { MaterialIcon("tablet android", "tablet_android", "E330") }
    override val tabletMac: IMaterialIcon by lazy { MaterialIcon("tablet mac", "tablet_mac", "E331") }
    override val toys: IMaterialIcon by lazy { MaterialIcon("toys", "toys", "E332") }
    override val tv: IMaterialIcon by lazy { MaterialIcon("tv", "tv", "E333") }
    override val videogameAsset: IMaterialIcon by lazy { MaterialIcon("videogame asset", "videogame_asset", "E338") }
    override val watch: IMaterialIcon by lazy { MaterialIcon("watch", "watch", "E334") }
    //endregion

    // region Image
    override val addAPhoto: IMaterialIcon by lazy { MaterialIcon("add a photo", "add_a_photo", "E439") }
    override val addToPhotos: IMaterialIcon by lazy { MaterialIcon("add to photos", "add_to_photos", "E39D") }
    override val adjust: IMaterialIcon by lazy { MaterialIcon("adjust", "adjust", "E39E") }
    override val assistant: IMaterialIcon by lazy { MaterialIcon("assistant", "assistant", "E39F") }
    override val assistantPhoto: IMaterialIcon by lazy { MaterialIcon("assistant photo", "assistant_photo", "E3A0") }
    override val audiotrack: IMaterialIcon by lazy { MaterialIcon("audiotrack", "audiotrack", "E3A1") }
    override val blurCircular: IMaterialIcon by lazy { MaterialIcon("blur circular", "blur_circular", "E3A2") }
    override val blurLinear: IMaterialIcon by lazy { MaterialIcon("blur linear", "blur_linear", "E3A3") }
    override val blurOff: IMaterialIcon by lazy { MaterialIcon("blur off", "blur_off", "E3A4") }
    override val blurOn: IMaterialIcon by lazy { MaterialIcon("blur on", "blur_on", "E3A5") }
    override val brightness1: IMaterialIcon by lazy { MaterialIcon("brightness 1", "brightness_1", "E3A6") }
    override val brightness2: IMaterialIcon by lazy { MaterialIcon("brightness 2", "brightness_2", "E3A7") }
    override val brightness3: IMaterialIcon by lazy { MaterialIcon("brightness 3", "brightness_3", "E3A8") }
    override val brightness4: IMaterialIcon by lazy { MaterialIcon("brightness 4", "brightness_4", "E3A9") }
    override val brightness5: IMaterialIcon by lazy { MaterialIcon("brightness 5", "brightness_5", "E3AA") }
    override val brightness6: IMaterialIcon by lazy { MaterialIcon("brightness 6", "brightness_6", "E3AB") }
    override val brightness7: IMaterialIcon by lazy { MaterialIcon("brightness 7", "brightness_7", "E3AC") }
    override val brokenImage: IMaterialIcon by lazy { MaterialIcon("broken image", "broken_image", "E3AD") }
    override val brush: IMaterialIcon by lazy { MaterialIcon("brush", "brush", "E3AE") }
    override val camera: IMaterialIcon by lazy { MaterialIcon("camera", "camera", "E3AF") }
    override val cameraAlt: IMaterialIcon by lazy { MaterialIcon("camera alt", "camera_alt", "E3B0") }
    override val cameraFront: IMaterialIcon by lazy { MaterialIcon("camera front", "camera_front", "E3B1") }
    override val cameraRear: IMaterialIcon by lazy { MaterialIcon("camera rear", "camera_rear", "E3B2") }
    override val cameraRoll: IMaterialIcon by lazy { MaterialIcon("camera roll", "camera_roll", "E3B3") }
    override val centerFocusStrong: IMaterialIcon by lazy { MaterialIcon("center focus strong", "center_focus_strong", "E3B4") }
    override val centerFocusWeak: IMaterialIcon by lazy { MaterialIcon("center focus weak", "center_focus_weak", "E3B5") }
    override val collections: IMaterialIcon by lazy { MaterialIcon("collections", "collections", "E3B6") }
    override val collectionsBookmark: IMaterialIcon by lazy { MaterialIcon("collections bookmark", "collections_bookmark", "E431") }
    override val colorLens: IMaterialIcon by lazy { MaterialIcon("color lens", "color_lens", "E3B7") }
    override val colorize: IMaterialIcon by lazy { MaterialIcon("colorize", "colorize", "E3B8") }
    override val compare: IMaterialIcon by lazy { MaterialIcon("compare", "compare", "E3B9") }
    override val controlPoint: IMaterialIcon by lazy { MaterialIcon("control point", "control_point", "E3BA") }
    override val controlPointDuplicate: IMaterialIcon by lazy { MaterialIcon("control point duplicate", "control_point_duplicate", "E3BB") }
    override val crop: IMaterialIcon by lazy { MaterialIcon("crop", "crop", "E3BE") }
    override val crop16_9: IMaterialIcon by lazy { MaterialIcon("crop 16 9", "crop_16_9", "E3BC") }
    override val crop3_2: IMaterialIcon by lazy { MaterialIcon("crop 3 2", "crop_3_2", "E3BD") }
    override val crop5_4: IMaterialIcon by lazy { MaterialIcon("crop 5 4", "crop_5_4", "E3BF") }
    override val crop7_5: IMaterialIcon by lazy { MaterialIcon("crop 7 5", "crop_7_5", "E3C0") }
    override val cropDin: IMaterialIcon by lazy { MaterialIcon("crop din", "crop_din", "E3C1") }
    override val cropFree: IMaterialIcon by lazy { MaterialIcon("crop free", "crop_free", "E3C2") }
    override val cropLandscape: IMaterialIcon by lazy { MaterialIcon("crop landscape", "crop_landscape", "E3C3") }
    override val cropOriginal: IMaterialIcon by lazy { MaterialIcon("crop original", "crop_original", "E3C4") }
    override val cropPortrait: IMaterialIcon by lazy { MaterialIcon("crop portrait", "crop_portrait", "E3C5") }
    override val cropRotate: IMaterialIcon by lazy { MaterialIcon("crop rotate", "crop_rotate", "E437") }
    override val cropSquare: IMaterialIcon by lazy { MaterialIcon("crop square", "crop_square", "E3C6") }
    override val dehaze: IMaterialIcon by lazy { MaterialIcon("dehaze", "dehaze", "E3C7") }
    override val details: IMaterialIcon by lazy { MaterialIcon("details", "details", "E3C8") }
    override val edit: IMaterialIcon by lazy { MaterialIcon("edit", "edit", "E3C9") }
    override val exposure: IMaterialIcon by lazy { MaterialIcon("exposure", "exposure", "E3CA") }
    override val exposureNeg1: IMaterialIcon by lazy { MaterialIcon("exposure neg 1", "exposure_neg_1", "E3CB") }
    override val exposureNeg2: IMaterialIcon by lazy { MaterialIcon("exposure neg 2", "exposure_neg_2", "E3CC") }
    override val exposurePlus1: IMaterialIcon by lazy { MaterialIcon("exposure plus 1", "exposure_plus_1", "E3CD") }
    override val exposurePlus2: IMaterialIcon by lazy { MaterialIcon("exposure plus 2", "exposure_plus_2", "E3CE") }
    override val exposureZero: IMaterialIcon by lazy { MaterialIcon("exposure zero", "exposure_zero", "E3CF") }
    override val filter: IMaterialIcon by lazy { MaterialIcon("filter", "filter", "E3D3") }
    override val filter1: IMaterialIcon by lazy { MaterialIcon("filter 1", "filter_1", "E3D0") }
    override val filter2: IMaterialIcon by lazy { MaterialIcon("filter 2", "filter_2", "E3D1") }
    override val filter3: IMaterialIcon by lazy { MaterialIcon("filter 3", "filter_3", "E3D2") }
    override val filter4: IMaterialIcon by lazy { MaterialIcon("filter 4", "filter_4", "E3D4") }
    override val filter5: IMaterialIcon by lazy { MaterialIcon("filter 5", "filter_5", "E3D5") }
    override val filter6: IMaterialIcon by lazy { MaterialIcon("filter 6", "filter_6", "E3D6") }
    override val filter7: IMaterialIcon by lazy { MaterialIcon("filter 7", "filter_7", "E3D7") }
    override val filter8: IMaterialIcon by lazy { MaterialIcon("filter 8", "filter_8", "E3D8") }
    override val filter9: IMaterialIcon by lazy { MaterialIcon("filter 9", "filter_9", "E3D9") }
    override val filter9Plus: IMaterialIcon by lazy { MaterialIcon("filter 9 plus", "filter_9_plus", "E3DA") }
    override val filterBAndW: IMaterialIcon by lazy { MaterialIcon("filter b and w", "filter_b_and_w", "E3DB") }
    override val filterCenterFocus: IMaterialIcon by lazy { MaterialIcon("filter center focus", "filter_center_focus", "E3DC") }
    override val filterDrama: IMaterialIcon by lazy { MaterialIcon("filter drama", "filter_drama", "E3DD") }
    override val filterFrames: IMaterialIcon by lazy { MaterialIcon("filter frames", "filter_frames", "E3DE") }
    override val filterHdr: IMaterialIcon by lazy { MaterialIcon("filter hdr", "filter_hdr", "E3DF") }
    override val filterNone: IMaterialIcon by lazy { MaterialIcon("filter none", "filter_none", "E3E0") }
    override val filterTiltShift: IMaterialIcon by lazy { MaterialIcon("filter tilt shift", "filter_tilt_shift", "E3E2") }
    override val filterVintage: IMaterialIcon by lazy { MaterialIcon("filter vintage", "filter_vintage", "E3E3") }
    override val flare: IMaterialIcon by lazy { MaterialIcon("flare", "flare", "E3E4") }
    override val flashAuto: IMaterialIcon by lazy { MaterialIcon("flash auto", "flash_auto", "E3E5") }
    override val flashOff: IMaterialIcon by lazy { MaterialIcon("flash off", "flash_off", "E3E6") }
    override val flashOn: IMaterialIcon by lazy { MaterialIcon("flash on", "flash_on", "E3E7") }
    override val flip: IMaterialIcon by lazy { MaterialIcon("flip", "flip", "E3E8") }
    override val gradient: IMaterialIcon by lazy { MaterialIcon("gradient", "gradient", "E3E9") }
    override val grain: IMaterialIcon by lazy { MaterialIcon("grain", "grain", "E3EA") }
    override val gridOff: IMaterialIcon by lazy { MaterialIcon("grid off", "grid_off", "E3EB") }
    override val gridOn: IMaterialIcon by lazy { MaterialIcon("grid on", "grid_on", "E3EC") }
    override val hdrOff: IMaterialIcon by lazy { MaterialIcon("hdr off", "hdr_off", "E3ED") }
    override val hdrOn: IMaterialIcon by lazy { MaterialIcon("hdr on", "hdr_on", "E3EE") }
    override val hdrStrong: IMaterialIcon by lazy { MaterialIcon("hdr strong", "hdr_strong", "E3F1") }
    override val hdrWeak: IMaterialIcon by lazy { MaterialIcon("hdr weak", "hdr_weak", "E3F2") }
    override val healing: IMaterialIcon by lazy { MaterialIcon("healing", "healing", "E3F3") }
    override val image: IMaterialIcon by lazy { MaterialIcon("image", "image", "E3F4") }
    override val imageAspectRatio: IMaterialIcon by lazy { MaterialIcon("image aspect ratio", "image_aspect_ratio", "E3F5") }
    override val iso: IMaterialIcon by lazy { MaterialIcon("iso", "iso", "E3F6") }
    override val landscape: IMaterialIcon by lazy { MaterialIcon("landscape", "landscape", "E3F7") }
    override val leakAdd: IMaterialIcon by lazy { MaterialIcon("leak add", "leak_add", "E3F8") }
    override val leakRemove: IMaterialIcon by lazy { MaterialIcon("leak remove", "leak_remove", "E3F9") }
    override val lens: IMaterialIcon by lazy { MaterialIcon("lens", "lens", "E3FA") }
    override val linkedCamera: IMaterialIcon by lazy { MaterialIcon("linked camera", "linked_camera", "E438") }
    override val looks: IMaterialIcon by lazy { MaterialIcon("looks", "looks", "E3FC") }
    override val looks3: IMaterialIcon by lazy { MaterialIcon("looks 3", "looks_3", "E3FB") }
    override val looks4: IMaterialIcon by lazy { MaterialIcon("looks 4", "looks_4", "E3FD") }
    override val looks5: IMaterialIcon by lazy { MaterialIcon("looks 5", "looks_5", "E3FE") }
    override val looks6: IMaterialIcon by lazy { MaterialIcon("looks 6", "looks_6", "E3FF") }
    override val looksOne: IMaterialIcon by lazy { MaterialIcon("looks one", "looks_one", "E400") }
    override val looksTwo: IMaterialIcon by lazy { MaterialIcon("looks two", "looks_two", "E401") }
    override val loupe: IMaterialIcon by lazy { MaterialIcon("loupe", "loupe", "E402") }
    override val monochromePhotos: IMaterialIcon by lazy { MaterialIcon("monochrome photos", "monochrome_photos", "E403") }
    override val movieCreation: IMaterialIcon by lazy { MaterialIcon("movie creation", "movie_creation", "E404") }
    override val movieFilter: IMaterialIcon by lazy { MaterialIcon("movie filter", "movie_filter", "E43A") }
    override val musicNote: IMaterialIcon by lazy { MaterialIcon("music note", "music_note", "E405") }
    override val nature: IMaterialIcon by lazy { MaterialIcon("nature", "nature", "E406") }
    override val naturePeople: IMaterialIcon by lazy { MaterialIcon("nature people", "nature_people", "E407") }
    override val navigateBefore: IMaterialIcon by lazy { MaterialIcon("navigate before", "navigate_before", "E408") }
    override val navigateNext: IMaterialIcon by lazy { MaterialIcon("navigate next", "navigate_next", "E409") }
    override val palette: IMaterialIcon by lazy { MaterialIcon("palette", "palette", "E40A") }
    override val panorama: IMaterialIcon by lazy { MaterialIcon("panorama", "panorama", "E40B") }
    override val panoramaFishEye: IMaterialIcon by lazy { MaterialIcon("panorama fish eye", "panorama_fish_eye", "E40C") }
    override val panoramaHorizontal: IMaterialIcon by lazy { MaterialIcon("panorama horizontal", "panorama_horizontal", "E40D") }
    override val panoramaVertical: IMaterialIcon by lazy { MaterialIcon("panorama vertical", "panorama_vertical", "E40E") }
    override val panoramaWideAngle: IMaterialIcon by lazy { MaterialIcon("panorama wide angle", "panorama_wide_angle", "E40F") }
    override val photo: IMaterialIcon by lazy { MaterialIcon("photo", "photo", "E410") }
    override val photoAlbum: IMaterialIcon by lazy { MaterialIcon("photo album", "photo_album", "E411") }
    override val photoCamera: IMaterialIcon by lazy { MaterialIcon("photo camera", "photo_camera", "E412") }
    override val photoFilter: IMaterialIcon by lazy { MaterialIcon("photo filter", "photo_filter", "E43B") }
    override val photoLibrary: IMaterialIcon by lazy { MaterialIcon("photo library", "photo_library", "E413") }
    override val photoSizeSelectActual: IMaterialIcon by lazy { MaterialIcon("photo size select actual", "photo_size_select_actual", "E432") }
    override val photoSizeSelectLarge: IMaterialIcon by lazy { MaterialIcon("photo size select large", "photo_size_select_large", "E433") }
    override val photoSizeSelectSmall: IMaterialIcon by lazy { MaterialIcon("photo size select small", "photo_size_select_small", "E434") }
    override val pictureAsPdf: IMaterialIcon by lazy { MaterialIcon("picture as pdf", "picture_as_pdf", "E415") }
    override val portrait: IMaterialIcon by lazy { MaterialIcon("portrait", "portrait", "E416") }
    override val removeRedEye: IMaterialIcon by lazy { MaterialIcon("remove red eye", "remove_red_eye", "E417") }
    override val rotate90DegreesCcw: IMaterialIcon by lazy { MaterialIcon("rotate 90 degrees ccw", "rotate_90_degrees_ccw", "E418") }
    override val rotateLeft: IMaterialIcon by lazy { MaterialIcon("rotate left", "rotate_left", "E419") }
    override val rotateRight: IMaterialIcon by lazy { MaterialIcon("rotate right", "rotate_right", "E41A") }
    override val slideshow: IMaterialIcon by lazy { MaterialIcon("slideshow", "slideshow", "E41B") }
    override val straighten: IMaterialIcon by lazy { MaterialIcon("straighten", "straighten", "E41C") }
    override val style: IMaterialIcon by lazy { MaterialIcon("style", "style", "E41D") }
    override val switchCamera: IMaterialIcon by lazy { MaterialIcon("switch camera", "switch_camera", "E41E") }
    override val switchVideo: IMaterialIcon by lazy { MaterialIcon("switch video", "switch_video", "E41F") }
    override val tagFaces: IMaterialIcon by lazy { MaterialIcon("tag faces", "tag_faces", "E420") }
    override val texture: IMaterialIcon by lazy { MaterialIcon("texture", "texture", "E421") }
    override val timelapse: IMaterialIcon by lazy { MaterialIcon("timelapse", "timelapse", "E422") }
    override val timer: IMaterialIcon by lazy { MaterialIcon("timer", "timer", "E425") }
    override val timer3: IMaterialIcon by lazy { MaterialIcon("timer 3", "timer_3", "E424") }
    override val timer10: IMaterialIcon by lazy { MaterialIcon("timer 10", "timer_10", "E423") }
    override val timerOff: IMaterialIcon by lazy { MaterialIcon("timer off", "timer_off", "E426") }
    override val tonality: IMaterialIcon by lazy { MaterialIcon("tonality", "tonality", "E427") }
    override val transform: IMaterialIcon by lazy { MaterialIcon("transform", "transform", "E428") }
    override val tune: IMaterialIcon by lazy { MaterialIcon("tune", "tune", "E429") }
    override val viewComfy: IMaterialIcon by lazy { MaterialIcon("view comfy", "view_comfy", "E42A") }
    override val viewCompact: IMaterialIcon by lazy { MaterialIcon("view compact", "view_compact", "E42B") }
    override val vignette: IMaterialIcon by lazy { MaterialIcon("vignette", "vignette", "E435") }
    override val wbAuto: IMaterialIcon by lazy { MaterialIcon("wb auto", "wb_auto", "E42C") }
    override val wbCloudy: IMaterialIcon by lazy { MaterialIcon("wb cloudy", "wb_cloudy", "E42D") }
    override val wbIncandescent: IMaterialIcon by lazy { MaterialIcon("wb incandescent", "wb_incandescent", "E42E") }
    override val wbIridescent: IMaterialIcon by lazy { MaterialIcon("wb iridescent", "wb_iridescent", "E436") }
    override val wbSunny: IMaterialIcon by lazy { MaterialIcon("wb sunny", "wb_sunny", "E430") }
    //endregion

    // region Maps
    override val addLocation: IMaterialIcon by lazy { MaterialIcon("add location", "add_location", "E567") }
    override val beenhere: IMaterialIcon by lazy { MaterialIcon("beenhere", "beenhere", "E52D") }
    override val directions: IMaterialIcon by lazy { MaterialIcon("directions", "directions", "E52E") }
    override val directionsBike: IMaterialIcon by lazy { MaterialIcon("directions bike", "directions_bike", "E52F") }
    override val directionsBoat: IMaterialIcon by lazy { MaterialIcon("directions boat", "directions_boat", "E532") }
    override val directionsBus: IMaterialIcon by lazy { MaterialIcon("directions bus", "directions_bus", "E530") }
    override val directionsCar: IMaterialIcon by lazy { MaterialIcon("directions car", "directions_car", "E531") }
    override val directionsRailway: IMaterialIcon by lazy { MaterialIcon("directions railway", "directions_railway", "E534") }
    override val directionsRun: IMaterialIcon by lazy { MaterialIcon("directions run", "directions_run", "E566") }
    override val directionsSubway: IMaterialIcon by lazy { MaterialIcon("directions subway", "directions_subway", "E533") }
    override val directionsTransit: IMaterialIcon by lazy { MaterialIcon("directions transit", "directions_transit", "E535") }
    override val directionsWalk: IMaterialIcon by lazy { MaterialIcon("directions walk", "directions_walk", "E536") }
    override val editLocation: IMaterialIcon by lazy { MaterialIcon("edit location", "edit_location", "E568") }
    override val flight: IMaterialIcon by lazy { MaterialIcon("flight", "flight", "E539") }
    override val hotel: IMaterialIcon by lazy { MaterialIcon("hotel", "hotel", "E53A") }
    override val layers: IMaterialIcon by lazy { MaterialIcon("layers", "layers", "E53B") }
    override val layersClear: IMaterialIcon by lazy { MaterialIcon("layers clear", "layers_clear", "E53C") }
    override val localActivity: IMaterialIcon by lazy { MaterialIcon("local activity", "local_activity", "E53F") }
    override val localAirport: IMaterialIcon by lazy { MaterialIcon("local airport", "local_airport", "E53D") }
    override val localAtm: IMaterialIcon by lazy { MaterialIcon("local atm", "local_atm", "E53E") }
    override val localBar: IMaterialIcon by lazy { MaterialIcon("local bar", "local_bar", "E540") }
    override val localCafe: IMaterialIcon by lazy { MaterialIcon("local cafe", "local_cafe", "E541") }
    override val localCarWash: IMaterialIcon by lazy { MaterialIcon("local car wash", "local_car_wash", "E542") }
    override val localConvenienceStore: IMaterialIcon by lazy { MaterialIcon("local convenience store", "local_convenience_store", "E543") }
    override val localDining: IMaterialIcon by lazy { MaterialIcon("local dining", "local_dining", "E556") }
    override val localDrink: IMaterialIcon by lazy { MaterialIcon("local drink", "local_drink", "E544") }
    override val localFlorist: IMaterialIcon by lazy { MaterialIcon("local florist", "local_florist", "E545") }
    override val localGasStation: IMaterialIcon by lazy { MaterialIcon("local gas station", "local_gas_station", "E546") }
    override val localGroceryStore: IMaterialIcon by lazy { MaterialIcon("local grocery store", "local_grocery_store", "E547") }
    override val localHospital: IMaterialIcon by lazy { MaterialIcon("local hospital", "local_hospital", "E548") }
    override val localHotel: IMaterialIcon by lazy { MaterialIcon("local hotel", "local_hotel", "E549") }
    override val localLaundryService: IMaterialIcon by lazy { MaterialIcon("local laundry service", "local_laundry_service", "E54A") }
    override val localLibrary: IMaterialIcon by lazy { MaterialIcon("local library", "local_library", "E54B") }
    override val localMall: IMaterialIcon by lazy { MaterialIcon("local mall", "local_mall", "E54C") }
    override val localMovies: IMaterialIcon by lazy { MaterialIcon("local movies", "local_movies", "E54D") }
    override val localOffer: IMaterialIcon by lazy { MaterialIcon("local offer", "local_offer", "E54E") }
    override val localParking: IMaterialIcon by lazy { MaterialIcon("local parking", "local_parking", "E54F") }
    override val localPharmacy: IMaterialIcon by lazy { MaterialIcon("local pharmacy", "local_pharmacy", "E550") }
    override val localPhone: IMaterialIcon by lazy { MaterialIcon("local phone", "local_phone", "E551") }
    override val localPizza: IMaterialIcon by lazy { MaterialIcon("local pizza", "local_pizza", "E552") }
    override val localPlay: IMaterialIcon by lazy { MaterialIcon("local play", "local_play", "E553") }
    override val localPostOffice: IMaterialIcon by lazy { MaterialIcon("local post office", "local_post_office", "E554") }
    override val localPrintshop: IMaterialIcon by lazy { MaterialIcon("local printshop", "local_printshop", "E555") }
    override val localSee: IMaterialIcon by lazy { MaterialIcon("local see", "local_see", "E557") }
    override val localShipping: IMaterialIcon by lazy { MaterialIcon("local shipping", "local_shipping", "E558") }
    override val localTaxi: IMaterialIcon by lazy { MaterialIcon("local taxi", "local_taxi", "E559") }
    override val map: IMaterialIcon by lazy { MaterialIcon("map", "map", "E55B") }
    override val myLocation: IMaterialIcon by lazy { MaterialIcon("my location", "my_location", "E55C") }
    override val navigation: IMaterialIcon by lazy { MaterialIcon("navigation", "navigation", "E55D") }
    override val nearMe: IMaterialIcon by lazy { MaterialIcon("near me", "near_me", "E569") }
    override val personPin: IMaterialIcon by lazy { MaterialIcon("person pin", "person_pin", "E55A") }
    override val personPinCircle: IMaterialIcon by lazy { MaterialIcon("person pin circle", "person_pin_circle", "E56A") }
    override val pinDrop: IMaterialIcon by lazy { MaterialIcon("pin drop", "pin_drop", "E55E") }
    override val place: IMaterialIcon by lazy { MaterialIcon("place", "place", "E55F") }
    override val rateReview: IMaterialIcon by lazy { MaterialIcon("rate review", "rate_review", "E560") }
    override val restaurantMenu: IMaterialIcon by lazy { MaterialIcon("restaurant menu", "restaurant_menu", "E561") }
    override val satellite: IMaterialIcon by lazy { MaterialIcon("satellite", "satellite", "E562") }
    override val storeMallDirectory: IMaterialIcon by lazy { MaterialIcon("store mall directory", "store_mall_directory", "E563") }
    override val terrain: IMaterialIcon by lazy { MaterialIcon("terrain", "terrain", "E564") }
    override val traffic: IMaterialIcon by lazy { MaterialIcon("traffic", "traffic", "E565") }
    override val zoomOutMap: IMaterialIcon by lazy { MaterialIcon("zoom out map", "zoom_out_map", "E56B") }
    //endregion

    // region Navigation
    override val apps: IMaterialIcon by lazy { MaterialIcon("apps", "apps", "E5C3") }
    override val arrowBack: IMaterialIcon by lazy { MaterialIcon("arrow back", "arrow_back", "E5C4") }
    override val arrowDownward: IMaterialIcon by lazy { MaterialIcon("arrow downward", "arrow_downward", "E5DB") }
    override val arrowDropDown: IMaterialIcon by lazy { MaterialIcon("arrow drop down", "arrow_drop_down", "E5C5") }
    override val arrowDropDownCircle: IMaterialIcon by lazy { MaterialIcon("arrow drop down circle", "arrow_drop_down_circle", "E5C6") }
    override val arrowDropUp: IMaterialIcon by lazy { MaterialIcon("arrow drop up", "arrow_drop_up", "E5C7") }
    override val arrowForward: IMaterialIcon by lazy { MaterialIcon("arrow forward", "arrow_forward", "E5C8") }
    override val arrowUpward: IMaterialIcon by lazy { MaterialIcon("arrow upward", "arrow_upward", "E5D8") }
    override val cancel: IMaterialIcon by lazy { MaterialIcon("cancel", "cancel", "E5C9") }
    override val check: IMaterialIcon by lazy { MaterialIcon("check", "check", "E5CA") }
    override val chevronLeft: IMaterialIcon by lazy { MaterialIcon("chevron left", "chevron_left", "E5CB") }
    override val chevronRight: IMaterialIcon by lazy { MaterialIcon("chevron right", "chevron_right", "E5CC") }
    override val close: IMaterialIcon by lazy { MaterialIcon("close", "close", "E5CD") }
    override val expandLess: IMaterialIcon by lazy { MaterialIcon("expand less", "expand_less", "E5CE") }
    override val expandMore: IMaterialIcon by lazy { MaterialIcon("expand more", "expand_more", "E5CF") }
    override val fullscreen: IMaterialIcon by lazy { MaterialIcon("fullscreen", "fullscreen", "E5D0") }
    override val fullscreenExit: IMaterialIcon by lazy { MaterialIcon("fullscreen exit", "fullscreen_exit", "E5D1") }
    override val menu: IMaterialIcon by lazy { MaterialIcon("menu", "menu", "E5D2") }
    override val moreHorizontal: IMaterialIcon by lazy { MaterialIcon("more horiz", "more_horiz", "E5D3") }
    override val moreVertical: IMaterialIcon by lazy { MaterialIcon("more vert", "more_vert", "E5D4") }
    override val refresh: IMaterialIcon by lazy { MaterialIcon("refresh", "refresh", "E5D5") }
    override val subdirectoryArrowLeft: IMaterialIcon by lazy { MaterialIcon("subdirectory arrow left", "subdirectory_arrow_left", "E5D9") }
    override val subdirectoryArrowRight: IMaterialIcon by lazy { MaterialIcon("subdirectory arrow right", "subdirectory_arrow_right", "E5DA") }
    //endregion

    // region Notification
    override val adb: IMaterialIcon by lazy { MaterialIcon("adb", "adb", "E60E") }
    override val airlineSeatFlat: IMaterialIcon by lazy { MaterialIcon("airline seat flat", "airline_seat_flat", "E630") }
    override val airlineSeatFlatAngled: IMaterialIcon by lazy { MaterialIcon("airline seat flat angled", "airline_seat_flat_angled", "E631") }
    override val airlineSeatIndividualSuite: IMaterialIcon by lazy { MaterialIcon("airline seat individual suite", "airline_seat_individual_suite", "E632") }
    override val airlineSeatLegroomExtra: IMaterialIcon by lazy { MaterialIcon("airline seat legroom extra", "airline_seat_legroom_extra", "E633") }
    override val airlineSeatLegroomNormal: IMaterialIcon by lazy { MaterialIcon("airline seat legroom normal", "airline_seat_legroom_normal", "E634") }
    override val airlineSeatLegroomReduced: IMaterialIcon by lazy { MaterialIcon("airline seat legroom reduced", "airline_seat_legroom_reduced", "E635") }
    override val airlineSeatReclineExtra: IMaterialIcon by lazy { MaterialIcon("airline seat recline extra", "airline_seat_recline_extra", "E636") }
    override val airlineSeatReclineNormal: IMaterialIcon by lazy { MaterialIcon("airline seat recline normal", "airline_seat_recline_normal", "E637") }
    override val bluetoothAudio: IMaterialIcon by lazy { MaterialIcon("bluetooth audio", "bluetooth_audio", "E60F") }
    override val confirmationNumber: IMaterialIcon by lazy { MaterialIcon("confirmation number", "confirmation_number", "E638") }
    override val discFull: IMaterialIcon by lazy { MaterialIcon("disc full", "disc_full", "E610") }
    override val doNotDisturb: IMaterialIcon by lazy { MaterialIcon("do not disturb", "do_not_disturb", "E612") }
    override val doNotDisturbAlt: IMaterialIcon by lazy { MaterialIcon("do not disturb alt", "do_not_disturb_alt", "E611") }
    override val driveEta: IMaterialIcon by lazy { MaterialIcon("drive eta", "drive_eta", "E613") }
    override val enhancedEncryption: IMaterialIcon by lazy { MaterialIcon("enhanced encryption", "enhanced_encryption", "E63F") }
    override val eventAvailable: IMaterialIcon by lazy { MaterialIcon("event available", "event_available", "E614") }
    override val eventBusy: IMaterialIcon by lazy { MaterialIcon("event busy", "event_busy", "E615") }
    override val eventNote: IMaterialIcon by lazy { MaterialIcon("event note", "event_note", "E616") }
    override val folderSpecial: IMaterialIcon by lazy { MaterialIcon("folder special", "folder_special", "E617") }
    override val liveTv: IMaterialIcon by lazy { MaterialIcon("live tv", "live_tv", "E639") }
    override val mms: IMaterialIcon by lazy { MaterialIcon("mms", "mms", "E618") }
    override val more: IMaterialIcon by lazy { MaterialIcon("more", "more", "E619") }
    override val networkCheck: IMaterialIcon by lazy { MaterialIcon("network check", "network_check", "E640") }
    override val networkLocked: IMaterialIcon by lazy { MaterialIcon("network locked", "network_locked", "E61A") }
    override val noEncryption: IMaterialIcon by lazy { MaterialIcon("no encryption", "no_encryption", "E641") }
    override val ondemandVideo: IMaterialIcon by lazy { MaterialIcon("ondemand video", "ondemand_video", "E63A") }
    override val personalVideo: IMaterialIcon by lazy { MaterialIcon("personal video", "personal_video", "E63B") }
    override val phoneBluetoothSpeaker: IMaterialIcon by lazy { MaterialIcon("phone bluetooth speaker", "phone_bluetooth_speaker", "E61B") }
    override val phoneForwarded: IMaterialIcon by lazy { MaterialIcon("phone forwarded", "phone_forwarded", "E61C") }
    override val phoneInTalk: IMaterialIcon by lazy { MaterialIcon("phone in talk", "phone_in_talk", "E61D") }
    override val phoneLocked: IMaterialIcon by lazy { MaterialIcon("phone locked", "phone_locked", "E61E") }
    override val phoneMissed: IMaterialIcon by lazy { MaterialIcon("phone missed", "phone_missed", "E61F") }
    override val phonePaused: IMaterialIcon by lazy { MaterialIcon("phone paused", "phone_paused", "E620") }
    override val power: IMaterialIcon by lazy { MaterialIcon("power", "power", "E63C") }
    override val sdCard: IMaterialIcon by lazy { MaterialIcon("sd card", "sd_card", "E623") }
    override val simCardAlert: IMaterialIcon by lazy { MaterialIcon("sim card alert", "sim_card_alert", "E624") }
    override val sms: IMaterialIcon by lazy { MaterialIcon("sms", "sms", "E625") }
    override val smsFailed: IMaterialIcon by lazy { MaterialIcon("sms failed", "sms_failed", "E626") }
    override val sync: IMaterialIcon by lazy { MaterialIcon("sync", "sync", "E627") }
    override val syncDisabled: IMaterialIcon by lazy { MaterialIcon("sync disabled", "sync_disabled", "E628") }
    override val syncProblem: IMaterialIcon by lazy { MaterialIcon("sync problem", "sync_problem", "E629") }
    override val systemUpdate: IMaterialIcon by lazy { MaterialIcon("system update", "system_update", "E62A") }
    override val tapAndPlay: IMaterialIcon by lazy { MaterialIcon("tap and play", "tap_and_play", "E62B") }
    override val timeToLeave: IMaterialIcon by lazy { MaterialIcon("time to leave", "time_to_leave", "E62C") }
    override val vibration: IMaterialIcon by lazy { MaterialIcon("vibration", "vibration", "E62D") }
    override val voiceChat: IMaterialIcon by lazy { MaterialIcon("voice chat", "voice_chat", "E62E") }
    override val vpnLock: IMaterialIcon by lazy { MaterialIcon("vpn lock", "vpn_lock", "E62F") }
    override val wc: IMaterialIcon by lazy { MaterialIcon("wc", "wc", "E63D") }
    override val wifi: IMaterialIcon by lazy { MaterialIcon("wifi", "wifi", "E63E") }
    //endregion

    // region Places
    override val acUnit: IMaterialIcon by lazy { MaterialIcon("ac unit", "ac_unit", "EB3B") }
    override val airportShuttle: IMaterialIcon by lazy { MaterialIcon("airport shuttle", "airport_shuttle", "EB3C") }
    override val allInclusive: IMaterialIcon by lazy { MaterialIcon("all inclusive", "all_inclusive", "EB3D") }
    override val beachAccess: IMaterialIcon by lazy { MaterialIcon("beach access", "beach_access", "EB3E") }
    override val businessCenter: IMaterialIcon by lazy { MaterialIcon("business center", "business_center", "EB3F") }
    override val casino: IMaterialIcon by lazy { MaterialIcon("casino", "casino", "EB40") }
    override val childCare: IMaterialIcon by lazy { MaterialIcon("child care", "child_care", "EB41") }
    override val childFriendly: IMaterialIcon by lazy { MaterialIcon("child friendly", "child_friendly", "EB42") }
    override val fitnessCenter: IMaterialIcon by lazy { MaterialIcon("fitness center", "fitness_center", "EB43") }
    override val freeBreakfast: IMaterialIcon by lazy { MaterialIcon("free breakfast", "free_breakfast", "EB44") }
    override val golfCourse: IMaterialIcon by lazy { MaterialIcon("golf course", "golf_course", "EB45") }
    override val hotTub: IMaterialIcon by lazy { MaterialIcon("hot tub", "hot_tub", "EB46") }
    override val kitchen: IMaterialIcon by lazy { MaterialIcon("kitchen", "kitchen", "EB47") }
    override val pool: IMaterialIcon by lazy { MaterialIcon("pool", "pool", "EB48") }
    override val roomService: IMaterialIcon by lazy { MaterialIcon("room service", "room_service", "EB49") }
    override val rvHookup: IMaterialIcon by lazy { MaterialIcon("rv hookup", "rv_hookup", "E642") }
    override val smokeFree: IMaterialIcon by lazy { MaterialIcon("smoke free", "smoke_free", "EB4A") }
    override val smokingRooms: IMaterialIcon by lazy { MaterialIcon("smoking rooms", "smoking_rooms", "EB4B") }
    override val spa: IMaterialIcon by lazy { MaterialIcon("spa", "spa", "EB4C") }
    //endregion

    // region Social
    override val cake: IMaterialIcon by lazy { MaterialIcon("cake", "cake", "E7E9") }
    override val domain: IMaterialIcon by lazy { MaterialIcon("domain", "domain", "E7EE") }
    override val group: IMaterialIcon by lazy { MaterialIcon("group", "group", "E7EF") }
    override val groupAdd: IMaterialIcon by lazy { MaterialIcon("group add", "group_add", "E7F0") }
    override val locationCity: IMaterialIcon by lazy { MaterialIcon("location city", "location_city", "E7F1") }
    override val mood: IMaterialIcon by lazy { MaterialIcon("mood", "mood", "E7F2") }
    override val moodBad: IMaterialIcon by lazy { MaterialIcon("mood bad", "mood_bad", "E7F3") }
    override val notifications: IMaterialIcon by lazy { MaterialIcon("notifications", "notifications", "E7F4") }
    override val notificationsActive: IMaterialIcon by lazy { MaterialIcon("notifications active", "notifications_active", "E7F7") }
    override val notificationsNone: IMaterialIcon by lazy { MaterialIcon("notifications none", "notifications_none", "E7F5") }
    override val notificationsOff: IMaterialIcon by lazy { MaterialIcon("notifications off", "notifications_off", "E7F6") }
    override val notificationsPaused: IMaterialIcon by lazy { MaterialIcon("notifications paused", "notifications_paused", "E7F8") }
    override val pages: IMaterialIcon by lazy { MaterialIcon("pages", "pages", "E7F9") }
    override val partyMode: IMaterialIcon by lazy { MaterialIcon("party mode", "party_mode", "E7FA") }
    override val people: IMaterialIcon by lazy { MaterialIcon("people", "people", "E7FB") }
    override val peopleOutline: IMaterialIcon by lazy { MaterialIcon("people outline", "people_outline", "E7FC") }
    override val person: IMaterialIcon by lazy { MaterialIcon("person", "person", "E7FD") }
    override val personAdd: IMaterialIcon by lazy { MaterialIcon("person add", "person_add", "E7FE") }
    override val personOutline: IMaterialIcon by lazy { MaterialIcon("person outline", "person_outline", "E7FF") }
    override val plusOne: IMaterialIcon by lazy { MaterialIcon("plus one", "plus_one", "E800") }
    override val poll: IMaterialIcon by lazy { MaterialIcon("poll", "poll", "E801") }
    override val public: IMaterialIcon by lazy { MaterialIcon("public", "public", "E80B") }
    override val school: IMaterialIcon by lazy { MaterialIcon("school", "school", "E80C") }
    override val share: IMaterialIcon by lazy { MaterialIcon("share", "share", "E80D") }
    override val whatshot: IMaterialIcon by lazy { MaterialIcon("whatshot", "whatshot", "E80E") }
    //endregion

    // region Toggle
    override val checkBox: IMaterialIcon by lazy { MaterialIcon("check box", "check_box", "E834") }
    override val checkBoxOutlineBlank: IMaterialIcon by lazy { MaterialIcon("check box outline blank", "check_box_outline_blank", "E835") }
    override val indeterminateCheckBox: IMaterialIcon by lazy { MaterialIcon("indeterminate check box", "indeterminate_check_box", "E909") }
    override val radioButtonChecked: IMaterialIcon by lazy { MaterialIcon("radio button checked", "radio_button_checked", "E837") }
    override val radioButtonUnchecked: IMaterialIcon by lazy { MaterialIcon("radio button unchecked", "radio_button_unchecked", "E836") }
    override val star: IMaterialIcon by lazy { MaterialIcon("star", "star", "E838") }
    override val starBorder: IMaterialIcon by lazy { MaterialIcon("star border", "star_border", "E83A") }
    override val starHalf: IMaterialIcon by lazy { MaterialIcon("star half", "star_half", "E839") }
    //endregion
}
