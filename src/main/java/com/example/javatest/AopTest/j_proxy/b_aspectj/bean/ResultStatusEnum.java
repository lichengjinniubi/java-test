package com.example.javatest.AopTest.j_proxy.b_aspectj.bean;


/**
 * @author chengzhengzheng
 * @date 2019-05-30
 **/
public enum ResultStatusEnum {
    SUCCESS(200, "成功"),
    FAIL_PARAM_ERROR(401, "参数错误"),
    FAIL_EXCEPTION(402, "内部异常"),
    ENTER_ROOM_FAIL_USER_FULL(403, "进入房间失败，人数已达上限"),
    ENTER_ROOM_FAIL_NOTEXIST(404, "当前房间不存在"),
    FAIL_PROHIBITSPEAK(405, "你已被禁言"),
    FAIL_SPAM(406, ""),
    FAIL_KEEPALIVE_OUT(407, "网络异常，请稍后再试"),
    FAIL_NOTIN_ROOM(408, "不在该房间"),
    FAIL_NO_SEAT(409, "当前麦上人数已满，不能上麦哦"),
    BUSINESS_CURFEW(410, "当前时段已宵禁"),
    FAIL_NOTIN_QUEUE(411, "你已不再排麦队列，请重新申请"),
    GENERATE_KEY_ERROR(412, "声网key生成错误"),
    FAIL_IN_SEAT(413, "已经在座位上"),
    APPLY_QUEUE_FULL(416, "申请队列已满"),
    TEXT_RE_EDIT(417, "内容包含违规词汇，请重新编辑"),
    NOT_ON_SEAT(418, "不在座位上"),
    BEEN_BANNED(419, "已被禁言"),
    USER_BUSY(420, "已在申请队列里"),
    ROOM_ID_INVALID(421, "房间号无效"),
    INVITE_MIC_FAIL_NO_MASTER(430, "没有主持人暂时无法邀请好友"),
    CONFIRM_UP_MIC_REPEAT(431, "重复请求上麦"),
    ROOM_PERMISSION_MODE(435, "当前版本过低，请升级"),
    MASTER_LEAVE_SEAT(441, "房间无主持人,暂不支持申请连麦"),
    GRAP_SEAT_FAIL_NO_MASTER(442, "房间无主持人,暂不支持上麦"),
    FAIL_NOTIN_MASTER_QUEUE(443, "无主持权限，不可上麦"),
    GRAPE_FAIL_MASTER_LEAVE(445, "主持人离开，暂不支持申请"),
    ENTER_ROOM_FAIL_STOP(446, "视频交友已经结束"),
    FAIL_NOT_MASTER(447, "不是主持"),
    ROOM_STATUS_IS_WRONG(448, "当前房间状态无需更改"),
    ENTER_CANDIDATE_USER_STATUS_ERROR(449, "请上传头像"),
    NO_RIGHT(460, "无权限操作"),
    TEXT_NOT_CHANGE(463, "输入没有变化"),
    CHANGE_SERVER_TYPE(478, "切换运营商"),
    START_MARRY_NO_GIFT(479, "赠送\"{0}礼物\"或是\"{1}礼物\"才能绑定情侣"),
    START_MARRY_HAS_LOVER(480, "已经有情侣"),
    STOP_MARRY_NO_LOVER(481, "没有情侣"),
    MARRY_MUST_DIFFERENT_SEX(524, "绑定情侣必须是异性"),
    START_MARRY_SEAT_ERROR(482, "必须两个人才能绑定情侣哦"),
    STOP_MARRY_THREE_DAYS(483, "成为情侣超过7天后才能手动解除情侣关系"),
    OWNER_NOT_SELF_ROOM(484, "房主不可以直接进入自己房间"),
    ANGEL_HAS_PUB(485, "已经公布过天使了"),
    OPERATE_TOO_QUICK(486, "操作太频繁"),
    HAS_NOT_CLOSED_ROOM(487, "您还在断线重连期，暂不能创建其他房间，点击「{0}」房，可以回到原房间～"),
    PAYMENT_ROUND_REPEAT(488, "已经支付过了"),
    VIP_MODE_IS_FULL(489, "当前已有嘉宾上麦，暂无法进房～"),
    VIP_MODE_SEAT_HAS_ONE(490, "当前有嘉宾在麦，请先把当前嘉宾抱下麦再操作"),
    VIP_MODE_PREPARED_ERROR(491, "当前有嘉宾即将上麦，请稍等"),


