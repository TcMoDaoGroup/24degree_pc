package com.dujia.config;

public class InfoSdateMessage {

    //成功信息配置：
    public static final String SUCCESS = "执行成功";
    public static final String REGISTRATION_SUCCESS = "注册成功";
    public static final String LOGIN_SUCCESS = "登录成功";
    public static final String ADD_SUCCESS = "添加成功";
    public static final String DELETE_SUCCESS = "删除成功";
    public static final String REVIEWER_SUCCESS = "审核成功";

    //失败信息配置：
    public static final String FAIL = "执行失败";
    public static final String REGISTRATION_ERROR = "注册失败";
    public static final String LOGIN_ERROR = "登录失败";
    public static final String ADD_ERROR = "添加失败";
    public static final String DELETE_ERROR = "删除失败";
    public static final String REVIEWER_ERROR = "审核失败";

    //请求-数据验证配置：
    public static final String PERMISSIONS_SUCCESS = "验证成功";
    public static final String PERMISSIONS_FAIL = "验证失败";
    public static final String DATA_NOT_FOUND = "数据不存在";
    public static final String DATA_PARAMETER_NULL = "请求参数为空值";
    public static final String DATA_USER_ID_NULL = "用户ID不能为空";

    //完成等待配置：
    public static final String WAIT_REVIEWER = "等待审核";

    // 错误信息配置：
    public static final String NOT_HAVE_FUN = "没有对应权限";
    public static final String PARAM_ERROR = "参数错误";
    public static final String DB_ERROR = "数据库错误";
    public static final String USER_NOT_FOUND = "用户不存在";
    public static final String JSON_SAVE_FAIL = "json文件存储失败";
    public static final String JSON_PARSE_FAIL = "json解析失败";
    public static final String NUMBERREPEAT="编号已经存在";
    public static final String NAME_REPEAT="名称已经存在";

    //特定账号验证配置：
    public static final String IDENTITY_EXISTS = "此身份证号已存在，请使用未绑定的身份证";
    public static final String PHONE_EXISTS = "此手机/电话已存在，请使用未绑定的手机/电话号";
    public static final String EMAIL_EXISTS = "此邮箱已存在，请使用未绑定的邮箱账号";
    public static final String WECHAT_EXISTS = "此微信号已存在，请使用未绑定的微信账号";
    public static final String DEF_ROLE_CANNOT_EDIT="内置角色不能修改";
    public static final String UPDATE_INFO_FAIL_DATA_NOT_CHANGE = "修改信息失败,信息未改变";
    public static final String ASSETS_IS_AUDITTING = "资产处于审核状态中,不可进行更改操作";

    //其他信息配置：
    public static final String NOFINDSERVICECATALOG="未发现对应的服务目录";
    public static final String PARAM_CAN_NOT_NULL = "参数不能为空";
    public static final String LOGIN_TIMEOUT = "登录超时,请重新登录";
    public static final String IMG_COMPRESS_ERROR = "图片压缩失败";
    public static final String IO_ERROR = "IO异常";
    public static final String FILE_EXISTS = "数据文件已存在，无法更改";

    //模块目录：
    public static final String LOGIN_MODUL = "登录模块";
    public static final String USER_MODUL = "用户模块";
    public static final String ORDER_MODUL = "订单模块";



}
