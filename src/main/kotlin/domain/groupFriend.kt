package org.example.mirai.plugin.domain

data class groupFriend(
    val qq:Long,
    val name:Long,
    val count:Long, //发言统计
    val status:Long //查询状态:今天-0/昨天-1/本周-2/本月-3
)