    VIP_MODE_NOT_QUERY_UP_ERROR(491, "当前用户正在上麦无法邀请"),
    CHANGE_ROOM_MODE_ERROR(492, "当前只支持从三人房间切换到专属房间"),
    VIP_MODE_ENTER_ERROR(493, "专属房间只能是申请或者主持邀请进入"),
    VIP_ALREADY_IN_SEAT(494, "您已经在麦，暂无法申请"),
    VIP_PAY_START_FAIL(495, "不满足支付条件，无需支付"),
    ADD_SINGLE_FULL_ERROR(496, "当前%s的陪伴团数量已经达到上限了，暂时无法加入哦"),
    ONLY_PERMITE_INVITED_OR_APPLY(497, "必须通过申请或者邀请才能上麦哦!"),
    BALANCE_NOT_ENOUGH_TO_UP_MIC(498, "余额不足，无法上麦!"),
    OPERATION_PROHIBIT(499, "非法操作!"),
    GAME_IN_ACTION(500, "游戏中，不可离开"),
    GAME_STEP_ERROR(501, "游戏阶段不正确"),
    FLASHLIGHT_QUERY_UP_ERROR(502, "互选心动环节不支持抱人上麦"),
    CONFESS_QUERY_UP_ERROR(503, "浪漫告白环节不支持抱人上麦"),
    CONTINUE_GAME_NOT_SUIT(504, "需要两个嘉宾在麦才可以开始"),
    MOMENT_LEAVE(505, "暂时离开"),
    CHANGE_HEART_FRIEND_MODE_ERROR(506,"游戏进行中不可切换模板"),
    GRAPE_SEAT_CHANGE_MODE(507,"房间已切换模版，请重新申请上麦"),
    //固定写死的、android客户端bug
    ROOM_MODE_NOT_NEEDED_CHANGED(509, "与当前房间模式相同"),
    FLASH_LIGHT_ERROR_NEXT(510, "嘉宾还未进行心动选择"),

    MATCH_QUESTION_ERROR_NEXT(511, "本轮答题环节尚未结束，请耐心等待"),
    CHANGE_ROOM_MODE_MATCH_QUESTION_ERROR(512, "正在答题，暂无法切换。"),
    GRAB_CONNOT_ANSWER(514, "抢亲阶段，无法进行默契问答"),

    GRAB_START_SEAT_ERROR(514, "男女嘉宾都在麦才可开启游戏"),
    GRAB_START_SEAT_LOW_VERSION_ERROR(515, "暂无法开启，可提示用户升级最新版本"),
    GRAB_DATING_SUPPORT_QUERY_UP(515, "约会环节不支持抱人上麦"),
    GRAB_NOT_AVAILABLE(516, "系统维护中，暂不可用"),
    GUEST_HAS_CHOOSE(518, "嘉宾正在下麦，稍后再试"),
    GRAB_NOEW_NOT_MARRY(519, "抢亲阶段，无法绑定情侣"),

    AUCTION_NOT_AVAILABLE(520, "系统维护中，暂不可用"),
    AUCTION_START_SEAT_ERROR(521, "嘉宾位有人才可开启游戏"),
    AUCTION_GIFT_INFO_ERROR(522, "礼物信息错误"),
    AUCTION_GUEST_ERROR(523, "您已不在嘉宾位"),

    GRAB_CANNOT_LOCK_IN_GAME(524, "正在浪漫交友游戏中，不能上锁房间"),
    GRAB_LOCK_SEAT_USER_LACK(524, "男女嘉宾都在麦才能锁房间"),
    GRAB_LOCK_MONEY_LACK(524, "男嘉宾给女嘉宾的亲密值>=1w才可锁房间"),
    GRAB_ROOM_LOCK(524, "房间上锁中，不能开启游戏"),
    GRAB_ROOM_LOCK_INVITE_FAIL(524, "房间上锁中，不能邀请用户"),

