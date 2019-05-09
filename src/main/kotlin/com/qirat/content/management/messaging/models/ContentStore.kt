package com.qirat.content.management.messaging.models

import com.qirat.content.management.utils.models.ContentObject
import org.springframework.stereotype.Component

@Component
class ContentStore {
    fun load(): List<ContentObject> {
        // retrieve objects from database

        return listOf(ContentObject("Identification Document", "pdf"))
    }
}