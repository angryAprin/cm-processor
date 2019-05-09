package com.qirat.content.management.messaging.io

import com.qirat.content.management.messaging.models.ContentStore
import com.qirat.content.management.utils.models.ContentStoreObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Processor
import org.springframework.integration.annotation.MessageEndpoint
import org.springframework.messaging.handler.annotation.SendTo

/**
 *
 * @author Tauriq Behardien
 */
@MessageEndpoint
@EnableBinding(Processor::class)
class ContentProcessor {
    @Autowired
    private lateinit var store: ContentStore

    /**
     * Since this is a demo, the following method
     * doesn't really do much. However, in a real
     * world scenario, you would add some post
     * queueing process to transform the data
     * slightly
     */
    @SendTo(Processor.OUTPUT)
    @StreamListener(Processor.INPUT)
    fun process(contentObject: ContentStoreObject): ContentStoreObject {
        // do some checks here

        return contentObject
    }
}