    MARRY_SCORE_NOT_ENOUGH(525, "亲密值满300000才能申请情侣"),
    SELF_HAS_LOVER(526, "已有情侣，请解除后再绑定"),
    OTHER_HAS_LOIVER(527, "对方已有情侣无法绑定"),
    HAS_DELETE_FRIEBD(528, "已经删除亲友"),
    HAS_IS_FRIEND(529, "已经是情侣，请解除绑定后删除"),
    INCOMPLETE_INFORMATION(530, "头像未经过审核或资料填写不完整不能上主持麦"),

    ROOM_STATUS_NOT_NORMAL(550, "该房间暂时无法使用，请联系客服处理"),
    ROOM_NOT_OWNER(551, "您不是房主，无权限操作"),
    ROOM_MANAGER(552, "对方已经是房间管理员"),
    ROOM_MANAGER_NOT_INDULGE(553, "仅能任命金牌或王牌红娘做为房间管理员"),
    ROOM_MANAGER_NOT_APPRENTICE(554, "仅能任命自己的徒弟做为房间管理员"),
    ROOM_MANAGER_NUM_LIMIT(555, "房间最多拥有12名管理"),
    USER_MANAGER_ROOM_NUM_LIMIT(555, "该用户管理房间已达上限，无法添加"),
    MODE_NOT_SUPPORT(556, "该玩法不再支持，请选择其他玩法"),
    MODE_NEED_UPGRADE(556, "无法切换该玩法，请选择其他玩法"),

    AUCTION_EXCLUSIVE_STAGE_CHOOSE(557, "是否进入专属关系阶段,该阶段用户可通过积累甜蜜值升级关系"),
    AUCTION_EXCLUSIVE_CONDITIONS_NOT_MET(558, "不满足进入下阶段条件"),
    AUCTION_EXCLUSIVE_BIDDER_ISNULL(559, "专属阶段获取竞拍人为空"),
    AUCTION_CUSTOMIZE_RELATION_ERROR(560, "不能自定义关系"),
    AUCTION_CUSTOMIZE_RELATION_NOT_EMPTY(561, "自定义关系名称不能为空"),

    AUCTION_NO_START(562, "游戏尚未开始，无法结束游戏。请先开始游戏"),
    GAME_STAGE_ERR(563, "游戏阶段异常"),
    MARRIAGE_GUEST_IS_NOT_ENOUGH(564, "人都不齐怎么拜堂？"),
    MARRIAGE_SEAT_SEX_CHECK(565, "再找找，座位是男左女右喔"),
    MARRIAGE_SEAT_ON_GAME(566, "游戏过程中禁止上麦"),
    MARRIAGE_GAME_NOT_NOTIFY_LEAVE(567, "游戏中不可以抱男主/女主下麦"),

    ROOM_COVER_CHECK_FAIL(600,"房间封面审核失败，请重试"),
    ROOM_COVER_UPDATE(601,"房间封面已更新"),
    ACTIVITY_IS_NOT_START(602,"活动未开启"),

    CANNOT_NOTIFY_LEAVE_SEAT_IN_GAME(620,"游戏中不能抱嘉宾下麦"),
    CANNOT_GRAP_SEAT_IN_GAME(621,"游戏中不可以上麦"),
    CANNOT_LEAVE_SEAT_IN_GAME(622,"游戏中不可以下麦"),
    CANNOT_NOTIFY_SEAT_IN_GAME(623,"游戏中不能抱嘉宾上麦"),

    HEART_PK_NO_TEAM(640, "未有嘉宾组队成功"),
    HEART_PK_GUEST_IN_PROTECTED_TIME(641, "该嘉宾不可被赠送「心碎小恶魔道具」"),
    HEART_PK_ADD_TIME_FAIL(642, "当前不可加时"),
    HEART_PK_PROP_NOT_FOUND(643, "未找到该道具"),
    HEART_PK_PROP_TO_TEAM_GUEST(644, "道具只能送给组队嘉宾"),
    HEART_PK_PROP_NOT_ENOUGH(645, "道具数量不足"),

    USER_PROPS_ERROR(700, "使用道具错误~ 请联系管理"),
    USER_PROPS_NOT_ENOUGH(701, "您该道具持有的数量不足"),
    USE_PROPS_NOT_MATCH_MAKER(702, "仅铜牌及以上红娘可使用红娘券"),
    USE_PROPS_LEVEL_NOT_ENOUGH(703, "不能使用低于自己等级的红娘券"),
    GIVE_AWAY_NOT_FOR_MYSELF(704, "自己的券不能赠送给自己,请重新选择赠送对象"),

