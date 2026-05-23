package com.oss.perfmon.ui.navigation

import androidx.navigation.NavController

/**
 * 백 스택을 [Routes.HOME]이 최상단이 될 때까지 pop합니다.
 * [Routes.HOME] 자체는 제거하지 않습니다.
 *
 * 툴바 "홈" 등 Home으로 명시적으로 이동할 때 사용합니다.
 * 상세 화면에서 한 단계 뒤로 가기(돌아가기)에는 [NavController.navigateUp]을 사용하세요.
 */
fun NavController.popBackToHome(): Boolean =
    popBackStack(Routes.HOME, inclusive = false)
