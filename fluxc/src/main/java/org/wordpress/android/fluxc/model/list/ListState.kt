package org.wordpress.android.fluxc.model.list

enum class ListState(val value: Int) {
    CAN_LOAD_MORE(0),
    FETCHED(1),
    FETCHING_FIRST_PAGE(2),
    LOADING_MORE(3),
    ERROR(4);

    fun canLoadMore(): Boolean {
        return this == CAN_LOAD_MORE
    }

    fun isFetchingFirstPage(): Boolean {
        return this == FETCHING_FIRST_PAGE
    }

    fun isLoadingMore(): Boolean {
        return this == LOADING_MORE
    }
}
