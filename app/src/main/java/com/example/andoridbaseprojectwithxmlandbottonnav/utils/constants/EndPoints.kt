package com.ivaninfotech.dalearts.utils.constants

object EndPoints {
    const val USE_DEVELOPMENT = true
    const val LIVE_BASE_URL = ""
    const val DEVELOPMENT_BASE_URL = "https://dev8.ivantechnology.in"
    private const val BASE_URL_SECOND_PART = "/daleart/backend/frontend"
    const val DEV_BASE_SECOND_PART = "/daleart/backend/frontend"
    const val LIVE_BASE_SECOND_PART = ""
    const val POST_IMAGE_URL = "https://dev8.ivantechnology.in/daleart/backend/uploads/blogs/"
    const val FRAME_IMAGE_URL = "https://dev8.ivantechnology.in/daleart/backend/uploads/frames/"

    // =============== AUTH  =======================
    const val REGISTER_END_POINT = "${BASE_URL_SECOND_PART}/auth/register"
    const val VERIFY_OTP_END_POINT = "${BASE_URL_SECOND_PART}/otp/verify"
    const val LOGIN_END_POINT="${BASE_URL_SECOND_PART}/auth/login"
    const val RESEND_OTP_END_POINT="${BASE_URL_SECOND_PART}/otp/resend"

    // ===============  HOME PAGE  =============================
    const val HOME_BLOG_POST_END_POINT = "${BASE_URL_SECOND_PART}/home/blog/fetch"
    const val ADD_MY_POSTS = "${BASE_URL_SECOND_PART}/blog/add"
    const val HOME_ARTIST_PHOTOGRAPHER_END_POINT = "${BASE_URL_SECOND_PART}/home/sellers/sidebar"
    const val GET_USER_PROFILE_END_POINT = "${BASE_URL_SECOND_PART}/user/profile/get"
    const val GLOBAL_SEARCH_END_POINT = "${BASE_URL_SECOND_PART}/home/search"
    const val GET_ALL_ARTISTS_PHOTOGRAPHERS = "${BASE_URL_SECOND_PART}/home/members/fetch"

    // =================== SHOP =======================
    const val SHOP_ART_END_POINT="${BASE_URL_SECOND_PART}/product/browse"
    const val GET_PRODUCT_VARIANTS ="/daleart/backend/frontend/product/variants/get"
    const val GET_PRODUCT_FRAMES = "${BASE_URL_SECOND_PART}/product/frames/get"
    const val ADD_PRODUCT_TO_CART = "${BASE_URL_SECOND_PART}/cart/submit"

    // ================= WALLET SUBSCRIPTION =============
    const val WALLET_TRANSACTION_END_POINT="${BASE_URL_SECOND_PART}/seller/wallet/transactions"
    const val WALLET_BALANCE_END_POINT="${BASE_URL_SECOND_PART}/seller/wallet/balance"
    const val WALLET_PAYOUT_REQUEST="${BASE_URL_SECOND_PART}/seller/wallet/payout-request/submit"
    const val WALLET_PAYOUT_FETCH="${BASE_URL_SECOND_PART}/seller/wallet/payout-request/fetch"
    const val FETCH_SUBSCRIPTIONS="${BASE_URL_SECOND_PART}/subscription/fetch"
    const val FETCH_SELLER_ORDERS="${BASE_URL_SECOND_PART}/seller/wallet/orders/fetch"

    // ================= NOTIFICATIONS =============
    const val NOTIFICATIONS="${BASE_URL_SECOND_PART}/notifications"


    // ================= ORDER AND CART ================
    const val GET_CART_DATA = "${BASE_URL_SECOND_PART}/cart/list"
    const val GET_STATE_LIST="${BASE_URL_SECOND_PART}/user/states"
    const val GET_CITY_LIST="${BASE_URL_SECOND_PART}/user/city"
    const val GET_USER_ADDRESS="${BASE_URL_SECOND_PART}/user/getAddess"
    const val ADD_ADDRESS="${BASE_URL_SECOND_PART}/user/addshipping"
    const val GET_ORDER_LIST="${BASE_URL_SECOND_PART}/order/list"
    const val GET_ORDER_DETAILS="${BASE_URL_SECOND_PART}/order/details"