    JOIN_ACCOMPANY_TEAM_FULL_ERROR(800, "当前房主的陪伴团数量已经达到上限了，暂时无法加入哦"),
    MY_ACCOMPANY_TEAM_FULL_ERROR(801, "加入陪伴团数量已达上限，请先退出其他团"),
    ACCOMPANY_TEAM_BADGE_EDIT_COUNT_FULL(802, "修改次数太多了，明天再试吧"),
    NOT_IN_ACCOMPANY_TEAM(803, "您不在该陪伴团列表内"),
    FAIL_IN_ACCOMPANY_TEAM(804, "请先加入该陪伴团再使用道具"),
    ACCOMPANY_TEAM_LEVEL_ERROR(805, "当前等级已经很高了，无法使用"),

    PROGRAMME_NUM_LIMIT(820, "节目单数量超出上限"),
    PROGRAMME_NOT_EXIST(821, "节目单不存在"),

    JOB_IS_NOT_START(901, "脚本已关闭"),

    HEART_PK_GUEST_BACK(10001, "由于原房间未结束，需返回房间继续参与"),
    BOMB_PLAYER_NOT_ENOUGH(10101, "最少2人参与游戏"),
    BOMB_GAME_START(10102, "游戏已经开始"),
    BOMB_GAME_NOT_START(10103, "游戏未开始"),
    BOMB_GAME_ROUND_PROHIBIT(10104, "当前回合不能操作"),
    BOMB_GAME_ROUND_OVER(10105, "当前回合已过"),
    BOMB_GAME_CANNOT_DISARM(10106, "当前不能拆弹"),
    BOMB_GAME_NO_DISARM_CARD(10107, "没有拆弹牌"),
    BOMB_GAME_CANNOT_BACK_BOMB(10108, "当前不能放回炸弹牌"),
    BOMB_GAME_CANNOT_PLAY_DISARM_CARD(10109, "拆弹牌不能打"),
    BOMB_GAME_CARD_NOT_EXIST(10110, "牌不存在"),
    BOMB_GAME_CARD_NOT_PLAY(10111, "当前回合不能出牌"),
    BOMB_GAME_CARD_NOT_GAIN(10112, "当前回合已经摸牌"),
    BOMB_GAME_CARD_NOT_GIVE(10113, "当前回合不能给牌"),
    BOMB_GAME_CANNOT_SELECT(10114, "当前不能选人"),
    BOMB_GAME_CANNOT_SELECT_OUT(10115, "不能选择已淘汰的人"),

    IM_SAAS_BUSINESS_ERROR(100001,"业务标识错误"),
    IM_SAAS_MESS_TYPE_ERROR(100002,"消息类型错误"),
    IM_SAAS_MESS_NO_HANDLER(100003,"无法处理该类型消息"),
    IM_SAAS_MESS_ERROR(100004,"消息参数错误"),
    IM_SAAS_MESS_TEXT_EMPTY(100005,"消息内容不能为空"),
    IM_SAAS_MESS_TEXT_LENGTH(100006,"最多输入200个字"),
    IM_SAAS_MESS_TEXT_INVALID(100007,"你提交的内容可能包含特殊符号，请修改重试"),
    IM_SAAS_MESS_HANDLE_ERROR(100008,"消息处理异常，请重试"),
    IM_SAAS_MESS_PROHIBIT(100009,"操作非法"),
    IM_SAAS_MESS_FREQUENTLY(100010,"操作频繁，请稍后再试"),
    CREATE_TEAM_ROOM_FAIL(100011,"生成小队房间ID失败"),
    TEAM_ROOM_IS_EXIST(100012,"已经创建过小队房间，不能重复查创建"),
    ;

    private int ec;
    private String em;

    ResultStatusEnum(int ec, String em) {
        this.ec = ec;
        this.em = em;
    }

    public static ResultStatusEnum enumOf(int code) {
        for (ResultStatusEnum resultStatusEnum : values()) {
            if (resultStatusEnum.getEc() == code) {
                return resultStatusEnum;
            }
        }
        return null;
    }

    public ResultStatusEnum setEm(String em) {
        this.em = em;
        return this;
    }

    public int getEc() {
        return ec;
    }

    public String getEm() {
        return em;
    }
}
