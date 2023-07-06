package ru.tensess.api.utils

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.KotlinFeature
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

private val kotlinModule: SimpleModule = KotlinModule.Builder()
    .withReflectionCacheSize(512)
    .configure(KotlinFeature.NullToEmptyCollection, false)
    .configure(KotlinFeature.NullToEmptyMap, false)
    .configure(KotlinFeature.NullIsSameAsDefault, false)
    .configure(KotlinFeature.SingletonSupport, false)
    .configure(KotlinFeature.StrictNullChecks, false)
    .build()

fun coroutine(block: suspend CoroutineScope.() -> Unit) = CoroutineScope(Dispatchers.IO).launch { block() }

val mapper = jacksonObjectMapper()
    .registerModule(kotlinModule)
    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)