    // ================== MY POSTS ====================
    const val GET_MY_POSTS = "${BASE_URL_SECOND_PART}/blog/bloglist"
    const val EDIT_MY_POSTS = "${BASE_URL_SECOND_PART}/blog/edit"
    const val DELETE_MY_POSTS = "${BASE_URL_SECOND_PART}/blog/delete"

    //================= SELLER PRODUCT AND FRAMES ==============
    //======== PRODUCTS =======
    const val SELLER_ADD_PRODUCT = "${BASE_URL_SECOND_PART}/seller/product/submit"
    const val SELLER_PRODUCT_FETCH="${BASE_URL_SECOND_PART}/seller/product/fetch"
    const val SELLER_PRODUCT_DELETE="${BASE_URL_SECOND_PART}/seller/product/delete"

    //======== FRAME =======
    const val SELLER_FRAME_FETCH="${BASE_URL_SECOND_PART}/seller/frames/fetch"
    const val SELLER_FRAME_ADD="${BASE_URL_SECOND_PART}/seller/frames/add"
    const val SELLER_FRAME_EDIT="${BASE_URL_SECOND_PART}/seller/frames/edit"
    const val SELLER_FRAME_DELETE="${BASE_URL_SECOND_PART}/seller/frames/delete"

    //======= DIMENSIONS ========
    const val SELLER_DIMENSIONS_MASTER="${BASE_URL_SECOND_PART}/seller/product/master"
    const val SELLER_DIMENSIONS_UPDATE="${BASE_URL_SECOND_PART}/seller/dimension/price-update"
    const val SELLER_DIMENSIONS_ADD="${BASE_URL_SECOND_PART}/seller/dimension/save"
    const val SELLER_DIMENSIONS_EDIT="${BASE_URL_SECOND_PART}/seller/dimension/edit"
    const val SELLER_DIMENSIONS_DELETE="${BASE_URL_SECOND_PART}/seller/dimension/delete"
    const val SELLER_DIMENSIONS_FETCH="${BASE_URL_SECOND_PART}/seller/dimension/fetch"

    //====== MATERIALS ==========
    const val SELLER_MATERIALS_FETCH="${BASE_URL_SECOND_PART}/seller/material/fetch"
    const val SELLER_MATERIALS_ADD="${BASE_URL_SECOND_PART}/seller/material/add"
    const val SELLER_MATERIALS_EDIT="${BASE_URL_SECOND_PART}/seller/material/edit"
    const val SELLER_MATERIALS_DELETE="${BASE_URL_SECOND_PART}/seller/material/delete"


    // ================ SPECIAL REQUEST ========================
    const val USER_SPECIAL_REQUEST = "${BASE_URL_SECOND_PART}/specialrequest/add"
    const val FRAME_FOR_SPECIAL_REQUEST = "${BASE_URL_SECOND_PART}/specialrequestmodal/framelist"
    const val USER_MY_REQUESTS = "${BASE_URL_SECOND_PART}/fetchrequest/fetch"
    const val SELLER_MY_REQUESTS = "${BASE_URL_SECOND_PART}/seller/fetchrequest/fetch"
    const val IGNORE_SPECIAL_REQUEST = "${BASE_URL_SECOND_PART}/seller/statuschange/update"
    const val ACCEPT_SPECIAL_REQUEST = "${BASE_URL_SECOND_PART}/seller/sendproposal/add"

    // ================= PROFILE ==========================
    const val FOLLOW_PROFILE="${BASE_URL_SECOND_PART}/user/profile/follow"
    const val UPDATE_PROFILE_INFO="${BASE_URL_SECOND_PART}/user/profile/update"

    // ================== PAYMENT ===========================
    const val CART_PAYMENT  = "${BASE_URL_SECOND_PART}/order/add"
    const val SPECIAL_REQUEST_PAYMENT  = "${BASE_URL_SECOND_PART}/proceedpayment/pay"
    const val SUBSCRIPTION_PAYMENT  = "${BASE_URL_SECOND_PART}/subscription/add"






}


